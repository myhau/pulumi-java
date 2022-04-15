// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureFirewallIpGroupsResponse {
    /**
     * The iteration number.
     * 
     */
    private final String changeNumber;
    /**
     * Resource ID.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private AzureFirewallIpGroupsResponse(
        @CustomType.Parameter("changeNumber") String changeNumber,
        @CustomType.Parameter("id") String id) {
        this.changeNumber = changeNumber;
        this.id = id;
    }

    /**
     * The iteration number.
     * 
    */
    public String changeNumber() {
        return this.changeNumber;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallIpGroupsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String changeNumber;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallIpGroupsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeNumber = defaults.changeNumber;
    	      this.id = defaults.id;
        }

        public Builder changeNumber(String changeNumber) {
            this.changeNumber = Objects.requireNonNull(changeNumber);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public AzureFirewallIpGroupsResponse build() {
            return new AzureFirewallIpGroupsResponse(changeNumber, id);
        }
    }
}
