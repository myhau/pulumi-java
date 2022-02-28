// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudcontrol.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourceResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String identifier;
    /**
     * JSON string matching the CloudFormation resource type schema with current configuration.
     * 
     */
    private final String properties;
    private final @Nullable String roleArn;
    private final String typeName;
    private final @Nullable String typeVersionId;

    @OutputCustomType.Constructor({"id","identifier","properties","roleArn","typeName","typeVersionId"})
    private GetResourceResult(
        String id,
        String identifier,
        String properties,
        @Nullable String roleArn,
        String typeName,
        @Nullable String typeVersionId) {
        this.id = Objects.requireNonNull(id);
        this.identifier = Objects.requireNonNull(identifier);
        this.properties = Objects.requireNonNull(properties);
        this.roleArn = roleArn;
        this.typeName = Objects.requireNonNull(typeName);
        this.typeVersionId = typeVersionId;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getIdentifier() {
        return this.identifier;
    }
    /**
     * JSON string matching the CloudFormation resource type schema with current configuration.
     * 
     */
    public String getProperties() {
        return this.properties;
    }
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public String getTypeName() {
        return this.typeName;
    }
    public Optional<String> getTypeVersionId() {
        return Optional.ofNullable(this.typeVersionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String identifier;
        private String properties;
        private @Nullable String roleArn;
        private String typeName;
        private @Nullable String typeVersionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.properties = defaults.properties;
    	      this.roleArn = defaults.roleArn;
    	      this.typeName = defaults.typeName;
    	      this.typeVersionId = defaults.typeVersionId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }

        public Builder setProperties(String properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setTypeName(String typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }

        public Builder setTypeVersionId(@Nullable String typeVersionId) {
            this.typeVersionId = typeVersionId;
            return this;
        }
        public GetResourceResult build() {
            return new GetResourceResult(id, identifier, properties, roleArn, typeName, typeVersionId);
        }
    }
}
