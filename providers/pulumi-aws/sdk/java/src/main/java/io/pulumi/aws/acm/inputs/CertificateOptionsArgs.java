// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateOptionsArgs Empty = new CertificateOptionsArgs();

    /**
     * Specifies whether certificate details should be added to a certificate transparency log. Valid values are `ENABLED` or `DISABLED`. See https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency for more details.
     * 
     */
    @InputImport(name="certificateTransparencyLoggingPreference")
      private final @Nullable Input<String> certificateTransparencyLoggingPreference;

    public Input<String> getCertificateTransparencyLoggingPreference() {
        return this.certificateTransparencyLoggingPreference == null ? Input.empty() : this.certificateTransparencyLoggingPreference;
    }

    public CertificateOptionsArgs(@Nullable Input<String> certificateTransparencyLoggingPreference) {
        this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference;
    }

    private CertificateOptionsArgs() {
        this.certificateTransparencyLoggingPreference = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateTransparencyLoggingPreference;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateTransparencyLoggingPreference = defaults.certificateTransparencyLoggingPreference;
        }

        public Builder setCertificateTransparencyLoggingPreference(@Nullable Input<String> certificateTransparencyLoggingPreference) {
            this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference;
            return this;
        }

        public Builder setCertificateTransparencyLoggingPreference(@Nullable String certificateTransparencyLoggingPreference) {
            this.certificateTransparencyLoggingPreference = Input.ofNullable(certificateTransparencyLoggingPreference);
            return this;
        }
        public CertificateOptionsArgs build() {
            return new CertificateOptionsArgs(certificateTransparencyLoggingPreference);
        }
    }
}
