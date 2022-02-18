// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalNetworkEndpointGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalNetworkEndpointGroupArgs Empty = new GlobalNetworkEndpointGroupArgs();

    /**
     * The default port used if the port number is not specified in the
     * network endpoint.
     * 
     */
    @InputImport(name="defaultPort")
    private final @Nullable Input<Integer> defaultPort;

    public Input<Integer> getDefaultPort() {
        return this.defaultPort == null ? Input.empty() : this.defaultPort;
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Type of network endpoints in this network endpoint group.
     * Possible values are `INTERNET_IP_PORT` and `INTERNET_FQDN_PORT`.
     * 
     */
    @InputImport(name="networkEndpointType", required=true)
    private final Input<String> networkEndpointType;

    public Input<String> getNetworkEndpointType() {
        return this.networkEndpointType;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public GlobalNetworkEndpointGroupArgs(
        @Nullable Input<Integer> defaultPort,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> networkEndpointType,
        @Nullable Input<String> project) {
        this.defaultPort = defaultPort;
        this.description = description;
        this.name = name;
        this.networkEndpointType = Objects.requireNonNull(networkEndpointType, "expected parameter 'networkEndpointType' to be non-null");
        this.project = project;
    }

    private GlobalNetworkEndpointGroupArgs() {
        this.defaultPort = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.networkEndpointType = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> defaultPort;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> networkEndpointType;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalNetworkEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultPort = defaults.defaultPort;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.project = defaults.project;
        }

        public Builder setDefaultPort(@Nullable Input<Integer> defaultPort) {
            this.defaultPort = defaultPort;
            return this;
        }

        public Builder setDefaultPort(@Nullable Integer defaultPort) {
            this.defaultPort = Input.ofNullable(defaultPort);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworkEndpointType(Input<String> networkEndpointType) {
            this.networkEndpointType = Objects.requireNonNull(networkEndpointType);
            return this;
        }

        public Builder setNetworkEndpointType(String networkEndpointType) {
            this.networkEndpointType = Input.of(Objects.requireNonNull(networkEndpointType));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public GlobalNetworkEndpointGroupArgs build() {
            return new GlobalNetworkEndpointGroupArgs(defaultPort, description, name, networkEndpointType, project);
        }
    }
}
