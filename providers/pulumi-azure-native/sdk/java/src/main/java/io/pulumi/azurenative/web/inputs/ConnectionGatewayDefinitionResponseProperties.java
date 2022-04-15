// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ConnectionGatewayReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionGatewayDefinitionResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionGatewayDefinitionResponseProperties Empty = new ConnectionGatewayDefinitionResponseProperties();

    /**
     * The URI of the backend
     * 
     */
    @Import(name="backendUri")
      private final @Nullable String backendUri;

    public Optional<String> backendUri() {
        return this.backendUri == null ? Optional.empty() : Optional.ofNullable(this.backendUri);
    }

    /**
     * The gateway installation reference
     * 
     */
    @Import(name="connectionGatewayInstallation")
      private final @Nullable ConnectionGatewayReferenceResponse connectionGatewayInstallation;

    public Optional<ConnectionGatewayReferenceResponse> connectionGatewayInstallation() {
        return this.connectionGatewayInstallation == null ? Optional.empty() : Optional.ofNullable(this.connectionGatewayInstallation);
    }

    /**
     * The gateway admin
     * 
     */
    @Import(name="contactInformation")
      private final @Nullable List<String> contactInformation;

    public List<String> contactInformation() {
        return this.contactInformation == null ? List.of() : this.contactInformation;
    }

    /**
     * The gateway description
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The gateway display name
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The machine name of the gateway
     * 
     */
    @Import(name="machineName")
      private final @Nullable String machineName;

    public Optional<String> machineName() {
        return this.machineName == null ? Optional.empty() : Optional.ofNullable(this.machineName);
    }

    /**
     * The gateway status
     * 
     */
    @Import(name="status")
      private final @Nullable Object status;

    public Optional<Object> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public ConnectionGatewayDefinitionResponseProperties(
        @Nullable String backendUri,
        @Nullable ConnectionGatewayReferenceResponse connectionGatewayInstallation,
        @Nullable List<String> contactInformation,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String machineName,
        @Nullable Object status) {
        this.backendUri = backendUri;
        this.connectionGatewayInstallation = connectionGatewayInstallation;
        this.contactInformation = contactInformation;
        this.description = description;
        this.displayName = displayName;
        this.machineName = machineName;
        this.status = status;
    }

    private ConnectionGatewayDefinitionResponseProperties() {
        this.backendUri = null;
        this.connectionGatewayInstallation = null;
        this.contactInformation = List.of();
        this.description = null;
        this.displayName = null;
        this.machineName = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGatewayDefinitionResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backendUri;
        private @Nullable ConnectionGatewayReferenceResponse connectionGatewayInstallation;
        private @Nullable List<String> contactInformation;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String machineName;
        private @Nullable Object status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionGatewayDefinitionResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendUri = defaults.backendUri;
    	      this.connectionGatewayInstallation = defaults.connectionGatewayInstallation;
    	      this.contactInformation = defaults.contactInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.machineName = defaults.machineName;
    	      this.status = defaults.status;
        }

        public Builder backendUri(@Nullable String backendUri) {
            this.backendUri = backendUri;
            return this;
        }
        public Builder connectionGatewayInstallation(@Nullable ConnectionGatewayReferenceResponse connectionGatewayInstallation) {
            this.connectionGatewayInstallation = connectionGatewayInstallation;
            return this;
        }
        public Builder contactInformation(@Nullable List<String> contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }
        public Builder contactInformation(String... contactInformation) {
            return contactInformation(List.of(contactInformation));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder machineName(@Nullable String machineName) {
            this.machineName = machineName;
            return this;
        }
        public Builder status(@Nullable Object status) {
            this.status = status;
            return this;
        }        public ConnectionGatewayDefinitionResponseProperties build() {
            return new ConnectionGatewayDefinitionResponseProperties(backendUri, connectionGatewayInstallation, contactInformation, description, displayName, machineName, status);
        }
    }
}
