// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationFederatedIdentityCredentialState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationFederatedIdentityCredentialState Empty = new ApplicationFederatedIdentityCredentialState();

    /**
     * The object ID of the application for which this federated identity credential should be created. Changing this field forces a new resource to be created.
     * 
     */
    @Import(name="applicationObjectId")
    private @Nullable Output<String> applicationObjectId;

    /**
     * @return The object ID of the application for which this federated identity credential should be created. Changing this field forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> applicationObjectId() {
        return Optional.ofNullable(this.applicationObjectId);
    }

    /**
     * List of audiences that can appear in the external token. This specifies what should be accepted in the `aud` claim of incoming tokens.
     * 
     */
    @Import(name="audiences")
    private @Nullable Output<List<String>> audiences;

    /**
     * @return List of audiences that can appear in the external token. This specifies what should be accepted in the `aud` claim of incoming tokens.
     * 
     */
    public Optional<Output<List<String>>> audiences() {
        return Optional.ofNullable(this.audiences);
    }

    /**
     * A UUID used to uniquely identify this federated identity credential.
     * 
     */
    @Import(name="credentialId")
    private @Nullable Output<String> credentialId;

    /**
     * @return A UUID used to uniquely identify this federated identity credential.
     * 
     */
    public Optional<Output<String>> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }

    /**
     * A description for the federated identity credential.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the federated identity credential.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A unique display name for the federated identity credential. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A unique display name for the federated identity credential. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The URL of the external identity provider, which must match the issuer claim of the external token being exchanged. The combination of the values of issuer and subject must be unique on the app.
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return The URL of the external identity provider, which must match the issuer claim of the external token being exchanged. The combination of the values of issuer and subject must be unique on the app.
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * The identifier of the external software workload within the external identity provider. The combination of issuer and subject must be unique on the app.
     * 
     */
    @Import(name="subject")
    private @Nullable Output<String> subject;

    /**
     * @return The identifier of the external software workload within the external identity provider. The combination of issuer and subject must be unique on the app.
     * 
     */
    public Optional<Output<String>> subject() {
        return Optional.ofNullable(this.subject);
    }

    private ApplicationFederatedIdentityCredentialState() {}

    private ApplicationFederatedIdentityCredentialState(ApplicationFederatedIdentityCredentialState $) {
        this.applicationObjectId = $.applicationObjectId;
        this.audiences = $.audiences;
        this.credentialId = $.credentialId;
        this.description = $.description;
        this.displayName = $.displayName;
        this.issuer = $.issuer;
        this.subject = $.subject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationFederatedIdentityCredentialState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationFederatedIdentityCredentialState $;

        public Builder() {
            $ = new ApplicationFederatedIdentityCredentialState();
        }

        public Builder(ApplicationFederatedIdentityCredentialState defaults) {
            $ = new ApplicationFederatedIdentityCredentialState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationObjectId The object ID of the application for which this federated identity credential should be created. Changing this field forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationObjectId(@Nullable Output<String> applicationObjectId) {
            $.applicationObjectId = applicationObjectId;
            return this;
        }

        /**
         * @param applicationObjectId The object ID of the application for which this federated identity credential should be created. Changing this field forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationObjectId(String applicationObjectId) {
            return applicationObjectId(Output.of(applicationObjectId));
        }

        /**
         * @param audiences List of audiences that can appear in the external token. This specifies what should be accepted in the `aud` claim of incoming tokens.
         * 
         * @return builder
         * 
         */
        public Builder audiences(@Nullable Output<List<String>> audiences) {
            $.audiences = audiences;
            return this;
        }

        /**
         * @param audiences List of audiences that can appear in the external token. This specifies what should be accepted in the `aud` claim of incoming tokens.
         * 
         * @return builder
         * 
         */
        public Builder audiences(List<String> audiences) {
            return audiences(Output.of(audiences));
        }

        /**
         * @param audiences List of audiences that can appear in the external token. This specifies what should be accepted in the `aud` claim of incoming tokens.
         * 
         * @return builder
         * 
         */
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }

        /**
         * @param credentialId A UUID used to uniquely identify this federated identity credential.
         * 
         * @return builder
         * 
         */
        public Builder credentialId(@Nullable Output<String> credentialId) {
            $.credentialId = credentialId;
            return this;
        }

        /**
         * @param credentialId A UUID used to uniquely identify this federated identity credential.
         * 
         * @return builder
         * 
         */
        public Builder credentialId(String credentialId) {
            return credentialId(Output.of(credentialId));
        }

        /**
         * @param description A description for the federated identity credential.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the federated identity credential.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A unique display name for the federated identity credential. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A unique display name for the federated identity credential. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param issuer The URL of the external identity provider, which must match the issuer claim of the external token being exchanged. The combination of the values of issuer and subject must be unique on the app.
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer The URL of the external identity provider, which must match the issuer claim of the external token being exchanged. The combination of the values of issuer and subject must be unique on the app.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param subject The identifier of the external software workload within the external identity provider. The combination of issuer and subject must be unique on the app.
         * 
         * @return builder
         * 
         */
        public Builder subject(@Nullable Output<String> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject The identifier of the external software workload within the external identity provider. The combination of issuer and subject must be unique on the app.
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            return subject(Output.of(subject));
        }

        public ApplicationFederatedIdentityCredentialState build() {
            return $;
        }
    }

}
