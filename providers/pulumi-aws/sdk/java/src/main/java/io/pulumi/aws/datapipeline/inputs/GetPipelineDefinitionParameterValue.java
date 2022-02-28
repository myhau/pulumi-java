// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineDefinitionParameterValue extends io.pulumi.resources.InvokeArgs {

    public static final GetPipelineDefinitionParameterValue Empty = new GetPipelineDefinitionParameterValue();

    /**
     * ID of the object.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Field value, expressed as a String.
     * 
     */
    @InputImport(name="stringValue", required=true)
      private final String stringValue;

    public String getStringValue() {
        return this.stringValue;
    }

    public GetPipelineDefinitionParameterValue(
        String id,
        String stringValue) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.stringValue = Objects.requireNonNull(stringValue, "expected parameter 'stringValue' to be non-null");
    }

    private GetPipelineDefinitionParameterValue() {
        this.id = null;
        this.stringValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineDefinitionParameterValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineDefinitionParameterValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }
        public GetPipelineDefinitionParameterValue build() {
            return new GetPipelineDefinitionParameterValue(id, stringValue);
        }
    }
}
