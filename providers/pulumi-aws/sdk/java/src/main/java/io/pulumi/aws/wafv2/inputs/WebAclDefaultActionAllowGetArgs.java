// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclDefaultActionAllowGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclDefaultActionAllowGetArgs Empty = new WebAclDefaultActionAllowGetArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @InputImport(name="customRequestHandling")
      private final @Nullable Input<WebAclDefaultActionAllowCustomRequestHandlingGetArgs> customRequestHandling;

    public Input<WebAclDefaultActionAllowCustomRequestHandlingGetArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Input.empty() : this.customRequestHandling;
    }

    public WebAclDefaultActionAllowGetArgs(@Nullable Input<WebAclDefaultActionAllowCustomRequestHandlingGetArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private WebAclDefaultActionAllowGetArgs() {
        this.customRequestHandling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionAllowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclDefaultActionAllowCustomRequestHandlingGetArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultActionAllowGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable Input<WebAclDefaultActionAllowCustomRequestHandlingGetArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder setCustomRequestHandling(@Nullable WebAclDefaultActionAllowCustomRequestHandlingGetArgs customRequestHandling) {
            this.customRequestHandling = Input.ofNullable(customRequestHandling);
            return this;
        }
        public WebAclDefaultActionAllowGetArgs build() {
            return new WebAclDefaultActionAllowGetArgs(customRequestHandling);
        }
    }
}
