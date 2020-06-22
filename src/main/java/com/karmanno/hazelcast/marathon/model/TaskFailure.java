package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

@Data
public class TaskFailure {
    private String appId;
    private String host;
    private String message;
    private String state;
    private String taskId;
    private String timestamp;
    private String version;
    private String slaveId;
}
