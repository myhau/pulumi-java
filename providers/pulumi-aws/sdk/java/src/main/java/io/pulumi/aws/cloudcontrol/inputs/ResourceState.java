// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudcontrol.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceState extends io.pulumi.resources.ResourceArgs {

    public static final ResourceState Empty = new ResourceState();

    @InputImport(name="desiredState")
      private final @Nullable Input<String> desiredState;

    public Input<String> getDesiredState() {
        return this.desiredState == null ? Input.empty() : this.desiredState;
    }

    @InputImport(name="properties")
      private final @Nullable Input<String> properties;

    public Input<String> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role to assume for operations.
     * 
     */
    @InputImport(name="roleArn")
      private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * JSON string of the CloudFormation resource type schema which is used for plan time validation where possible. Automatically fetched if not provided. In large scale environments with multiple resources using the same `type_name`, it is recommended to fetch the schema once via the `aws.cloudformation.CloudFormationType` data source and use this argument to reduce `DescribeType` API operation throttling. This value is marked sensitive only to prevent large plan differences from showing.
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * CloudFormation resource type name. For example, `AWS::EC2::VPC`.
     * 
     */
    @InputImport(name="typeName")
      private final @Nullable Input<String> typeName;

    public Input<String> getTypeName() {
        return this.typeName == null ? Input.empty() : this.typeName;
    }

    /**
     * Identifier of the CloudFormation resource type version.
     * 
     */
    @InputImport(name="typeVersionId")
      private final @Nullable Input<String> typeVersionId;

    public Input<String> getTypeVersionId() {
        return this.typeVersionId == null ? Input.empty() : this.typeVersionId;
    }

    public ResourceState(
        @Nullable Input<String> desiredState,
        @Nullable Input<String> properties,
        @Nullable Input<String> roleArn,
        @Nullable Input<String> schema,
        @Nullable Input<String> typeName,
        @Nullable Input<String> typeVersionId) {
        this.desiredState = desiredState;
        this.properties = properties;
        this.roleArn = roleArn;
        this.schema = schema;
        this.typeName = typeName;
        this.typeVersionId = typeVersionId;
    }

    private ResourceState() {
        this.desiredState = Input.empty();
        this.properties = Input.empty();
        this.roleArn = Input.empty();
        this.schema = Input.empty();
        this.typeName = Input.empty();
        this.typeVersionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> desiredState;
        private @Nullable Input<String> properties;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<String> schema;
        private @Nullable Input<String> typeName;
        private @Nullable Input<String> typeVersionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.properties = defaults.properties;
    	      this.roleArn = defaults.roleArn;
    	      this.schema = defaults.schema;
    	      this.typeName = defaults.typeName;
    	      this.typeVersionId = defaults.typeVersionId;
        }

        public Builder setDesiredState(@Nullable Input<String> desiredState) {
            this.desiredState = desiredState;
            return this;
        }

        public Builder setDesiredState(@Nullable String desiredState) {
            this.desiredState = Input.ofNullable(desiredState);
            return this;
        }

        public Builder setProperties(@Nullable Input<String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable String properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder setSchema(@Nullable Input<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable String schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setTypeName(@Nullable Input<String> typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder setTypeName(@Nullable String typeName) {
            this.typeName = Input.ofNullable(typeName);
            return this;
        }

        public Builder setTypeVersionId(@Nullable Input<String> typeVersionId) {
            this.typeVersionId = typeVersionId;
            return this;
        }

        public Builder setTypeVersionId(@Nullable String typeVersionId) {
            this.typeVersionId = Input.ofNullable(typeVersionId);
            return this;
        }
        public ResourceState build() {
            return new ResourceState(desiredState, properties, roleArn, schema, typeName, typeVersionId);
        }
    }
}