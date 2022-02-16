// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    @InputImport(name="autoCreateNetwork")
    private final @Nullable Input<Boolean> autoCreateNetwork;

    public Input<Boolean> getAutoCreateNetwork() {
        return this.autoCreateNetwork == null ? Input.empty() : this.autoCreateNetwork;
    }

    @InputImport(name="billingAccount")
    private final @Nullable Input<String> billingAccount;

    public Input<String> getBillingAccount() {
        return this.billingAccount == null ? Input.empty() : this.billingAccount;
    }

    @InputImport(name="folderId")
    private final @Nullable Input<String> folderId;

    public Input<String> getFolderId() {
        return this.folderId == null ? Input.empty() : this.folderId;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="orgId")
    private final @Nullable Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId == null ? Input.empty() : this.orgId;
    }

    @InputImport(name="projectId", required=true)
    private final Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId;
    }

    @InputImport(name="skipDelete")
    private final @Nullable Input<Boolean> skipDelete;

    public Input<Boolean> getSkipDelete() {
        return this.skipDelete == null ? Input.empty() : this.skipDelete;
    }

    public ProjectArgs(
        @Nullable Input<Boolean> autoCreateNetwork,
        @Nullable Input<String> billingAccount,
        @Nullable Input<String> folderId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> orgId,
        Input<String> projectId,
        @Nullable Input<Boolean> skipDelete) {
        this.autoCreateNetwork = autoCreateNetwork;
        this.billingAccount = billingAccount;
        this.folderId = folderId;
        this.labels = labels;
        this.name = name;
        this.orgId = orgId;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.skipDelete = skipDelete;
    }

    private ProjectArgs() {
        this.autoCreateNetwork = Input.empty();
        this.billingAccount = Input.empty();
        this.folderId = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.orgId = Input.empty();
        this.projectId = Input.empty();
        this.skipDelete = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoCreateNetwork;
        private @Nullable Input<String> billingAccount;
        private @Nullable Input<String> folderId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> orgId;
        private Input<String> projectId;
        private @Nullable Input<Boolean> skipDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateNetwork = defaults.autoCreateNetwork;
    	      this.billingAccount = defaults.billingAccount;
    	      this.folderId = defaults.folderId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.skipDelete = defaults.skipDelete;
        }

        public Builder setAutoCreateNetwork(@Nullable Input<Boolean> autoCreateNetwork) {
            this.autoCreateNetwork = autoCreateNetwork;
            return this;
        }

        public Builder setAutoCreateNetwork(@Nullable Boolean autoCreateNetwork) {
            this.autoCreateNetwork = Input.ofNullable(autoCreateNetwork);
            return this;
        }

        public Builder setBillingAccount(@Nullable Input<String> billingAccount) {
            this.billingAccount = billingAccount;
            return this;
        }

        public Builder setBillingAccount(@Nullable String billingAccount) {
            this.billingAccount = Input.ofNullable(billingAccount);
            return this;
        }

        public Builder setFolderId(@Nullable Input<String> folderId) {
            this.folderId = folderId;
            return this;
        }

        public Builder setFolderId(@Nullable String folderId) {
            this.folderId = Input.ofNullable(folderId);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrgId(@Nullable Input<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder setOrgId(@Nullable String orgId) {
            this.orgId = Input.ofNullable(orgId);
            return this;
        }

        public Builder setProjectId(Input<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Input.of(Objects.requireNonNull(projectId));
            return this;
        }

        public Builder setSkipDelete(@Nullable Input<Boolean> skipDelete) {
            this.skipDelete = skipDelete;
            return this;
        }

        public Builder setSkipDelete(@Nullable Boolean skipDelete) {
            this.skipDelete = Input.ofNullable(skipDelete);
            return this;
        }

        public ProjectArgs build() {
            return new ProjectArgs(autoCreateNetwork, billingAccount, folderId, labels, name, orgId, projectId, skipDelete);
        }
    }
}