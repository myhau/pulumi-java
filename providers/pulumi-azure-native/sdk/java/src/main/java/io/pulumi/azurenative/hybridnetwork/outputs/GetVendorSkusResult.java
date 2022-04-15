// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.azurenative.hybridnetwork.outputs.NetworkFunctionTemplateResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVendorSkusResult {
    /**
     * The sku deployment mode.
     * 
     */
    private final @Nullable String deploymentMode;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The parameters for the managed application to be supplied by the vendor.
     * 
     */
    private final @Nullable Object managedApplicationParameters;
    /**
     * The template for the managed application deployment.
     * 
     */
    private final @Nullable Object managedApplicationTemplate;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The template definition of the network function.
     * 
     */
    private final @Nullable NetworkFunctionTemplateResponse networkFunctionTemplate;
    /**
     * Indicates if the vendor sku is in preview mode.
     * 
     */
    private final @Nullable Boolean preview;
    /**
     * The provisioning state of the vendor sku sub resource.
     * 
     */
    private final String provisioningState;
    /**
     * The sku type.
     * 
     */
    private final @Nullable String skuType;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetVendorSkusResult(
        @CustomType.Parameter("deploymentMode") @Nullable String deploymentMode,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("managedApplicationParameters") @Nullable Object managedApplicationParameters,
        @CustomType.Parameter("managedApplicationTemplate") @Nullable Object managedApplicationTemplate,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkFunctionTemplate") @Nullable NetworkFunctionTemplateResponse networkFunctionTemplate,
        @CustomType.Parameter("preview") @Nullable Boolean preview,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("skuType") @Nullable String skuType,
        @CustomType.Parameter("type") String type) {
        this.deploymentMode = deploymentMode;
        this.id = id;
        this.managedApplicationParameters = managedApplicationParameters;
        this.managedApplicationTemplate = managedApplicationTemplate;
        this.name = name;
        this.networkFunctionTemplate = networkFunctionTemplate;
        this.preview = preview;
        this.provisioningState = provisioningState;
        this.skuType = skuType;
        this.type = type;
    }

    /**
     * The sku deployment mode.
     * 
    */
    public Optional<String> deploymentMode() {
        return Optional.ofNullable(this.deploymentMode);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The parameters for the managed application to be supplied by the vendor.
     * 
    */
    public Optional<Object> managedApplicationParameters() {
        return Optional.ofNullable(this.managedApplicationParameters);
    }
    /**
     * The template for the managed application deployment.
     * 
    */
    public Optional<Object> managedApplicationTemplate() {
        return Optional.ofNullable(this.managedApplicationTemplate);
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The template definition of the network function.
     * 
    */
    public Optional<NetworkFunctionTemplateResponse> networkFunctionTemplate() {
        return Optional.ofNullable(this.networkFunctionTemplate);
    }
    /**
     * Indicates if the vendor sku is in preview mode.
     * 
    */
    public Optional<Boolean> preview() {
        return Optional.ofNullable(this.preview);
    }
    /**
     * The provisioning state of the vendor sku sub resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku type.
     * 
    */
    public Optional<String> skuType() {
        return Optional.ofNullable(this.skuType);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVendorSkusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deploymentMode;
        private String id;
        private @Nullable Object managedApplicationParameters;
        private @Nullable Object managedApplicationTemplate;
        private String name;
        private @Nullable NetworkFunctionTemplateResponse networkFunctionTemplate;
        private @Nullable Boolean preview;
        private String provisioningState;
        private @Nullable String skuType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVendorSkusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentMode = defaults.deploymentMode;
    	      this.id = defaults.id;
    	      this.managedApplicationParameters = defaults.managedApplicationParameters;
    	      this.managedApplicationTemplate = defaults.managedApplicationTemplate;
    	      this.name = defaults.name;
    	      this.networkFunctionTemplate = defaults.networkFunctionTemplate;
    	      this.preview = defaults.preview;
    	      this.provisioningState = defaults.provisioningState;
    	      this.skuType = defaults.skuType;
    	      this.type = defaults.type;
        }

        public Builder deploymentMode(@Nullable String deploymentMode) {
            this.deploymentMode = deploymentMode;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder managedApplicationParameters(@Nullable Object managedApplicationParameters) {
            this.managedApplicationParameters = managedApplicationParameters;
            return this;
        }
        public Builder managedApplicationTemplate(@Nullable Object managedApplicationTemplate) {
            this.managedApplicationTemplate = managedApplicationTemplate;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkFunctionTemplate(@Nullable NetworkFunctionTemplateResponse networkFunctionTemplate) {
            this.networkFunctionTemplate = networkFunctionTemplate;
            return this;
        }
        public Builder preview(@Nullable Boolean preview) {
            this.preview = preview;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder skuType(@Nullable String skuType) {
            this.skuType = skuType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetVendorSkusResult build() {
            return new GetVendorSkusResult(deploymentMode, id, managedApplicationParameters, managedApplicationTemplate, name, networkFunctionTemplate, preview, provisioningState, skuType, type);
        }
    }
}
