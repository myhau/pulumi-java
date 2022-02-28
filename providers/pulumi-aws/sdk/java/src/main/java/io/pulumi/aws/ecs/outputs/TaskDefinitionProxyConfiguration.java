// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionProxyConfiguration {
    /**
     * Name of the container that will serve as the App Mesh proxy.
     * 
     */
    private final String containerName;
    /**
     * Set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"containerName","properties","type"})
    private TaskDefinitionProxyConfiguration(
        String containerName,
        @Nullable Map<String,String> properties,
        @Nullable String type) {
        this.containerName = Objects.requireNonNull(containerName);
        this.properties = properties;
        this.type = type;
    }

    /**
     * Name of the container that will serve as the App Mesh proxy.
     * 
     */
    public String getContainerName() {
        return this.containerName;
    }
    /**
     * Set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionProxyConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private @Nullable Map<String,String> properties;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionProxyConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public TaskDefinitionProxyConfiguration build() {
            return new TaskDefinitionProxyConfiguration(containerName, properties, type);
        }
    }
}
