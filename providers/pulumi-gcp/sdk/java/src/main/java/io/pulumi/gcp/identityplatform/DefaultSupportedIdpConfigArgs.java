// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultSupportedIdpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultSupportedIdpConfigArgs Empty = new DefaultSupportedIdpConfigArgs();

    /**
     * OAuth client ID
     * 
     */
    @InputImport(name="clientId", required=true)
    private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    /**
     * OAuth client secret
     * 
     */
    @InputImport(name="clientSecret", required=true)
    private final Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret;
    }

    /**
     * If this IDP allows the user to sign in
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * ID of the IDP. Possible values include:
     * * `apple.com`
     * * `facebook.com`
     * * `gc.apple.com`
     * * `github.com`
     * * `google.com`
     * * `linkedin.com`
     * * `microsoft.com`
     * * `playgames.google.com`
     * * `twitter.com`
     * * `yahoo.com`
     * 
     */
    @InputImport(name="idpId", required=true)
    private final Input<String> idpId;

    public Input<String> getIdpId() {
        return this.idpId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DefaultSupportedIdpConfigArgs(
        Input<String> clientId,
        Input<String> clientSecret,
        @Nullable Input<Boolean> enabled,
        Input<String> idpId,
        @Nullable Input<String> project) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
        this.enabled = enabled;
        this.idpId = Objects.requireNonNull(idpId, "expected parameter 'idpId' to be non-null");
        this.project = project;
    }

    private DefaultSupportedIdpConfigArgs() {
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.enabled = Input.empty();
        this.idpId = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSupportedIdpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clientId;
        private Input<String> clientSecret;
        private @Nullable Input<Boolean> enabled;
        private Input<String> idpId;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSupportedIdpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.enabled = defaults.enabled;
    	      this.idpId = defaults.idpId;
    	      this.project = defaults.project;
        }

        public Builder setClientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setClientSecret(Input<String> clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = Input.of(Objects.requireNonNull(clientSecret));
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setIdpId(Input<String> idpId) {
            this.idpId = Objects.requireNonNull(idpId);
            return this;
        }

        public Builder setIdpId(String idpId) {
            this.idpId = Input.of(Objects.requireNonNull(idpId));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public DefaultSupportedIdpConfigArgs build() {
            return new DefaultSupportedIdpConfigArgs(clientId, clientSecret, enabled, idpId, project);
        }
    }
}
