// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search;

import io.pulumi.azurenative.search.inputs.SharedPrivateLinkResourcePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SharedPrivateLinkResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharedPrivateLinkResourceArgs Empty = new SharedPrivateLinkResourceArgs();

    @InputImport(name="properties")
    private final @Nullable Input<SharedPrivateLinkResourcePropertiesArgs> properties;

    public Input<SharedPrivateLinkResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="searchServiceName", required=true)
    private final Input<String> searchServiceName;

    public Input<String> getSearchServiceName() {
        return this.searchServiceName;
    }

    @InputImport(name="sharedPrivateLinkResourceName")
    private final @Nullable Input<String> sharedPrivateLinkResourceName;

    public Input<String> getSharedPrivateLinkResourceName() {
        return this.sharedPrivateLinkResourceName == null ? Input.empty() : this.sharedPrivateLinkResourceName;
    }

    public SharedPrivateLinkResourceArgs(
        @Nullable Input<SharedPrivateLinkResourcePropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> searchServiceName,
        @Nullable Input<String> sharedPrivateLinkResourceName) {
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.searchServiceName = Objects.requireNonNull(searchServiceName, "expected parameter 'searchServiceName' to be non-null");
        this.sharedPrivateLinkResourceName = sharedPrivateLinkResourceName;
    }

    private SharedPrivateLinkResourceArgs() {
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.searchServiceName = Input.empty();
        this.sharedPrivateLinkResourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPrivateLinkResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SharedPrivateLinkResourcePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> searchServiceName;
        private @Nullable Input<String> sharedPrivateLinkResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.searchServiceName = defaults.searchServiceName;
    	      this.sharedPrivateLinkResourceName = defaults.sharedPrivateLinkResourceName;
        }

        public Builder setProperties(@Nullable Input<SharedPrivateLinkResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable SharedPrivateLinkResourcePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSearchServiceName(Input<String> searchServiceName) {
            this.searchServiceName = Objects.requireNonNull(searchServiceName);
            return this;
        }

        public Builder setSearchServiceName(String searchServiceName) {
            this.searchServiceName = Input.of(Objects.requireNonNull(searchServiceName));
            return this;
        }

        public Builder setSharedPrivateLinkResourceName(@Nullable Input<String> sharedPrivateLinkResourceName) {
            this.sharedPrivateLinkResourceName = sharedPrivateLinkResourceName;
            return this;
        }

        public Builder setSharedPrivateLinkResourceName(@Nullable String sharedPrivateLinkResourceName) {
            this.sharedPrivateLinkResourceName = Input.ofNullable(sharedPrivateLinkResourceName);
            return this;
        }

        public SharedPrivateLinkResourceArgs build() {
            return new SharedPrivateLinkResourceArgs(properties, resourceGroupName, searchServiceName, sharedPrivateLinkResourceName);
        }
    }
}