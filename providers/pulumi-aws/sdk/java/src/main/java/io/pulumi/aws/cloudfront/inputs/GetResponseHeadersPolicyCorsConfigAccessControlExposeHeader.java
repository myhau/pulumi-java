// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader extends io.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader Empty = new GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader();

    @InputImport(name="items", required=true)
      private final List<String> items;

    public List<String> getItems() {
        return this.items;
    }

    public GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader(List<String> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader() {
        this.items = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader build() {
            return new GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader(items);
        }
    }
}
