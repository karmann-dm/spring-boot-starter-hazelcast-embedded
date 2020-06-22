package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

@Data
public class HealthCheck {
    private Command command;
    private Integer gracePeriodSeconds;
    private Integer intervalSeconds;
    private Integer maxConsecutiveFailures;
    private Integer portIndex;
    private Integer timeoutSeconds;
    private boolean ignoreHttp1xx;
    private String path;
    private String protocol;
}
