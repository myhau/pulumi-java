// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class StandardsSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardsSubscriptionArgs Empty = new StandardsSubscriptionArgs();

    /**
     * The ARN of a standard - see below.
     * 
     */
    @InputImport(name="standardsArn", required=true)
      private final Input<String> standardsArn;

    public Input<String> getStandardsArn() {
        return this.standardsArn;
    }

    public StandardsSubscriptionArgs(Input<String> standardsArn) {
        this.standardsArn = Objects.requireNonNull(standardsArn, "expected parameter 'standardsArn' to be non-null");
    }

    private StandardsSubscriptionArgs() {
        this.standardsArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardsSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> standardsArn;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardsSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.standardsArn = defaults.standardsArn;
        }

        public Builder setStandardsArn(Input<String> standardsArn) {
            this.standardsArn = Objects.requireNonNull(standardsArn);
            return this;
        }

        public Builder setStandardsArn(String standardsArn) {
            this.standardsArn = Input.of(Objects.requireNonNull(standardsArn));
            return this;
        }
        public StandardsSubscriptionArgs build() {
            return new StandardsSubscriptionArgs(standardsArn);
        }
    }
}
