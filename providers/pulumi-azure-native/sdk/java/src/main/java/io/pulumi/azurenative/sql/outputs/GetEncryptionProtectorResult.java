// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEncryptionProtectorResult {
    /**
     * Key auto rotation opt-in flag. Either true or false.
     * 
     */
    private final @Nullable Boolean autoRotationEnabled;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     */
    private final String kind;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The name of the server key.
     * 
     */
    private final @Nullable String serverKeyName;
    /**
     * The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     * 
     */
    private final String serverKeyType;
    /**
     * Subregion of the encryption protector.
     * 
     */
    private final String subregion;
    /**
     * Thumbprint of the server key.
     * 
     */
    private final String thumbprint;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The URI of the server key.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private GetEncryptionProtectorResult(
        @CustomType.Parameter("autoRotationEnabled") @Nullable Boolean autoRotationEnabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("serverKeyName") @Nullable String serverKeyName,
        @CustomType.Parameter("serverKeyType") String serverKeyType,
        @CustomType.Parameter("subregion") String subregion,
        @CustomType.Parameter("thumbprint") String thumbprint,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uri") String uri) {
        this.autoRotationEnabled = autoRotationEnabled;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.serverKeyName = serverKeyName;
        this.serverKeyType = serverKeyType;
        this.subregion = subregion;
        this.thumbprint = thumbprint;
        this.type = type;
        this.uri = uri;
    }

    /**
     * Key auto rotation opt-in flag. Either true or false.
     * 
    */
    public Optional<Boolean> autoRotationEnabled() {
        return Optional.ofNullable(this.autoRotationEnabled);
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The name of the server key.
     * 
    */
    public Optional<String> serverKeyName() {
        return Optional.ofNullable(this.serverKeyName);
    }
    /**
     * The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     * 
    */
    public String serverKeyType() {
        return this.serverKeyType;
    }
    /**
     * Subregion of the encryption protector.
     * 
    */
    public String subregion() {
        return this.subregion;
    }
    /**
     * Thumbprint of the server key.
     * 
    */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The URI of the server key.
     * 
    */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptionProtectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoRotationEnabled;
        private String id;
        private String kind;
        private String location;
        private String name;
        private @Nullable String serverKeyName;
        private String serverKeyType;
        private String subregion;
        private String thumbprint;
        private String type;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEncryptionProtectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRotationEnabled = defaults.autoRotationEnabled;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.serverKeyName = defaults.serverKeyName;
    	      this.serverKeyType = defaults.serverKeyType;
    	      this.subregion = defaults.subregion;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder autoRotationEnabled(@Nullable Boolean autoRotationEnabled) {
            this.autoRotationEnabled = autoRotationEnabled;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder serverKeyName(@Nullable String serverKeyName) {
            this.serverKeyName = serverKeyName;
            return this;
        }
        public Builder serverKeyType(String serverKeyType) {
            this.serverKeyType = Objects.requireNonNull(serverKeyType);
            return this;
        }
        public Builder subregion(String subregion) {
            this.subregion = Objects.requireNonNull(subregion);
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GetEncryptionProtectorResult build() {
            return new GetEncryptionProtectorResult(autoRotationEnabled, id, kind, location, name, serverKeyName, serverKeyType, subregion, thumbprint, type, uri);
        }
    }
}
