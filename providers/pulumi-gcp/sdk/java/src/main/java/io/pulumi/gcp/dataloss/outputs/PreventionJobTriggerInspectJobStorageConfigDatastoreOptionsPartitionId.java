// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId {
    /**
     * If not empty, the ID of the namespace to which the entities belong.
     * 
     */
    private final @Nullable String namespaceId;
    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    private final String projectId;

    @OutputCustomType.Constructor({"namespaceId","projectId"})
    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId(
        @Nullable String namespaceId,
        String projectId) {
        this.namespaceId = namespaceId;
        this.projectId = Objects.requireNonNull(projectId);
    }

    /**
     * If not empty, the ID of the namespace to which the entities belong.
     * 
     */
    public Optional<String> getNamespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }
    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String namespaceId;
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceId = defaults.namespaceId;
    	      this.projectId = defaults.projectId;
        }

        public Builder setNamespaceId(@Nullable String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId build() {
            return new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId(namespaceId, projectId);
        }
    }
}
