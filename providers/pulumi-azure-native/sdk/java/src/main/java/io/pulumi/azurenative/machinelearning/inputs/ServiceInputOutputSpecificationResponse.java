// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.TableSpecificationResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The swagger 2.0 schema describing the service's inputs or outputs. See Swagger specification: http://swagger.io/specification/
 * 
 */
public final class ServiceInputOutputSpecificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceInputOutputSpecificationResponse Empty = new ServiceInputOutputSpecificationResponse();

    /**
     * The description of the Swagger schema.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Specifies a collection that contains the column schema for each input or output of the web service. For more information, see the Swagger specification.
     * 
     */
    @Import(name="properties", required=true)
      private final Map<String,TableSpecificationResponse> properties;

    public Map<String,TableSpecificationResponse> properties() {
        return this.properties;
    }

    /**
     * The title of your Swagger schema.
     * 
     */
    @Import(name="title")
      private final @Nullable String title;

    public Optional<String> title() {
        return this.title == null ? Optional.empty() : Optional.ofNullable(this.title);
    }

    /**
     * The type of the entity described in swagger. Always 'object'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ServiceInputOutputSpecificationResponse(
        @Nullable String description,
        Map<String,TableSpecificationResponse> properties,
        @Nullable String title,
        String type) {
        this.description = description;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.title = title;
        this.type = type == null ? "object" : Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServiceInputOutputSpecificationResponse() {
        this.description = null;
        this.properties = Map.of();
        this.title = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceInputOutputSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private Map<String,TableSpecificationResponse> properties;
        private @Nullable String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceInputOutputSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder properties(Map<String,TableSpecificationResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ServiceInputOutputSpecificationResponse build() {
            return new ServiceInputOutputSpecificationResponse(description, properties, title, type);
        }
    }
}
