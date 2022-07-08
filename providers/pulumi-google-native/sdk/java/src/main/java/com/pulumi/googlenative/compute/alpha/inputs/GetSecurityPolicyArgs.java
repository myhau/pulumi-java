// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecurityPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityPolicyArgs Empty = new GetSecurityPolicyArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="securityPolicy", required=true)
    private Output<String> securityPolicy;

    public Output<String> securityPolicy() {
        return this.securityPolicy;
    }

    private GetSecurityPolicyArgs() {}

    private GetSecurityPolicyArgs(GetSecurityPolicyArgs $) {
        this.project = $.project;
        this.securityPolicy = $.securityPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityPolicyArgs $;

        public Builder() {
            $ = new GetSecurityPolicyArgs();
        }

        public Builder(GetSecurityPolicyArgs defaults) {
            $ = new GetSecurityPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder securityPolicy(Output<String> securityPolicy) {
            $.securityPolicy = securityPolicy;
            return this;
        }

        public Builder securityPolicy(String securityPolicy) {
            return securityPolicy(Output.of(securityPolicy));
        }

        public GetSecurityPolicyArgs build() {
            $.securityPolicy = Objects.requireNonNull($.securityPolicy, "expected parameter 'securityPolicy' to be non-null");
            return $;
        }
    }

}
