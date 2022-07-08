// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateTemplateIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateTemplateIamPolicyArgs Empty = new GetCertificateTemplateIamPolicyArgs();

    @Import(name="certificateTemplateId", required=true)
    private Output<String> certificateTemplateId;

    public Output<String> certificateTemplateId() {
        return this.certificateTemplateId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
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

    private GetCertificateTemplateIamPolicyArgs() {}

    private GetCertificateTemplateIamPolicyArgs(GetCertificateTemplateIamPolicyArgs $) {
        this.certificateTemplateId = $.certificateTemplateId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateTemplateIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateTemplateIamPolicyArgs $;

        public Builder() {
            $ = new GetCertificateTemplateIamPolicyArgs();
        }

        public Builder(GetCertificateTemplateIamPolicyArgs defaults) {
            $ = new GetCertificateTemplateIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateTemplateId(Output<String> certificateTemplateId) {
            $.certificateTemplateId = certificateTemplateId;
            return this;
        }

        public Builder certificateTemplateId(String certificateTemplateId) {
            return certificateTemplateId(Output.of(certificateTemplateId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
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

        public GetCertificateTemplateIamPolicyArgs build() {
            $.certificateTemplateId = Objects.requireNonNull($.certificateTemplateId, "expected parameter 'certificateTemplateId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
