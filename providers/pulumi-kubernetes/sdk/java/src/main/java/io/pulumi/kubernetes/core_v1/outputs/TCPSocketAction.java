// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TCPSocketAction {
    private final @Nullable String host;
    private final Either<Integer,String> port;

    @OutputCustomType.Constructor({"host","port"})
    private TCPSocketAction(
        @Nullable String host,
        Either<Integer,String> port) {
        this.host = host;
        this.port = Objects.requireNonNull(port);
    }

    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    public Either<Integer,String> getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TCPSocketAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private Either<Integer,String> port;

        public Builder() {
    	      // Empty
        }

        public Builder(TCPSocketAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setPort(Either<Integer,String> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public TCPSocketAction build() {
            return new TCPSocketAction(host, port);
        }
    }
}