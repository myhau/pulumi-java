// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlobContainerImmutabilityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobContainerImmutabilityPolicyArgs Empty = new BlobContainerImmutabilityPolicyArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API
     * 
     */
    @Import(name="allowProtectedAppendWrites")
      private final @Nullable Output<Boolean> allowProtectedAppendWrites;

    public Output<Boolean> allowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites == null ? Codegen.empty() : this.allowProtectedAppendWrites;
    }

    /**
     * The name of the blob container within the specified storage account. Blob container names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * 
     */
    @Import(name="containerName", required=true)
      private final Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    @Import(name="immutabilityPeriodSinceCreationInDays")
      private final @Nullable Output<Integer> immutabilityPeriodSinceCreationInDays;

    public Output<Integer> immutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays == null ? Codegen.empty() : this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * The name of the blob container immutabilityPolicy within the specified storage account. ImmutabilityPolicy Name must be 'default'
     * 
     */
    @Import(name="immutabilityPolicyName")
      private final @Nullable Output<String> immutabilityPolicyName;

    public Output<String> immutabilityPolicyName() {
        return this.immutabilityPolicyName == null ? Codegen.empty() : this.immutabilityPolicyName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public BlobContainerImmutabilityPolicyArgs(
        Output<String> accountName,
        @Nullable Output<Boolean> allowProtectedAppendWrites,
        Output<String> containerName,
        @Nullable Output<Integer> immutabilityPeriodSinceCreationInDays,
        @Nullable Output<String> immutabilityPolicyName,
        Output<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.allowProtectedAppendWrites = allowProtectedAppendWrites;
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
        this.immutabilityPolicyName = immutabilityPolicyName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private BlobContainerImmutabilityPolicyArgs() {
        this.accountName = Codegen.empty();
        this.allowProtectedAppendWrites = Codegen.empty();
        this.containerName = Codegen.empty();
        this.immutabilityPeriodSinceCreationInDays = Codegen.empty();
        this.immutabilityPolicyName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobContainerImmutabilityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<Boolean> allowProtectedAppendWrites;
        private Output<String> containerName;
        private @Nullable Output<Integer> immutabilityPeriodSinceCreationInDays;
        private @Nullable Output<String> immutabilityPolicyName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobContainerImmutabilityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.allowProtectedAppendWrites = defaults.allowProtectedAppendWrites;
    	      this.containerName = defaults.containerName;
    	      this.immutabilityPeriodSinceCreationInDays = defaults.immutabilityPeriodSinceCreationInDays;
    	      this.immutabilityPolicyName = defaults.immutabilityPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder allowProtectedAppendWrites(@Nullable Output<Boolean> allowProtectedAppendWrites) {
            this.allowProtectedAppendWrites = allowProtectedAppendWrites;
            return this;
        }
        public Builder allowProtectedAppendWrites(@Nullable Boolean allowProtectedAppendWrites) {
            this.allowProtectedAppendWrites = Codegen.ofNullable(allowProtectedAppendWrites);
            return this;
        }
        public Builder containerName(Output<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Output.of(Objects.requireNonNull(containerName));
            return this;
        }
        public Builder immutabilityPeriodSinceCreationInDays(@Nullable Output<Integer> immutabilityPeriodSinceCreationInDays) {
            this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
            return this;
        }
        public Builder immutabilityPeriodSinceCreationInDays(@Nullable Integer immutabilityPeriodSinceCreationInDays) {
            this.immutabilityPeriodSinceCreationInDays = Codegen.ofNullable(immutabilityPeriodSinceCreationInDays);
            return this;
        }
        public Builder immutabilityPolicyName(@Nullable Output<String> immutabilityPolicyName) {
            this.immutabilityPolicyName = immutabilityPolicyName;
            return this;
        }
        public Builder immutabilityPolicyName(@Nullable String immutabilityPolicyName) {
            this.immutabilityPolicyName = Codegen.ofNullable(immutabilityPolicyName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public BlobContainerImmutabilityPolicyArgs build() {
            return new BlobContainerImmutabilityPolicyArgs(accountName, allowProtectedAppendWrites, containerName, immutabilityPeriodSinceCreationInDays, immutabilityPolicyName, resourceGroupName);
        }
    }
}
