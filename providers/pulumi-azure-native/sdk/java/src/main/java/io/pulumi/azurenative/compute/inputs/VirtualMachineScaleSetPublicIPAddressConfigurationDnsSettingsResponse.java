// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a virtual machines scale sets network configuration's DNS settings.
 * 
 */
public final class VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse Empty = new VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse();

    /**
     * The Domain name label.The concatenation of the domain name label and vm index will be the domain name labels of the PublicIPAddress resources that will be created
     * 
     */
    @Import(name="domainNameLabel", required=true)
      private final String domainNameLabel;

    public String domainNameLabel() {
        return this.domainNameLabel;
    }

    public VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse(String domainNameLabel) {
        this.domainNameLabel = Objects.requireNonNull(domainNameLabel, "expected parameter 'domainNameLabel' to be non-null");
    }

    private VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse() {
        this.domainNameLabel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainNameLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
        }

        public Builder domainNameLabel(String domainNameLabel) {
            this.domainNameLabel = Objects.requireNonNull(domainNameLabel);
            return this;
        }        public VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse build() {
            return new VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse(domainNameLabel);
        }
    }
}
