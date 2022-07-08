// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTargetServerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetServerArgs Empty = new GetTargetServerArgs();

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    @Import(name="targetserverId", required=true)
    private Output<String> targetserverId;

    public Output<String> targetserverId() {
        return this.targetserverId;
    }

    private GetTargetServerArgs() {}

    private GetTargetServerArgs(GetTargetServerArgs $) {
        this.environmentId = $.environmentId;
        this.organizationId = $.organizationId;
        this.targetserverId = $.targetserverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetServerArgs $;

        public Builder() {
            $ = new GetTargetServerArgs();
        }

        public Builder(GetTargetServerArgs defaults) {
            $ = new GetTargetServerArgs(Objects.requireNonNull(defaults));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder targetserverId(Output<String> targetserverId) {
            $.targetserverId = targetserverId;
            return this;
        }

        public Builder targetserverId(String targetserverId) {
            return targetserverId(Output.of(targetserverId));
        }

        public GetTargetServerArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.targetserverId = Objects.requireNonNull($.targetserverId, "expected parameter 'targetserverId' to be non-null");
            return $;
        }
    }

}
