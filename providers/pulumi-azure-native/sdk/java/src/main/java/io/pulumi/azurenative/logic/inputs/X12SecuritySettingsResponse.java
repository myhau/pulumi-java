// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 agreement security settings.
 * 
 */
public final class X12SecuritySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12SecuritySettingsResponse Empty = new X12SecuritySettingsResponse();

    /**
     * The authorization qualifier.
     * 
     */
    @Import(name="authorizationQualifier", required=true)
      private final String authorizationQualifier;

    public String authorizationQualifier() {
        return this.authorizationQualifier;
    }

    /**
     * The authorization value.
     * 
     */
    @Import(name="authorizationValue")
      private final @Nullable String authorizationValue;

    public Optional<String> authorizationValue() {
        return this.authorizationValue == null ? Optional.empty() : Optional.ofNullable(this.authorizationValue);
    }

    /**
     * The password value.
     * 
     */
    @Import(name="passwordValue")
      private final @Nullable String passwordValue;

    public Optional<String> passwordValue() {
        return this.passwordValue == null ? Optional.empty() : Optional.ofNullable(this.passwordValue);
    }

    /**
     * The security qualifier.
     * 
     */
    @Import(name="securityQualifier", required=true)
      private final String securityQualifier;

    public String securityQualifier() {
        return this.securityQualifier;
    }

    public X12SecuritySettingsResponse(
        String authorizationQualifier,
        @Nullable String authorizationValue,
        @Nullable String passwordValue,
        String securityQualifier) {
        this.authorizationQualifier = Objects.requireNonNull(authorizationQualifier, "expected parameter 'authorizationQualifier' to be non-null");
        this.authorizationValue = authorizationValue;
        this.passwordValue = passwordValue;
        this.securityQualifier = Objects.requireNonNull(securityQualifier, "expected parameter 'securityQualifier' to be non-null");
    }

    private X12SecuritySettingsResponse() {
        this.authorizationQualifier = null;
        this.authorizationValue = null;
        this.passwordValue = null;
        this.securityQualifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12SecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationQualifier;
        private @Nullable String authorizationValue;
        private @Nullable String passwordValue;
        private String securityQualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(X12SecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationQualifier = defaults.authorizationQualifier;
    	      this.authorizationValue = defaults.authorizationValue;
    	      this.passwordValue = defaults.passwordValue;
    	      this.securityQualifier = defaults.securityQualifier;
        }

        public Builder authorizationQualifier(String authorizationQualifier) {
            this.authorizationQualifier = Objects.requireNonNull(authorizationQualifier);
            return this;
        }
        public Builder authorizationValue(@Nullable String authorizationValue) {
            this.authorizationValue = authorizationValue;
            return this;
        }
        public Builder passwordValue(@Nullable String passwordValue) {
            this.passwordValue = passwordValue;
            return this;
        }
        public Builder securityQualifier(String securityQualifier) {
            this.securityQualifier = Objects.requireNonNull(securityQualifier);
            return this;
        }        public X12SecuritySettingsResponse build() {
            return new X12SecuritySettingsResponse(authorizationQualifier, authorizationValue, passwordValue, securityQualifier);
        }
    }
}
