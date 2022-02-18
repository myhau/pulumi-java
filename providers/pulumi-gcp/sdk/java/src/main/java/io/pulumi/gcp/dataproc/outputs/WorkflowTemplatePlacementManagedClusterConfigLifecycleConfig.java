// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig {
    /**
     * Optional. The time when cluster will be auto-deleted (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    private final @Nullable String autoDeleteTime;
    /**
     * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    private final @Nullable String autoDeleteTtl;
    /**
     * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json).
     * 
     */
    private final @Nullable String idleDeleteTtl;
    /**
     * - 
     * Output only. The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    private final @Nullable String idleStartTime;

    @OutputCustomType.Constructor({"autoDeleteTime","autoDeleteTtl","idleDeleteTtl","idleStartTime"})
    private WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig(
        @Nullable String autoDeleteTime,
        @Nullable String autoDeleteTtl,
        @Nullable String idleDeleteTtl,
        @Nullable String idleStartTime) {
        this.autoDeleteTime = autoDeleteTime;
        this.autoDeleteTtl = autoDeleteTtl;
        this.idleDeleteTtl = idleDeleteTtl;
        this.idleStartTime = idleStartTime;
    }

    /**
     * Optional. The time when cluster will be auto-deleted (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public Optional<String> getAutoDeleteTime() {
        return Optional.ofNullable(this.autoDeleteTime);
    }
    /**
     * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public Optional<String> getAutoDeleteTtl() {
        return Optional.ofNullable(this.autoDeleteTtl);
    }
    /**
     * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json).
     * 
     */
    public Optional<String> getIdleDeleteTtl() {
        return Optional.ofNullable(this.idleDeleteTtl);
    }
    /**
     * - 
     * Output only. The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public Optional<String> getIdleStartTime() {
        return Optional.ofNullable(this.idleStartTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoDeleteTime;
        private @Nullable String autoDeleteTtl;
        private @Nullable String idleDeleteTtl;
        private @Nullable String idleStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteTime = defaults.autoDeleteTime;
    	      this.autoDeleteTtl = defaults.autoDeleteTtl;
    	      this.idleDeleteTtl = defaults.idleDeleteTtl;
    	      this.idleStartTime = defaults.idleStartTime;
        }

        public Builder setAutoDeleteTime(@Nullable String autoDeleteTime) {
            this.autoDeleteTime = autoDeleteTime;
            return this;
        }

        public Builder setAutoDeleteTtl(@Nullable String autoDeleteTtl) {
            this.autoDeleteTtl = autoDeleteTtl;
            return this;
        }

        public Builder setIdleDeleteTtl(@Nullable String idleDeleteTtl) {
            this.idleDeleteTtl = idleDeleteTtl;
            return this;
        }

        public Builder setIdleStartTime(@Nullable String idleStartTime) {
            this.idleStartTime = idleStartTime;
            return this;
        }

        public WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig(autoDeleteTime, autoDeleteTtl, idleDeleteTtl, idleStartTime);
        }
    }
}
