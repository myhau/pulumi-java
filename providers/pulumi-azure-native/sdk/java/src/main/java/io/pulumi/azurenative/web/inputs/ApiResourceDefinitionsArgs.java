// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * API Definitions
 * 
 */
public final class ApiResourceDefinitionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiResourceDefinitionsArgs Empty = new ApiResourceDefinitionsArgs();

    /**
     * The modified swagger URL
     * 
     */
    @Import(name="modifiedSwaggerUrl")
      private final @Nullable Output<String> modifiedSwaggerUrl;

    public Output<String> modifiedSwaggerUrl() {
        return this.modifiedSwaggerUrl == null ? Codegen.empty() : this.modifiedSwaggerUrl;
    }

    /**
     * The original swagger URL
     * 
     */
    @Import(name="originalSwaggerUrl")
      private final @Nullable Output<String> originalSwaggerUrl;

    public Output<String> originalSwaggerUrl() {
        return this.originalSwaggerUrl == null ? Codegen.empty() : this.originalSwaggerUrl;
    }

    public ApiResourceDefinitionsArgs(
        @Nullable Output<String> modifiedSwaggerUrl,
        @Nullable Output<String> originalSwaggerUrl) {
        this.modifiedSwaggerUrl = modifiedSwaggerUrl;
        this.originalSwaggerUrl = originalSwaggerUrl;
    }

    private ApiResourceDefinitionsArgs() {
        this.modifiedSwaggerUrl = Codegen.empty();
        this.originalSwaggerUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceDefinitionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> modifiedSwaggerUrl;
        private @Nullable Output<String> originalSwaggerUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceDefinitionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modifiedSwaggerUrl = defaults.modifiedSwaggerUrl;
    	      this.originalSwaggerUrl = defaults.originalSwaggerUrl;
        }

        public Builder modifiedSwaggerUrl(@Nullable Output<String> modifiedSwaggerUrl) {
            this.modifiedSwaggerUrl = modifiedSwaggerUrl;
            return this;
        }
        public Builder modifiedSwaggerUrl(@Nullable String modifiedSwaggerUrl) {
            this.modifiedSwaggerUrl = Codegen.ofNullable(modifiedSwaggerUrl);
            return this;
        }
        public Builder originalSwaggerUrl(@Nullable Output<String> originalSwaggerUrl) {
            this.originalSwaggerUrl = originalSwaggerUrl;
            return this;
        }
        public Builder originalSwaggerUrl(@Nullable String originalSwaggerUrl) {
            this.originalSwaggerUrl = Codegen.ofNullable(originalSwaggerUrl);
            return this;
        }        public ApiResourceDefinitionsArgs build() {
            return new ApiResourceDefinitionsArgs(modifiedSwaggerUrl, originalSwaggerUrl);
        }
    }
}
