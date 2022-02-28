// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecr.inputs.GetCredentialsArgs;
import io.pulumi.aws.ecr.outputs.GetCredentialsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCredentials {
    public static CompletableFuture<GetCredentialsResult> invokeAsync(GetCredentialsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecr/getCredentials:getCredentials", TypeShape.of(GetCredentialsResult.class), args == null ? GetCredentialsArgs.Empty : args, Utilities.withVersion(options));
    }
}
