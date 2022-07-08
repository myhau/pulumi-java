// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.retail.v2.inputs.GetProductArgs;
import com.pulumi.googlenative.retail.v2.inputs.GetProductPlainArgs;
import com.pulumi.googlenative.retail.v2.outputs.GetProductResult;
import java.util.concurrent.CompletableFuture;

public final class Retail_v2Functions {
    /**
     * Gets a Product.
     * 
     */
    public static Output<GetProductResult> getProduct(GetProductArgs args) {
        return getProduct(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Product.
     * 
     */
    public static CompletableFuture<GetProductResult> getProductPlain(GetProductPlainArgs args) {
        return getProductPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a Product.
     * 
     */
    public static Output<GetProductResult> getProduct(GetProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:retail/v2:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a Product.
     * 
     */
    public static CompletableFuture<GetProductResult> getProductPlain(GetProductPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:retail/v2:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
}
