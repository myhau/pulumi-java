// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TransactionInfoResponse {
    /**
     * // [Alpha] Id of the transaction.
     * 
     */
    private final String transactionId;

    @OutputCustomType.Constructor
    private TransactionInfoResponse(@OutputCustomType.Parameter("transactionId") String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * // [Alpha] Id of the transaction.
     * 
    */
    public String getTransactionId() {
        return this.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransactionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String transactionId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransactionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transactionId = defaults.transactionId;
        }

        public Builder setTransactionId(String transactionId) {
            this.transactionId = Objects.requireNonNull(transactionId);
            return this;
        }
        public TransactionInfoResponse build() {
            return new TransactionInfoResponse(transactionId);
        }
    }
}
