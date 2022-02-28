// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PartitionStorageDescriptorColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final PartitionStorageDescriptorColumnArgs Empty = new PartitionStorageDescriptorColumnArgs();

    /**
     * Free-form text comment.
     * 
     */
    @InputImport(name="comment")
      private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * Name of the SerDe.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The datatype of data in the Column.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public PartitionStorageDescriptorColumnArgs(
        @Nullable Input<String> comment,
        Input<String> name,
        @Nullable Input<String> type) {
        this.comment = comment;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = type;
    }

    private PartitionStorageDescriptorColumnArgs() {
        this.comment = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionStorageDescriptorColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> comment;
        private Input<String> name;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionStorageDescriptorColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public PartitionStorageDescriptorColumnArgs build() {
            return new PartitionStorageDescriptorColumnArgs(comment, name, type);
        }
    }
}
