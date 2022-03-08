// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBundleUserStorage {
    /**
     * The size of the user storage.
     * 
     */
    private final String capacity;

    @OutputCustomType.Constructor({"capacity"})
    private GetBundleUserStorage(String capacity) {
        this.capacity = capacity;
    }

    /**
     * The size of the user storage.
     * 
    */
    public String getCapacity() {
        return this.capacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBundleUserStorage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String capacity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBundleUserStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
        }

        public Builder setCapacity(String capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        public GetBundleUserStorage build() {
            return new GetBundleUserStorage(capacity);
        }
    }
}
