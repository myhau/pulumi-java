// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * User assigned identity properties.
 * 
 */
public final class UserAssignedPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserAssignedPropertiesArgs Empty = new UserAssignedPropertiesArgs();

    /**
     * Arm resource id for user assigned identity to be used to fetch MSI token.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    public UserAssignedPropertiesArgs(@Nullable Output<String> resourceId) {
        this.resourceId = resourceId;
    }

    private UserAssignedPropertiesArgs() {
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }        public UserAssignedPropertiesArgs build() {
            return new UserAssignedPropertiesArgs(resourceId);
        }
    }
}
