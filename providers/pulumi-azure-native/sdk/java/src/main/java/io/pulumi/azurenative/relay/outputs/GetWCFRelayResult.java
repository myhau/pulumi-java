// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWCFRelayResult {
    /**
     * The time the WCF relay was created.
     * 
     */
    private final String createdAt;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Returns true if the relay is dynamic; otherwise, false.
     * 
     */
    private final Boolean isDynamic;
    /**
     * The number of listeners for this relay. Note that min :1 and max:25 are supported.
     * 
     */
    private final Integer listenerCount;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * WCF relay type.
     * 
     */
    private final @Nullable String relayType;
    /**
     * Returns true if client authorization is needed for this relay; otherwise, false.
     * 
     */
    private final @Nullable Boolean requiresClientAuthorization;
    /**
     * Returns true if transport security is needed for this relay; otherwise, false.
     * 
     */
    private final @Nullable Boolean requiresTransportSecurity;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The time the namespace was updated.
     * 
     */
    private final String updatedAt;
    /**
     * The usermetadata is a placeholder to store user-defined string data for the WCF Relay endpoint. For example, it can be used to store descriptive data, such as list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
     */
    private final @Nullable String userMetadata;

    @CustomType.Constructor
    private GetWCFRelayResult(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isDynamic") Boolean isDynamic,
        @CustomType.Parameter("listenerCount") Integer listenerCount,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("relayType") @Nullable String relayType,
        @CustomType.Parameter("requiresClientAuthorization") @Nullable Boolean requiresClientAuthorization,
        @CustomType.Parameter("requiresTransportSecurity") @Nullable Boolean requiresTransportSecurity,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updatedAt") String updatedAt,
        @CustomType.Parameter("userMetadata") @Nullable String userMetadata) {
        this.createdAt = createdAt;
        this.id = id;
        this.isDynamic = isDynamic;
        this.listenerCount = listenerCount;
        this.name = name;
        this.relayType = relayType;
        this.requiresClientAuthorization = requiresClientAuthorization;
        this.requiresTransportSecurity = requiresTransportSecurity;
        this.type = type;
        this.updatedAt = updatedAt;
        this.userMetadata = userMetadata;
    }

    /**
     * The time the WCF relay was created.
     * 
    */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Returns true if the relay is dynamic; otherwise, false.
     * 
    */
    public Boolean isDynamic() {
        return this.isDynamic;
    }
    /**
     * The number of listeners for this relay. Note that min :1 and max:25 are supported.
     * 
    */
    public Integer listenerCount() {
        return this.listenerCount;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * WCF relay type.
     * 
    */
    public Optional<String> relayType() {
        return Optional.ofNullable(this.relayType);
    }
    /**
     * Returns true if client authorization is needed for this relay; otherwise, false.
     * 
    */
    public Optional<Boolean> requiresClientAuthorization() {
        return Optional.ofNullable(this.requiresClientAuthorization);
    }
    /**
     * Returns true if transport security is needed for this relay; otherwise, false.
     * 
    */
    public Optional<Boolean> requiresTransportSecurity() {
        return Optional.ofNullable(this.requiresTransportSecurity);
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The time the namespace was updated.
     * 
    */
    public String updatedAt() {
        return this.updatedAt;
    }
    /**
     * The usermetadata is a placeholder to store user-defined string data for the WCF Relay endpoint. For example, it can be used to store descriptive data, such as list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
    */
    public Optional<String> userMetadata() {
        return Optional.ofNullable(this.userMetadata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWCFRelayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private Boolean isDynamic;
        private Integer listenerCount;
        private String name;
        private @Nullable String relayType;
        private @Nullable Boolean requiresClientAuthorization;
        private @Nullable Boolean requiresTransportSecurity;
        private String type;
        private String updatedAt;
        private @Nullable String userMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWCFRelayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.isDynamic = defaults.isDynamic;
    	      this.listenerCount = defaults.listenerCount;
    	      this.name = defaults.name;
    	      this.relayType = defaults.relayType;
    	      this.requiresClientAuthorization = defaults.requiresClientAuthorization;
    	      this.requiresTransportSecurity = defaults.requiresTransportSecurity;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
    	      this.userMetadata = defaults.userMetadata;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isDynamic(Boolean isDynamic) {
            this.isDynamic = Objects.requireNonNull(isDynamic);
            return this;
        }
        public Builder listenerCount(Integer listenerCount) {
            this.listenerCount = Objects.requireNonNull(listenerCount);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder relayType(@Nullable String relayType) {
            this.relayType = relayType;
            return this;
        }
        public Builder requiresClientAuthorization(@Nullable Boolean requiresClientAuthorization) {
            this.requiresClientAuthorization = requiresClientAuthorization;
            return this;
        }
        public Builder requiresTransportSecurity(@Nullable Boolean requiresTransportSecurity) {
            this.requiresTransportSecurity = requiresTransportSecurity;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public Builder userMetadata(@Nullable String userMetadata) {
            this.userMetadata = userMetadata;
            return this;
        }        public GetWCFRelayResult build() {
            return new GetWCFRelayResult(createdAt, id, isDynamic, listenerCount, name, relayType, requiresClientAuthorization, requiresTransportSecurity, type, updatedAt, userMetadata);
        }
    }
}
