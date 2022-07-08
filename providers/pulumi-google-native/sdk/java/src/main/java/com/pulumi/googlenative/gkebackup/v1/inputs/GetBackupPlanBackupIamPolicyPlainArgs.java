// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackupPlanBackupIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupPlanBackupIamPolicyPlainArgs Empty = new GetBackupPlanBackupIamPolicyPlainArgs();

    @Import(name="backupId", required=true)
    private String backupId;

    public String backupId() {
        return this.backupId;
    }

    @Import(name="backupPlanId", required=true)
    private String backupPlanId;

    public String backupPlanId() {
        return this.backupPlanId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBackupPlanBackupIamPolicyPlainArgs() {}

    private GetBackupPlanBackupIamPolicyPlainArgs(GetBackupPlanBackupIamPolicyPlainArgs $) {
        this.backupId = $.backupId;
        this.backupPlanId = $.backupPlanId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupPlanBackupIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupPlanBackupIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetBackupPlanBackupIamPolicyPlainArgs();
        }

        public Builder(GetBackupPlanBackupIamPolicyPlainArgs defaults) {
            $ = new GetBackupPlanBackupIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupId(String backupId) {
            $.backupId = backupId;
            return this;
        }

        public Builder backupPlanId(String backupPlanId) {
            $.backupPlanId = backupPlanId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetBackupPlanBackupIamPolicyPlainArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.backupPlanId = Objects.requireNonNull($.backupPlanId, "expected parameter 'backupPlanId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
