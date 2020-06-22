package com.karmanno.hazelcast;

import lombok.Data;

@Data
public class ServiceNode {
    private String host;
    private int port;
}
