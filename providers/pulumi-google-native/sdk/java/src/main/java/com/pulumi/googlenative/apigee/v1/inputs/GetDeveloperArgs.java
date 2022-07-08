// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeveloperArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeveloperArgs Empty = new GetDeveloperArgs();

    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="developerId", required=true)
    private Output<String> developerId;

    public Output<String> developerId() {
        return this.developerId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetDeveloperArgs() {}

    private GetDeveloperArgs(GetDeveloperArgs $) {
        this.action = $.action;
        this.developerId = $.developerId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeveloperArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeveloperArgs $;

        public Builder() {
            $ = new GetDeveloperArgs();
        }

        public Builder(GetDeveloperArgs defaults) {
            $ = new GetDeveloperArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder developerId(Output<String> developerId) {
            $.developerId = developerId;
            return this;
        }

        public Builder developerId(String developerId) {
            return developerId(Output.of(developerId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetDeveloperArgs build() {
            $.developerId = Objects.requireNonNull($.developerId, "expected parameter 'developerId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
