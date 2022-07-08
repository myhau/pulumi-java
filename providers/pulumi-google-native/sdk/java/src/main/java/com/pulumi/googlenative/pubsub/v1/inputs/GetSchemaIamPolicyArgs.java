// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaIamPolicyArgs Empty = new GetSchemaIamPolicyArgs();

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

    @Import(name="schemaId", required=true)
    private Output<String> schemaId;

    public Output<String> schemaId() {
        return this.schemaId;
    }

    private GetSchemaIamPolicyArgs() {}

    private GetSchemaIamPolicyArgs(GetSchemaIamPolicyArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.schemaId = $.schemaId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaIamPolicyArgs $;

        public Builder() {
            $ = new GetSchemaIamPolicyArgs();
        }

        public Builder(GetSchemaIamPolicyArgs defaults) {
            $ = new GetSchemaIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder schemaId(Output<String> schemaId) {
            $.schemaId = schemaId;
            return this;
        }

        public Builder schemaId(String schemaId) {
            return schemaId(Output.of(schemaId));
        }

        public GetSchemaIamPolicyArgs build() {
            $.schemaId = Objects.requireNonNull($.schemaId, "expected parameter 'schemaId' to be non-null");
            return $;
        }
    }

}
