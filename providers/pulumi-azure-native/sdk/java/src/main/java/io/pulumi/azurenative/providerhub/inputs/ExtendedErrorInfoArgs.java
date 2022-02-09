// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.TypedErrorInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExtendedErrorInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtendedErrorInfoArgs Empty = new ExtendedErrorInfoArgs();

    @InputImport(name="additionalInfo")
    private final @Nullable Input<List<TypedErrorInfoArgs>> additionalInfo;

    public Input<List<TypedErrorInfoArgs>> getAdditionalInfo() {
        return this.additionalInfo == null ? Input.empty() : this.additionalInfo;
    }

    @InputImport(name="code")
    private final @Nullable Input<String> code;

    public Input<String> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    @InputImport(name="details")
    private final @Nullable Input<List<ExtendedErrorInfoArgs>> details;

    public Input<List<ExtendedErrorInfoArgs>> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    @InputImport(name="target")
    private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    public ExtendedErrorInfoArgs(
        @Nullable Input<List<TypedErrorInfoArgs>> additionalInfo,
        @Nullable Input<String> code,
        @Nullable Input<List<ExtendedErrorInfoArgs>> details,
        @Nullable Input<String> message,
        @Nullable Input<String> target) {
        this.additionalInfo = additionalInfo;
        this.code = code;
        this.details = details;
        this.message = message;
        this.target = target;
    }

    private ExtendedErrorInfoArgs() {
        this.additionalInfo = Input.empty();
        this.code = Input.empty();
        this.details = Input.empty();
        this.message = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedErrorInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<TypedErrorInfoArgs>> additionalInfo;
        private @Nullable Input<String> code;
        private @Nullable Input<List<ExtendedErrorInfoArgs>> details;
        private @Nullable Input<String> message;
        private @Nullable Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedErrorInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setAdditionalInfo(@Nullable Input<List<TypedErrorInfoArgs>> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Builder setAdditionalInfo(@Nullable List<TypedErrorInfoArgs> additionalInfo) {
            this.additionalInfo = Input.ofNullable(additionalInfo);
            return this;
        }

        public Builder setCode(@Nullable Input<String> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setDetails(@Nullable Input<List<ExtendedErrorInfoArgs>> details) {
            this.details = details;
            return this;
        }

        public Builder setDetails(@Nullable List<ExtendedErrorInfoArgs> details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public ExtendedErrorInfoArgs build() {
            return new ExtendedErrorInfoArgs(additionalInfo, code, details, message, target);
        }
    }
}