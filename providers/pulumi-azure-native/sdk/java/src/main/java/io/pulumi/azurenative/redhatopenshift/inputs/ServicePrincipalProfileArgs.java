// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ServicePrincipalProfile represents a service principal profile.
 * 
 */
public final class ServicePrincipalProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalProfileArgs Empty = new ServicePrincipalProfileArgs();

    /**
     * The client ID used for the cluster (immutable).
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * The client secret used for the cluster (immutable).
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret == null ? Codegen.empty() : this.clientSecret;
    }

    public ServicePrincipalProfileArgs(
        @Nullable Output<String> clientId,
        @Nullable Output<String> clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    private ServicePrincipalProfileArgs() {
        this.clientId = Codegen.empty();
        this.clientSecret = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Codegen.ofNullable(clientSecret);
            return this;
        }        public ServicePrincipalProfileArgs build() {
            return new ServicePrincipalProfileArgs(clientId, clientSecret);
        }
    }
}
