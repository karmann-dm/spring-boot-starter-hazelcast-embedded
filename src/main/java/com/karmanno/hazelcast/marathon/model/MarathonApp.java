package com.karmanno.hazelcast.marathon.model;

import lombok.Data;

import java.util.*;

@Data
public class MarathonApp {
    private String id;
    private String cmd;
    private List<String> args;
    private Integer instances;
    private Double cpus;
    private Double mem;
    private Collection<String> uris;
    private List<List<String>> constraints;
    private Collection<String> acceptedResourceRoles;
    private DockerContainer container;
    private Map<String, String> env;
    private Map<String, String> labels;
    private String executor;
    private List<Integer> ports;
    private Boolean requirePorts;
    private Collection<String> dependencies;
    private Integer backoffSeconds;
    private Double backoffFactor;
    private Integer maxLaunchDelaySeconds;
    private Collection<Task> tasks;
    private Integer tasksStaged;
    private Integer tasksRunning;
    private Integer tasksHealthy;
    private Integer tasksUnhealthy;
    private List<HealthCheck> healthChecks;
    private UpgradeStrategy upgradeStrategy;
    private List<Deployment> deployments;
    private TaskFailure lastTaskFailure;
}
