// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyToPath {
    /**
     * The key to project.
     * 
     */
    private final String key;
    /**
     * Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private final @Nullable Integer mode;
    /**
     * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
     * 
     */
    private final String path;

    @OutputCustomType.Constructor({"key","mode","path"})
    private KeyToPath(
        String key,
        @Nullable Integer mode,
        String path) {
        this.key = key;
        this.mode = mode;
        this.path = path;
    }

    /**
     * The key to project.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
    */
    public Optional<Integer> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyToPath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable Integer mode;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyToPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setMode(@Nullable Integer mode) {
            this.mode = mode;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public KeyToPath build() {
            return new KeyToPath(key, mode, path);
        }
    }
}
