// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterNodeConfigShieldedInstanceConfig {
    /**
     * Defines if the instance has integrity monitoring enabled.
     * 
     */
    private final @Nullable Boolean enableIntegrityMonitoring;
    /**
     * Defines if the instance has Secure Boot enabled.
     * 
     */
    private final @Nullable Boolean enableSecureBoot;

    @OutputCustomType.Constructor({"enableIntegrityMonitoring","enableSecureBoot"})
    private ClusterNodeConfigShieldedInstanceConfig(
        @Nullable Boolean enableIntegrityMonitoring,
        @Nullable Boolean enableSecureBoot) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
    }

    /**
     * Defines if the instance has integrity monitoring enabled.
     * 
     */
    public Optional<Boolean> getEnableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }
    /**
     * Defines if the instance has Secure Boot enabled.
     * 
     */
    public Optional<Boolean> getEnableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableIntegrityMonitoring;
        private @Nullable Boolean enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
        }

        public Builder setEnableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder setEnableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public ClusterNodeConfigShieldedInstanceConfig build() {
            return new ClusterNodeConfigShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
