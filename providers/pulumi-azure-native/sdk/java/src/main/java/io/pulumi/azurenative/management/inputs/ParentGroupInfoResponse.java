// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * (Optional) The ID of the parent management group.
 * 
 */
public final class ParentGroupInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ParentGroupInfoResponse Empty = new ParentGroupInfoResponse();

    /**
     * The friendly name of the parent management group.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the parent management group
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public ParentGroupInfoResponse(
        @Nullable String displayName,
        @Nullable String id,
        @Nullable String name) {
        this.displayName = displayName;
        this.id = id;
        this.name = name;
    }

    private ParentGroupInfoResponse() {
        this.displayName = null;
        this.id = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParentGroupInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String id;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ParentGroupInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public ParentGroupInfoResponse build() {
            return new ParentGroupInfoResponse(displayName, id, name);
        }
    }
}
