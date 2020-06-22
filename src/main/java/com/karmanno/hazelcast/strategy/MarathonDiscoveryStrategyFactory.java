package com.karmanno.hazelcast.strategy;

import com.hazelcast.config.properties.PropertyDefinition;
import com.hazelcast.logging.ILogger;
import com.hazelcast.spi.discovery.DiscoveryNode;
import com.hazelcast.spi.discovery.DiscoveryStrategy;
import com.hazelcast.spi.discovery.DiscoveryStrategyFactory;
import com.karmanno.hazelcast.marathon.MarathonClient;
import com.karmanno.hazelcast.settings.MarathonDiscoverySettings;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

@RequiredArgsConstructor
public class MarathonDiscoveryStrategyFactory implements DiscoveryStrategyFactory {
    private final MarathonDiscoverySettings marathonDiscoverySettings;
    private final MarathonClient marathonClient;
    private final ScheduledExecutorService scheduledExecutorService;

    @Override
    public Class<? extends DiscoveryStrategy> getDiscoveryStrategyType() {
        return MarathonDiscoveryStrategy.class;
    }

    @Override
    public DiscoveryStrategy newDiscoveryStrategy(DiscoveryNode discoveryNode,
                                                  ILogger logger,
                                                  Map<String, Comparable> properties) {
        return new MarathonDiscoveryStrategy(
                marathonDiscoverySettings,
                marathonClient,
                logger,
                properties,
                scheduledExecutorService
        );
    }

    @Override
    public Collection<PropertyDefinition> getConfigurationProperties() {
        return null;
    }
}
