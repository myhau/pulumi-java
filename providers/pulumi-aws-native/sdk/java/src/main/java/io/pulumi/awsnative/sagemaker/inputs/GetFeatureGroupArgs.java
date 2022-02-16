// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFeatureGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFeatureGroupArgs Empty = new GetFeatureGroupArgs();

    @InputImport(name="featureGroupName", required=true)
    private final String featureGroupName;

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    public GetFeatureGroupArgs(String featureGroupName) {
        this.featureGroupName = Objects.requireNonNull(featureGroupName, "expected parameter 'featureGroupName' to be non-null");
    }

    private GetFeatureGroupArgs() {
        this.featureGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String featureGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFeatureGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureGroupName = defaults.featureGroupName;
        }

        public Builder setFeatureGroupName(String featureGroupName) {
            this.featureGroupName = Objects.requireNonNull(featureGroupName);
            return this;
        }

        public GetFeatureGroupArgs build() {
            return new GetFeatureGroupArgs(featureGroupName);
        }
    }
}