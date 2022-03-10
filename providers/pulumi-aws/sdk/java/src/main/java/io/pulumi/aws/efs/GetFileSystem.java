// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.efs.inputs.GetFileSystemArgs;
import io.pulumi.aws.efs.outputs.GetFileSystemResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFileSystem {
    private GetFileSystem() {}
    public interface BuilderApplicator {
        public void apply(GetFileSystemArgs.Builder a);
    }
    private static GetFileSystemArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetFileSystemArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides information about an Elastic File System (EFS) File System.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getFileSystem.
 * 
     *
     * A collection of values returned by getFileSystem.
 * 
     */
    public static CompletableFuture<GetFileSystemResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides information about an Elastic File System (EFS) File System.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getFileSystem.
     * 
     *
         * A collection of values returned by getFileSystem.
     * 
     */
    public static CompletableFuture<GetFileSystemResult> invokeAsync(@Nullable GetFileSystemArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:efs/getFileSystem:getFileSystem", TypeShape.of(GetFileSystemResult.class), args == null ? GetFileSystemArgs.Empty : args, Utilities.withVersion(options));
    }
}