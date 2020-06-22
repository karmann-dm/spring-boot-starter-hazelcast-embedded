package com.karmanno.hazelcast.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceNode {
    private String host;
    private Integer port;
}
