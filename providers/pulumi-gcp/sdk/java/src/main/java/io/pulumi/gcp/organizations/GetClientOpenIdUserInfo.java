// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.outputs.GetClientOpenIdUserInfoResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetClientOpenIdUserInfo {
/**
 * Get OpenID userinfo about the credentials used with the Google provider,
 * specifically the email.
 * 
 * This datasource enables you to export the email of the account you've
 * authenticated the provider with; this can be used alongside
 * `data.google_client_config`'s `access_token` to perform OpenID Connect
 * authentication with GKE and configure an RBAC role for the email used.
 * 
 * > This resource will only work as expected if the provider is configured to
 * use the `https://www.googleapis.com/auth/userinfo.email` scope! You will
 * receive an error otherwise.
 * 
 * ## Example Usage
 * 
 *
 * A collection of values returned by getClientOpenIdUserInfo.
 * 
 */
    public static CompletableFuture<GetClientOpenIdUserInfoResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getClientOpenIdUserInfo:getClientOpenIdUserInfo", TypeShape.of(GetClientOpenIdUserInfoResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
