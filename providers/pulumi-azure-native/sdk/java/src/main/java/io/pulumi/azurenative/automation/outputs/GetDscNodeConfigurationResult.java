// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.DscConfigurationAssociationPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDscNodeConfigurationResult {
    private final @Nullable DscConfigurationAssociationPropertyResponse configuration;
    private final @Nullable String creationTime;
    private final String id;
    private final @Nullable Boolean incrementNodeConfigurationBuild;
    private final @Nullable String lastModifiedTime;
    private final String name;
    private final @Nullable Double nodeCount;
    private final @Nullable String source;
    private final String type;

    @OutputCustomType.Constructor({"configuration","creationTime","id","incrementNodeConfigurationBuild","lastModifiedTime","name","nodeCount","source","type"})
    private GetDscNodeConfigurationResult(
        @Nullable DscConfigurationAssociationPropertyResponse configuration,
        @Nullable String creationTime,
        String id,
        @Nullable Boolean incrementNodeConfigurationBuild,
        @Nullable String lastModifiedTime,
        String name,
        @Nullable Double nodeCount,
        @Nullable String source,
        String type) {
        this.configuration = configuration;
        this.creationTime = creationTime;
        this.id = Objects.requireNonNull(id);
        this.incrementNodeConfigurationBuild = incrementNodeConfigurationBuild;
        this.lastModifiedTime = lastModifiedTime;
        this.name = Objects.requireNonNull(name);
        this.nodeCount = nodeCount;
        this.source = source;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<DscConfigurationAssociationPropertyResponse> getConfiguration() {
        return Optional.ofNullable(this.configuration);
    }
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    public String getId() {
        return this.id;
    }
    public Optional<Boolean> getIncrementNodeConfigurationBuild() {
        return Optional.ofNullable(this.incrementNodeConfigurationBuild);
    }
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    public String getName() {
        return this.name;
    }
    public Optional<Double> getNodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDscNodeConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DscConfigurationAssociationPropertyResponse configuration;
        private @Nullable String creationTime;
        private String id;
        private @Nullable Boolean incrementNodeConfigurationBuild;
        private @Nullable String lastModifiedTime;
        private String name;
        private @Nullable Double nodeCount;
        private @Nullable String source;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDscNodeConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.creationTime = defaults.creationTime;
    	      this.id = defaults.id;
    	      this.incrementNodeConfigurationBuild = defaults.incrementNodeConfigurationBuild;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder setConfiguration(@Nullable DscConfigurationAssociationPropertyResponse configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIncrementNodeConfigurationBuild(@Nullable Boolean incrementNodeConfigurationBuild) {
            this.incrementNodeConfigurationBuild = incrementNodeConfigurationBuild;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeCount(@Nullable Double nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDscNodeConfigurationResult build() {
            return new GetDscNodeConfigurationResult(configuration, creationTime, id, incrementNodeConfigurationBuild, lastModifiedTime, name, nodeCount, source, type);
        }
    }
}