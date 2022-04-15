// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.SsisEnvironmentReferenceResponse;
import io.pulumi.azurenative.synapse.inputs.SsisParameterResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis project.
 * 
 */
public final class SsisProjectResponse extends io.pulumi.resources.InvokeArgs {

    public static final SsisProjectResponse Empty = new SsisProjectResponse();

    /**
     * Metadata description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Environment reference in project
     * 
     */
    @Import(name="environmentRefs")
      private final @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs;

    public List<SsisEnvironmentReferenceResponse> environmentRefs() {
        return this.environmentRefs == null ? List.of() : this.environmentRefs;
    }

    /**
     * Folder id which contains project.
     * 
     */
    @Import(name="folderId")
      private final @Nullable Double folderId;

    public Optional<Double> folderId() {
        return this.folderId == null ? Optional.empty() : Optional.ofNullable(this.folderId);
    }

    /**
     * Metadata id.
     * 
     */
    @Import(name="id")
      private final @Nullable Double id;

    public Optional<Double> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Metadata name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Parameters in project
     * 
     */
    @Import(name="parameters")
      private final @Nullable List<SsisParameterResponse> parameters;

    public List<SsisParameterResponse> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    /**
     * The type of SSIS object metadata.
     * Expected value is 'Project'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Project version.
     * 
     */
    @Import(name="version")
      private final @Nullable Double version;

    public Optional<Double> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public SsisProjectResponse(
        @Nullable String description,
        @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs,
        @Nullable Double folderId,
        @Nullable Double id,
        @Nullable String name,
        @Nullable List<SsisParameterResponse> parameters,
        String type,
        @Nullable Double version) {
        this.description = description;
        this.environmentRefs = environmentRefs;
        this.folderId = folderId;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = version;
    }

    private SsisProjectResponse() {
        this.description = null;
        this.environmentRefs = List.of();
        this.folderId = null;
        this.id = null;
        this.name = null;
        this.parameters = List.of();
        this.type = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisProjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs;
        private @Nullable Double folderId;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable List<SsisParameterResponse> parameters;
        private String type;
        private @Nullable Double version;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisProjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.environmentRefs = defaults.environmentRefs;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder environmentRefs(@Nullable List<SsisEnvironmentReferenceResponse> environmentRefs) {
            this.environmentRefs = environmentRefs;
            return this;
        }
        public Builder environmentRefs(SsisEnvironmentReferenceResponse... environmentRefs) {
            return environmentRefs(List.of(environmentRefs));
        }
        public Builder folderId(@Nullable Double folderId) {
            this.folderId = folderId;
            return this;
        }
        public Builder id(@Nullable Double id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder parameters(@Nullable List<SsisParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(SsisParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable Double version) {
            this.version = version;
            return this;
        }        public SsisProjectResponse build() {
            return new SsisProjectResponse(description, environmentRefs, folderId, id, name, parameters, type, version);
        }
    }
}
