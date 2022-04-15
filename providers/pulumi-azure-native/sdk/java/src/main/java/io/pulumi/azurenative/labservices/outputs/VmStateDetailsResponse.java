// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VmStateDetailsResponse {
    /**
     * Last known compute power state captured in DTL
     * 
     */
    private final String lastKnownPowerState;
    /**
     * The power state of the reference virtual machine.
     * 
     */
    private final String powerState;
    /**
     * The RdpAuthority property is a server DNS host name or IP address followed by the service port number for RDP (Remote Desktop Protocol).
     * 
     */
    private final String rdpAuthority;
    /**
     * The SshAuthority property is a server DNS host name or IP address followed by the service port number for SSH.
     * 
     */
    private final String sshAuthority;

    @CustomType.Constructor
    private VmStateDetailsResponse(
        @CustomType.Parameter("lastKnownPowerState") String lastKnownPowerState,
        @CustomType.Parameter("powerState") String powerState,
        @CustomType.Parameter("rdpAuthority") String rdpAuthority,
        @CustomType.Parameter("sshAuthority") String sshAuthority) {
        this.lastKnownPowerState = lastKnownPowerState;
        this.powerState = powerState;
        this.rdpAuthority = rdpAuthority;
        this.sshAuthority = sshAuthority;
    }

    /**
     * Last known compute power state captured in DTL
     * 
    */
    public String lastKnownPowerState() {
        return this.lastKnownPowerState;
    }
    /**
     * The power state of the reference virtual machine.
     * 
    */
    public String powerState() {
        return this.powerState;
    }
    /**
     * The RdpAuthority property is a server DNS host name or IP address followed by the service port number for RDP (Remote Desktop Protocol).
     * 
    */
    public String rdpAuthority() {
        return this.rdpAuthority;
    }
    /**
     * The SshAuthority property is a server DNS host name or IP address followed by the service port number for SSH.
     * 
    */
    public String sshAuthority() {
        return this.sshAuthority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmStateDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastKnownPowerState;
        private String powerState;
        private String rdpAuthority;
        private String sshAuthority;

        public Builder() {
    	      // Empty
        }

        public Builder(VmStateDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastKnownPowerState = defaults.lastKnownPowerState;
    	      this.powerState = defaults.powerState;
    	      this.rdpAuthority = defaults.rdpAuthority;
    	      this.sshAuthority = defaults.sshAuthority;
        }

        public Builder lastKnownPowerState(String lastKnownPowerState) {
            this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
            return this;
        }
        public Builder powerState(String powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }
        public Builder rdpAuthority(String rdpAuthority) {
            this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
            return this;
        }
        public Builder sshAuthority(String sshAuthority) {
            this.sshAuthority = Objects.requireNonNull(sshAuthority);
            return this;
        }        public VmStateDetailsResponse build() {
            return new VmStateDetailsResponse(lastKnownPowerState, powerState, rdpAuthority, sshAuthority);
        }
    }
}
