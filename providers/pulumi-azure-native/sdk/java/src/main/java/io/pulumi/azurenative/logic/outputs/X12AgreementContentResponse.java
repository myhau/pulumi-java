// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.X12OneWayAgreementResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class X12AgreementContentResponse {
    /**
     * The X12 one-way receive agreement.
     * 
     */
    private final X12OneWayAgreementResponse receiveAgreement;
    /**
     * The X12 one-way send agreement.
     * 
     */
    private final X12OneWayAgreementResponse sendAgreement;

    @CustomType.Constructor
    private X12AgreementContentResponse(
        @CustomType.Parameter("receiveAgreement") X12OneWayAgreementResponse receiveAgreement,
        @CustomType.Parameter("sendAgreement") X12OneWayAgreementResponse sendAgreement) {
        this.receiveAgreement = receiveAgreement;
        this.sendAgreement = sendAgreement;
    }

    /**
     * The X12 one-way receive agreement.
     * 
    */
    public X12OneWayAgreementResponse receiveAgreement() {
        return this.receiveAgreement;
    }
    /**
     * The X12 one-way send agreement.
     * 
    */
    public X12OneWayAgreementResponse sendAgreement() {
        return this.sendAgreement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12AgreementContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12OneWayAgreementResponse receiveAgreement;
        private X12OneWayAgreementResponse sendAgreement;

        public Builder() {
    	      // Empty
        }

        public Builder(X12AgreementContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiveAgreement = defaults.receiveAgreement;
    	      this.sendAgreement = defaults.sendAgreement;
        }

        public Builder receiveAgreement(X12OneWayAgreementResponse receiveAgreement) {
            this.receiveAgreement = Objects.requireNonNull(receiveAgreement);
            return this;
        }
        public Builder sendAgreement(X12OneWayAgreementResponse sendAgreement) {
            this.sendAgreement = Objects.requireNonNull(sendAgreement);
            return this;
        }        public X12AgreementContentResponse build() {
            return new X12AgreementContentResponse(receiveAgreement, sendAgreement);
        }
    }
}
