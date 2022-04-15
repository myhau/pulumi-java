// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Allowed Audiences validation flow.
 * 
 */
public final class AllowedAudiencesValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllowedAudiencesValidationArgs Empty = new AllowedAudiencesValidationArgs();

    /**
     * The configuration settings of the allowed list of audiences from which to validate the JWT token.
     * 
     */
    @Import(name="allowedAudiences")
      private final @Nullable Output<List<String>> allowedAudiences;

    public Output<List<String>> allowedAudiences() {
        return this.allowedAudiences == null ? Codegen.empty() : this.allowedAudiences;
    }

    public AllowedAudiencesValidationArgs(@Nullable Output<List<String>> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
    }

    private AllowedAudiencesValidationArgs() {
        this.allowedAudiences = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedAudiencesValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedAudiences;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedAudiencesValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
        }

        public Builder allowedAudiences(@Nullable Output<List<String>> allowedAudiences) {
            this.allowedAudiences = allowedAudiences;
            return this;
        }
        public Builder allowedAudiences(@Nullable List<String> allowedAudiences) {
            this.allowedAudiences = Codegen.ofNullable(allowedAudiences);
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }        public AllowedAudiencesValidationArgs build() {
            return new AllowedAudiencesValidationArgs(allowedAudiences);
        }
    }
}
