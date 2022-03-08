// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse {
    /**
     * Matches values of the parent parameter with type 'INTEGER'. All values must lie in `integer_value_spec` of parent parameter.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"values"})
    private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse(List<String> values) {
        this.values = values;
    }

    /**
     * Matches values of the parent parameter with type 'INTEGER'. All values must lie in `integer_value_spec` of parent parameter.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse(values);
        }
    }
}
