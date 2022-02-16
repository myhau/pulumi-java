// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.resiliencehub.ResiliencyPolicyArgs;
import io.pulumi.awsnative.resiliencehub.enums.ResiliencyPolicyDataLocationConstraint;
import io.pulumi.awsnative.resiliencehub.enums.ResiliencyPolicyTier;
import io.pulumi.awsnative.resiliencehub.outputs.ResiliencyPolicyPolicyMap;
import io.pulumi.awsnative.resiliencehub.outputs.ResiliencyPolicyTagMap;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:resiliencehub:ResiliencyPolicy")
public class ResiliencyPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dataLocationConstraint", type=ResiliencyPolicyDataLocationConstraint.class, parameters={})
    private Output</* @Nullable */ ResiliencyPolicyDataLocationConstraint> dataLocationConstraint;

    public Output</* @Nullable */ ResiliencyPolicyDataLocationConstraint> getDataLocationConstraint() {
        return this.dataLocationConstraint;
    }
    @OutputExport(name="policy", type=ResiliencyPolicyPolicyMap.class, parameters={})
    private Output<ResiliencyPolicyPolicyMap> policy;

    public Output<ResiliencyPolicyPolicyMap> getPolicy() {
        return this.policy;
    }
    @OutputExport(name="policyArn", type=String.class, parameters={})
    private Output<String> policyArn;

    public Output<String> getPolicyArn() {
        return this.policyArn;
    }
    @OutputExport(name="policyDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyDescription;

    public Output</* @Nullable */ String> getPolicyDescription() {
        return this.policyDescription;
    }
    @OutputExport(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName;
    }
    @OutputExport(name="tags", type=ResiliencyPolicyTagMap.class, parameters={})
    private Output</* @Nullable */ ResiliencyPolicyTagMap> tags;

    public Output</* @Nullable */ ResiliencyPolicyTagMap> getTags() {
        return this.tags;
    }
    @OutputExport(name="tier", type=ResiliencyPolicyTier.class, parameters={})
    private Output<ResiliencyPolicyTier> tier;

    public Output<ResiliencyPolicyTier> getTier() {
        return this.tier;
    }

    public ResiliencyPolicy(String name, ResiliencyPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resiliencehub:ResiliencyPolicy", name, args == null ? ResiliencyPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResiliencyPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:resiliencehub:ResiliencyPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ResiliencyPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResiliencyPolicy(name, id, options);
    }
}