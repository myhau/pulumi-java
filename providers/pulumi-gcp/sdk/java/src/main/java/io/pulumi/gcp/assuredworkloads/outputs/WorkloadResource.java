// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.assuredworkloads.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkloadResource {
    /**
     * Resource identifier. For a project this represents project_number. If the project is already taken, the workload creation will fail.
     * 
     */
    private final @Nullable Integer resourceId;
    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT) Possible values: RESOURCE_TYPE_UNSPECIFIED, CONSUMER_PROJECT, ENCRYPTION_KEYS_PROJECT, KEYRING, CONSUMER_FOLDER
     * 
     */
    private final @Nullable String resourceType;

    @OutputCustomType.Constructor({"resourceId","resourceType"})
    private WorkloadResource(
        @Nullable Integer resourceId,
        @Nullable String resourceType) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    /**
     * Resource identifier. For a project this represents project_number. If the project is already taken, the workload creation will fail.
     * 
     */
    public Optional<Integer> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT) Possible values: RESOURCE_TYPE_UNSPECIFIED, CONSUMER_PROJECT, ENCRYPTION_KEYS_PROJECT, KEYRING, CONSUMER_FOLDER
     * 
     */
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer resourceId;
        private @Nullable String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setResourceId(@Nullable Integer resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public WorkloadResource build() {
            return new WorkloadResource(resourceId, resourceType);
        }
    }
}
