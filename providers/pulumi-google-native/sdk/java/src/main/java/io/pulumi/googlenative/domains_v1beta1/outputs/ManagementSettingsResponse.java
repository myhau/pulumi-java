// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagementSettingsResponse {
    /**
     * The renewal method for this `Registration`.
     * 
     */
    private final String renewalMethod;
    /**
     * Controls whether the domain can be transferred to another registrar.
     * 
     */
    private final String transferLockState;

    @OutputCustomType.Constructor({"renewalMethod","transferLockState"})
    private ManagementSettingsResponse(
        String renewalMethod,
        String transferLockState) {
        this.renewalMethod = renewalMethod;
        this.transferLockState = transferLockState;
    }

    /**
     * The renewal method for this `Registration`.
     * 
    */
    public String getRenewalMethod() {
        return this.renewalMethod;
    }
    /**
     * Controls whether the domain can be transferred to another registrar.
     * 
    */
    public String getTransferLockState() {
        return this.transferLockState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String renewalMethod;
        private String transferLockState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.renewalMethod = defaults.renewalMethod;
    	      this.transferLockState = defaults.transferLockState;
        }

        public Builder setRenewalMethod(String renewalMethod) {
            this.renewalMethod = Objects.requireNonNull(renewalMethod);
            return this;
        }

        public Builder setTransferLockState(String transferLockState) {
            this.transferLockState = Objects.requireNonNull(transferLockState);
            return this;
        }
        public ManagementSettingsResponse build() {
            return new ManagementSettingsResponse(renewalMethod, transferLockState);
        }
    }
}
