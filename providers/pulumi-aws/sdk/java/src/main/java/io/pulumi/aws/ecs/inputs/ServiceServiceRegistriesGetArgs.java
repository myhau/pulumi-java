// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceServiceRegistriesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceServiceRegistriesGetArgs Empty = new ServiceServiceRegistriesGetArgs();

    /**
     * Container name value, already specified in the task definition, to be used for your service discovery service.
     * 
     */
    @InputImport(name="containerName")
      private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    /**
     * Port value, already specified in the task definition, to be used for your service discovery service.
     * 
     */
    @InputImport(name="containerPort")
      private final @Nullable Input<Integer> containerPort;

    public Input<Integer> getContainerPort() {
        return this.containerPort == null ? Input.empty() : this.containerPort;
    }

    /**
     * Port value used if your Service Discovery service specified an SRV record.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * ARN of the Service Registry. The currently supported service registry is Amazon Route 53 Auto Naming Service(`aws.servicediscovery.Service`). For more information, see [Service](https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html)
     * 
     */
    @InputImport(name="registryArn", required=true)
      private final Input<String> registryArn;

    public Input<String> getRegistryArn() {
        return this.registryArn;
    }

    public ServiceServiceRegistriesGetArgs(
        @Nullable Input<String> containerName,
        @Nullable Input<Integer> containerPort,
        @Nullable Input<Integer> port,
        Input<String> registryArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.port = port;
        this.registryArn = Objects.requireNonNull(registryArn, "expected parameter 'registryArn' to be non-null");
    }

    private ServiceServiceRegistriesGetArgs() {
        this.containerName = Input.empty();
        this.containerPort = Input.empty();
        this.port = Input.empty();
        this.registryArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceServiceRegistriesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerName;
        private @Nullable Input<Integer> containerPort;
        private @Nullable Input<Integer> port;
        private Input<String> registryArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceServiceRegistriesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.port = defaults.port;
    	      this.registryArn = defaults.registryArn;
        }

        public Builder setContainerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }

        public Builder setContainerPort(@Nullable Input<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = Input.ofNullable(containerPort);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setRegistryArn(Input<String> registryArn) {
            this.registryArn = Objects.requireNonNull(registryArn);
            return this;
        }

        public Builder setRegistryArn(String registryArn) {
            this.registryArn = Input.of(Objects.requireNonNull(registryArn));
            return this;
        }
        public ServiceServiceRegistriesGetArgs build() {
            return new ServiceServiceRegistriesGetArgs(containerName, containerPort, port, registryArn);
        }
    }
}