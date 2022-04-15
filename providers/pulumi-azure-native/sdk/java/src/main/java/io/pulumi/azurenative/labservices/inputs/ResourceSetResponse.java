// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a VM and the setting Id it was created for.
 * 
 */
public final class ResourceSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceSetResponse Empty = new ResourceSetResponse();

    /**
     * resourceSettingId for the environment
     * 
     */
    @Import(name="resourceSettingId")
      private final @Nullable String resourceSettingId;

    public Optional<String> resourceSettingId() {
        return this.resourceSettingId == null ? Optional.empty() : Optional.ofNullable(this.resourceSettingId);
    }

    /**
     * VM resource Id for the environment
     * 
     */
    @Import(name="vmResourceId")
      private final @Nullable String vmResourceId;

    public Optional<String> vmResourceId() {
        return this.vmResourceId == null ? Optional.empty() : Optional.ofNullable(this.vmResourceId);
    }

    public ResourceSetResponse(
        @Nullable String resourceSettingId,
        @Nullable String vmResourceId) {
        this.resourceSettingId = resourceSettingId;
        this.vmResourceId = vmResourceId;
    }

    private ResourceSetResponse() {
        this.resourceSettingId = null;
        this.vmResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceSettingId;
        private @Nullable String vmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceSettingId = defaults.resourceSettingId;
    	      this.vmResourceId = defaults.vmResourceId;
        }

        public Builder resourceSettingId(@Nullable String resourceSettingId) {
            this.resourceSettingId = resourceSettingId;
            return this;
        }
        public Builder vmResourceId(@Nullable String vmResourceId) {
            this.vmResourceId = vmResourceId;
            return this;
        }        public ResourceSetResponse build() {
            return new ResourceSetResponse(resourceSettingId, vmResourceId);
        }
    }
}
