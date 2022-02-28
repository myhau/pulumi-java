// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationTlsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationTlsConfigArgs Empty = new IntegrationTlsConfigArgs();

    /**
     * Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a [supported certificate authority](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html). This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate's expiration date, hostname, and presence of a root certificate authority. Supported only for `HTTP` and `HTTP_PROXY` integrations.
     * 
     */
    @InputImport(name="insecureSkipVerification")
      private final @Nullable Input<Boolean> insecureSkipVerification;

    public Input<Boolean> getInsecureSkipVerification() {
        return this.insecureSkipVerification == null ? Input.empty() : this.insecureSkipVerification;
    }

    public IntegrationTlsConfigArgs(@Nullable Input<Boolean> insecureSkipVerification) {
        this.insecureSkipVerification = insecureSkipVerification;
    }

    private IntegrationTlsConfigArgs() {
        this.insecureSkipVerification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationTlsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> insecureSkipVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationTlsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insecureSkipVerification = defaults.insecureSkipVerification;
        }

        public Builder setInsecureSkipVerification(@Nullable Input<Boolean> insecureSkipVerification) {
            this.insecureSkipVerification = insecureSkipVerification;
            return this;
        }

        public Builder setInsecureSkipVerification(@Nullable Boolean insecureSkipVerification) {
            this.insecureSkipVerification = Input.ofNullable(insecureSkipVerification);
            return this;
        }
        public IntegrationTlsConfigArgs build() {
            return new IntegrationTlsConfigArgs(insecureSkipVerification);
        }
    }
}
