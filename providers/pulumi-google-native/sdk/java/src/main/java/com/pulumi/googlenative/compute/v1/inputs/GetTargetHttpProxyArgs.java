// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetHttpProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetHttpProxyArgs Empty = new GetTargetHttpProxyArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetHttpProxy", required=true)
    private Output<String> targetHttpProxy;

    public Output<String> targetHttpProxy() {
        return this.targetHttpProxy;
    }

    private GetTargetHttpProxyArgs() {}

    private GetTargetHttpProxyArgs(GetTargetHttpProxyArgs $) {
        this.project = $.project;
        this.targetHttpProxy = $.targetHttpProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetHttpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetHttpProxyArgs $;

        public Builder() {
            $ = new GetTargetHttpProxyArgs();
        }

        public Builder(GetTargetHttpProxyArgs defaults) {
            $ = new GetTargetHttpProxyArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder targetHttpProxy(Output<String> targetHttpProxy) {
            $.targetHttpProxy = targetHttpProxy;
            return this;
        }

        public Builder targetHttpProxy(String targetHttpProxy) {
            return targetHttpProxy(Output.of(targetHttpProxy));
        }

        public GetTargetHttpProxyArgs build() {
            $.targetHttpProxy = Objects.requireNonNull($.targetHttpProxy, "expected parameter 'targetHttpProxy' to be non-null");
            return $;
        }
    }

}
