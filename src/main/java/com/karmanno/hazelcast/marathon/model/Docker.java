package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

import java.util.Collection;
import java.util.List;

@Data
public class Docker {
    private String image;
    private String network;
    private boolean forcePullImage;
    private Collection<Port> portMappings;
    private List<Parameter> parameters;
    private boolean privileged;
}
