// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.IntegrationRuntimeComputePropertiesArgs;
import io.pulumi.azurenative.synapse.inputs.IntegrationRuntimeSsisPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedIntegrationRuntimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedIntegrationRuntimeArgs Empty = new ManagedIntegrationRuntimeArgs();

    @InputImport(name="computeProperties")
    private final @Nullable Input<IntegrationRuntimeComputePropertiesArgs> computeProperties;

    public Input<IntegrationRuntimeComputePropertiesArgs> getComputeProperties() {
        return this.computeProperties == null ? Input.empty() : this.computeProperties;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="ssisProperties")
    private final @Nullable Input<IntegrationRuntimeSsisPropertiesArgs> ssisProperties;

    public Input<IntegrationRuntimeSsisPropertiesArgs> getSsisProperties() {
        return this.ssisProperties == null ? Input.empty() : this.ssisProperties;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ManagedIntegrationRuntimeArgs(
        @Nullable Input<IntegrationRuntimeComputePropertiesArgs> computeProperties,
        @Nullable Input<String> description,
        @Nullable Input<IntegrationRuntimeSsisPropertiesArgs> ssisProperties,
        Input<String> type) {
        this.computeProperties = computeProperties;
        this.description = description;
        this.ssisProperties = ssisProperties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedIntegrationRuntimeArgs() {
        this.computeProperties = Input.empty();
        this.description = Input.empty();
        this.ssisProperties = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IntegrationRuntimeComputePropertiesArgs> computeProperties;
        private @Nullable Input<String> description;
        private @Nullable Input<IntegrationRuntimeSsisPropertiesArgs> ssisProperties;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeProperties = defaults.computeProperties;
    	      this.description = defaults.description;
    	      this.ssisProperties = defaults.ssisProperties;
    	      this.type = defaults.type;
        }

        public Builder setComputeProperties(@Nullable Input<IntegrationRuntimeComputePropertiesArgs> computeProperties) {
            this.computeProperties = computeProperties;
            return this;
        }

        public Builder setComputeProperties(@Nullable IntegrationRuntimeComputePropertiesArgs computeProperties) {
            this.computeProperties = Input.ofNullable(computeProperties);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setSsisProperties(@Nullable Input<IntegrationRuntimeSsisPropertiesArgs> ssisProperties) {
            this.ssisProperties = ssisProperties;
            return this;
        }

        public Builder setSsisProperties(@Nullable IntegrationRuntimeSsisPropertiesArgs ssisProperties) {
            this.ssisProperties = Input.ofNullable(ssisProperties);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ManagedIntegrationRuntimeArgs build() {
            return new ManagedIntegrationRuntimeArgs(computeProperties, description, ssisProperties, type);
        }
    }
}