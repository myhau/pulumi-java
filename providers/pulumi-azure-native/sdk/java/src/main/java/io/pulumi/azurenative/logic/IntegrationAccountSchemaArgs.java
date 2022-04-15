// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.enums.SchemaType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationAccountSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountSchemaArgs Empty = new IntegrationAccountSchemaArgs();

    /**
     * The content.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> content() {
        return this.content == null ? Codegen.empty() : this.content;
    }

    /**
     * The content type.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * The document name.
     * 
     */
    @Import(name="documentName")
      private final @Nullable Output<String> documentName;

    public Output<String> documentName() {
        return this.documentName == null ? Codegen.empty() : this.documentName;
    }

    /**
     * The file name.
     * 
     */
    @Import(name="fileName")
      private final @Nullable Output<String> fileName;

    public Output<String> fileName() {
        return this.fileName == null ? Codegen.empty() : this.fileName;
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
      private final Output<String> integrationAccountName;

    public Output<String> integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Object> metadata;

    public Output<Object> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The integration account schema name.
     * 
     */
    @Import(name="schemaName")
      private final @Nullable Output<String> schemaName;

    public Output<String> schemaName() {
        return this.schemaName == null ? Codegen.empty() : this.schemaName;
    }

    /**
     * The schema type.
     * 
     */
    @Import(name="schemaType", required=true)
      private final Output<Either<String,SchemaType>> schemaType;

    public Output<Either<String,SchemaType>> schemaType() {
        return this.schemaType;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The target namespace of the schema.
     * 
     */
    @Import(name="targetNamespace")
      private final @Nullable Output<String> targetNamespace;

    public Output<String> targetNamespace() {
        return this.targetNamespace == null ? Codegen.empty() : this.targetNamespace;
    }

    public IntegrationAccountSchemaArgs(
        @Nullable Output<String> content,
        @Nullable Output<String> contentType,
        @Nullable Output<String> documentName,
        @Nullable Output<String> fileName,
        Output<String> integrationAccountName,
        @Nullable Output<String> location,
        @Nullable Output<Object> metadata,
        Output<String> resourceGroupName,
        @Nullable Output<String> schemaName,
        Output<Either<String,SchemaType>> schemaType,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> targetNamespace) {
        this.content = content;
        this.contentType = contentType;
        this.documentName = documentName;
        this.fileName = fileName;
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.location = location;
        this.metadata = metadata;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaName = schemaName;
        this.schemaType = Objects.requireNonNull(schemaType, "expected parameter 'schemaType' to be non-null");
        this.tags = tags;
        this.targetNamespace = targetNamespace;
    }

    private IntegrationAccountSchemaArgs() {
        this.content = Codegen.empty();
        this.contentType = Codegen.empty();
        this.documentName = Codegen.empty();
        this.fileName = Codegen.empty();
        this.integrationAccountName = Codegen.empty();
        this.location = Codegen.empty();
        this.metadata = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.schemaName = Codegen.empty();
        this.schemaType = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetNamespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> documentName;
        private @Nullable Output<String> fileName;
        private Output<String> integrationAccountName;
        private @Nullable Output<String> location;
        private @Nullable Output<Object> metadata;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> schemaName;
        private Output<Either<String,SchemaType>> schemaType;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.documentName = defaults.documentName;
    	      this.fileName = defaults.fileName;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.schemaType = defaults.schemaType;
    	      this.tags = defaults.tags;
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Codegen.ofNullable(content);
            return this;
        }
        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder documentName(@Nullable Output<String> documentName) {
            this.documentName = documentName;
            return this;
        }
        public Builder documentName(@Nullable String documentName) {
            this.documentName = Codegen.ofNullable(documentName);
            return this;
        }
        public Builder fileName(@Nullable Output<String> fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder fileName(@Nullable String fileName) {
            this.fileName = Codegen.ofNullable(fileName);
            return this;
        }
        public Builder integrationAccountName(Output<String> integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }
        public Builder integrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Output.of(Objects.requireNonNull(integrationAccountName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder metadata(@Nullable Output<Object> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder schemaName(@Nullable Output<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public Builder schemaName(@Nullable String schemaName) {
            this.schemaName = Codegen.ofNullable(schemaName);
            return this;
        }
        public Builder schemaType(Output<Either<String,SchemaType>> schemaType) {
            this.schemaType = Objects.requireNonNull(schemaType);
            return this;
        }
        public Builder schemaType(Either<String,SchemaType> schemaType) {
            this.schemaType = Output.of(Objects.requireNonNull(schemaType));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetNamespace(@Nullable Output<String> targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }
        public Builder targetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = Codegen.ofNullable(targetNamespace);
            return this;
        }        public IntegrationAccountSchemaArgs build() {
            return new IntegrationAccountSchemaArgs(content, contentType, documentName, fileName, integrationAccountName, location, metadata, resourceGroupName, schemaName, schemaType, tags, targetNamespace);
        }
    }
}
