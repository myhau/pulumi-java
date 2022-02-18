// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectMetadataItemState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectMetadataItemState Empty = new ProjectMetadataItemState();

    /**
     * The metadata key to set.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The value to set for the given metadata key.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ProjectMetadataItemState(
        @Nullable Input<String> key,
        @Nullable Input<String> project,
        @Nullable Input<String> value) {
        this.key = key;
        this.project = project;
        this.value = value;
    }

    private ProjectMetadataItemState() {
        this.key = Input.empty();
        this.project = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectMetadataItemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private @Nullable Input<String> project;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectMetadataItemState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public ProjectMetadataItemState build() {
            return new ProjectMetadataItemState(key, project, value);
        }
    }
}
