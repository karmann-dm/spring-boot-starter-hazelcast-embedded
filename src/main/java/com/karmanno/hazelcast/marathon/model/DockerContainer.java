package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

import java.util.Collection;

@Data
public class DockerContainer {
    private String type;
    private Docker docker;
    private Collection<DockerVolume> volumes;
}
