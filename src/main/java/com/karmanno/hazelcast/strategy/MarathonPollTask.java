package com.karmanno.hazelcast.strategy;

import com.hazelcast.util.CollectionUtil;
import com.karmanno.hazelcast.marathon.MarathonClient;
import com.karmanno.hazelcast.marathon.model.MarathonAppResponse;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class MarathonPollTask implements Runnable {
    private final MarathonClient marathonClient;
    private final String appId;
    private final String currentHost;
    private final Integer portIndex;

    private AtomicReference<Set<ServiceNode>> serviceNodes = new AtomicReference<>(Collections.emptySet());

    @Override
    public void run() {
        MarathonAppResponse marathonAppResponse = marathonClient.getApp(appId);
        Set<ServiceNode> nodes = marathonAppResponse.getApp()
                .getTasks()
                .stream()
                .map(task -> new ServiceNode(
                        task.getHost(),
                        CollectionUtil.getItemAtPositionOrNull(task.getPorts(), portIndex)
                ))
                .filter(serviceNode -> !serviceNode.getHost().equals(currentHost))
                .collect(Collectors.toSet());
        serviceNodes.getAndSet(nodes);
    }
}
