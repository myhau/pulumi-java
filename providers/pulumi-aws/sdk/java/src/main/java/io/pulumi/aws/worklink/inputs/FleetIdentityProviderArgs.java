// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FleetIdentityProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetIdentityProviderArgs Empty = new FleetIdentityProviderArgs();

    /**
     * The SAML metadata document provided by the customer’s identity provider.
     * 
     */
    @InputImport(name="samlMetadata", required=true)
      private final Input<String> samlMetadata;

    public Input<String> getSamlMetadata() {
        return this.samlMetadata;
    }

    /**
     * The type of identity provider.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public FleetIdentityProviderArgs(
        Input<String> samlMetadata,
        Input<String> type) {
        this.samlMetadata = Objects.requireNonNull(samlMetadata, "expected parameter 'samlMetadata' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FleetIdentityProviderArgs() {
        this.samlMetadata = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> samlMetadata;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetIdentityProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.samlMetadata = defaults.samlMetadata;
    	      this.type = defaults.type;
        }

        public Builder setSamlMetadata(Input<String> samlMetadata) {
            this.samlMetadata = Objects.requireNonNull(samlMetadata);
            return this;
        }

        public Builder setSamlMetadata(String samlMetadata) {
            this.samlMetadata = Input.of(Objects.requireNonNull(samlMetadata));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public FleetIdentityProviderArgs build() {
            return new FleetIdentityProviderArgs(samlMetadata, type);
        }
    }
}
