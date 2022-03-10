// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBundleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBundleArgs Empty = new GetBundleArgs();

    /**
     * The ID of the bundle.
     * 
     */
    @InputImport(name="bundleId")
      private final @Nullable String bundleId;

    public Optional<String> getBundleId() {
        return this.bundleId == null ? Optional.empty() : Optional.ofNullable(this.bundleId);
    }

    /**
     * The name of the bundle. You cannot combine this parameter with `bundle_id`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The owner of the bundles. You have to leave it blank for own bundles. You cannot combine this parameter with `bundle_id`.
     * 
     */
    @InputImport(name="owner")
      private final @Nullable String owner;

    public Optional<String> getOwner() {
        return this.owner == null ? Optional.empty() : Optional.ofNullable(this.owner);
    }

    public GetBundleArgs(
        @Nullable String bundleId,
        @Nullable String name,
        @Nullable String owner) {
        this.bundleId = bundleId;
        this.name = name;
        this.owner = owner;
    }

    private GetBundleArgs() {
        this.bundleId = null;
        this.name = null;
        this.owner = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBundleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bundleId;
        private @Nullable String name;
        private @Nullable String owner;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBundleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
        }

        public Builder setBundleId(@Nullable String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        public GetBundleArgs build() {
            return new GetBundleArgs(bundleId, name, owner);
        }
    }
}