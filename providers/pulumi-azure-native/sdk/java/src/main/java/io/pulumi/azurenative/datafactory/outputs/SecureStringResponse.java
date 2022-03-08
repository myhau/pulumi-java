// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecureStringResponse {
    /**
     * Type of the secret.
     * Expected value is 'SecureString'.
     * 
     */
    private final String type;
    /**
     * Value of secure string.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"type","value"})
    private SecureStringResponse(
        String type,
        String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Type of the secret.
     * Expected value is 'SecureString'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Value of secure string.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecureStringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecureStringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SecureStringResponse build() {
            return new SecureStringResponse(type, value);
        }
    }
}
