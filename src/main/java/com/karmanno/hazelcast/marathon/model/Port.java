package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

@Data
public class Port {
    private Integer containerPort;
    private Integer hostPort;
    private Integer servicePort;
    private String protocol;
}
