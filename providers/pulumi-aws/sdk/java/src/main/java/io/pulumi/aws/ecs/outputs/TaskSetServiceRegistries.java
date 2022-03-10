// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskSetServiceRegistries {
    /**
     * The container name value, already specified in the task definition, to be used for your service discovery service.
     * 
     */
    private final @Nullable String containerName;
    /**
     * The port value, already specified in the task definition, to be used for your service discovery service.
     * 
     */
    private final @Nullable Integer containerPort;
    /**
     * The port value used if your Service Discovery service specified an SRV record.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The ARN of the Service Registry. The currently supported service registry is Amazon Route 53 Auto Naming Service(`aws.servicediscovery.Service` resource). For more information, see [Service](https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html).
     * 
     */
    private final String registryArn;

    @OutputCustomType.Constructor({"containerName","containerPort","port","registryArn"})
    private TaskSetServiceRegistries(
        @Nullable String containerName,
        @Nullable Integer containerPort,
        @Nullable Integer port,
        String registryArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.port = port;
        this.registryArn = registryArn;
    }

    /**
     * The container name value, already specified in the task definition, to be used for your service discovery service.
     * 
    */
    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * The port value, already specified in the task definition, to be used for your service discovery service.
     * 
    */
    public Optional<Integer> getContainerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    /**
     * The port value used if your Service Discovery service specified an SRV record.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The ARN of the Service Registry. The currently supported service registry is Amazon Route 53 Auto Naming Service(`aws.servicediscovery.Service` resource). For more information, see [Service](https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html).
     * 
    */
    public String getRegistryArn() {
        return this.registryArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetServiceRegistries defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private @Nullable Integer containerPort;
        private @Nullable Integer port;
        private String registryArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetServiceRegistries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.port = defaults.port;
    	      this.registryArn = defaults.registryArn;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setRegistryArn(String registryArn) {
            this.registryArn = Objects.requireNonNull(registryArn);
            return this;
        }
        public TaskSetServiceRegistries build() {
            return new TaskSetServiceRegistries(containerName, containerPort, port, registryArn);
        }
    }
}