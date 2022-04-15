// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.inputs.ExchangeConnectionArgs;
import io.pulumi.azurenative.peering.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that define an exchange peering.
 * 
 */
public final class PeeringPropertiesExchangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeringPropertiesExchangeArgs Empty = new PeeringPropertiesExchangeArgs();

    /**
     * The set of connections that constitute an exchange peering.
     * 
     */
    @Import(name="connections")
      private final @Nullable Output<List<ExchangeConnectionArgs>> connections;

    public Output<List<ExchangeConnectionArgs>> connections() {
        return this.connections == null ? Codegen.empty() : this.connections;
    }

    /**
     * The reference of the peer ASN.
     * 
     */
    @Import(name="peerAsn")
      private final @Nullable Output<SubResourceArgs> peerAsn;

    public Output<SubResourceArgs> peerAsn() {
        return this.peerAsn == null ? Codegen.empty() : this.peerAsn;
    }

    public PeeringPropertiesExchangeArgs(
        @Nullable Output<List<ExchangeConnectionArgs>> connections,
        @Nullable Output<SubResourceArgs> peerAsn) {
        this.connections = connections;
        this.peerAsn = peerAsn;
    }

    private PeeringPropertiesExchangeArgs() {
        this.connections = Codegen.empty();
        this.peerAsn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringPropertiesExchangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ExchangeConnectionArgs>> connections;
        private @Nullable Output<SubResourceArgs> peerAsn;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringPropertiesExchangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connections = defaults.connections;
    	      this.peerAsn = defaults.peerAsn;
        }

        public Builder connections(@Nullable Output<List<ExchangeConnectionArgs>> connections) {
            this.connections = connections;
            return this;
        }
        public Builder connections(@Nullable List<ExchangeConnectionArgs> connections) {
            this.connections = Codegen.ofNullable(connections);
            return this;
        }
        public Builder connections(ExchangeConnectionArgs... connections) {
            return connections(List.of(connections));
        }
        public Builder peerAsn(@Nullable Output<SubResourceArgs> peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Builder peerAsn(@Nullable SubResourceArgs peerAsn) {
            this.peerAsn = Codegen.ofNullable(peerAsn);
            return this;
        }        public PeeringPropertiesExchangeArgs build() {
            return new PeeringPropertiesExchangeArgs(connections, peerAsn);
        }
    }
}
