// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning;

import io.pulumi.azurenative.machinelearning.inputs.WebServicePropertiesForGraphArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebServiceArgs Empty = new WebServiceArgs();

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="properties", required=true)
    private final Input<WebServicePropertiesForGraphArgs> properties;

    public Input<WebServicePropertiesForGraphArgs> getProperties() {
        return this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="webServiceName")
    private final @Nullable Input<String> webServiceName;

    public Input<String> getWebServiceName() {
        return this.webServiceName == null ? Input.empty() : this.webServiceName;
    }

    public WebServiceArgs(
        @Nullable Input<String> location,
        Input<WebServicePropertiesForGraphArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> webServiceName) {
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.webServiceName = webServiceName;
    }

    private WebServiceArgs() {
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.webServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<WebServicePropertiesForGraphArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> webServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.webServiceName = defaults.webServiceName;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(Input<WebServicePropertiesForGraphArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(WebServicePropertiesForGraphArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWebServiceName(@Nullable Input<String> webServiceName) {
            this.webServiceName = webServiceName;
            return this;
        }

        public Builder setWebServiceName(@Nullable String webServiceName) {
            this.webServiceName = Input.ofNullable(webServiceName);
            return this;
        }

        public WebServiceArgs build() {
            return new WebServiceArgs(location, properties, resourceGroupName, tags, webServiceName);
        }
    }
}