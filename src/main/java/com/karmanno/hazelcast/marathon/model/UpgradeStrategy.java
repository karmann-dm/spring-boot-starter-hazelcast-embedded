package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

@Data
public class UpgradeStrategy {
    private Double minimumHealthCapacity;
    private Double maximumOverCapacity;
}
