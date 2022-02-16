// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionVpcConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModelQualityJobDefinitionNetworkConfig {
    private final @Nullable Boolean enableInterContainerTrafficEncryption;
    private final @Nullable Boolean enableNetworkIsolation;
    private final @Nullable ModelQualityJobDefinitionVpcConfig vpcConfig;

    @OutputCustomType.Constructor({"enableInterContainerTrafficEncryption","enableNetworkIsolation","vpcConfig"})
    private ModelQualityJobDefinitionNetworkConfig(
        @Nullable Boolean enableInterContainerTrafficEncryption,
        @Nullable Boolean enableNetworkIsolation,
        @Nullable ModelQualityJobDefinitionVpcConfig vpcConfig) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.vpcConfig = vpcConfig;
    }

    public Optional<Boolean> getEnableInterContainerTrafficEncryption() {
        return Optional.ofNullable(this.enableInterContainerTrafficEncryption);
    }
    public Optional<Boolean> getEnableNetworkIsolation() {
        return Optional.ofNullable(this.enableNetworkIsolation);
    }
    public Optional<ModelQualityJobDefinitionVpcConfig> getVpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableInterContainerTrafficEncryption;
        private @Nullable Boolean enableNetworkIsolation;
        private @Nullable ModelQualityJobDefinitionVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInterContainerTrafficEncryption = defaults.enableInterContainerTrafficEncryption;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setEnableInterContainerTrafficEncryption(@Nullable Boolean enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }

        public Builder setEnableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        public Builder setVpcConfig(@Nullable ModelQualityJobDefinitionVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public ModelQualityJobDefinitionNetworkConfig build() {
            return new ModelQualityJobDefinitionNetworkConfig(enableInterContainerTrafficEncryption, enableNetworkIsolation, vpcConfig);
        }
    }
}