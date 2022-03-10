// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ShieldedInstanceConfigResponse {
    /**
     * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the boot integrity of the instance. The attestation is performed against the integrity policy baseline. This baseline is initially derived from the implicitly trusted boot image when the instance is created.
     * 
     */
    private final Boolean enableIntegrityMonitoring;
    /**
     * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs authentic software by verifying the digital signature of all boot components, and halting the boot process if signature verification fails.
     * 
     */
    private final Boolean enableSecureBoot;

    @OutputCustomType.Constructor
    private ShieldedInstanceConfigResponse(
        @OutputCustomType.Parameter("enableIntegrityMonitoring") Boolean enableIntegrityMonitoring,
        @OutputCustomType.Parameter("enableSecureBoot") Boolean enableSecureBoot) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
    }

    /**
     * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the boot integrity of the instance. The attestation is performed against the integrity policy baseline. This baseline is initially derived from the implicitly trusted boot image when the instance is created.
     * 
    */
    public Boolean getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }
    /**
     * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs authentic software by verifying the digital signature of all boot components, and halting the boot process if signature verification fails.
     * 
    */
    public Boolean getEnableSecureBoot() {
        return this.enableSecureBoot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedInstanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedInstanceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
        }

        public Builder setEnableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }

        public Builder setEnableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }
        public ShieldedInstanceConfigResponse build() {
            return new ShieldedInstanceConfigResponse(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
