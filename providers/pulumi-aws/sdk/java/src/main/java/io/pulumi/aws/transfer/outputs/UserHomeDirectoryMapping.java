// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserHomeDirectoryMapping {
    /**
     * Represents an entry and a target.
     * 
     */
    private final String entry;
    /**
     * Represents the map target.
     * 
     */
    private final String target;

    @OutputCustomType.Constructor({"entry","target"})
    private UserHomeDirectoryMapping(
        String entry,
        String target) {
        this.entry = Objects.requireNonNull(entry);
        this.target = Objects.requireNonNull(target);
    }

    /**
     * Represents an entry and a target.
     * 
     */
    public String getEntry() {
        return this.entry;
    }
    /**
     * Represents the map target.
     * 
     */
    public String getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserHomeDirectoryMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entry;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(UserHomeDirectoryMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entry = defaults.entry;
    	      this.target = defaults.target;
        }

        public Builder setEntry(String entry) {
            this.entry = Objects.requireNonNull(entry);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public UserHomeDirectoryMapping build() {
            return new UserHomeDirectoryMapping(entry, target);
        }
    }
}
