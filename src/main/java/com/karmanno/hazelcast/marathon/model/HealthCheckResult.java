package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

@Data
public class HealthCheckResult {
    private boolean alive;
    private int consecutiveFailures;
    private String firstSuccess;
    private String lastFailure;
    private String lastSuccess;
    private String taskId;
}
