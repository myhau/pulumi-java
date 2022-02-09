// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RequestResponse {
    private final @Nullable String addr;
    private final @Nullable String host;
    private final @Nullable String id;
    private final @Nullable String method;
    private final @Nullable String useragent;

    @OutputCustomType.Constructor({"addr","host","id","method","useragent"})
    private RequestResponse(
        @Nullable String addr,
        @Nullable String host,
        @Nullable String id,
        @Nullable String method,
        @Nullable String useragent) {
        this.addr = addr;
        this.host = host;
        this.id = id;
        this.method = method;
        this.useragent = useragent;
    }

    public Optional<String> getAddr() {
        return Optional.ofNullable(this.addr);
    }
    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getMethod() {
        return Optional.ofNullable(this.method);
    }
    public Optional<String> getUseragent() {
        return Optional.ofNullable(this.useragent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addr;
        private @Nullable String host;
        private @Nullable String id;
        private @Nullable String method;
        private @Nullable String useragent;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addr = defaults.addr;
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.method = defaults.method;
    	      this.useragent = defaults.useragent;
        }

        public Builder setAddr(@Nullable String addr) {
            this.addr = addr;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = method;
            return this;
        }

        public Builder setUseragent(@Nullable String useragent) {
            this.useragent = useragent;
            return this;
        }

        public RequestResponse build() {
            return new RequestResponse(addr, host, id, method, useragent);
        }
    }
}