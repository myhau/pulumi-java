// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.azuread.outputs.ApplicationApiOauth2PermissionScope;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApi {
    /**
     * @return A set of application IDs (client IDs), used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app.
     * 
     */
    private final @Nullable List<String> knownClientApplications;
    /**
     * @return Allows an application to use claims mapping without specifying a custom signing key. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean mappedClaimsEnabled;
    /**
     * @return One or more `oauth2_permission_scope` blocks as documented below, to describe delegated permissions exposed by the web API represented by this application.
     * 
     */
    private final @Nullable List<ApplicationApiOauth2PermissionScope> oauth2PermissionScopes;
    /**
     * @return The access token version expected by this resource. Must be one of `1` or `2`, and must be `2` when `sign_in_audience` is either `AzureADandPersonalMicrosoftAccount` or `PersonalMicrosoftAccount` Defaults to `1`.
     * 
     */
    private final @Nullable Integer requestedAccessTokenVersion;

    @CustomType.Constructor
    private ApplicationApi(
        @CustomType.Parameter("knownClientApplications") @Nullable List<String> knownClientApplications,
        @CustomType.Parameter("mappedClaimsEnabled") @Nullable Boolean mappedClaimsEnabled,
        @CustomType.Parameter("oauth2PermissionScopes") @Nullable List<ApplicationApiOauth2PermissionScope> oauth2PermissionScopes,
        @CustomType.Parameter("requestedAccessTokenVersion") @Nullable Integer requestedAccessTokenVersion) {
        this.knownClientApplications = knownClientApplications;
        this.mappedClaimsEnabled = mappedClaimsEnabled;
        this.oauth2PermissionScopes = oauth2PermissionScopes;
        this.requestedAccessTokenVersion = requestedAccessTokenVersion;
    }

    /**
     * @return A set of application IDs (client IDs), used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app.
     * 
     */
    public List<String> knownClientApplications() {
        return this.knownClientApplications == null ? List.of() : this.knownClientApplications;
    }
    /**
     * @return Allows an application to use claims mapping without specifying a custom signing key. Defaults to `false`.
     * 
     */
    public Optional<Boolean> mappedClaimsEnabled() {
        return Optional.ofNullable(this.mappedClaimsEnabled);
    }
    /**
     * @return One or more `oauth2_permission_scope` blocks as documented below, to describe delegated permissions exposed by the web API represented by this application.
     * 
     */
    public List<ApplicationApiOauth2PermissionScope> oauth2PermissionScopes() {
        return this.oauth2PermissionScopes == null ? List.of() : this.oauth2PermissionScopes;
    }
    /**
     * @return The access token version expected by this resource. Must be one of `1` or `2`, and must be `2` when `sign_in_audience` is either `AzureADandPersonalMicrosoftAccount` or `PersonalMicrosoftAccount` Defaults to `1`.
     * 
     */
    public Optional<Integer> requestedAccessTokenVersion() {
        return Optional.ofNullable(this.requestedAccessTokenVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApi defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> knownClientApplications;
        private @Nullable Boolean mappedClaimsEnabled;
        private @Nullable List<ApplicationApiOauth2PermissionScope> oauth2PermissionScopes;
        private @Nullable Integer requestedAccessTokenVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knownClientApplications = defaults.knownClientApplications;
    	      this.mappedClaimsEnabled = defaults.mappedClaimsEnabled;
    	      this.oauth2PermissionScopes = defaults.oauth2PermissionScopes;
    	      this.requestedAccessTokenVersion = defaults.requestedAccessTokenVersion;
        }

        public Builder knownClientApplications(@Nullable List<String> knownClientApplications) {
            this.knownClientApplications = knownClientApplications;
            return this;
        }
        public Builder knownClientApplications(String... knownClientApplications) {
            return knownClientApplications(List.of(knownClientApplications));
        }
        public Builder mappedClaimsEnabled(@Nullable Boolean mappedClaimsEnabled) {
            this.mappedClaimsEnabled = mappedClaimsEnabled;
            return this;
        }
        public Builder oauth2PermissionScopes(@Nullable List<ApplicationApiOauth2PermissionScope> oauth2PermissionScopes) {
            this.oauth2PermissionScopes = oauth2PermissionScopes;
            return this;
        }
        public Builder oauth2PermissionScopes(ApplicationApiOauth2PermissionScope... oauth2PermissionScopes) {
            return oauth2PermissionScopes(List.of(oauth2PermissionScopes));
        }
        public Builder requestedAccessTokenVersion(@Nullable Integer requestedAccessTokenVersion) {
            this.requestedAccessTokenVersion = requestedAccessTokenVersion;
            return this;
        }        public ApplicationApi build() {
            return new ApplicationApi(knownClientApplications, mappedClaimsEnabled, oauth2PermissionScopes, requestedAccessTokenVersion);
        }
    }
}
