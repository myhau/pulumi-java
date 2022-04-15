// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HybridConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridConnectionArgs Empty = new HybridConnectionArgs();

    /**
     * The hybrid connection name.
     * 
     */
    @Import(name="hybridConnectionName")
      private final @Nullable Output<String> hybridConnectionName;

    public Output<String> hybridConnectionName() {
        return this.hybridConnectionName == null ? Codegen.empty() : this.hybridConnectionName;
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Returns true if client authorization is needed for this hybrid connection; otherwise, false.
     * 
     */
    @Import(name="requiresClientAuthorization")
      private final @Nullable Output<Boolean> requiresClientAuthorization;

    public Output<Boolean> requiresClientAuthorization() {
        return this.requiresClientAuthorization == null ? Codegen.empty() : this.requiresClientAuthorization;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The usermetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
     */
    @Import(name="userMetadata")
      private final @Nullable Output<String> userMetadata;

    public Output<String> userMetadata() {
        return this.userMetadata == null ? Codegen.empty() : this.userMetadata;
    }

    public HybridConnectionArgs(
        @Nullable Output<String> hybridConnectionName,
        Output<String> namespaceName,
        @Nullable Output<Boolean> requiresClientAuthorization,
        Output<String> resourceGroupName,
        @Nullable Output<String> userMetadata) {
        this.hybridConnectionName = hybridConnectionName;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.requiresClientAuthorization = requiresClientAuthorization;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.userMetadata = userMetadata;
    }

    private HybridConnectionArgs() {
        this.hybridConnectionName = Codegen.empty();
        this.namespaceName = Codegen.empty();
        this.requiresClientAuthorization = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.userMetadata = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hybridConnectionName;
        private Output<String> namespaceName;
        private @Nullable Output<Boolean> requiresClientAuthorization;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> userMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hybridConnectionName = defaults.hybridConnectionName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.requiresClientAuthorization = defaults.requiresClientAuthorization;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.userMetadata = defaults.userMetadata;
        }

        public Builder hybridConnectionName(@Nullable Output<String> hybridConnectionName) {
            this.hybridConnectionName = hybridConnectionName;
            return this;
        }
        public Builder hybridConnectionName(@Nullable String hybridConnectionName) {
            this.hybridConnectionName = Codegen.ofNullable(hybridConnectionName);
            return this;
        }
        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }
        public Builder requiresClientAuthorization(@Nullable Output<Boolean> requiresClientAuthorization) {
            this.requiresClientAuthorization = requiresClientAuthorization;
            return this;
        }
        public Builder requiresClientAuthorization(@Nullable Boolean requiresClientAuthorization) {
            this.requiresClientAuthorization = Codegen.ofNullable(requiresClientAuthorization);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder userMetadata(@Nullable Output<String> userMetadata) {
            this.userMetadata = userMetadata;
            return this;
        }
        public Builder userMetadata(@Nullable String userMetadata) {
            this.userMetadata = Codegen.ofNullable(userMetadata);
            return this;
        }        public HybridConnectionArgs build() {
            return new HybridConnectionArgs(hybridConnectionName, namespaceName, requiresClientAuthorization, resourceGroupName, userMetadata);
        }
    }
}
