package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

import java.util.Collection;

@Data
public class Task {
    private String host;
    private String id;
    private String appId;
    private Collection<Integer> ports;
    private String stagedAt;
    private String startedAt;
    private Collection<HealthCheckResult> healthCheckResults;
    private String version;
}
