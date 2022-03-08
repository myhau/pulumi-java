// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HttpRouteMatchPathResponse {
    /**
     * replacement string for matched part of the Uri.
     * 
     */
    private final @Nullable String rewrite;
    /**
     * how to match value in the Uri
     * 
     */
    private final String type;
    /**
     * Uri path to match for request.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"rewrite","type","value"})
    private HttpRouteMatchPathResponse(
        @Nullable String rewrite,
        String type,
        String value) {
        this.rewrite = rewrite;
        this.type = type;
        this.value = value;
    }

    /**
     * replacement string for matched part of the Uri.
     * 
    */
    public Optional<String> getRewrite() {
        return Optional.ofNullable(this.rewrite);
    }
    /**
     * how to match value in the Uri
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Uri path to match for request.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteMatchPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String rewrite;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteMatchPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rewrite = defaults.rewrite;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setRewrite(@Nullable String rewrite) {
            this.rewrite = rewrite;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public HttpRouteMatchPathResponse build() {
            return new HttpRouteMatchPathResponse(rewrite, type, value);
        }
    }
}
