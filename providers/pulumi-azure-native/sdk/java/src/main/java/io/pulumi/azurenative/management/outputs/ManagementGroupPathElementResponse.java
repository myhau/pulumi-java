// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementGroupPathElementResponse {
    /**
     * The friendly name of the group.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The name of the group.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private ManagementGroupPathElementResponse(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("name") @Nullable String name) {
        this.displayName = displayName;
        this.name = name;
    }

    /**
     * The friendly name of the group.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The name of the group.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupPathElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupPathElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public ManagementGroupPathElementResponse build() {
            return new ManagementGroupPathElementResponse(displayName, name);
        }
    }
}
