// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigItemArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyCustomHeadersConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyCustomHeadersConfigArgs Empty = new ResponseHeadersPolicyCustomHeadersConfigArgs();

    @InputImport(name="items")
      private final @Nullable Input<List<ResponseHeadersPolicyCustomHeadersConfigItemArgs>> items;

    public Input<List<ResponseHeadersPolicyCustomHeadersConfigItemArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    public ResponseHeadersPolicyCustomHeadersConfigArgs(@Nullable Input<List<ResponseHeadersPolicyCustomHeadersConfigItemArgs>> items) {
        this.items = items;
    }

    private ResponseHeadersPolicyCustomHeadersConfigArgs() {
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCustomHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ResponseHeadersPolicyCustomHeadersConfigItemArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCustomHeadersConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable Input<List<ResponseHeadersPolicyCustomHeadersConfigItemArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<ResponseHeadersPolicyCustomHeadersConfigItemArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }
        public ResponseHeadersPolicyCustomHeadersConfigArgs build() {
            return new ResponseHeadersPolicyCustomHeadersConfigArgs(items);
        }
    }
}
