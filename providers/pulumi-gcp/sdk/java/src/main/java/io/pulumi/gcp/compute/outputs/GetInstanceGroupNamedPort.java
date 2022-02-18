// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceGroupNamedPort {
    /**
     * The name of the instance group. Either `name` or `self_link` must be provided.
     * 
     */
    private final String name;
    private final Integer port;

    @OutputCustomType.Constructor({"name","port"})
    private GetInstanceGroupNamedPort(
        String name,
        Integer port) {
        this.name = Objects.requireNonNull(name);
        this.port = Objects.requireNonNull(port);
    }

    /**
     * The name of the instance group. Either `name` or `self_link` must be provided.
     * 
     */
    public String getName() {
        return this.name;
    }
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupNamedPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceGroupNamedPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public GetInstanceGroupNamedPort build() {
            return new GetInstanceGroupNamedPort(name, port);
        }
    }
}
