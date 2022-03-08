// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourcePackageResourceAPTResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourcePackageResourceDebResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourcePackageResourceGooGetResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourcePackageResourceMSIResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourcePackageResourceRPMResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourcePackageResourceYUMResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourcePackageResourceZypperResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourcePackageResourceResponse {
    /**
     * A package managed by Apt.
     * 
     */
    private final OSPolicyResourcePackageResourceAPTResponse apt;
    /**
     * A deb package file.
     * 
     */
    private final OSPolicyResourcePackageResourceDebResponse deb;
    /**
     * The desired state the agent should maintain for this package.
     * 
     */
    private final String desiredState;
    /**
     * A package managed by GooGet.
     * 
     */
    private final OSPolicyResourcePackageResourceGooGetResponse googet;
    /**
     * An MSI package.
     * 
     */
    private final OSPolicyResourcePackageResourceMSIResponse msi;
    /**
     * An rpm package file.
     * 
     */
    private final OSPolicyResourcePackageResourceRPMResponse rpm;
    /**
     * A package managed by YUM.
     * 
     */
    private final OSPolicyResourcePackageResourceYUMResponse yum;
    /**
     * A package managed by Zypper.
     * 
     */
    private final OSPolicyResourcePackageResourceZypperResponse zypper;

    @OutputCustomType.Constructor({"apt","deb","desiredState","googet","msi","rpm","yum","zypper"})
    private OSPolicyResourcePackageResourceResponse(
        OSPolicyResourcePackageResourceAPTResponse apt,
        OSPolicyResourcePackageResourceDebResponse deb,
        String desiredState,
        OSPolicyResourcePackageResourceGooGetResponse googet,
        OSPolicyResourcePackageResourceMSIResponse msi,
        OSPolicyResourcePackageResourceRPMResponse rpm,
        OSPolicyResourcePackageResourceYUMResponse yum,
        OSPolicyResourcePackageResourceZypperResponse zypper) {
        this.apt = apt;
        this.deb = deb;
        this.desiredState = desiredState;
        this.googet = googet;
        this.msi = msi;
        this.rpm = rpm;
        this.yum = yum;
        this.zypper = zypper;
    }

    /**
     * A package managed by Apt.
     * 
    */
    public OSPolicyResourcePackageResourceAPTResponse getApt() {
        return this.apt;
    }
    /**
     * A deb package file.
     * 
    */
    public OSPolicyResourcePackageResourceDebResponse getDeb() {
        return this.deb;
    }
    /**
     * The desired state the agent should maintain for this package.
     * 
    */
    public String getDesiredState() {
        return this.desiredState;
    }
    /**
     * A package managed by GooGet.
     * 
    */
    public OSPolicyResourcePackageResourceGooGetResponse getGooget() {
        return this.googet;
    }
    /**
     * An MSI package.
     * 
    */
    public OSPolicyResourcePackageResourceMSIResponse getMsi() {
        return this.msi;
    }
    /**
     * An rpm package file.
     * 
    */
    public OSPolicyResourcePackageResourceRPMResponse getRpm() {
        return this.rpm;
    }
    /**
     * A package managed by YUM.
     * 
    */
    public OSPolicyResourcePackageResourceYUMResponse getYum() {
        return this.yum;
    }
    /**
     * A package managed by Zypper.
     * 
    */
    public OSPolicyResourcePackageResourceZypperResponse getZypper() {
        return this.zypper;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceAPTResponse apt;
        private OSPolicyResourcePackageResourceDebResponse deb;
        private String desiredState;
        private OSPolicyResourcePackageResourceGooGetResponse googet;
        private OSPolicyResourcePackageResourceMSIResponse msi;
        private OSPolicyResourcePackageResourceRPMResponse rpm;
        private OSPolicyResourcePackageResourceYUMResponse yum;
        private OSPolicyResourcePackageResourceZypperResponse zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.deb = defaults.deb;
    	      this.desiredState = defaults.desiredState;
    	      this.googet = defaults.googet;
    	      this.msi = defaults.msi;
    	      this.rpm = defaults.rpm;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder setApt(OSPolicyResourcePackageResourceAPTResponse apt) {
            this.apt = Objects.requireNonNull(apt);
            return this;
        }

        public Builder setDeb(OSPolicyResourcePackageResourceDebResponse deb) {
            this.deb = Objects.requireNonNull(deb);
            return this;
        }

        public Builder setDesiredState(String desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder setGooget(OSPolicyResourcePackageResourceGooGetResponse googet) {
            this.googet = Objects.requireNonNull(googet);
            return this;
        }

        public Builder setMsi(OSPolicyResourcePackageResourceMSIResponse msi) {
            this.msi = Objects.requireNonNull(msi);
            return this;
        }

        public Builder setRpm(OSPolicyResourcePackageResourceRPMResponse rpm) {
            this.rpm = Objects.requireNonNull(rpm);
            return this;
        }

        public Builder setYum(OSPolicyResourcePackageResourceYUMResponse yum) {
            this.yum = Objects.requireNonNull(yum);
            return this;
        }

        public Builder setZypper(OSPolicyResourcePackageResourceZypperResponse zypper) {
            this.zypper = Objects.requireNonNull(zypper);
            return this;
        }
        public OSPolicyResourcePackageResourceResponse build() {
            return new OSPolicyResourcePackageResourceResponse(apt, deb, desiredState, googet, msi, rpm, yum, zypper);
        }
    }
}
