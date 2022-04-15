// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.JitNetworkAccessPolicyVirtualMachineResponse;
import io.pulumi.azurenative.security.outputs.JitNetworkAccessRequestResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJitNetworkAccessPolicyResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Kind of the resource
     * 
     */
    private final @Nullable String kind;
    /**
     * Location where the resource is stored
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Gets the provisioning state of the Just-in-Time policy.
     * 
     */
    private final String provisioningState;
    private final @Nullable List<JitNetworkAccessRequestResponse> requests;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Configurations for Microsoft.Compute/virtualMachines resource type.
     * 
     */
    private final List<JitNetworkAccessPolicyVirtualMachineResponse> virtualMachines;

    @CustomType.Constructor
    private GetJitNetworkAccessPolicyResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("requests") @Nullable List<JitNetworkAccessRequestResponse> requests,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualMachines") List<JitNetworkAccessPolicyVirtualMachineResponse> virtualMachines) {
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.requests = requests;
        this.type = type;
        this.virtualMachines = virtualMachines;
    }

    /**
     * Resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of the resource
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Location where the resource is stored
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Gets the provisioning state of the Just-in-Time policy.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    public List<JitNetworkAccessRequestResponse> requests() {
        return this.requests == null ? List.of() : this.requests;
    }
    /**
     * Resource type
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Configurations for Microsoft.Compute/virtualMachines resource type.
     * 
    */
    public List<JitNetworkAccessPolicyVirtualMachineResponse> virtualMachines() {
        return this.virtualMachines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJitNetworkAccessPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable List<JitNetworkAccessRequestResponse> requests;
        private String type;
        private List<JitNetworkAccessPolicyVirtualMachineResponse> virtualMachines;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJitNetworkAccessPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requests = defaults.requests;
    	      this.type = defaults.type;
    	      this.virtualMachines = defaults.virtualMachines;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder requests(@Nullable List<JitNetworkAccessRequestResponse> requests) {
            this.requests = requests;
            return this;
        }
        public Builder requests(JitNetworkAccessRequestResponse... requests) {
            return requests(List.of(requests));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualMachines(List<JitNetworkAccessPolicyVirtualMachineResponse> virtualMachines) {
            this.virtualMachines = Objects.requireNonNull(virtualMachines);
            return this;
        }
        public Builder virtualMachines(JitNetworkAccessPolicyVirtualMachineResponse... virtualMachines) {
            return virtualMachines(List.of(virtualMachines));
        }        public GetJitNetworkAccessPolicyResult build() {
            return new GetJitNetworkAccessPolicyResult(id, kind, location, name, provisioningState, requests, type, virtualMachines);
        }
    }
}
