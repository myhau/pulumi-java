// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs Empty = new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs();

    /**
     * The criteria for determining a SAN's match.
     * 
     */
    @InputImport(name="match", required=true)
      private final Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs> match;

    public Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs> getMatch() {
        return this.match;
    }

    public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs(Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs> match) {
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
    }

    private VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs() {
        this.match = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs> match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder setMatch(Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setMatch(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs match) {
            this.match = Input.of(Objects.requireNonNull(match));
            return this;
        }
        public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs build() {
            return new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs(match);
        }
    }
}
