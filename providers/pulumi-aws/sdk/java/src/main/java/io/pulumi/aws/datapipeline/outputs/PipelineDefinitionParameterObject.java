// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.outputs;

import io.pulumi.aws.datapipeline.outputs.PipelineDefinitionParameterObjectAttribute;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineDefinitionParameterObject {
    private final @Nullable List<PipelineDefinitionParameterObjectAttribute> attributes;
    /**
     * ID of the parameter value.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"attributes","id"})
    private PipelineDefinitionParameterObject(
        @Nullable List<PipelineDefinitionParameterObjectAttribute> attributes,
        String id) {
        this.attributes = attributes;
        this.id = Objects.requireNonNull(id);
    }

    public List<PipelineDefinitionParameterObjectAttribute> getAttributes() {
        return this.attributes == null ? List.of() : this.attributes;
    }
    /**
     * ID of the parameter value.
     * 
     */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionParameterObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PipelineDefinitionParameterObjectAttribute> attributes;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionParameterObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.id = defaults.id;
        }

        public Builder setAttributes(@Nullable List<PipelineDefinitionParameterObjectAttribute> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public PipelineDefinitionParameterObject build() {
            return new PipelineDefinitionParameterObject(attributes, id);
        }
    }
}
