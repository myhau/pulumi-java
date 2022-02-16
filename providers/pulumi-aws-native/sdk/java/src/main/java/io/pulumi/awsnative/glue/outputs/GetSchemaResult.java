// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.outputs;

import io.pulumi.awsnative.glue.enums.SchemaCompatibility;
import io.pulumi.awsnative.glue.outputs.SchemaTag;
import io.pulumi.awsnative.glue.outputs.SchemaVersion;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSchemaResult {
    private final @Nullable String arn;
    private final @Nullable SchemaVersion checkpointVersion;
    private final @Nullable SchemaCompatibility compatibility;
    private final @Nullable String description;
    private final @Nullable String initialSchemaVersionId;
    private final @Nullable List<SchemaTag> tags;

    @OutputCustomType.Constructor({"arn","checkpointVersion","compatibility","description","initialSchemaVersionId","tags"})
    private GetSchemaResult(
        @Nullable String arn,
        @Nullable SchemaVersion checkpointVersion,
        @Nullable SchemaCompatibility compatibility,
        @Nullable String description,
        @Nullable String initialSchemaVersionId,
        @Nullable List<SchemaTag> tags) {
        this.arn = arn;
        this.checkpointVersion = checkpointVersion;
        this.compatibility = compatibility;
        this.description = description;
        this.initialSchemaVersionId = initialSchemaVersionId;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<SchemaVersion> getCheckpointVersion() {
        return Optional.ofNullable(this.checkpointVersion);
    }
    public Optional<SchemaCompatibility> getCompatibility() {
        return Optional.ofNullable(this.compatibility);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getInitialSchemaVersionId() {
        return Optional.ofNullable(this.initialSchemaVersionId);
    }
    public List<SchemaTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable SchemaVersion checkpointVersion;
        private @Nullable SchemaCompatibility compatibility;
        private @Nullable String description;
        private @Nullable String initialSchemaVersionId;
        private @Nullable List<SchemaTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchemaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.checkpointVersion = defaults.checkpointVersion;
    	      this.compatibility = defaults.compatibility;
    	      this.description = defaults.description;
    	      this.initialSchemaVersionId = defaults.initialSchemaVersionId;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCheckpointVersion(@Nullable SchemaVersion checkpointVersion) {
            this.checkpointVersion = checkpointVersion;
            return this;
        }

        public Builder setCompatibility(@Nullable SchemaCompatibility compatibility) {
            this.compatibility = compatibility;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setInitialSchemaVersionId(@Nullable String initialSchemaVersionId) {
            this.initialSchemaVersionId = initialSchemaVersionId;
            return this;
        }

        public Builder setTags(@Nullable List<SchemaTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetSchemaResult build() {
            return new GetSchemaResult(arn, checkpointVersion, compatibility, description, initialSchemaVersionId, tags);
        }
    }
}