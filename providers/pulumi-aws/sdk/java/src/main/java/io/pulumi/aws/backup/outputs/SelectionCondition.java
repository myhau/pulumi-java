// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.outputs;

import io.pulumi.aws.backup.outputs.SelectionConditionStringEqual;
import io.pulumi.aws.backup.outputs.SelectionConditionStringLike;
import io.pulumi.aws.backup.outputs.SelectionConditionStringNotEqual;
import io.pulumi.aws.backup.outputs.SelectionConditionStringNotLike;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SelectionCondition {
    private final @Nullable List<SelectionConditionStringEqual> stringEquals;
    private final @Nullable List<SelectionConditionStringLike> stringLikes;
    private final @Nullable List<SelectionConditionStringNotEqual> stringNotEquals;
    private final @Nullable List<SelectionConditionStringNotLike> stringNotLikes;

    @OutputCustomType.Constructor({"stringEquals","stringLikes","stringNotEquals","stringNotLikes"})
    private SelectionCondition(
        @Nullable List<SelectionConditionStringEqual> stringEquals,
        @Nullable List<SelectionConditionStringLike> stringLikes,
        @Nullable List<SelectionConditionStringNotEqual> stringNotEquals,
        @Nullable List<SelectionConditionStringNotLike> stringNotLikes) {
        this.stringEquals = stringEquals;
        this.stringLikes = stringLikes;
        this.stringNotEquals = stringNotEquals;
        this.stringNotLikes = stringNotLikes;
    }

    public List<SelectionConditionStringEqual> getStringEquals() {
        return this.stringEquals == null ? List.of() : this.stringEquals;
    }
    public List<SelectionConditionStringLike> getStringLikes() {
        return this.stringLikes == null ? List.of() : this.stringLikes;
    }
    public List<SelectionConditionStringNotEqual> getStringNotEquals() {
        return this.stringNotEquals == null ? List.of() : this.stringNotEquals;
    }
    public List<SelectionConditionStringNotLike> getStringNotLikes() {
        return this.stringNotLikes == null ? List.of() : this.stringNotLikes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectionCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SelectionConditionStringEqual> stringEquals;
        private @Nullable List<SelectionConditionStringLike> stringLikes;
        private @Nullable List<SelectionConditionStringNotEqual> stringNotEquals;
        private @Nullable List<SelectionConditionStringNotLike> stringNotLikes;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectionCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stringEquals = defaults.stringEquals;
    	      this.stringLikes = defaults.stringLikes;
    	      this.stringNotEquals = defaults.stringNotEquals;
    	      this.stringNotLikes = defaults.stringNotLikes;
        }

        public Builder setStringEquals(@Nullable List<SelectionConditionStringEqual> stringEquals) {
            this.stringEquals = stringEquals;
            return this;
        }

        public Builder setStringLikes(@Nullable List<SelectionConditionStringLike> stringLikes) {
            this.stringLikes = stringLikes;
            return this;
        }

        public Builder setStringNotEquals(@Nullable List<SelectionConditionStringNotEqual> stringNotEquals) {
            this.stringNotEquals = stringNotEquals;
            return this;
        }

        public Builder setStringNotLikes(@Nullable List<SelectionConditionStringNotLike> stringNotLikes) {
            this.stringNotLikes = stringNotLikes;
            return this;
        }
        public SelectionCondition build() {
            return new SelectionCondition(stringEquals, stringLikes, stringNotEquals, stringNotLikes);
        }
    }
}
