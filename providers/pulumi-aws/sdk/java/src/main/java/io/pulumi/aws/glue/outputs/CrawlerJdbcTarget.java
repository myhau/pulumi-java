// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CrawlerJdbcTarget {
    /**
     * The name of the connection to use to connect to the Delta table target.
     * 
     */
    private final String connectionName;
    /**
     * A list of glob patterns used to exclude from the crawl.
     * 
     */
    private final @Nullable List<String> exclusions;
    /**
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * 
     */
    private final String path;

    @OutputCustomType.Constructor({"connectionName","exclusions","path"})
    private CrawlerJdbcTarget(
        String connectionName,
        @Nullable List<String> exclusions,
        String path) {
        this.connectionName = Objects.requireNonNull(connectionName);
        this.exclusions = exclusions;
        this.path = Objects.requireNonNull(path);
    }

    /**
     * The name of the connection to use to connect to the Delta table target.
     * 
     */
    public String getConnectionName() {
        return this.connectionName;
    }
    /**
     * A list of glob patterns used to exclude from the crawl.
     * 
     */
    public List<String> getExclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }
    /**
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * 
     */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerJdbcTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionName;
        private @Nullable List<String> exclusions;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerJdbcTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.exclusions = defaults.exclusions;
    	      this.path = defaults.path;
        }

        public Builder setConnectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }

        public Builder setExclusions(@Nullable List<String> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public CrawlerJdbcTarget build() {
            return new CrawlerJdbcTarget(connectionName, exclusions, path);
        }
    }
}
