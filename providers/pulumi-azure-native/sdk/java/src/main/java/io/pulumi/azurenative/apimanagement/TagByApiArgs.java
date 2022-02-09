// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagByApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagByApiArgs Empty = new TagByApiArgs();

    @InputImport(name="apiId", required=true)
    private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    @InputImport(name="tagId")
    private final @Nullable Input<String> tagId;

    public Input<String> getTagId() {
        return this.tagId == null ? Input.empty() : this.tagId;
    }

    public TagByApiArgs(
        Input<String> apiId,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<String> tagId) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.tagId = tagId;
    }

    private TagByApiArgs() {
        this.apiId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.tagId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagByApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<String> tagId;

        public Builder() {
    	      // Empty
        }

        public Builder(TagByApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.tagId = defaults.tagId;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
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

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setTagId(@Nullable Input<String> tagId) {
            this.tagId = tagId;
            return this;
        }

        public Builder setTagId(@Nullable String tagId) {
            this.tagId = Input.ofNullable(tagId);
            return this;
        }

        public TagByApiArgs build() {
            return new TagByApiArgs(apiId, resourceGroupName, serviceName, tagId);
        }
    }
}