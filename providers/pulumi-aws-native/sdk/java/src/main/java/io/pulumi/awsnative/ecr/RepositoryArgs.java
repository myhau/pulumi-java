// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr;

import io.pulumi.awsnative.ecr.enums.RepositoryImageTagMutability;
import io.pulumi.awsnative.ecr.inputs.RepositoryEncryptionConfigurationArgs;
import io.pulumi.awsnative.ecr.inputs.RepositoryImageScanningConfigurationArgs;
import io.pulumi.awsnative.ecr.inputs.RepositoryLifecyclePolicyArgs;
import io.pulumi.awsnative.ecr.inputs.RepositoryTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    @InputImport(name="encryptionConfiguration")
    private final @Nullable Input<RepositoryEncryptionConfigurationArgs> encryptionConfiguration;

    public Input<RepositoryEncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    @InputImport(name="imageScanningConfiguration")
    private final @Nullable Input<RepositoryImageScanningConfigurationArgs> imageScanningConfiguration;

    public Input<RepositoryImageScanningConfigurationArgs> getImageScanningConfiguration() {
        return this.imageScanningConfiguration == null ? Input.empty() : this.imageScanningConfiguration;
    }

    @InputImport(name="imageTagMutability")
    private final @Nullable Input<RepositoryImageTagMutability> imageTagMutability;

    public Input<RepositoryImageTagMutability> getImageTagMutability() {
        return this.imageTagMutability == null ? Input.empty() : this.imageTagMutability;
    }

    @InputImport(name="lifecyclePolicy")
    private final @Nullable Input<RepositoryLifecyclePolicyArgs> lifecyclePolicy;

    public Input<RepositoryLifecyclePolicyArgs> getLifecyclePolicy() {
        return this.lifecyclePolicy == null ? Input.empty() : this.lifecyclePolicy;
    }

    @InputImport(name="repositoryName")
    private final @Nullable Input<String> repositoryName;

    public Input<String> getRepositoryName() {
        return this.repositoryName == null ? Input.empty() : this.repositoryName;
    }

    @InputImport(name="repositoryPolicyText")
    private final @Nullable Input<Object> repositoryPolicyText;

    public Input<Object> getRepositoryPolicyText() {
        return this.repositoryPolicyText == null ? Input.empty() : this.repositoryPolicyText;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<RepositoryTagArgs>> tags;

    public Input<List<RepositoryTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RepositoryArgs(
        @Nullable Input<RepositoryEncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Input<RepositoryImageScanningConfigurationArgs> imageScanningConfiguration,
        @Nullable Input<RepositoryImageTagMutability> imageTagMutability,
        @Nullable Input<RepositoryLifecyclePolicyArgs> lifecyclePolicy,
        @Nullable Input<String> repositoryName,
        @Nullable Input<Object> repositoryPolicyText,
        @Nullable Input<List<RepositoryTagArgs>> tags) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.imageScanningConfiguration = imageScanningConfiguration;
        this.imageTagMutability = imageTagMutability;
        this.lifecyclePolicy = lifecyclePolicy;
        this.repositoryName = repositoryName;
        this.repositoryPolicyText = repositoryPolicyText;
        this.tags = tags;
    }

    private RepositoryArgs() {
        this.encryptionConfiguration = Input.empty();
        this.imageScanningConfiguration = Input.empty();
        this.imageTagMutability = Input.empty();
        this.lifecyclePolicy = Input.empty();
        this.repositoryName = Input.empty();
        this.repositoryPolicyText = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RepositoryEncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Input<RepositoryImageScanningConfigurationArgs> imageScanningConfiguration;
        private @Nullable Input<RepositoryImageTagMutability> imageTagMutability;
        private @Nullable Input<RepositoryLifecyclePolicyArgs> lifecyclePolicy;
        private @Nullable Input<String> repositoryName;
        private @Nullable Input<Object> repositoryPolicyText;
        private @Nullable Input<List<RepositoryTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.imageScanningConfiguration = defaults.imageScanningConfiguration;
    	      this.imageTagMutability = defaults.imageTagMutability;
    	      this.lifecyclePolicy = defaults.lifecyclePolicy;
    	      this.repositoryName = defaults.repositoryName;
    	      this.repositoryPolicyText = defaults.repositoryPolicyText;
    	      this.tags = defaults.tags;
        }

        public Builder setEncryptionConfiguration(@Nullable Input<RepositoryEncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable RepositoryEncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder setImageScanningConfiguration(@Nullable Input<RepositoryImageScanningConfigurationArgs> imageScanningConfiguration) {
            this.imageScanningConfiguration = imageScanningConfiguration;
            return this;
        }

        public Builder setImageScanningConfiguration(@Nullable RepositoryImageScanningConfigurationArgs imageScanningConfiguration) {
            this.imageScanningConfiguration = Input.ofNullable(imageScanningConfiguration);
            return this;
        }

        public Builder setImageTagMutability(@Nullable Input<RepositoryImageTagMutability> imageTagMutability) {
            this.imageTagMutability = imageTagMutability;
            return this;
        }

        public Builder setImageTagMutability(@Nullable RepositoryImageTagMutability imageTagMutability) {
            this.imageTagMutability = Input.ofNullable(imageTagMutability);
            return this;
        }

        public Builder setLifecyclePolicy(@Nullable Input<RepositoryLifecyclePolicyArgs> lifecyclePolicy) {
            this.lifecyclePolicy = lifecyclePolicy;
            return this;
        }

        public Builder setLifecyclePolicy(@Nullable RepositoryLifecyclePolicyArgs lifecyclePolicy) {
            this.lifecyclePolicy = Input.ofNullable(lifecyclePolicy);
            return this;
        }

        public Builder setRepositoryName(@Nullable Input<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder setRepositoryName(@Nullable String repositoryName) {
            this.repositoryName = Input.ofNullable(repositoryName);
            return this;
        }

        public Builder setRepositoryPolicyText(@Nullable Input<Object> repositoryPolicyText) {
            this.repositoryPolicyText = repositoryPolicyText;
            return this;
        }

        public Builder setRepositoryPolicyText(@Nullable Object repositoryPolicyText) {
            this.repositoryPolicyText = Input.ofNullable(repositoryPolicyText);
            return this;
        }

        public Builder setTags(@Nullable Input<List<RepositoryTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<RepositoryTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public RepositoryArgs build() {
            return new RepositoryArgs(encryptionConfiguration, imageScanningConfiguration, imageTagMutability, lifecyclePolicy, repositoryName, repositoryPolicyText, tags);
        }
    }
}