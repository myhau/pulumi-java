// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLogGroupsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLogGroupsArgs Empty = new GetLogGroupsArgs();

    /**
     * The group prefix of the Cloudwatch log groups to list
     * 
     */
    @InputImport(name="logGroupNamePrefix", required=true)
      private final String logGroupNamePrefix;

    public String getLogGroupNamePrefix() {
        return this.logGroupNamePrefix;
    }

    public GetLogGroupsArgs(String logGroupNamePrefix) {
        this.logGroupNamePrefix = Objects.requireNonNull(logGroupNamePrefix, "expected parameter 'logGroupNamePrefix' to be non-null");
    }

    private GetLogGroupsArgs() {
        this.logGroupNamePrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logGroupNamePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogGroupsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupNamePrefix = defaults.logGroupNamePrefix;
        }

        public Builder setLogGroupNamePrefix(String logGroupNamePrefix) {
            this.logGroupNamePrefix = Objects.requireNonNull(logGroupNamePrefix);
            return this;
        }
        public GetLogGroupsArgs build() {
            return new GetLogGroupsArgs(logGroupNamePrefix);
        }
    }
}
