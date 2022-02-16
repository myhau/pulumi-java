// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ProjectSinkBigqueryOptions {
    private final Boolean usePartitionedTables;

    @OutputCustomType.Constructor({"usePartitionedTables"})
    private ProjectSinkBigqueryOptions(Boolean usePartitionedTables) {
        this.usePartitionedTables = Objects.requireNonNull(usePartitionedTables);
    }

    public Boolean getUsePartitionedTables() {
        return this.usePartitionedTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSinkBigqueryOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean usePartitionedTables;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSinkBigqueryOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usePartitionedTables = defaults.usePartitionedTables;
        }

        public Builder setUsePartitionedTables(Boolean usePartitionedTables) {
            this.usePartitionedTables = Objects.requireNonNull(usePartitionedTables);
            return this;
        }

        public ProjectSinkBigqueryOptions build() {
            return new ProjectSinkBigqueryOptions(usePartitionedTables);
        }
    }
}