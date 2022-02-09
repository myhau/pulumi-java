// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.enums.JobStepActionSource;
import io.pulumi.azurenative.sql.enums.JobStepActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobStepActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStepActionArgs Empty = new JobStepActionArgs();

    @InputImport(name="source")
    private final @Nullable Input<Either<String,JobStepActionSource>> source;

    public Input<Either<String,JobStepActionSource>> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    @InputImport(name="type")
    private final @Nullable Input<Either<String,JobStepActionType>> type;

    public Input<Either<String,JobStepActionType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public JobStepActionArgs(
        @Nullable Input<Either<String,JobStepActionSource>> source,
        @Nullable Input<Either<String,JobStepActionType>> type,
        Input<String> value) {
        this.source = source == null ? Input.ofLeft("Inline") : source;
        this.type = type == null ? Input.ofLeft("TSql") : type;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private JobStepActionArgs() {
        this.source = Input.empty();
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStepActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,JobStepActionSource>> source;
        private @Nullable Input<Either<String,JobStepActionType>> type;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStepActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setSource(@Nullable Input<Either<String,JobStepActionSource>> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable Either<String,JobStepActionSource> source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,JobStepActionType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,JobStepActionType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public JobStepActionArgs build() {
            return new JobStepActionArgs(source, type, value);
        }
    }
}