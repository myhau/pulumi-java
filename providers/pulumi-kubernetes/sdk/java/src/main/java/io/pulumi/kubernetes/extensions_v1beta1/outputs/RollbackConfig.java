// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RollbackConfig {
    private final @Nullable Integer revision;

    @OutputCustomType.Constructor({"revision"})
    private RollbackConfig(@Nullable Integer revision) {
        this.revision = revision;
    }

    public Optional<Integer> getRevision() {
        return Optional.ofNullable(this.revision);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollbackConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer revision;

        public Builder() {
    	      // Empty
        }

        public Builder(RollbackConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revision = defaults.revision;
        }

        public Builder setRevision(@Nullable Integer revision) {
            this.revision = revision;
            return this;
        }

        public RollbackConfig build() {
            return new RollbackConfig(revision);
        }
    }
}