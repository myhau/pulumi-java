// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The JSON object that contains the properties to validate a domain.
 * 
 */
public final class DomainValidationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final DomainValidationPropertiesResponse Empty = new DomainValidationPropertiesResponse();

    /**
     * The date time that the token expires
     * 
     */
    @Import(name="expirationDate", required=true)
      private final String expirationDate;

    public String expirationDate() {
        return this.expirationDate;
    }

    /**
     * Challenge used for DNS TXT record or file based validation
     * 
     */
    @Import(name="validationToken", required=true)
      private final String validationToken;

    public String validationToken() {
        return this.validationToken;
    }

    public DomainValidationPropertiesResponse(
        String expirationDate,
        String validationToken) {
        this.expirationDate = Objects.requireNonNull(expirationDate, "expected parameter 'expirationDate' to be non-null");
        this.validationToken = Objects.requireNonNull(validationToken, "expected parameter 'validationToken' to be non-null");
    }

    private DomainValidationPropertiesResponse() {
        this.expirationDate = null;
        this.validationToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainValidationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationDate;
        private String validationToken;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainValidationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.validationToken = defaults.validationToken;
        }

        public Builder expirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }
        public Builder validationToken(String validationToken) {
            this.validationToken = Objects.requireNonNull(validationToken);
            return this;
        }        public DomainValidationPropertiesResponse build() {
            return new DomainValidationPropertiesResponse(expirationDate, validationToken);
        }
    }
}
