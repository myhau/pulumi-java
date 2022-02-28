// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AccessHomeDirectoryMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessHomeDirectoryMappingArgs Empty = new AccessHomeDirectoryMappingArgs();

    /**
     * Represents an entry and a target.
     * 
     */
    @InputImport(name="entry", required=true)
      private final Input<String> entry;

    public Input<String> getEntry() {
        return this.entry;
    }

    /**
     * Represents the map target.
     * 
     */
    @InputImport(name="target", required=true)
      private final Input<String> target;

    public Input<String> getTarget() {
        return this.target;
    }

    public AccessHomeDirectoryMappingArgs(
        Input<String> entry,
        Input<String> target) {
        this.entry = Objects.requireNonNull(entry, "expected parameter 'entry' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private AccessHomeDirectoryMappingArgs() {
        this.entry = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessHomeDirectoryMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> entry;
        private Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessHomeDirectoryMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entry = defaults.entry;
    	      this.target = defaults.target;
        }

        public Builder setEntry(Input<String> entry) {
            this.entry = Objects.requireNonNull(entry);
            return this;
        }

        public Builder setEntry(String entry) {
            this.entry = Input.of(Objects.requireNonNull(entry));
            return this;
        }

        public Builder setTarget(Input<String> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }
        public AccessHomeDirectoryMappingArgs build() {
            return new AccessHomeDirectoryMappingArgs(entry, target);
        }
    }
}
