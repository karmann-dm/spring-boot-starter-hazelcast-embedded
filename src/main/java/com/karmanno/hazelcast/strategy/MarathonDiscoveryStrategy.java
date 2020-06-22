package com.karmanno.hazelcast.strategy;

import com.hazelcast.logging.ILogger;
import com.hazelcast.spi.discovery.AbstractDiscoveryStrategy;
import com.hazelcast.spi.discovery.DiscoveryNode;
import com.karmanno.hazelcast.marathon.MarathonClient;
import com.karmanno.hazelcast.settings.MarathonDiscoverySettings;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MarathonDiscoveryStrategy extends AbstractDiscoveryStrategy {
    private final MarathonClient marathonClient;
    private final ScheduledExecutorService scheduledExecutorService;
    private final MarathonDiscoverySettings marathonDiscoverySettings;

    public MarathonDiscoveryStrategy(
            MarathonDiscoverySettings marathonDiscoverySettings,
            MarathonClient marathonClient,
            ILogger logger,
            Map<String, Comparable> properties,
            ScheduledExecutorService scheduledExecutorService) {
        super(logger, properties);
        this.marathonClient = marathonClient;
        this.scheduledExecutorService = scheduledExecutorService;
        this.marathonDiscoverySettings = marathonDiscoverySettings;
        start();
    }

    @Override
    public void start() {
        scheduledExecutorService.scheduleAtFixedRate(
                () -> {},
                0,
                marathonDiscoverySettings.getDiscoveryRateInSeconds(),
                TimeUnit.SECONDS);
    }

    @Override
    public Iterable<DiscoveryNode> discoverNodes() {
        return null;
    }
}
