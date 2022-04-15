// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.inputs.ApplicationInsightsComponentDataVolumeCapArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentCurrentBillingFeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentCurrentBillingFeatureArgs Empty = new ComponentCurrentBillingFeatureArgs();

    /**
     * Current enabled pricing plan. When the component is in the Enterprise plan, this will list both 'Basic' and 'Application Insights Enterprise'.
     * 
     */
    @Import(name="currentBillingFeatures")
      private final @Nullable Output<List<String>> currentBillingFeatures;

    public Output<List<String>> currentBillingFeatures() {
        return this.currentBillingFeatures == null ? Codegen.empty() : this.currentBillingFeatures;
    }

    /**
     * An Application Insights component daily data volume cap
     * 
     */
    @Import(name="dataVolumeCap")
      private final @Nullable Output<ApplicationInsightsComponentDataVolumeCapArgs> dataVolumeCap;

    public Output<ApplicationInsightsComponentDataVolumeCapArgs> dataVolumeCap() {
        return this.dataVolumeCap == null ? Codegen.empty() : this.dataVolumeCap;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    public ComponentCurrentBillingFeatureArgs(
        @Nullable Output<List<String>> currentBillingFeatures,
        @Nullable Output<ApplicationInsightsComponentDataVolumeCapArgs> dataVolumeCap,
        Output<String> resourceGroupName,
        Output<String> resourceName) {
        this.currentBillingFeatures = currentBillingFeatures;
        this.dataVolumeCap = dataVolumeCap;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ComponentCurrentBillingFeatureArgs() {
        this.currentBillingFeatures = Codegen.empty();
        this.dataVolumeCap = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentCurrentBillingFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> currentBillingFeatures;
        private @Nullable Output<ApplicationInsightsComponentDataVolumeCapArgs> dataVolumeCap;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentCurrentBillingFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentBillingFeatures = defaults.currentBillingFeatures;
    	      this.dataVolumeCap = defaults.dataVolumeCap;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder currentBillingFeatures(@Nullable Output<List<String>> currentBillingFeatures) {
            this.currentBillingFeatures = currentBillingFeatures;
            return this;
        }
        public Builder currentBillingFeatures(@Nullable List<String> currentBillingFeatures) {
            this.currentBillingFeatures = Codegen.ofNullable(currentBillingFeatures);
            return this;
        }
        public Builder currentBillingFeatures(String... currentBillingFeatures) {
            return currentBillingFeatures(List.of(currentBillingFeatures));
        }
        public Builder dataVolumeCap(@Nullable Output<ApplicationInsightsComponentDataVolumeCapArgs> dataVolumeCap) {
            this.dataVolumeCap = dataVolumeCap;
            return this;
        }
        public Builder dataVolumeCap(@Nullable ApplicationInsightsComponentDataVolumeCapArgs dataVolumeCap) {
            this.dataVolumeCap = Codegen.ofNullable(dataVolumeCap);
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
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }        public ComponentCurrentBillingFeatureArgs build() {
            return new ComponentCurrentBillingFeatureArgs(currentBillingFeatures, dataVolumeCap, resourceGroupName, resourceName);
        }
    }
}
