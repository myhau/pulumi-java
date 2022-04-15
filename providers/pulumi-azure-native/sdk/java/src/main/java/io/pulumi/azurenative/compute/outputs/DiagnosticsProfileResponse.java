// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.BootDiagnosticsResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiagnosticsProfileResponse {
    /**
     * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. <br><br> You can easily view the output of your console log. <br><br> Azure also enables you to see a screenshot of the VM from the hypervisor.
     * 
     */
    private final @Nullable BootDiagnosticsResponse bootDiagnostics;

    @CustomType.Constructor
    private DiagnosticsProfileResponse(@CustomType.Parameter("bootDiagnostics") @Nullable BootDiagnosticsResponse bootDiagnostics) {
        this.bootDiagnostics = bootDiagnostics;
    }

    /**
     * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. <br><br> You can easily view the output of your console log. <br><br> Azure also enables you to see a screenshot of the VM from the hypervisor.
     * 
    */
    public Optional<BootDiagnosticsResponse> bootDiagnostics() {
        return Optional.ofNullable(this.bootDiagnostics);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BootDiagnosticsResponse bootDiagnostics;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiagnostics = defaults.bootDiagnostics;
        }

        public Builder bootDiagnostics(@Nullable BootDiagnosticsResponse bootDiagnostics) {
            this.bootDiagnostics = bootDiagnostics;
            return this;
        }        public DiagnosticsProfileResponse build() {
            return new DiagnosticsProfileResponse(bootDiagnostics);
        }
    }
}
