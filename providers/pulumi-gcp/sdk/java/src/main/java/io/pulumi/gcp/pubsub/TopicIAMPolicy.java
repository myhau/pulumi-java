// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.pubsub.TopicIAMPolicyArgs;
import io.pulumi.gcp.pubsub.inputs.TopicIAMPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:pubsub/topicIAMPolicy:TopicIAMPolicy")
public class TopicIAMPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    public Output<String> getTopic() {
        return this.topic;
    }

    public TopicIAMPolicy(String name, TopicIAMPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/topicIAMPolicy:TopicIAMPolicy", name, args == null ? TopicIAMPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TopicIAMPolicy(String name, Input<String> id, @Nullable TopicIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/topicIAMPolicy:TopicIAMPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static TopicIAMPolicy get(String name, Input<String> id, @Nullable TopicIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TopicIAMPolicy(name, id, state, options);
    }
}