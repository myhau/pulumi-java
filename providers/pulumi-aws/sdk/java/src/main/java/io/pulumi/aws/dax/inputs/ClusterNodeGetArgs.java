// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dax.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeGetArgs Empty = new ClusterNodeGetArgs();

    @InputImport(name="address")
      private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    @InputImport(name="availabilityZone")
      private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The port used by the configuration endpoint
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public ClusterNodeGetArgs(
        @Nullable Input<String> address,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> id,
        @Nullable Input<Integer> port) {
        this.address = address;
        this.availabilityZone = availabilityZone;
        this.id = id;
        this.port = port;
    }

    private ClusterNodeGetArgs() {
        this.address = Input.empty();
        this.availabilityZone = Input.empty();
        this.id = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> id;
        private @Nullable Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.id = defaults.id;
    	      this.port = defaults.port;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }
        public ClusterNodeGetArgs build() {
            return new ClusterNodeGetArgs(address, availabilityZone, id, port);
        }
    }
}
