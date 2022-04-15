// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * User identity used for CMK.
 * 
 */
public final class EncryptionPropertiesIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionPropertiesIdentityArgs Empty = new EncryptionPropertiesIdentityArgs();

    /**
     * The user identity used for CMK. It will be an ARM resource id in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @Import(name="userAssignedIdentity")
      private final @Nullable Output<Object> userAssignedIdentity;

    public Output<Object> userAssignedIdentity() {
        return this.userAssignedIdentity == null ? Codegen.empty() : this.userAssignedIdentity;
    }

    public EncryptionPropertiesIdentityArgs(@Nullable Output<Object> userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
    }

    private EncryptionPropertiesIdentityArgs() {
        this.userAssignedIdentity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder userAssignedIdentity(@Nullable Output<Object> userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }
        public Builder userAssignedIdentity(@Nullable Object userAssignedIdentity) {
            this.userAssignedIdentity = Codegen.ofNullable(userAssignedIdentity);
            return this;
        }        public EncryptionPropertiesIdentityArgs build() {
            return new EncryptionPropertiesIdentityArgs(userAssignedIdentity);
        }
    }
}
