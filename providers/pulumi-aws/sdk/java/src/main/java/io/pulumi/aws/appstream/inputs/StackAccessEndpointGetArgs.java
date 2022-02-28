// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackAccessEndpointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackAccessEndpointGetArgs Empty = new StackAccessEndpointGetArgs();

    @InputImport(name="endpointType", required=true)
      private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    @InputImport(name="vpceId")
      private final @Nullable Input<String> vpceId;

    public Input<String> getVpceId() {
        return this.vpceId == null ? Input.empty() : this.vpceId;
    }

    public StackAccessEndpointGetArgs(
        Input<String> endpointType,
        @Nullable Input<String> vpceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.vpceId = vpceId;
    }

    private StackAccessEndpointGetArgs() {
        this.endpointType = Input.empty();
        this.vpceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackAccessEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endpointType;
        private @Nullable Input<String> vpceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StackAccessEndpointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.vpceId = defaults.vpceId;
        }

        public Builder setEndpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder setVpceId(@Nullable Input<String> vpceId) {
            this.vpceId = vpceId;
            return this;
        }

        public Builder setVpceId(@Nullable String vpceId) {
            this.vpceId = Input.ofNullable(vpceId);
            return this;
        }
        public StackAccessEndpointGetArgs build() {
            return new StackAccessEndpointGetArgs(endpointType, vpceId);
        }
    }
}
