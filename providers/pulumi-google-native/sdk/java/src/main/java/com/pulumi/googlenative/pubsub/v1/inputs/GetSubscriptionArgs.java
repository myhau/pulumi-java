// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionArgs Empty = new GetSubscriptionArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private GetSubscriptionArgs() {}

    private GetSubscriptionArgs(GetSubscriptionArgs $) {
        this.project = $.project;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionArgs $;

        public Builder() {
            $ = new GetSubscriptionArgs();
        }

        public Builder(GetSubscriptionArgs defaults) {
            $ = new GetSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public GetSubscriptionArgs build() {
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
