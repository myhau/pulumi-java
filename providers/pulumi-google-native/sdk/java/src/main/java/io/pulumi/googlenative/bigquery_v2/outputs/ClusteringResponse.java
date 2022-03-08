// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ClusteringResponse {
    /**
     * [Repeated] One or more fields on which data should be clustered. Only top-level, non-repeated, simple-type fields are supported. When you cluster a table using multiple columns, the order of columns you specify is important. The order of the specified columns determines the sort order of the data.
     * 
     */
    private final List<String> fields;

    @OutputCustomType.Constructor({"fields"})
    private ClusteringResponse(List<String> fields) {
        this.fields = fields;
    }

    /**
     * [Repeated] One or more fields on which data should be clustered. Only top-level, non-repeated, simple-type fields are supported. When you cluster a table using multiple columns, the order of columns you specify is important. The order of the specified columns determines the sort order of the data.
     * 
    */
    public List<String> getFields() {
        return this.fields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusteringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> fields;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusteringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
        }

        public Builder setFields(List<String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public ClusteringResponse build() {
            return new ClusteringResponse(fields);
        }
    }
}
