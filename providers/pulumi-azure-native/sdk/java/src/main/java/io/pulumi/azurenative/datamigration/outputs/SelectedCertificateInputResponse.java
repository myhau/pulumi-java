// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SelectedCertificateInputResponse {
    private final String certificateName;
    private final String password;

    @OutputCustomType.Constructor({"certificateName","password"})
    private SelectedCertificateInputResponse(
        String certificateName,
        String password) {
        this.certificateName = Objects.requireNonNull(certificateName);
        this.password = Objects.requireNonNull(password);
    }

    public String getCertificateName() {
        return this.certificateName;
    }
    public String getPassword() {
        return this.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectedCertificateInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateName;
        private String password;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectedCertificateInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.password = defaults.password;
        }

        public Builder setCertificateName(String certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public SelectedCertificateInputResponse build() {
            return new SelectedCertificateInputResponse(certificateName, password);
        }
    }
}