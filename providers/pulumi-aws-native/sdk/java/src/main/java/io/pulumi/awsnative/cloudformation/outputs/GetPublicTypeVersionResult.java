// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPublicTypeVersionResult {
    private final @Nullable String publicTypeArn;
    private final @Nullable String publisherId;
    private final @Nullable String typeVersionArn;

    @OutputCustomType.Constructor({"publicTypeArn","publisherId","typeVersionArn"})
    private GetPublicTypeVersionResult(
        @Nullable String publicTypeArn,
        @Nullable String publisherId,
        @Nullable String typeVersionArn) {
        this.publicTypeArn = publicTypeArn;
        this.publisherId = publisherId;
        this.typeVersionArn = typeVersionArn;
    }

    public Optional<String> getPublicTypeArn() {
        return Optional.ofNullable(this.publicTypeArn);
    }
    public Optional<String> getPublisherId() {
        return Optional.ofNullable(this.publisherId);
    }
    public Optional<String> getTypeVersionArn() {
        return Optional.ofNullable(this.typeVersionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicTypeVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publicTypeArn;
        private @Nullable String publisherId;
        private @Nullable String typeVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicTypeVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicTypeArn = defaults.publicTypeArn;
    	      this.publisherId = defaults.publisherId;
    	      this.typeVersionArn = defaults.typeVersionArn;
        }

        public Builder setPublicTypeArn(@Nullable String publicTypeArn) {
            this.publicTypeArn = publicTypeArn;
            return this;
        }

        public Builder setPublisherId(@Nullable String publisherId) {
            this.publisherId = publisherId;
            return this;
        }

        public Builder setTypeVersionArn(@Nullable String typeVersionArn) {
            this.typeVersionArn = typeVersionArn;
            return this;
        }

        public GetPublicTypeVersionResult build() {
            return new GetPublicTypeVersionResult(publicTypeArn, publisherId, typeVersionArn);
        }
    }
}