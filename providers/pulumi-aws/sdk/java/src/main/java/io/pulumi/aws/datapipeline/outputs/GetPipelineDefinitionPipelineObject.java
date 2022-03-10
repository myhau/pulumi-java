// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.outputs;

import io.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionPipelineObjectField;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPipelineDefinitionPipelineObject {
    /**
     * Key-value pairs that define the properties of the object. See below
     * 
     */
    private final @Nullable List<GetPipelineDefinitionPipelineObjectField> fields;
    /**
     * ID of the object.
     * 
     */
    private final String id;
    /**
     * ARN of the storage connector.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"fields","id","name"})
    private GetPipelineDefinitionPipelineObject(
        @Nullable List<GetPipelineDefinitionPipelineObjectField> fields,
        String id,
        String name) {
        this.fields = fields;
        this.id = id;
        this.name = name;
    }

    /**
     * Key-value pairs that define the properties of the object. See below
     * 
    */
    public List<GetPipelineDefinitionPipelineObjectField> getFields() {
        return this.fields == null ? List.of() : this.fields;
    }
    /**
     * ID of the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * ARN of the storage connector.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineDefinitionPipelineObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetPipelineDefinitionPipelineObjectField> fields;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineDefinitionPipelineObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setFields(@Nullable List<GetPipelineDefinitionPipelineObjectField> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetPipelineDefinitionPipelineObject build() {
            return new GetPipelineDefinitionPipelineObject(fields, id, name);
        }
    }
}