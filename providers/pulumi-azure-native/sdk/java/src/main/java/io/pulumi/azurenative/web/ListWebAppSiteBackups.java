// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppSiteBackupsArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppSiteBackupsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppSiteBackups {
    public static CompletableFuture<ListWebAppSiteBackupsResult> invokeAsync(ListWebAppSiteBackupsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppSiteBackups", TypeShape.of(ListWebAppSiteBackupsResult.class), args == null ? ListWebAppSiteBackupsArgs.Empty : args, Utilities.withVersion(options));
    }
}