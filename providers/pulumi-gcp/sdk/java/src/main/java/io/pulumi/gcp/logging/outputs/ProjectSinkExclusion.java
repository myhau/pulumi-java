// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectSinkExclusion {
    /**
     * A description of this exclusion.
     * 
     */
    private final @Nullable String description;
    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    private final @Nullable Boolean disabled;
    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    private final String filter;
    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"description","disabled","filter","name"})
    private ProjectSinkExclusion(
        @Nullable String description,
        @Nullable Boolean disabled,
        String filter,
        String name) {
        this.description = description;
        this.disabled = disabled;
        this.filter = Objects.requireNonNull(filter);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * A description of this exclusion.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    public Optional<Boolean> getDisabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    public String getFilter() {
        return this.filter;
    }
    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSinkExclusion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean disabled;
        private String filter;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSinkExclusion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public ProjectSinkExclusion build() {
            return new ProjectSinkExclusion(description, disabled, filter, name);
        }
    }
}
