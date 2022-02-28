// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteState extends io.pulumi.resources.ResourceArgs {

    public static final RouteState Empty = new RouteState();

    /**
     * The ARN of the route.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The creation date of the route.
     * 
     */
    @InputImport(name="createdDate")
      private final @Nullable Input<String> createdDate;

    public Input<String> getCreatedDate() {
        return this.createdDate == null ? Input.empty() : this.createdDate;
    }

    /**
     * The last update date of the route.
     * 
     */
    @InputImport(name="lastUpdatedDate")
      private final @Nullable Input<String> lastUpdatedDate;

    public Input<String> getLastUpdatedDate() {
        return this.lastUpdatedDate == null ? Input.empty() : this.lastUpdatedDate;
    }

    /**
     * The name of the service mesh in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="meshName")
      private final @Nullable Input<String> meshName;

    public Input<String> getMeshName() {
        return this.meshName == null ? Input.empty() : this.meshName;
    }

    /**
     * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @InputImport(name="meshOwner")
      private final @Nullable Input<String> meshOwner;

    public Input<String> getMeshOwner() {
        return this.meshOwner == null ? Input.empty() : this.meshOwner;
    }

    /**
     * The name to use for the route. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The resource owner's AWS account ID.
     * 
     */
    @InputImport(name="resourceOwner")
      private final @Nullable Input<String> resourceOwner;

    public Input<String> getResourceOwner() {
        return this.resourceOwner == null ? Input.empty() : this.resourceOwner;
    }

    /**
     * The route specification to apply.
     * 
     */
    @InputImport(name="spec")
      private final @Nullable Input<RouteSpecGetArgs> spec;

    public Input<RouteSpecGetArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The name of the virtual router in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="virtualRouterName")
      private final @Nullable Input<String> virtualRouterName;

    public Input<String> getVirtualRouterName() {
        return this.virtualRouterName == null ? Input.empty() : this.virtualRouterName;
    }

    public RouteState(
        @Nullable Input<String> arn,
        @Nullable Input<String> createdDate,
        @Nullable Input<String> lastUpdatedDate,
        @Nullable Input<String> meshName,
        @Nullable Input<String> meshOwner,
        @Nullable Input<String> name,
        @Nullable Input<String> resourceOwner,
        @Nullable Input<RouteSpecGetArgs> spec,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> virtualRouterName) {
        this.arn = arn;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.meshName = meshName;
        this.meshOwner = meshOwner;
        this.name = name;
        this.resourceOwner = resourceOwner;
        this.spec = spec;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.virtualRouterName = virtualRouterName;
    }

    private RouteState() {
        this.arn = Input.empty();
        this.createdDate = Input.empty();
        this.lastUpdatedDate = Input.empty();
        this.meshName = Input.empty();
        this.meshOwner = Input.empty();
        this.name = Input.empty();
        this.resourceOwner = Input.empty();
        this.spec = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.virtualRouterName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> createdDate;
        private @Nullable Input<String> lastUpdatedDate;
        private @Nullable Input<String> meshName;
        private @Nullable Input<String> meshOwner;
        private @Nullable Input<String> name;
        private @Nullable Input<String> resourceOwner;
        private @Nullable Input<RouteSpecGetArgs> spec;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> virtualRouterName;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdDate = defaults.createdDate;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.meshName = defaults.meshName;
    	      this.meshOwner = defaults.meshOwner;
    	      this.name = defaults.name;
    	      this.resourceOwner = defaults.resourceOwner;
    	      this.spec = defaults.spec;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.virtualRouterName = defaults.virtualRouterName;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCreatedDate(@Nullable Input<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setCreatedDate(@Nullable String createdDate) {
            this.createdDate = Input.ofNullable(createdDate);
            return this;
        }

        public Builder setLastUpdatedDate(@Nullable Input<String> lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        public Builder setLastUpdatedDate(@Nullable String lastUpdatedDate) {
            this.lastUpdatedDate = Input.ofNullable(lastUpdatedDate);
            return this;
        }

        public Builder setMeshName(@Nullable Input<String> meshName) {
            this.meshName = meshName;
            return this;
        }

        public Builder setMeshName(@Nullable String meshName) {
            this.meshName = Input.ofNullable(meshName);
            return this;
        }

        public Builder setMeshOwner(@Nullable Input<String> meshOwner) {
            this.meshOwner = meshOwner;
            return this;
        }

        public Builder setMeshOwner(@Nullable String meshOwner) {
            this.meshOwner = Input.ofNullable(meshOwner);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setResourceOwner(@Nullable Input<String> resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }

        public Builder setResourceOwner(@Nullable String resourceOwner) {
            this.resourceOwner = Input.ofNullable(resourceOwner);
            return this;
        }

        public Builder setSpec(@Nullable Input<RouteSpecGetArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder setSpec(@Nullable RouteSpecGetArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setVirtualRouterName(@Nullable Input<String> virtualRouterName) {
            this.virtualRouterName = virtualRouterName;
            return this;
        }

        public Builder setVirtualRouterName(@Nullable String virtualRouterName) {
            this.virtualRouterName = Input.ofNullable(virtualRouterName);
            return this;
        }
        public RouteState build() {
            return new RouteState(arn, createdDate, lastUpdatedDate, meshName, meshOwner, name, resourceOwner, spec, tags, tagsAll, virtualRouterName);
        }
    }
}
