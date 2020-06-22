package com.karmanno.hazelcast.settings;

import lombok.Data;

@Data
public class MarathonDiscoverySettings {
    private String marathonEndpoint;
    private String appId;
    private Integer portIndex;
}
