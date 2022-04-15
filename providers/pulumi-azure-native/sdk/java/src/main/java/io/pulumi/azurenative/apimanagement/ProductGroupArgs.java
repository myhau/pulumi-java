// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProductGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProductGroupArgs Empty = new ProductGroupArgs();

    /**
     * Group identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="groupId")
      private final @Nullable Output<String> groupId;

    public Output<String> groupId() {
        return this.groupId == null ? Codegen.empty() : this.groupId;
    }

    /**
     * Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="productId", required=true)
      private final Output<String> productId;

    public Output<String> productId() {
        return this.productId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    public ProductGroupArgs(
        @Nullable Output<String> groupId,
        Output<String> productId,
        Output<String> resourceGroupName,
        Output<String> serviceName) {
        this.groupId = groupId;
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ProductGroupArgs() {
        this.groupId = Codegen.empty();
        this.productId = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> groupId;
        private Output<String> productId;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.productId = defaults.productId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder groupId(@Nullable Output<String> groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder groupId(@Nullable String groupId) {
            this.groupId = Codegen.ofNullable(groupId);
            return this;
        }
        public Builder productId(Output<String> productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        public Builder productId(String productId) {
            this.productId = Output.of(Objects.requireNonNull(productId));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }        public ProductGroupArgs build() {
            return new ProductGroupArgs(groupId, productId, resourceGroupName, serviceName);
        }
    }
}
