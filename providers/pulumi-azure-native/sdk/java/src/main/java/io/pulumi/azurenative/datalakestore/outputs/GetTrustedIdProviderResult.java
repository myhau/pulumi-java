// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTrustedIdProviderResult {
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The URL of this trusted identity provider.
     * 
     */
    private final String idProvider;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","idProvider","name","type"})
    private GetTrustedIdProviderResult(
        String id,
        String idProvider,
        String name,
        String type) {
        this.id = id;
        this.idProvider = idProvider;
        this.name = name;
        this.type = type;
    }

    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The URL of this trusted identity provider.
     * 
    */
    public String getIdProvider() {
        return this.idProvider;
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrustedIdProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String idProvider;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrustedIdProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.idProvider = defaults.idProvider;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdProvider(String idProvider) {
            this.idProvider = Objects.requireNonNull(idProvider);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTrustedIdProviderResult build() {
            return new GetTrustedIdProviderResult(id, idProvider, name, type);
        }
    }
}
