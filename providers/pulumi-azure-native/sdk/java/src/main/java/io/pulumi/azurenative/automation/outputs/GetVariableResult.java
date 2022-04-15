// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVariableResult {
    /**
     * Gets or sets the creation time.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * Gets or sets the encrypted flag of the variable.
     * 
     */
    private final @Nullable Boolean isEncrypted;
    /**
     * Gets or sets the last modified time.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * Gets or sets the value of the variable.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private GetVariableResult(
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isEncrypted") @Nullable Boolean isEncrypted,
        @CustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.creationTime = creationTime;
        this.description = description;
        this.id = id;
        this.isEncrypted = isEncrypted;
        this.lastModifiedTime = lastModifiedTime;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * Gets or sets the creation time.
     * 
    */
    public Optional<String> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * Gets or sets the description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Fully qualified resource Id for the resource
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Gets or sets the encrypted flag of the variable.
     * 
    */
    public Optional<Boolean> isEncrypted() {
        return Optional.ofNullable(this.isEncrypted);
    }
    /**
     * Gets or sets the last modified time.
     * 
    */
    public Optional<String> lastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Gets or sets the value of the variable.
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String description;
        private String id;
        private @Nullable Boolean isEncrypted;
        private @Nullable String lastModifiedTime;
        private String name;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVariableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.isEncrypted = defaults.isEncrypted;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isEncrypted(@Nullable Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }
        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public GetVariableResult build() {
            return new GetVariableResult(creationTime, description, id, isEncrypted, lastModifiedTime, name, type, value);
        }
    }
}
