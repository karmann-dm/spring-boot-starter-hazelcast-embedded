package com.karmanno.hazelcast.strategy;

import com.hazelcast.logging.ILogger;
import com.hazelcast.spi.discovery.AbstractDiscoveryStrategy;
import com.hazelcast.spi.discovery.DiscoveryNode;

import java.util.Map;

public class MarathonDiscoveryStrategy extends AbstractDiscoveryStrategy {
    public MarathonDiscoveryStrategy(ILogger logger, Map<String, Comparable> properties) {
        super(logger, properties);
    }

    @Override
    public Iterable<DiscoveryNode> discoverNodes() {
        return null;
    }
}
