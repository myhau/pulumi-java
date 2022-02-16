// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rekognition.outputs;

import io.pulumi.awsnative.rekognition.outputs.CollectionTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCollectionResult {
    private final @Nullable String arn;
    private final @Nullable List<CollectionTag> tags;

    @OutputCustomType.Constructor({"arn","tags"})
    private GetCollectionResult(
        @Nullable String arn,
        @Nullable List<CollectionTag> tags) {
        this.arn = arn;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<CollectionTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<CollectionTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCollectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setTags(@Nullable List<CollectionTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetCollectionResult build() {
            return new GetCollectionResult(arn, tags);
        }
    }
}