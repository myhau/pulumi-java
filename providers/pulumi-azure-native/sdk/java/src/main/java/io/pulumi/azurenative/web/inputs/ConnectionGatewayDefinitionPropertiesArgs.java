// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ConnectionGatewayReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionGatewayDefinitionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionGatewayDefinitionPropertiesArgs Empty = new ConnectionGatewayDefinitionPropertiesArgs();

    /**
     * The URI of the backend
     * 
     */
    @Import(name="backendUri")
      private final @Nullable Output<String> backendUri;

    public Output<String> backendUri() {
        return this.backendUri == null ? Codegen.empty() : this.backendUri;
    }

    /**
     * The gateway installation reference
     * 
     */
    @Import(name="connectionGatewayInstallation")
      private final @Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation;

    public Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation() {
        return this.connectionGatewayInstallation == null ? Codegen.empty() : this.connectionGatewayInstallation;
    }

    /**
     * The gateway admin
     * 
     */
    @Import(name="contactInformation")
      private final @Nullable Output<List<String>> contactInformation;

    public Output<List<String>> contactInformation() {
        return this.contactInformation == null ? Codegen.empty() : this.contactInformation;
    }

    /**
     * The gateway description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The gateway display name
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The machine name of the gateway
     * 
     */
    @Import(name="machineName")
      private final @Nullable Output<String> machineName;

    public Output<String> machineName() {
        return this.machineName == null ? Codegen.empty() : this.machineName;
    }

    /**
     * The gateway status
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Object> status;

    public Output<Object> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public ConnectionGatewayDefinitionPropertiesArgs(
        @Nullable Output<String> backendUri,
        @Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation,
        @Nullable Output<List<String>> contactInformation,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> machineName,
        @Nullable Output<Object> status) {
        this.backendUri = backendUri;
        this.connectionGatewayInstallation = connectionGatewayInstallation;
        this.contactInformation = contactInformation;
        this.description = description;
        this.displayName = displayName;
        this.machineName = machineName;
        this.status = status;
    }

    private ConnectionGatewayDefinitionPropertiesArgs() {
        this.backendUri = Codegen.empty();
        this.connectionGatewayInstallation = Codegen.empty();
        this.contactInformation = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.machineName = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGatewayDefinitionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backendUri;
        private @Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation;
        private @Nullable Output<List<String>> contactInformation;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> machineName;
        private @Nullable Output<Object> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionGatewayDefinitionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendUri = defaults.backendUri;
    	      this.connectionGatewayInstallation = defaults.connectionGatewayInstallation;
    	      this.contactInformation = defaults.contactInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.machineName = defaults.machineName;
    	      this.status = defaults.status;
        }

        public Builder backendUri(@Nullable Output<String> backendUri) {
            this.backendUri = backendUri;
            return this;
        }
        public Builder backendUri(@Nullable String backendUri) {
            this.backendUri = Codegen.ofNullable(backendUri);
            return this;
        }
        public Builder connectionGatewayInstallation(@Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation) {
            this.connectionGatewayInstallation = connectionGatewayInstallation;
            return this;
        }
        public Builder connectionGatewayInstallation(@Nullable ConnectionGatewayReferenceArgs connectionGatewayInstallation) {
            this.connectionGatewayInstallation = Codegen.ofNullable(connectionGatewayInstallation);
            return this;
        }
        public Builder contactInformation(@Nullable Output<List<String>> contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }
        public Builder contactInformation(@Nullable List<String> contactInformation) {
            this.contactInformation = Codegen.ofNullable(contactInformation);
            return this;
        }
        public Builder contactInformation(String... contactInformation) {
            return contactInformation(List.of(contactInformation));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder machineName(@Nullable Output<String> machineName) {
            this.machineName = machineName;
            return this;
        }
        public Builder machineName(@Nullable String machineName) {
            this.machineName = Codegen.ofNullable(machineName);
            return this;
        }
        public Builder status(@Nullable Output<Object> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Object status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public ConnectionGatewayDefinitionPropertiesArgs build() {
            return new ConnectionGatewayDefinitionPropertiesArgs(backendUri, connectionGatewayInstallation, contactInformation, description, displayName, machineName, status);
        }
    }
}
