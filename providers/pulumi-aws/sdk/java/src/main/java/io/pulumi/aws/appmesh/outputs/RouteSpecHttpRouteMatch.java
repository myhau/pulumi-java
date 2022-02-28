// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteMatchHeader;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteSpecHttpRouteMatch {
    /**
     * The client request headers to match on.
     * 
     */
    private final @Nullable List<RouteSpecHttpRouteMatchHeader> headers;
    /**
     * The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
     * 
     */
    private final @Nullable String method;
    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    private final String prefix;
    /**
     * The client request header scheme to match on. Valid values: `http`, `https`.
     * 
     */
    private final @Nullable String scheme;

    @OutputCustomType.Constructor({"headers","method","prefix","scheme"})
    private RouteSpecHttpRouteMatch(
        @Nullable List<RouteSpecHttpRouteMatchHeader> headers,
        @Nullable String method,
        String prefix,
        @Nullable String scheme) {
        this.headers = headers;
        this.method = method;
        this.prefix = Objects.requireNonNull(prefix);
        this.scheme = scheme;
    }

    /**
     * The client request headers to match on.
     * 
     */
    public List<RouteSpecHttpRouteMatchHeader> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
     * 
     */
    public Optional<String> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    public String getPrefix() {
        return this.prefix;
    }
    /**
     * The client request header scheme to match on. Valid values: `http`, `https`.
     * 
     */
    public Optional<String> getScheme() {
        return Optional.ofNullable(this.scheme);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RouteSpecHttpRouteMatchHeader> headers;
        private @Nullable String method;
        private String prefix;
        private @Nullable String scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.prefix = defaults.prefix;
    	      this.scheme = defaults.scheme;
        }

        public Builder setHeaders(@Nullable List<RouteSpecHttpRouteMatchHeader> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = method;
            return this;
        }

        public Builder setPrefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }

        public Builder setScheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }
        public RouteSpecHttpRouteMatch build() {
            return new RouteSpecHttpRouteMatch(headers, method, prefix, scheme);
        }
    }
}
