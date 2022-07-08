// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Uses Google Cloud Endpoints to handle requests.
 * 
 */
public final class ApiEndpointHandlerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiEndpointHandlerArgs Empty = new ApiEndpointHandlerArgs();

    /**
     * Path to the script from the application root directory.
     * 
     */
    @Import(name="scriptPath")
    private @Nullable Output<String> scriptPath;

    /**
     * @return Path to the script from the application root directory.
     * 
     */
    public Optional<Output<String>> scriptPath() {
        return Optional.ofNullable(this.scriptPath);
    }

    private ApiEndpointHandlerArgs() {}

    private ApiEndpointHandlerArgs(ApiEndpointHandlerArgs $) {
        this.scriptPath = $.scriptPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiEndpointHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiEndpointHandlerArgs $;

        public Builder() {
            $ = new ApiEndpointHandlerArgs();
        }

        public Builder(ApiEndpointHandlerArgs defaults) {
            $ = new ApiEndpointHandlerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scriptPath Path to the script from the application root directory.
         * 
         * @return builder
         * 
         */
        public Builder scriptPath(@Nullable Output<String> scriptPath) {
            $.scriptPath = scriptPath;
            return this;
        }

        /**
         * @param scriptPath Path to the script from the application root directory.
         * 
         * @return builder
         * 
         */
        public Builder scriptPath(String scriptPath) {
            return scriptPath(Output.of(scriptPath));
        }

        public ApiEndpointHandlerArgs build() {
            return $;
        }
    }

}
