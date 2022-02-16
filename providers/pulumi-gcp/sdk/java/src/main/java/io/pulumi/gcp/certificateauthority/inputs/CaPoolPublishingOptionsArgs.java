// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class CaPoolPublishingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolPublishingOptionsArgs Empty = new CaPoolPublishingOptionsArgs();

    @InputImport(name="publishCaCert", required=true)
    private final Input<Boolean> publishCaCert;

    public Input<Boolean> getPublishCaCert() {
        return this.publishCaCert;
    }

    @InputImport(name="publishCrl", required=true)
    private final Input<Boolean> publishCrl;

    public Input<Boolean> getPublishCrl() {
        return this.publishCrl;
    }

    public CaPoolPublishingOptionsArgs(
        Input<Boolean> publishCaCert,
        Input<Boolean> publishCrl) {
        this.publishCaCert = Objects.requireNonNull(publishCaCert, "expected parameter 'publishCaCert' to be non-null");
        this.publishCrl = Objects.requireNonNull(publishCrl, "expected parameter 'publishCrl' to be non-null");
    }

    private CaPoolPublishingOptionsArgs() {
        this.publishCaCert = Input.empty();
        this.publishCrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolPublishingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> publishCaCert;
        private Input<Boolean> publishCrl;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolPublishingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishCaCert = defaults.publishCaCert;
    	      this.publishCrl = defaults.publishCrl;
        }

        public Builder setPublishCaCert(Input<Boolean> publishCaCert) {
            this.publishCaCert = Objects.requireNonNull(publishCaCert);
            return this;
        }

        public Builder setPublishCaCert(Boolean publishCaCert) {
            this.publishCaCert = Input.of(Objects.requireNonNull(publishCaCert));
            return this;
        }

        public Builder setPublishCrl(Input<Boolean> publishCrl) {
            this.publishCrl = Objects.requireNonNull(publishCrl);
            return this;
        }

        public Builder setPublishCrl(Boolean publishCrl) {
            this.publishCrl = Input.of(Objects.requireNonNull(publishCrl));
            return this;
        }

        public CaPoolPublishingOptionsArgs build() {
            return new CaPoolPublishingOptionsArgs(publishCaCert, publishCrl);
        }
    }
}