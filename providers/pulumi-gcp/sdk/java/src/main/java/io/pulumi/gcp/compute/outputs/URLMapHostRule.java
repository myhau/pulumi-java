// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapHostRule {
    private final @Nullable String description;
    private final List<String> hosts;
    private final String pathMatcher;

    @OutputCustomType.Constructor({"description","hosts","pathMatcher"})
    private URLMapHostRule(
        @Nullable String description,
        List<String> hosts,
        String pathMatcher) {
        this.description = description;
        this.hosts = Objects.requireNonNull(hosts);
        this.pathMatcher = Objects.requireNonNull(pathMatcher);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public List<String> getHosts() {
        return this.hosts;
    }
    public String getPathMatcher() {
        return this.pathMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapHostRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private List<String> hosts;
        private String pathMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapHostRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hosts = defaults.hosts;
    	      this.pathMatcher = defaults.pathMatcher;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setHosts(List<String> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder setPathMatcher(String pathMatcher) {
            this.pathMatcher = Objects.requireNonNull(pathMatcher);
            return this;
        }

        public URLMapHostRule build() {
            return new URLMapHostRule(description, hosts, pathMatcher);
        }
    }
}