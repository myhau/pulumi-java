// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.outputs;

import io.pulumi.aws.cloudformation.outputs.GetCloudFormationTypeLoggingConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCloudFormationTypeResult {
    private final String arn;
    /**
     * Identifier of the CloudFormation Type default version.
     * 
     */
    private final String defaultVersionId;
    /**
     * Deprecation status of the CloudFormation Type.
     * 
     */
    private final String deprecatedStatus;
    /**
     * Description of the CloudFormation Type.
     * 
     */
    private final String description;
    /**
     * URL of the documentation for the CloudFormation Type.
     * 
     */
    private final String documentationUrl;
    /**
     * Amazon Resource Name (ARN) of the IAM Role used to register the CloudFormation Type.
     * 
     */
    private final String executionRoleArn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Whether the CloudFormation Type version is the default version.
     * 
     */
    private final Boolean isDefaultVersion;
    /**
     * List of objects containing logging configuration.
     * 
     */
    private final List<GetCloudFormationTypeLoggingConfig> loggingConfigs;
    /**
     * Provisioning behavior of the CloudFormation Type.
     * 
     */
    private final String provisioningType;
    /**
     * JSON document of the CloudFormation Type schema.
     * 
     */
    private final String schema;
    /**
     * URL of the source code for the CloudFormation Type.
     * 
     */
    private final String sourceUrl;
    private final String type;
    private final String typeArn;
    private final String typeName;
    private final @Nullable String versionId;
    /**
     * Scope of the CloudFormation Type.
     * 
     */
    private final String visibility;

    @OutputCustomType.Constructor({"arn","defaultVersionId","deprecatedStatus","description","documentationUrl","executionRoleArn","id","isDefaultVersion","loggingConfigs","provisioningType","schema","sourceUrl","type","typeArn","typeName","versionId","visibility"})
    private GetCloudFormationTypeResult(
        String arn,
        String defaultVersionId,
        String deprecatedStatus,
        String description,
        String documentationUrl,
        String executionRoleArn,
        String id,
        Boolean isDefaultVersion,
        List<GetCloudFormationTypeLoggingConfig> loggingConfigs,
        String provisioningType,
        String schema,
        String sourceUrl,
        String type,
        String typeArn,
        String typeName,
        @Nullable String versionId,
        String visibility) {
        this.arn = arn;
        this.defaultVersionId = defaultVersionId;
        this.deprecatedStatus = deprecatedStatus;
        this.description = description;
        this.documentationUrl = documentationUrl;
        this.executionRoleArn = executionRoleArn;
        this.id = id;
        this.isDefaultVersion = isDefaultVersion;
        this.loggingConfigs = loggingConfigs;
        this.provisioningType = provisioningType;
        this.schema = schema;
        this.sourceUrl = sourceUrl;
        this.type = type;
        this.typeArn = typeArn;
        this.typeName = typeName;
        this.versionId = versionId;
        this.visibility = visibility;
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * Identifier of the CloudFormation Type default version.
     * 
    */
    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }
    /**
     * Deprecation status of the CloudFormation Type.
     * 
    */
    public String getDeprecatedStatus() {
        return this.deprecatedStatus;
    }
    /**
     * Description of the CloudFormation Type.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * URL of the documentation for the CloudFormation Type.
     * 
    */
    public String getDocumentationUrl() {
        return this.documentationUrl;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role used to register the CloudFormation Type.
     * 
    */
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Whether the CloudFormation Type version is the default version.
     * 
    */
    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }
    /**
     * List of objects containing logging configuration.
     * 
    */
    public List<GetCloudFormationTypeLoggingConfig> getLoggingConfigs() {
        return this.loggingConfigs;
    }
    /**
     * Provisioning behavior of the CloudFormation Type.
     * 
    */
    public String getProvisioningType() {
        return this.provisioningType;
    }
    /**
     * JSON document of the CloudFormation Type schema.
     * 
    */
    public String getSchema() {
        return this.schema;
    }
    /**
     * URL of the source code for the CloudFormation Type.
     * 
    */
    public String getSourceUrl() {
        return this.sourceUrl;
    }
    public String getType() {
        return this.type;
    }
    public String getTypeArn() {
        return this.typeArn;
    }
    public String getTypeName() {
        return this.typeName;
    }
    public Optional<String> getVersionId() {
        return Optional.ofNullable(this.versionId);
    }
    /**
     * Scope of the CloudFormation Type.
     * 
    */
    public String getVisibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudFormationTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String defaultVersionId;
        private String deprecatedStatus;
        private String description;
        private String documentationUrl;
        private String executionRoleArn;
        private String id;
        private Boolean isDefaultVersion;
        private List<GetCloudFormationTypeLoggingConfig> loggingConfigs;
        private String provisioningType;
        private String schema;
        private String sourceUrl;
        private String type;
        private String typeArn;
        private String typeName;
        private @Nullable String versionId;
        private String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudFormationTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultVersionId = defaults.defaultVersionId;
    	      this.deprecatedStatus = defaults.deprecatedStatus;
    	      this.description = defaults.description;
    	      this.documentationUrl = defaults.documentationUrl;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.id = defaults.id;
    	      this.isDefaultVersion = defaults.isDefaultVersion;
    	      this.loggingConfigs = defaults.loggingConfigs;
    	      this.provisioningType = defaults.provisioningType;
    	      this.schema = defaults.schema;
    	      this.sourceUrl = defaults.sourceUrl;
    	      this.type = defaults.type;
    	      this.typeArn = defaults.typeArn;
    	      this.typeName = defaults.typeName;
    	      this.versionId = defaults.versionId;
    	      this.visibility = defaults.visibility;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDefaultVersionId(String defaultVersionId) {
            this.defaultVersionId = Objects.requireNonNull(defaultVersionId);
            return this;
        }

        public Builder setDeprecatedStatus(String deprecatedStatus) {
            this.deprecatedStatus = Objects.requireNonNull(deprecatedStatus);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDocumentationUrl(String documentationUrl) {
            this.documentationUrl = Objects.requireNonNull(documentationUrl);
            return this;
        }

        public Builder setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = Objects.requireNonNull(isDefaultVersion);
            return this;
        }

        public Builder setLoggingConfigs(List<GetCloudFormationTypeLoggingConfig> loggingConfigs) {
            this.loggingConfigs = Objects.requireNonNull(loggingConfigs);
            return this;
        }

        public Builder setProvisioningType(String provisioningType) {
            this.provisioningType = Objects.requireNonNull(provisioningType);
            return this;
        }

        public Builder setSchema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSourceUrl(String sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeArn(String typeArn) {
            this.typeArn = Objects.requireNonNull(typeArn);
            return this;
        }

        public Builder setTypeName(String typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder setVisibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }
        public GetCloudFormationTypeResult build() {
            return new GetCloudFormationTypeResult(arn, defaultVersionId, deprecatedStatus, description, documentationUrl, executionRoleArn, id, isDefaultVersion, loggingConfigs, provisioningType, schema, sourceUrl, type, typeArn, typeName, versionId, visibility);
        }
    }
}