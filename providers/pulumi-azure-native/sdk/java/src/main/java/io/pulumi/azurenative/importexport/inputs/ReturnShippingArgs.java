// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the return carrier and customer's account with the carrier.
 * 
 */
public final class ReturnShippingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReturnShippingArgs Empty = new ReturnShippingArgs();

    /**
     * The customer's account number with the carrier.
     * 
     */
    @Import(name="carrierAccountNumber", required=true)
      private final Output<String> carrierAccountNumber;

    public Output<String> carrierAccountNumber() {
        return this.carrierAccountNumber;
    }

    /**
     * The carrier's name.
     * 
     */
    @Import(name="carrierName", required=true)
      private final Output<String> carrierName;

    public Output<String> carrierName() {
        return this.carrierName;
    }

    public ReturnShippingArgs(
        Output<String> carrierAccountNumber,
        Output<String> carrierName) {
        this.carrierAccountNumber = Objects.requireNonNull(carrierAccountNumber, "expected parameter 'carrierAccountNumber' to be non-null");
        this.carrierName = Objects.requireNonNull(carrierName, "expected parameter 'carrierName' to be non-null");
    }

    private ReturnShippingArgs() {
        this.carrierAccountNumber = Codegen.empty();
        this.carrierName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReturnShippingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> carrierAccountNumber;
        private Output<String> carrierName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReturnShippingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierAccountNumber = defaults.carrierAccountNumber;
    	      this.carrierName = defaults.carrierName;
        }

        public Builder carrierAccountNumber(Output<String> carrierAccountNumber) {
            this.carrierAccountNumber = Objects.requireNonNull(carrierAccountNumber);
            return this;
        }
        public Builder carrierAccountNumber(String carrierAccountNumber) {
            this.carrierAccountNumber = Output.of(Objects.requireNonNull(carrierAccountNumber));
            return this;
        }
        public Builder carrierName(Output<String> carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }
        public Builder carrierName(String carrierName) {
            this.carrierName = Output.of(Objects.requireNonNull(carrierName));
            return this;
        }        public ReturnShippingArgs build() {
            return new ReturnShippingArgs(carrierAccountNumber, carrierName);
        }
    }
}
