// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConstraintArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConstraintArgs Empty = new GetConstraintArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @InputImport(name="acceptLanguage")
      private final @Nullable String acceptLanguage;

    public Optional<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Optional.empty() : Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Description of the constraint.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Constraint identifier.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public GetConstraintArgs(
        @Nullable String acceptLanguage,
        @Nullable String description,
        String id) {
        this.acceptLanguage = acceptLanguage;
        this.description = description;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GetConstraintArgs() {
        this.acceptLanguage = null;
        this.description = null;
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private @Nullable String description;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
        }

        public Builder setAcceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetConstraintArgs build() {
            return new GetConstraintArgs(acceptLanguage, description, id);
        }
    }
}
