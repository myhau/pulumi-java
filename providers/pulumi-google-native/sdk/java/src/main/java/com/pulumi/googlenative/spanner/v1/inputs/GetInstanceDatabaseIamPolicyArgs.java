// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.spanner.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceDatabaseIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceDatabaseIamPolicyArgs Empty = new GetInstanceDatabaseIamPolicyArgs();

    @Import(name="databaseId", required=true)
    private Output<String> databaseId;

    public Output<String> databaseId() {
        return this.databaseId;
    }

    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstanceDatabaseIamPolicyArgs() {}

    private GetInstanceDatabaseIamPolicyArgs(GetInstanceDatabaseIamPolicyArgs $) {
        this.databaseId = $.databaseId;
        this.instanceId = $.instanceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceDatabaseIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceDatabaseIamPolicyArgs $;

        public Builder() {
            $ = new GetInstanceDatabaseIamPolicyArgs();
        }

        public Builder(GetInstanceDatabaseIamPolicyArgs defaults) {
            $ = new GetInstanceDatabaseIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder databaseId(Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetInstanceDatabaseIamPolicyArgs build() {
            $.databaseId = Objects.requireNonNull($.databaseId, "expected parameter 'databaseId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
