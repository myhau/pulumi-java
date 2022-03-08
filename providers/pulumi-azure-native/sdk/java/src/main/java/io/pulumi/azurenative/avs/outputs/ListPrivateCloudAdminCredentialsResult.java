// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListPrivateCloudAdminCredentialsResult {
    /**
     * NSX-T Manager password
     * 
     */
    private final String nsxtPassword;
    /**
     * NSX-T Manager username
     * 
     */
    private final String nsxtUsername;
    /**
     * vCenter admin password
     * 
     */
    private final String vcenterPassword;
    /**
     * vCenter admin username
     * 
     */
    private final String vcenterUsername;

    @OutputCustomType.Constructor({"nsxtPassword","nsxtUsername","vcenterPassword","vcenterUsername"})
    private ListPrivateCloudAdminCredentialsResult(
        String nsxtPassword,
        String nsxtUsername,
        String vcenterPassword,
        String vcenterUsername) {
        this.nsxtPassword = nsxtPassword;
        this.nsxtUsername = nsxtUsername;
        this.vcenterPassword = vcenterPassword;
        this.vcenterUsername = vcenterUsername;
    }

    /**
     * NSX-T Manager password
     * 
    */
    public String getNsxtPassword() {
        return this.nsxtPassword;
    }
    /**
     * NSX-T Manager username
     * 
    */
    public String getNsxtUsername() {
        return this.nsxtUsername;
    }
    /**
     * vCenter admin password
     * 
    */
    public String getVcenterPassword() {
        return this.vcenterPassword;
    }
    /**
     * vCenter admin username
     * 
    */
    public String getVcenterUsername() {
        return this.vcenterUsername;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListPrivateCloudAdminCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nsxtPassword;
        private String nsxtUsername;
        private String vcenterPassword;
        private String vcenterUsername;

        public Builder() {
    	      // Empty
        }

        public Builder(ListPrivateCloudAdminCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nsxtPassword = defaults.nsxtPassword;
    	      this.nsxtUsername = defaults.nsxtUsername;
    	      this.vcenterPassword = defaults.vcenterPassword;
    	      this.vcenterUsername = defaults.vcenterUsername;
        }

        public Builder setNsxtPassword(String nsxtPassword) {
            this.nsxtPassword = Objects.requireNonNull(nsxtPassword);
            return this;
        }

        public Builder setNsxtUsername(String nsxtUsername) {
            this.nsxtUsername = Objects.requireNonNull(nsxtUsername);
            return this;
        }

        public Builder setVcenterPassword(String vcenterPassword) {
            this.vcenterPassword = Objects.requireNonNull(vcenterPassword);
            return this;
        }

        public Builder setVcenterUsername(String vcenterUsername) {
            this.vcenterUsername = Objects.requireNonNull(vcenterUsername);
            return this;
        }
        public ListPrivateCloudAdminCredentialsResult build() {
            return new ListPrivateCloudAdminCredentialsResult(nsxtPassword, nsxtUsername, vcenterPassword, vcenterUsername);
        }
    }
}
