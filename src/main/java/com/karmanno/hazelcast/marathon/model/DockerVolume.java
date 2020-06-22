package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

@Data
public class DockerVolume {
    private String containerPath;
    private String hostPath;
    private String mode;
}
