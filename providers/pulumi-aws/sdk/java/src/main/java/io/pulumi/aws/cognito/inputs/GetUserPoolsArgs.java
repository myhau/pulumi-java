// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserPoolsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserPoolsArgs Empty = new GetUserPoolsArgs();

    /**
     * Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetUserPoolsArgs(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetUserPoolsArgs() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetUserPoolsArgs build() {
            return new GetUserPoolsArgs(name);
        }
    }
}
