// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RouterNatLogConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatLogConfigGetArgs Empty = new RouterNatLogConfigGetArgs();

    /**
     * Indicates whether or not to export logs.
     * 
     */
    @InputImport(name="enable", required=true)
    private final Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable;
    }

    /**
     * Specifies the desired filtering of logs on this NAT.
     * Possible values are `ERRORS_ONLY`, `TRANSLATIONS_ONLY`, and `ALL`.
     * 
     */
    @InputImport(name="filter", required=true)
    private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    public RouterNatLogConfigGetArgs(
        Input<Boolean> enable,
        Input<String> filter) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
    }

    private RouterNatLogConfigGetArgs() {
        this.enable = Input.empty();
        this.filter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatLogConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enable;
        private Input<String> filter;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatLogConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
        }

        public Builder setEnable(Input<Boolean> enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Input.of(Objects.requireNonNull(enable));
            return this;
        }

        public Builder setFilter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public RouterNatLogConfigGetArgs build() {
            return new RouterNatLogConfigGetArgs(enable, filter);
        }
    }
}
