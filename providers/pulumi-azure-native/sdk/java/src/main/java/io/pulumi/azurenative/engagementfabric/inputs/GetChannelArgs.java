// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetChannelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetChannelArgs Empty = new GetChannelArgs();

    /**
     * Account Name
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * Channel Name
     * 
     */
    @Import(name="channelName", required=true)
      private final String channelName;

    public String channelName() {
        return this.channelName;
    }

    /**
     * Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetChannelArgs(
        String accountName,
        String channelName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetChannelArgs() {
        this.accountName = null;
        this.channelName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String channelName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.channelName = defaults.channelName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder channelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetChannelArgs build() {
            return new GetChannelArgs(accountName, channelName, resourceGroupName);
        }
    }
}
