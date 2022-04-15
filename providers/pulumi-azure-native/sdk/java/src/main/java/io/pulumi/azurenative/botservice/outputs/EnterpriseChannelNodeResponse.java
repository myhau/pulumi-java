// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnterpriseChannelNodeResponse {
    /**
     * The location of the Enterprise Channel Node.
     * 
     */
    private final String azureLocation;
    /**
     * The sku of the Enterprise Channel Node.
     * 
     */
    private final String azureSku;
    /**
     * Id of Enterprise Channel Node. This is generated by the Bot Framework.
     * 
     */
    private final String id;
    /**
     * The name of the Enterprise Channel Node.
     * 
     */
    private final String name;
    /**
     * The current state of the Enterprise Channel Node.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private EnterpriseChannelNodeResponse(
        @CustomType.Parameter("azureLocation") String azureLocation,
        @CustomType.Parameter("azureSku") String azureSku,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") @Nullable String state) {
        this.azureLocation = azureLocation;
        this.azureSku = azureSku;
        this.id = id;
        this.name = name;
        this.state = state;
    }

    /**
     * The location of the Enterprise Channel Node.
     * 
    */
    public String azureLocation() {
        return this.azureLocation;
    }
    /**
     * The sku of the Enterprise Channel Node.
     * 
    */
    public String azureSku() {
        return this.azureSku;
    }
    /**
     * Id of Enterprise Channel Node. This is generated by the Bot Framework.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the Enterprise Channel Node.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The current state of the Enterprise Channel Node.
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseChannelNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureLocation;
        private String azureSku;
        private String id;
        private String name;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseChannelNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureLocation = defaults.azureLocation;
    	      this.azureSku = defaults.azureSku;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder azureLocation(String azureLocation) {
            this.azureLocation = Objects.requireNonNull(azureLocation);
            return this;
        }
        public Builder azureSku(String azureSku) {
            this.azureSku = Objects.requireNonNull(azureSku);
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
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public EnterpriseChannelNodeResponse build() {
            return new EnterpriseChannelNodeResponse(azureLocation, azureSku, id, name, state);
        }
    }
}
