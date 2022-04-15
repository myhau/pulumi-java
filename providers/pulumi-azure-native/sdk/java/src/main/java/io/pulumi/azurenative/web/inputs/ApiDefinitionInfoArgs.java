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
 * Information about the formal API definition for the app.
 * 
 */
public final class ApiDefinitionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiDefinitionInfoArgs Empty = new ApiDefinitionInfoArgs();

    /**
     * The URL of the API definition.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public ApiDefinitionInfoArgs(@Nullable Output<String> url) {
        this.url = url;
    }

    private ApiDefinitionInfoArgs() {
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDefinitionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDefinitionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public ApiDefinitionInfoArgs build() {
            return new ApiDefinitionInfoArgs(url);
        }
    }
}
