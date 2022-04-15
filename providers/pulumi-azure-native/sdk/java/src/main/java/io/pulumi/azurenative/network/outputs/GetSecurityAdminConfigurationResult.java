// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityAdminConfigurationResult {
    /**
     * Flag if need to delete existing network security groups.
     * 
     */
    private final @Nullable String deleteExistingNSGs;
    /**
     * A description of the security configuration.
     * 
     */
    private final @Nullable String description;
    /**
     * A display name of the security configuration.
     * 
     */
    private final @Nullable String displayName;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Security Type.
     * 
     */
    private final @Nullable String securityType;
    /**
     * The system metadata related to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSecurityAdminConfigurationResult(
        @CustomType.Parameter("deleteExistingNSGs") @Nullable String deleteExistingNSGs,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("securityType") @Nullable String securityType,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.deleteExistingNSGs = deleteExistingNSGs;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.securityType = securityType;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Flag if need to delete existing network security groups.
     * 
    */
    public Optional<String> deleteExistingNSGs() {
        return Optional.ofNullable(this.deleteExistingNSGs);
    }
    /**
     * A description of the security configuration.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A display name of the security configuration.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioning state of the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Security Type.
     * 
    */
    public Optional<String> securityType() {
        return Optional.ofNullable(this.securityType);
    }
    /**
     * The system metadata related to this resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityAdminConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteExistingNSGs;
        private @Nullable String description;
        private @Nullable String displayName;
        private String etag;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable String securityType;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityAdminConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteExistingNSGs = defaults.deleteExistingNSGs;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.securityType = defaults.securityType;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder deleteExistingNSGs(@Nullable String deleteExistingNSGs) {
            this.deleteExistingNSGs = deleteExistingNSGs;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder securityType(@Nullable String securityType) {
            this.securityType = securityType;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSecurityAdminConfigurationResult build() {
            return new GetSecurityAdminConfigurationResult(deleteExistingNSGs, description, displayName, etag, id, name, provisioningState, securityType, systemData, type);
        }
    }
}
