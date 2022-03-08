// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TriggerBuildStepVolume {
    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    private final String name;
    /**
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the same
     * build step or with certain reserved volume paths.
     * 
     */
    private final String path;

    @OutputCustomType.Constructor({"name","path"})
    private TriggerBuildStepVolume(
        String name,
        String path) {
        this.name = name;
        this.path = path;
    }

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the same
     * build step or with certain reserved volume paths.
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildStepVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildStepVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public TriggerBuildStepVolume build() {
            return new TriggerBuildStepVolume(name, path);
        }
    }
}
