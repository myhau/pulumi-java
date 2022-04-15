// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.enums.ReadOnlyEndpointFailoverPolicy;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Read-only endpoint of the failover group instance.
 * 
 */
public final class InstanceFailoverGroupReadOnlyEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFailoverGroupReadOnlyEndpointArgs Empty = new InstanceFailoverGroupReadOnlyEndpointArgs();

    /**
     * Failover policy of the read-only endpoint for the failover group.
     * 
     */
    @Import(name="failoverPolicy")
      private final @Nullable Output<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy;

    public Output<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy() {
        return this.failoverPolicy == null ? Codegen.empty() : this.failoverPolicy;
    }

    public InstanceFailoverGroupReadOnlyEndpointArgs(@Nullable Output<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy) {
        this.failoverPolicy = failoverPolicy;
    }

    private InstanceFailoverGroupReadOnlyEndpointArgs() {
        this.failoverPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFailoverGroupReadOnlyEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFailoverGroupReadOnlyEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPolicy = defaults.failoverPolicy;
        }

        public Builder failoverPolicy(@Nullable Output<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy) {
            this.failoverPolicy = failoverPolicy;
            return this;
        }
        public Builder failoverPolicy(@Nullable Either<String,ReadOnlyEndpointFailoverPolicy> failoverPolicy) {
            this.failoverPolicy = Codegen.ofNullable(failoverPolicy);
            return this;
        }        public InstanceFailoverGroupReadOnlyEndpointArgs build() {
            return new InstanceFailoverGroupReadOnlyEndpointArgs(failoverPolicy);
        }
    }
}
