// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebACLAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLAssociationArgs Empty = new WebACLAssociationArgs();

    @InputImport(name="resourceArn", required=true)
    private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    @InputImport(name="webACLArn", required=true)
    private final Input<String> webACLArn;

    public Input<String> getWebACLArn() {
        return this.webACLArn;
    }

    public WebACLAssociationArgs(
        Input<String> resourceArn,
        Input<String> webACLArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.webACLArn = Objects.requireNonNull(webACLArn, "expected parameter 'webACLArn' to be non-null");
    }

    private WebACLAssociationArgs() {
        this.resourceArn = Input.empty();
        this.webACLArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceArn;
        private Input<String> webACLArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.webACLArn = defaults.webACLArn;
        }

        public Builder setResourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }

        public Builder setWebACLArn(Input<String> webACLArn) {
            this.webACLArn = Objects.requireNonNull(webACLArn);
            return this;
        }

        public Builder setWebACLArn(String webACLArn) {
            this.webACLArn = Input.of(Objects.requireNonNull(webACLArn));
            return this;
        }

        public WebACLAssociationArgs build() {
            return new WebACLAssociationArgs(resourceArn, webACLArn);
        }
    }
}