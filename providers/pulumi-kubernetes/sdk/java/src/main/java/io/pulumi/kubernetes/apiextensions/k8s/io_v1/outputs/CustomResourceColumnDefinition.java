// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomResourceColumnDefinition {
    /**
     * description is a human readable description of this column.
     * 
     */
    private final @Nullable String description;
    /**
     * format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    private final @Nullable String format;
    /**
     * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
     * 
     */
    private final String jsonPath;
    /**
     * name is a human readable name for the column.
     * 
     */
    private final String name;
    /**
     * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","format","jsonPath","name","priority","type"})
    private CustomResourceColumnDefinition(
        @Nullable String description,
        @Nullable String format,
        String jsonPath,
        String name,
        @Nullable Integer priority,
        String type) {
        this.description = description;
        this.format = format;
        this.jsonPath = jsonPath;
        this.name = name;
        this.priority = priority;
        this.type = type;
    }

    /**
     * description is a human readable description of this column.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
    */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
     * 
    */
    public String getJsonPath() {
        return this.jsonPath;
    }
    /**
     * name is a human readable name for the column.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceColumnDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String format;
        private String jsonPath;
        private String name;
        private @Nullable Integer priority;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceColumnDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.jsonPath = defaults.jsonPath;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setJsonPath(String jsonPath) {
            this.jsonPath = Objects.requireNonNull(jsonPath);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public CustomResourceColumnDefinition build() {
            return new CustomResourceColumnDefinition(description, format, jsonPath, name, priority, type);
        }
    }
}
