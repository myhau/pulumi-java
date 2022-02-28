// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codecommit.inputs.GetApprovalRuleTemplateArgs;
import io.pulumi.aws.codecommit.outputs.GetApprovalRuleTemplateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApprovalRuleTemplate {
/**
 * Provides details about a specific CodeCommit Approval Rule Template.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getApprovalRuleTemplate.
 * 
 *
 * A collection of values returned by getApprovalRuleTemplate.
 * 
 */
    public static CompletableFuture<GetApprovalRuleTemplateResult> invokeAsync(GetApprovalRuleTemplateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:codecommit/getApprovalRuleTemplate:getApprovalRuleTemplate", TypeShape.of(GetApprovalRuleTemplateResult.class), args == null ? GetApprovalRuleTemplateArgs.Empty : args, Utilities.withVersion(options));
    }
}
