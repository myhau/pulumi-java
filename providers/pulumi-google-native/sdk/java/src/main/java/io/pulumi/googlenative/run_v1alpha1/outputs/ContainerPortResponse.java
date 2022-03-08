// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContainerPortResponse {
    /**
     * (Optional) Port number the container listens on. This must be a valid port number, 0 < x < 65536.
     * 
     */
    private final Integer containerPort;
    /**
     * (Optional) If specified, used to specify which protocol to use. Allowed values are "http1" and "h2c".
     * 
     */
    private final String name;
    /**
     * (Optional) Protocol for port. Must be "TCP". Defaults to "TCP".
     * 
     */
    private final String protocol;

    @OutputCustomType.Constructor({"containerPort","name","protocol"})
    private ContainerPortResponse(
        Integer containerPort,
        String name,
        String protocol) {
        this.containerPort = containerPort;
        this.name = name;
        this.protocol = protocol;
    }

    /**
     * (Optional) Port number the container listens on. This must be a valid port number, 0 < x < 65536.
     * 
    */
    public Integer getContainerPort() {
        return this.containerPort;
    }
    /**
     * (Optional) If specified, used to specify which protocol to use. Allowed values are "http1" and "h2c".
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * (Optional) Protocol for port. Must be "TCP". Defaults to "TCP".
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerPort;
        private String name;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder setContainerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public ContainerPortResponse build() {
            return new ContainerPortResponse(containerPort, name, protocol);
        }
    }
}
