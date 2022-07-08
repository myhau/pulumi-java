// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainBackupIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainBackupIamPolicyArgs Empty = new GetDomainBackupIamPolicyArgs();

    @Import(name="backupId", required=true)
    private Output<String> backupId;

    public Output<String> backupId() {
        return this.backupId;
    }

    @Import(name="domainId", required=true)
    private Output<String> domainId;

    public Output<String> domainId() {
        return this.domainId;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDomainBackupIamPolicyArgs() {}

    private GetDomainBackupIamPolicyArgs(GetDomainBackupIamPolicyArgs $) {
        this.backupId = $.backupId;
        this.domainId = $.domainId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainBackupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainBackupIamPolicyArgs $;

        public Builder() {
            $ = new GetDomainBackupIamPolicyArgs();
        }

        public Builder(GetDomainBackupIamPolicyArgs defaults) {
            $ = new GetDomainBackupIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupId(Output<String> backupId) {
            $.backupId = backupId;
            return this;
        }

        public Builder backupId(String backupId) {
            return backupId(Output.of(backupId));
        }

        public Builder domainId(Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetDomainBackupIamPolicyArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.domainId = Objects.requireNonNull($.domainId, "expected parameter 'domainId' to be non-null");
            return $;
        }
    }

}
