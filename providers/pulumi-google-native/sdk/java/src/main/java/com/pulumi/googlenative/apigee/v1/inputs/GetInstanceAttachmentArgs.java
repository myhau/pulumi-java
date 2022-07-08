// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceAttachmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceAttachmentArgs Empty = new GetInstanceAttachmentArgs();

    @Import(name="attachmentId", required=true)
    private Output<String> attachmentId;

    public Output<String> attachmentId() {
        return this.attachmentId;
    }

    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetInstanceAttachmentArgs() {}

    private GetInstanceAttachmentArgs(GetInstanceAttachmentArgs $) {
        this.attachmentId = $.attachmentId;
        this.instanceId = $.instanceId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceAttachmentArgs $;

        public Builder() {
            $ = new GetInstanceAttachmentArgs();
        }

        public Builder(GetInstanceAttachmentArgs defaults) {
            $ = new GetInstanceAttachmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder attachmentId(Output<String> attachmentId) {
            $.attachmentId = attachmentId;
            return this;
        }

        public Builder attachmentId(String attachmentId) {
            return attachmentId(Output.of(attachmentId));
        }

        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetInstanceAttachmentArgs build() {
            $.attachmentId = Objects.requireNonNull($.attachmentId, "expected parameter 'attachmentId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
