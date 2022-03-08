// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.websecurityscanner_v1.outputs.CustomAccountResponse;
import io.pulumi.googlenative.websecurityscanner_v1.outputs.GoogleAccountResponse;
import io.pulumi.googlenative.websecurityscanner_v1.outputs.IapCredentialResponse;
import java.util.Objects;

@OutputCustomType
public final class AuthenticationResponse {
    /**
     * Authentication using a custom account.
     * 
     */
    private final CustomAccountResponse customAccount;
    /**
     * Authentication using a Google account.
     * 
     */
    private final GoogleAccountResponse googleAccount;
    /**
     * Authentication using Identity-Aware-Proxy (IAP).
     * 
     */
    private final IapCredentialResponse iapCredential;

    @OutputCustomType.Constructor({"customAccount","googleAccount","iapCredential"})
    private AuthenticationResponse(
        CustomAccountResponse customAccount,
        GoogleAccountResponse googleAccount,
        IapCredentialResponse iapCredential) {
        this.customAccount = customAccount;
        this.googleAccount = googleAccount;
        this.iapCredential = iapCredential;
    }

    /**
     * Authentication using a custom account.
     * 
    */
    public CustomAccountResponse getCustomAccount() {
        return this.customAccount;
    }
    /**
     * Authentication using a Google account.
     * 
    */
    public GoogleAccountResponse getGoogleAccount() {
        return this.googleAccount;
    }
    /**
     * Authentication using Identity-Aware-Proxy (IAP).
     * 
    */
    public IapCredentialResponse getIapCredential() {
        return this.iapCredential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomAccountResponse customAccount;
        private GoogleAccountResponse googleAccount;
        private IapCredentialResponse iapCredential;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customAccount = defaults.customAccount;
    	      this.googleAccount = defaults.googleAccount;
    	      this.iapCredential = defaults.iapCredential;
        }

        public Builder setCustomAccount(CustomAccountResponse customAccount) {
            this.customAccount = Objects.requireNonNull(customAccount);
            return this;
        }

        public Builder setGoogleAccount(GoogleAccountResponse googleAccount) {
            this.googleAccount = Objects.requireNonNull(googleAccount);
            return this;
        }

        public Builder setIapCredential(IapCredentialResponse iapCredential) {
            this.iapCredential = Objects.requireNonNull(iapCredential);
            return this;
        }
        public AuthenticationResponse build() {
            return new AuthenticationResponse(customAccount, googleAccount, iapCredential);
        }
    }
}
