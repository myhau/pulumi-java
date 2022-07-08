// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.policysimulator.v1.inputs.GetFolderReplayArgs;
import com.pulumi.googlenative.policysimulator.v1.inputs.GetFolderReplayPlainArgs;
import com.pulumi.googlenative.policysimulator.v1.inputs.GetOrganizationReplayArgs;
import com.pulumi.googlenative.policysimulator.v1.inputs.GetOrganizationReplayPlainArgs;
import com.pulumi.googlenative.policysimulator.v1.inputs.GetReplayArgs;
import com.pulumi.googlenative.policysimulator.v1.inputs.GetReplayPlainArgs;
import com.pulumi.googlenative.policysimulator.v1.outputs.GetFolderReplayResult;
import com.pulumi.googlenative.policysimulator.v1.outputs.GetOrganizationReplayResult;
import com.pulumi.googlenative.policysimulator.v1.outputs.GetReplayResult;
import java.util.concurrent.CompletableFuture;

public final class Policysimulator_v1Functions {
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static Output<GetFolderReplayResult> getFolderReplay(GetFolderReplayArgs args) {
        return getFolderReplay(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static CompletableFuture<GetFolderReplayResult> getFolderReplayPlain(GetFolderReplayPlainArgs args) {
        return getFolderReplayPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static Output<GetFolderReplayResult> getFolderReplay(GetFolderReplayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:policysimulator/v1:getFolderReplay", TypeShape.of(GetFolderReplayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static CompletableFuture<GetFolderReplayResult> getFolderReplayPlain(GetFolderReplayPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:policysimulator/v1:getFolderReplay", TypeShape.of(GetFolderReplayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static Output<GetOrganizationReplayResult> getOrganizationReplay(GetOrganizationReplayArgs args) {
        return getOrganizationReplay(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static CompletableFuture<GetOrganizationReplayResult> getOrganizationReplayPlain(GetOrganizationReplayPlainArgs args) {
        return getOrganizationReplayPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static Output<GetOrganizationReplayResult> getOrganizationReplay(GetOrganizationReplayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:policysimulator/v1:getOrganizationReplay", TypeShape.of(GetOrganizationReplayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static CompletableFuture<GetOrganizationReplayResult> getOrganizationReplayPlain(GetOrganizationReplayPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:policysimulator/v1:getOrganizationReplay", TypeShape.of(GetOrganizationReplayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static Output<GetReplayResult> getReplay(GetReplayArgs args) {
        return getReplay(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static CompletableFuture<GetReplayResult> getReplayPlain(GetReplayPlainArgs args) {
        return getReplayPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static Output<GetReplayResult> getReplay(GetReplayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:policysimulator/v1:getReplay", TypeShape.of(GetReplayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified Replay. Each `Replay` is available for at least 7 days.
     * 
     */
    public static CompletableFuture<GetReplayResult> getReplayPlain(GetReplayPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:policysimulator/v1:getReplay", TypeShape.of(GetReplayResult.class), args, Utilities.withVersion(options));
    }
}
