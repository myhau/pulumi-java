// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionProxyConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionProxyConfigurationArgs Empty = new TaskDefinitionProxyConfigurationArgs();

    /**
     * Name of the container that will serve as the App Mesh proxy.
     * 
     */
    @InputImport(name="containerName", required=true)
      private final Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName;
    }

    /**
     * Set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public TaskDefinitionProxyConfigurationArgs(
        Input<String> containerName,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<String> type) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.properties = properties;
        this.type = type;
    }

    private TaskDefinitionProxyConfigurationArgs() {
        this.containerName = Input.empty();
        this.properties = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionProxyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> containerName;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionProxyConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setContainerName(Input<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Input.of(Objects.requireNonNull(containerName));
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public TaskDefinitionProxyConfigurationArgs build() {
            return new TaskDefinitionProxyConfigurationArgs(containerName, properties, type);
        }
    }
}
