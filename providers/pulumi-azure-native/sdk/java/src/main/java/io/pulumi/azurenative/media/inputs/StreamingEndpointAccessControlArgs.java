// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AkamaiAccessControlArgs;
import io.pulumi.azurenative.media.inputs.IPAccessControlArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Streaming endpoint access control definition.
 * 
 */
public final class StreamingEndpointAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingEndpointAccessControlArgs Empty = new StreamingEndpointAccessControlArgs();

    /**
     * The access control of Akamai
     * 
     */
    @Import(name="akamai")
      private final @Nullable Output<AkamaiAccessControlArgs> akamai;

    public Output<AkamaiAccessControlArgs> akamai() {
        return this.akamai == null ? Codegen.empty() : this.akamai;
    }

    /**
     * The IP access control of the streaming endpoint.
     * 
     */
    @Import(name="ip")
      private final @Nullable Output<IPAccessControlArgs> ip;

    public Output<IPAccessControlArgs> ip() {
        return this.ip == null ? Codegen.empty() : this.ip;
    }

    public StreamingEndpointAccessControlArgs(
        @Nullable Output<AkamaiAccessControlArgs> akamai,
        @Nullable Output<IPAccessControlArgs> ip) {
        this.akamai = akamai;
        this.ip = ip;
    }

    private StreamingEndpointAccessControlArgs() {
        this.akamai = Codegen.empty();
        this.ip = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingEndpointAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AkamaiAccessControlArgs> akamai;
        private @Nullable Output<IPAccessControlArgs> ip;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingEndpointAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.akamai = defaults.akamai;
    	      this.ip = defaults.ip;
        }

        public Builder akamai(@Nullable Output<AkamaiAccessControlArgs> akamai) {
            this.akamai = akamai;
            return this;
        }
        public Builder akamai(@Nullable AkamaiAccessControlArgs akamai) {
            this.akamai = Codegen.ofNullable(akamai);
            return this;
        }
        public Builder ip(@Nullable Output<IPAccessControlArgs> ip) {
            this.ip = ip;
            return this;
        }
        public Builder ip(@Nullable IPAccessControlArgs ip) {
            this.ip = Codegen.ofNullable(ip);
            return this;
        }        public StreamingEndpointAccessControlArgs build() {
            return new StreamingEndpointAccessControlArgs(akamai, ip);
        }
    }
}
