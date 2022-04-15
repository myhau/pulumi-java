// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ServiceEndpointPolicyDefinitionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Service End point policy resource.
 * 
 */
public final class ServiceEndpointPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointPolicyArgs Empty = new ServiceEndpointPolicyArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * A collection of service endpoint policy definitions of the service endpoint policy.
     * 
     */
    @Import(name="serviceEndpointPolicyDefinitions")
      private final @Nullable Output<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions;

    public Output<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions() {
        return this.serviceEndpointPolicyDefinitions == null ? Codegen.empty() : this.serviceEndpointPolicyDefinitions;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ServiceEndpointPolicyArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions,
        @Nullable Output<Map<String,String>> tags) {
        this.id = id;
        this.location = location;
        this.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
        this.tags = tags;
    }

    private ServiceEndpointPolicyArgs() {
        this.id = Codegen.empty();
        this.location = Codegen.empty();
        this.serviceEndpointPolicyDefinitions = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.serviceEndpointPolicyDefinitions = defaults.serviceEndpointPolicyDefinitions;
    	      this.tags = defaults.tags;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder serviceEndpointPolicyDefinitions(@Nullable Output<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions) {
            this.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
            return this;
        }
        public Builder serviceEndpointPolicyDefinitions(@Nullable List<ServiceEndpointPolicyDefinitionArgs> serviceEndpointPolicyDefinitions) {
            this.serviceEndpointPolicyDefinitions = Codegen.ofNullable(serviceEndpointPolicyDefinitions);
            return this;
        }
        public Builder serviceEndpointPolicyDefinitions(ServiceEndpointPolicyDefinitionArgs... serviceEndpointPolicyDefinitions) {
            return serviceEndpointPolicyDefinitions(List.of(serviceEndpointPolicyDefinitions));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ServiceEndpointPolicyArgs build() {
            return new ServiceEndpointPolicyArgs(id, location, serviceEndpointPolicyDefinitions, tags);
        }
    }
}
