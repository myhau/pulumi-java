// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcPeeringConnectivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcPeeringConnectivityArgs Empty = new VpcPeeringConnectivityArgs();

    @InputImport(name="vpc")
    private final @Nullable Input<String> vpc;

    public Input<String> getVpc() {
        return this.vpc == null ? Input.empty() : this.vpc;
    }

    public VpcPeeringConnectivityArgs(@Nullable Input<String> vpc) {
        this.vpc = vpc;
    }

    private VpcPeeringConnectivityArgs() {
        this.vpc = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConnectivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpc = defaults.vpc;
        }

        public Builder setVpc(@Nullable Input<String> vpc) {
            this.vpc = vpc;
            return this;
        }

        public Builder setVpc(@Nullable String vpc) {
            this.vpc = Input.ofNullable(vpc);
            return this;
        }

        public VpcPeeringConnectivityArgs build() {
            return new VpcPeeringConnectivityArgs(vpc);
        }
    }
}