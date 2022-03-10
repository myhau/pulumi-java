// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RemoteImageBuild {
    private final @Nullable Map<String,String> buildArg;
    private final @Nullable String dockerfile;
    private final @Nullable Boolean forceRemove;
    private final @Nullable Map<String,String> label;
    private final @Nullable Boolean noCache;
    private final String path;
    private final @Nullable Boolean remove;
    private final @Nullable List<String> tags;
    private final @Nullable String target;

    @OutputCustomType.Constructor({"buildArg","dockerfile","forceRemove","label","noCache","path","remove","tags","target"})
    private RemoteImageBuild(
        @Nullable Map<String,String> buildArg,
        @Nullable String dockerfile,
        @Nullable Boolean forceRemove,
        @Nullable Map<String,String> label,
        @Nullable Boolean noCache,
        String path,
        @Nullable Boolean remove,
        @Nullable List<String> tags,
        @Nullable String target) {
        this.buildArg = buildArg;
        this.dockerfile = dockerfile;
        this.forceRemove = forceRemove;
        this.label = label;
        this.noCache = noCache;
        this.path = path;
        this.remove = remove;
        this.tags = tags;
        this.target = target;
    }

    public Map<String,String> getBuildArg() {
        return this.buildArg == null ? Map.of() : this.buildArg;
    }
    public Optional<String> getDockerfile() {
        return Optional.ofNullable(this.dockerfile);
    }
    public Optional<Boolean> getForceRemove() {
        return Optional.ofNullable(this.forceRemove);
    }
    public Map<String,String> getLabel() {
        return this.label == null ? Map.of() : this.label;
    }
    public Optional<Boolean> getNoCache() {
        return Optional.ofNullable(this.noCache);
    }
    public String getPath() {
        return this.path;
    }
    public Optional<Boolean> getRemove() {
        return Optional.ofNullable(this.remove);
    }
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemoteImageBuild defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> buildArg;
        private @Nullable String dockerfile;
        private @Nullable Boolean forceRemove;
        private @Nullable Map<String,String> label;
        private @Nullable Boolean noCache;
        private String path;
        private @Nullable Boolean remove;
        private @Nullable List<String> tags;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(RemoteImageBuild defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildArg = defaults.buildArg;
    	      this.dockerfile = defaults.dockerfile;
    	      this.forceRemove = defaults.forceRemove;
    	      this.label = defaults.label;
    	      this.noCache = defaults.noCache;
    	      this.path = defaults.path;
    	      this.remove = defaults.remove;
    	      this.tags = defaults.tags;
    	      this.target = defaults.target;
        }

        public Builder setBuildArg(@Nullable Map<String,String> buildArg) {
            this.buildArg = buildArg;
            return this;
        }

        public Builder setDockerfile(@Nullable String dockerfile) {
            this.dockerfile = dockerfile;
            return this;
        }

        public Builder setForceRemove(@Nullable Boolean forceRemove) {
            this.forceRemove = forceRemove;
            return this;
        }

        public Builder setLabel(@Nullable Map<String,String> label) {
            this.label = label;
            return this;
        }

        public Builder setNoCache(@Nullable Boolean noCache) {
            this.noCache = noCache;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setRemove(@Nullable Boolean remove) {
            this.remove = remove;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }
        public RemoteImageBuild build() {
            return new RemoteImageBuild(buildArg, dockerfile, forceRemove, label, noCache, path, remove, tags, target);
        }
    }
}