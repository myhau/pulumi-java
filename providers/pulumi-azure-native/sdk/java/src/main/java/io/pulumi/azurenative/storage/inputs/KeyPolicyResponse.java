// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * KeyPolicy assigned to the storage account.
 * 
 */
public final class KeyPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyPolicyResponse Empty = new KeyPolicyResponse();

    /**
     * The key expiration period in days.
     * 
     */
    @Import(name="keyExpirationPeriodInDays", required=true)
      private final Integer keyExpirationPeriodInDays;

    public Integer keyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    public KeyPolicyResponse(Integer keyExpirationPeriodInDays) {
        this.keyExpirationPeriodInDays = Objects.requireNonNull(keyExpirationPeriodInDays, "expected parameter 'keyExpirationPeriodInDays' to be non-null");
    }

    private KeyPolicyResponse() {
        this.keyExpirationPeriodInDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer keyExpirationPeriodInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyExpirationPeriodInDays = defaults.keyExpirationPeriodInDays;
        }

        public Builder keyExpirationPeriodInDays(Integer keyExpirationPeriodInDays) {
            this.keyExpirationPeriodInDays = Objects.requireNonNull(keyExpirationPeriodInDays);
            return this;
        }        public KeyPolicyResponse build() {
            return new KeyPolicyResponse(keyExpirationPeriodInDays);
        }
    }
}
