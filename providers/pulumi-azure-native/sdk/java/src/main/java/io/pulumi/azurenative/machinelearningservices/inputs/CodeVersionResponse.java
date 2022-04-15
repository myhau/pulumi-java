// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Code asset version details.
 * 
 */
public final class CodeVersionResponse extends io.pulumi.resources.InvokeArgs {

    public static final CodeVersionResponse Empty = new CodeVersionResponse();

    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
     */
    @Import(name="datastoreId")
      private final @Nullable String datastoreId;

    public Optional<String> datastoreId() {
        return this.datastoreId == null ? Optional.empty() : Optional.ofNullable(this.datastoreId);
    }

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    @Import(name="isAnonymous")
      private final @Nullable Boolean isAnonymous;

    public Optional<Boolean> isAnonymous() {
        return this.isAnonymous == null ? Optional.empty() : Optional.ofNullable(this.isAnonymous);
    }

    /**
     * The path of the file/directory in the datastore.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String path() {
        return this.path;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
      private final @Nullable Map<String,String> properties;

    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public CodeVersionResponse(
        @Nullable String datastoreId,
        @Nullable String description,
        @Nullable Boolean isAnonymous,
        String path,
        @Nullable Map<String,String> properties,
        @Nullable Map<String,String> tags) {
        this.datastoreId = datastoreId;
        this.description = description;
        this.isAnonymous = isAnonymous;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.properties = properties;
        this.tags = tags;
    }

    private CodeVersionResponse() {
        this.datastoreId = null;
        this.description = null;
        this.isAnonymous = null;
        this.path = null;
        this.properties = Map.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String description;
        private @Nullable Boolean isAnonymous;
        private String path;
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.description = defaults.description;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.path = defaults.path;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder isAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public CodeVersionResponse build() {
            return new CodeVersionResponse(datastoreId, description, isAnonymous, path, properties, tags);
        }
    }
}
