// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.BatchReleaseCriteriaArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The batch configuration properties definition.
 * 
 */
public final class BatchConfigurationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BatchConfigurationPropertiesArgs Empty = new BatchConfigurationPropertiesArgs();

    /**
     * The name of the batch group.
     * 
     */
    @Import(name="batchGroupName", required=true)
      private final Output<String> batchGroupName;

    public Output<String> batchGroupName() {
        return this.batchGroupName;
    }

    /**
     * The artifact changed time.
     * 
     */
    @Import(name="changedTime")
      private final @Nullable Output<String> changedTime;

    public Output<String> changedTime() {
        return this.changedTime == null ? Codegen.empty() : this.changedTime;
    }

    /**
     * The artifact creation time.
     * 
     */
    @Import(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> createdTime() {
        return this.createdTime == null ? Codegen.empty() : this.createdTime;
    }

    @Import(name="metadata")
      private final @Nullable Output<Object> metadata;

    public Output<Object> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * The batch release criteria.
     * 
     */
    @Import(name="releaseCriteria", required=true)
      private final Output<BatchReleaseCriteriaArgs> releaseCriteria;

    public Output<BatchReleaseCriteriaArgs> releaseCriteria() {
        return this.releaseCriteria;
    }

    public BatchConfigurationPropertiesArgs(
        Output<String> batchGroupName,
        @Nullable Output<String> changedTime,
        @Nullable Output<String> createdTime,
        @Nullable Output<Object> metadata,
        Output<BatchReleaseCriteriaArgs> releaseCriteria) {
        this.batchGroupName = Objects.requireNonNull(batchGroupName, "expected parameter 'batchGroupName' to be non-null");
        this.changedTime = changedTime;
        this.createdTime = createdTime;
        this.metadata = metadata;
        this.releaseCriteria = Objects.requireNonNull(releaseCriteria, "expected parameter 'releaseCriteria' to be non-null");
    }

    private BatchConfigurationPropertiesArgs() {
        this.batchGroupName = Codegen.empty();
        this.changedTime = Codegen.empty();
        this.createdTime = Codegen.empty();
        this.metadata = Codegen.empty();
        this.releaseCriteria = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> batchGroupName;
        private @Nullable Output<String> changedTime;
        private @Nullable Output<String> createdTime;
        private @Nullable Output<Object> metadata;
        private Output<BatchReleaseCriteriaArgs> releaseCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchConfigurationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchGroupName = defaults.batchGroupName;
    	      this.changedTime = defaults.changedTime;
    	      this.createdTime = defaults.createdTime;
    	      this.metadata = defaults.metadata;
    	      this.releaseCriteria = defaults.releaseCriteria;
        }

        public Builder batchGroupName(Output<String> batchGroupName) {
            this.batchGroupName = Objects.requireNonNull(batchGroupName);
            return this;
        }
        public Builder batchGroupName(String batchGroupName) {
            this.batchGroupName = Output.of(Objects.requireNonNull(batchGroupName));
            return this;
        }
        public Builder changedTime(@Nullable Output<String> changedTime) {
            this.changedTime = changedTime;
            return this;
        }
        public Builder changedTime(@Nullable String changedTime) {
            this.changedTime = Codegen.ofNullable(changedTime);
            return this;
        }
        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Codegen.ofNullable(createdTime);
            return this;
        }
        public Builder metadata(@Nullable Output<Object> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder releaseCriteria(Output<BatchReleaseCriteriaArgs> releaseCriteria) {
            this.releaseCriteria = Objects.requireNonNull(releaseCriteria);
            return this;
        }
        public Builder releaseCriteria(BatchReleaseCriteriaArgs releaseCriteria) {
            this.releaseCriteria = Output.of(Objects.requireNonNull(releaseCriteria));
            return this;
        }        public BatchConfigurationPropertiesArgs build() {
            return new BatchConfigurationPropertiesArgs(batchGroupName, changedTime, createdTime, metadata, releaseCriteria);
        }
    }
}
