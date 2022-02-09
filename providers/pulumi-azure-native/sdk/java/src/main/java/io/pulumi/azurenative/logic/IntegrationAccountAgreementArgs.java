// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.enums.AgreementType;
import io.pulumi.azurenative.logic.inputs.AgreementContentArgs;
import io.pulumi.azurenative.logic.inputs.BusinessIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationAccountAgreementArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountAgreementArgs Empty = new IntegrationAccountAgreementArgs();

    @InputImport(name="agreementName")
    private final @Nullable Input<String> agreementName;

    public Input<String> getAgreementName() {
        return this.agreementName == null ? Input.empty() : this.agreementName;
    }

    @InputImport(name="agreementType", required=true)
    private final Input<AgreementType> agreementType;

    public Input<AgreementType> getAgreementType() {
        return this.agreementType;
    }

    @InputImport(name="content", required=true)
    private final Input<AgreementContentArgs> content;

    public Input<AgreementContentArgs> getContent() {
        return this.content;
    }

    @InputImport(name="guestIdentity", required=true)
    private final Input<BusinessIdentityArgs> guestIdentity;

    public Input<BusinessIdentityArgs> getGuestIdentity() {
        return this.guestIdentity;
    }

    @InputImport(name="guestPartner", required=true)
    private final Input<String> guestPartner;

    public Input<String> getGuestPartner() {
        return this.guestPartner;
    }

    @InputImport(name="hostIdentity", required=true)
    private final Input<BusinessIdentityArgs> hostIdentity;

    public Input<BusinessIdentityArgs> getHostIdentity() {
        return this.hostIdentity;
    }

    @InputImport(name="hostPartner", required=true)
    private final Input<String> hostPartner;

    public Input<String> getHostPartner() {
        return this.hostPartner;
    }

    @InputImport(name="integrationAccountName", required=true)
    private final Input<String> integrationAccountName;

    public Input<String> getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<Object> metadata;

    public Input<Object> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public IntegrationAccountAgreementArgs(
        @Nullable Input<String> agreementName,
        Input<AgreementType> agreementType,
        Input<AgreementContentArgs> content,
        Input<BusinessIdentityArgs> guestIdentity,
        Input<String> guestPartner,
        Input<BusinessIdentityArgs> hostIdentity,
        Input<String> hostPartner,
        Input<String> integrationAccountName,
        @Nullable Input<String> location,
        @Nullable Input<Object> metadata,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.agreementName = agreementName;
        this.agreementType = Objects.requireNonNull(agreementType, "expected parameter 'agreementType' to be non-null");
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.guestIdentity = Objects.requireNonNull(guestIdentity, "expected parameter 'guestIdentity' to be non-null");
        this.guestPartner = Objects.requireNonNull(guestPartner, "expected parameter 'guestPartner' to be non-null");
        this.hostIdentity = Objects.requireNonNull(hostIdentity, "expected parameter 'hostIdentity' to be non-null");
        this.hostPartner = Objects.requireNonNull(hostPartner, "expected parameter 'hostPartner' to be non-null");
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.location = location;
        this.metadata = metadata;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private IntegrationAccountAgreementArgs() {
        this.agreementName = Input.empty();
        this.agreementType = Input.empty();
        this.content = Input.empty();
        this.guestIdentity = Input.empty();
        this.guestPartner = Input.empty();
        this.hostIdentity = Input.empty();
        this.hostPartner = Input.empty();
        this.integrationAccountName = Input.empty();
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountAgreementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> agreementName;
        private Input<AgreementType> agreementType;
        private Input<AgreementContentArgs> content;
        private Input<BusinessIdentityArgs> guestIdentity;
        private Input<String> guestPartner;
        private Input<BusinessIdentityArgs> hostIdentity;
        private Input<String> hostPartner;
        private Input<String> integrationAccountName;
        private @Nullable Input<String> location;
        private @Nullable Input<Object> metadata;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountAgreementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreementName = defaults.agreementName;
    	      this.agreementType = defaults.agreementType;
    	      this.content = defaults.content;
    	      this.guestIdentity = defaults.guestIdentity;
    	      this.guestPartner = defaults.guestPartner;
    	      this.hostIdentity = defaults.hostIdentity;
    	      this.hostPartner = defaults.hostPartner;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAgreementName(@Nullable Input<String> agreementName) {
            this.agreementName = agreementName;
            return this;
        }

        public Builder setAgreementName(@Nullable String agreementName) {
            this.agreementName = Input.ofNullable(agreementName);
            return this;
        }

        public Builder setAgreementType(Input<AgreementType> agreementType) {
            this.agreementType = Objects.requireNonNull(agreementType);
            return this;
        }

        public Builder setAgreementType(AgreementType agreementType) {
            this.agreementType = Input.of(Objects.requireNonNull(agreementType));
            return this;
        }

        public Builder setContent(Input<AgreementContentArgs> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContent(AgreementContentArgs content) {
            this.content = Input.of(Objects.requireNonNull(content));
            return this;
        }

        public Builder setGuestIdentity(Input<BusinessIdentityArgs> guestIdentity) {
            this.guestIdentity = Objects.requireNonNull(guestIdentity);
            return this;
        }

        public Builder setGuestIdentity(BusinessIdentityArgs guestIdentity) {
            this.guestIdentity = Input.of(Objects.requireNonNull(guestIdentity));
            return this;
        }

        public Builder setGuestPartner(Input<String> guestPartner) {
            this.guestPartner = Objects.requireNonNull(guestPartner);
            return this;
        }

        public Builder setGuestPartner(String guestPartner) {
            this.guestPartner = Input.of(Objects.requireNonNull(guestPartner));
            return this;
        }

        public Builder setHostIdentity(Input<BusinessIdentityArgs> hostIdentity) {
            this.hostIdentity = Objects.requireNonNull(hostIdentity);
            return this;
        }

        public Builder setHostIdentity(BusinessIdentityArgs hostIdentity) {
            this.hostIdentity = Input.of(Objects.requireNonNull(hostIdentity));
            return this;
        }

        public Builder setHostPartner(Input<String> hostPartner) {
            this.hostPartner = Objects.requireNonNull(hostPartner);
            return this;
        }

        public Builder setHostPartner(String hostPartner) {
            this.hostPartner = Input.of(Objects.requireNonNull(hostPartner));
            return this;
        }

        public Builder setIntegrationAccountName(Input<String> integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder setIntegrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Input.of(Objects.requireNonNull(integrationAccountName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public IntegrationAccountAgreementArgs build() {
            return new IntegrationAccountAgreementArgs(agreementName, agreementType, content, guestIdentity, guestPartner, hostIdentity, hostPartner, integrationAccountName, location, metadata, resourceGroupName, tags);
        }
    }
}