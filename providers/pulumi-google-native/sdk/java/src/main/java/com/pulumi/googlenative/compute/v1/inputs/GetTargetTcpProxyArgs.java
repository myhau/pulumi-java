// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetTcpProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetTcpProxyArgs Empty = new GetTargetTcpProxyArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetTcpProxy", required=true)
    private Output<String> targetTcpProxy;

    public Output<String> targetTcpProxy() {
        return this.targetTcpProxy;
    }

    private GetTargetTcpProxyArgs() {}

    private GetTargetTcpProxyArgs(GetTargetTcpProxyArgs $) {
        this.project = $.project;
        this.targetTcpProxy = $.targetTcpProxy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetTcpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetTcpProxyArgs $;

        public Builder() {
            $ = new GetTargetTcpProxyArgs();
        }

        public Builder(GetTargetTcpProxyArgs defaults) {
            $ = new GetTargetTcpProxyArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder targetTcpProxy(Output<String> targetTcpProxy) {
            $.targetTcpProxy = targetTcpProxy;
            return this;
        }

        public Builder targetTcpProxy(String targetTcpProxy) {
            return targetTcpProxy(Output.of(targetTcpProxy));
        }

        public GetTargetTcpProxyArgs build() {
            $.targetTcpProxy = Objects.requireNonNull($.targetTcpProxy, "expected parameter 'targetTcpProxy' to be non-null");
            return $;
        }
    }

}
