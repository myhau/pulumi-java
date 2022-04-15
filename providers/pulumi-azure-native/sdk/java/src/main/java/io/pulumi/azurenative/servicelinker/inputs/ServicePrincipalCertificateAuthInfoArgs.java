// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is servicePrincipal certificate
 * 
 */
public final class ServicePrincipalCertificateAuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalCertificateAuthInfoArgs Empty = new ServicePrincipalCertificateAuthInfoArgs();

    /**
     * The authentication type.
     * Expected value is 'servicePrincipalCertificate'.
     * 
     */
    @Import(name="authType", required=true)
      private final Output<String> authType;

    public Output<String> authType() {
        return this.authType;
    }

    /**
     * ServicePrincipal certificate for servicePrincipal auth.
     * 
     */
    @Import(name="certificate", required=true)
      private final Output<String> certificate;

    public Output<String> certificate() {
        return this.certificate;
    }

    /**
     * Application clientId for servicePrincipal auth.
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Principal Id for servicePrincipal auth.
     * 
     */
    @Import(name="principalId", required=true)
      private final Output<String> principalId;

    public Output<String> principalId() {
        return this.principalId;
    }

    public ServicePrincipalCertificateAuthInfoArgs(
        Output<String> authType,
        Output<String> certificate,
        Output<String> clientId,
        Output<String> principalId) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
    }

    private ServicePrincipalCertificateAuthInfoArgs() {
        this.authType = Codegen.empty();
        this.certificate = Codegen.empty();
        this.clientId = Codegen.empty();
        this.principalId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalCertificateAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authType;
        private Output<String> certificate;
        private Output<String> clientId;
        private Output<String> principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalCertificateAuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder authType(Output<String> authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        public Builder authType(String authType) {
            this.authType = Output.of(Objects.requireNonNull(authType));
            return this;
        }
        public Builder certificate(Output<String> certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder certificate(String certificate) {
            this.certificate = Output.of(Objects.requireNonNull(certificate));
            return this;
        }
        public Builder clientId(Output<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }
        public Builder principalId(Output<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Output.of(Objects.requireNonNull(principalId));
            return this;
        }        public ServicePrincipalCertificateAuthInfoArgs build() {
            return new ServicePrincipalCertificateAuthInfoArgs(authType, certificate, clientId, principalId);
        }
    }
}
