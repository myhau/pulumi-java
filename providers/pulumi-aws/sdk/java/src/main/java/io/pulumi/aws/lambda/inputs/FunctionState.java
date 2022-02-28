// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.aws.lambda.enums.Runtime;
import io.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigGetArgs;
import io.pulumi.aws.lambda.inputs.FunctionEnvironmentGetArgs;
import io.pulumi.aws.lambda.inputs.FunctionFileSystemConfigGetArgs;
import io.pulumi.aws.lambda.inputs.FunctionImageConfigGetArgs;
import io.pulumi.aws.lambda.inputs.FunctionTracingConfigGetArgs;
import io.pulumi.aws.lambda.inputs.FunctionVpcConfigGetArgs;
import io.pulumi.core.Archive;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionState extends io.pulumi.resources.ResourceArgs {

    public static final FunctionState Empty = new FunctionState();

    /**
     * Instruction set architecture for your Lambda function. Valid values are `["x86_64"]` and `["arm64"]`. Default is `["x86_64"]`. Removing this attribute, function's architecture stay the same.
     * 
     */
    @InputImport(name="architectures")
      private final @Nullable Input<List<String>> architectures;

    public Input<List<String>> getArchitectures() {
        return this.architectures == null ? Input.empty() : this.architectures;
    }

    /**
     * Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Path to the function's deployment package within the local filesystem. Conflicts with `image_uri`, `s3_bucket`, `s3_key`, and `s3_object_version`.
     * 
     */
    @InputImport(name="code")
      private final @Nullable Input<Archive> code;

    public Input<Archive> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * To enable code signing for this function, specify the ARN of a code-signing configuration. A code-signing configuration includes a set of signing profiles, which define the trusted publishers for this function.
     * 
     */
    @InputImport(name="codeSigningConfigArn")
      private final @Nullable Input<String> codeSigningConfigArn;

    public Input<String> getCodeSigningConfigArn() {
        return this.codeSigningConfigArn == null ? Input.empty() : this.codeSigningConfigArn;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="deadLetterConfig")
      private final @Nullable Input<FunctionDeadLetterConfigGetArgs> deadLetterConfig;

    public Input<FunctionDeadLetterConfigGetArgs> getDeadLetterConfig() {
        return this.deadLetterConfig == null ? Input.empty() : this.deadLetterConfig;
    }

    /**
     * Description of what your Lambda Function does.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable Input<FunctionEnvironmentGetArgs> environment;

    public Input<FunctionEnvironmentGetArgs> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="fileSystemConfig")
      private final @Nullable Input<FunctionFileSystemConfigGetArgs> fileSystemConfig;

    public Input<FunctionFileSystemConfigGetArgs> getFileSystemConfig() {
        return this.fileSystemConfig == null ? Input.empty() : this.fileSystemConfig;
    }

    /**
     * Function [entrypoint](https://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events-create-test-function.html) in your code.
     * 
     */
    @InputImport(name="handler")
      private final @Nullable Input<String> handler;

    public Input<String> getHandler() {
        return this.handler == null ? Input.empty() : this.handler;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="imageConfig")
      private final @Nullable Input<FunctionImageConfigGetArgs> imageConfig;

    public Input<FunctionImageConfigGetArgs> getImageConfig() {
        return this.imageConfig == null ? Input.empty() : this.imageConfig;
    }

    /**
     * ECR image URI containing the function's deployment package. Conflicts with `filename`, `s3_bucket`, `s3_key`, and `s3_object_version`.
     * 
     */
    @InputImport(name="imageUri")
      private final @Nullable Input<String> imageUri;

    public Input<String> getImageUri() {
        return this.imageUri == null ? Input.empty() : this.imageUri;
    }

    /**
     * ARN to be used for invoking Lambda Function from API Gateway - to be used in `aws.apigateway.Integration`'s `uri`.
     * 
     */
    @InputImport(name="invokeArn")
      private final @Nullable Input<String> invokeArn;

    public Input<String> getInvokeArn() {
        return this.invokeArn == null ? Input.empty() : this.invokeArn;
    }

    /**
     * Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key that is used to encrypt environment variables. If this configuration is not provided when environment variables are in use, AWS Lambda uses a default service key. If this configuration is provided when environment variables are not in use, the AWS Lambda API does not save this configuration and the provider will show a perpetual difference of adding the key. To fix the perpetual difference, remove this configuration.
     * 
     */
    @InputImport(name="kmsKeyArn")
      private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    /**
     * Date this resource was last modified.
     * 
     */
    @InputImport(name="lastModified")
      private final @Nullable Input<String> lastModified;

    public Input<String> getLastModified() {
        return this.lastModified == null ? Input.empty() : this.lastModified;
    }

    /**
     * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. See [Lambda Layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
     * 
     */
    @InputImport(name="layers")
      private final @Nullable Input<List<String>> layers;

    public Input<List<String>> getLayers() {
        return this.layers == null ? Input.empty() : this.layers;
    }

    /**
     * Amount of memory in MB your Lambda Function can use at runtime. Defaults to `128`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html)
     * 
     */
    @InputImport(name="memorySize")
      private final @Nullable Input<Integer> memorySize;

    public Input<Integer> getMemorySize() {
        return this.memorySize == null ? Input.empty() : this.memorySize;
    }

    /**
     * Unique name for your Lambda Function.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Lambda deployment package type. Valid values are `Zip` and `Image`. Defaults to `Zip`.
     * 
     */
    @InputImport(name="packageType")
      private final @Nullable Input<String> packageType;

    public Input<String> getPackageType() {
        return this.packageType == null ? Input.empty() : this.packageType;
    }

    /**
     * Whether to publish creation/change as new Lambda Function Version. Defaults to `false`.
     * 
     */
    @InputImport(name="publish")
      private final @Nullable Input<Boolean> publish;

    public Input<Boolean> getPublish() {
        return this.publish == null ? Input.empty() : this.publish;
    }

    /**
     * ARN identifying your Lambda Function Version (if versioning is enabled via `publish = true`).
     * 
     */
    @InputImport(name="qualifiedArn")
      private final @Nullable Input<String> qualifiedArn;

    public Input<String> getQualifiedArn() {
        return this.qualifiedArn == null ? Input.empty() : this.qualifiedArn;
    }

    /**
     * Amount of reserved concurrent executions for this lambda function. A value of `0` disables lambda from being triggered and `-1` removes any concurrency limitations. Defaults to Unreserved Concurrency Limits `-1`. See [Managing Concurrency](https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html)
     * 
     */
    @InputImport(name="reservedConcurrentExecutions")
      private final @Nullable Input<Integer> reservedConcurrentExecutions;

    public Input<Integer> getReservedConcurrentExecutions() {
        return this.reservedConcurrentExecutions == null ? Input.empty() : this.reservedConcurrentExecutions;
    }

    /**
     * Amazon Resource Name (ARN) of the function's execution role. The role provides the function's identity and access to AWS services and resources.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * Identifier of the function's runtime. See [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_CreateFunction.html#SSS-CreateFunction-request-Runtime) for valid values.
     * 
     */
    @InputImport(name="runtime")
      private final @Nullable Input<Either<String,Runtime>> runtime;

    public Input<Either<String,Runtime>> getRuntime() {
        return this.runtime == null ? Input.empty() : this.runtime;
    }

    /**
     * S3 bucket location containing the function's deployment package. Conflicts with `filename` and `image_uri`. This bucket must reside in the same AWS region where you are creating the Lambda function.
     * 
     */
    @InputImport(name="s3Bucket")
      private final @Nullable Input<String> s3Bucket;

    public Input<String> getS3Bucket() {
        return this.s3Bucket == null ? Input.empty() : this.s3Bucket;
    }

    /**
     * S3 key of an object containing the function's deployment package. Conflicts with `filename` and `image_uri`.
     * 
     */
    @InputImport(name="s3Key")
      private final @Nullable Input<String> s3Key;

    public Input<String> getS3Key() {
        return this.s3Key == null ? Input.empty() : this.s3Key;
    }

    /**
     * Object version containing the function's deployment package. Conflicts with `filename` and `image_uri`.
     * 
     */
    @InputImport(name="s3ObjectVersion")
      private final @Nullable Input<String> s3ObjectVersion;

    public Input<String> getS3ObjectVersion() {
        return this.s3ObjectVersion == null ? Input.empty() : this.s3ObjectVersion;
    }

    /**
     * ARN of the signing job.
     * 
     */
    @InputImport(name="signingJobArn")
      private final @Nullable Input<String> signingJobArn;

    public Input<String> getSigningJobArn() {
        return this.signingJobArn == null ? Input.empty() : this.signingJobArn;
    }

    /**
     * ARN of the signing profile version.
     * 
     */
    @InputImport(name="signingProfileVersionArn")
      private final @Nullable Input<String> signingProfileVersionArn;

    public Input<String> getSigningProfileVersionArn() {
        return this.signingProfileVersionArn == null ? Input.empty() : this.signingProfileVersionArn;
    }

    /**
     * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3_key`. The usual way to set this is `filebase64sha256("file.zip")`, where "file.zip" is the local filename of the lambda function source archive.
     * 
     */
    @InputImport(name="sourceCodeHash")
      private final @Nullable Input<String> sourceCodeHash;

    public Input<String> getSourceCodeHash() {
        return this.sourceCodeHash == null ? Input.empty() : this.sourceCodeHash;
    }

    /**
     * Size in bytes of the function .zip file.
     * 
     */
    @InputImport(name="sourceCodeSize")
      private final @Nullable Input<Integer> sourceCodeSize;

    public Input<Integer> getSourceCodeSize() {
        return this.sourceCodeSize == null ? Input.empty() : this.sourceCodeSize;
    }

    /**
     * Map of tags to assign to the object.
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
     * Amount of time your Lambda Function has to run in seconds. Defaults to `3`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html).
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="tracingConfig")
      private final @Nullable Input<FunctionTracingConfigGetArgs> tracingConfig;

    public Input<FunctionTracingConfigGetArgs> getTracingConfig() {
        return this.tracingConfig == null ? Input.empty() : this.tracingConfig;
    }

    /**
     * Latest published version of your Lambda Function.
     * * `vpc_config.vpc_id` - ID of the VPC.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="vpcConfig")
      private final @Nullable Input<FunctionVpcConfigGetArgs> vpcConfig;

    public Input<FunctionVpcConfigGetArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    public FunctionState(
        @Nullable Input<List<String>> architectures,
        @Nullable Input<String> arn,
        @Nullable Input<Archive> code,
        @Nullable Input<String> codeSigningConfigArn,
        @Nullable Input<FunctionDeadLetterConfigGetArgs> deadLetterConfig,
        @Nullable Input<String> description,
        @Nullable Input<FunctionEnvironmentGetArgs> environment,
        @Nullable Input<FunctionFileSystemConfigGetArgs> fileSystemConfig,
        @Nullable Input<String> handler,
        @Nullable Input<FunctionImageConfigGetArgs> imageConfig,
        @Nullable Input<String> imageUri,
        @Nullable Input<String> invokeArn,
        @Nullable Input<String> kmsKeyArn,
        @Nullable Input<String> lastModified,
        @Nullable Input<List<String>> layers,
        @Nullable Input<Integer> memorySize,
        @Nullable Input<String> name,
        @Nullable Input<String> packageType,
        @Nullable Input<Boolean> publish,
        @Nullable Input<String> qualifiedArn,
        @Nullable Input<Integer> reservedConcurrentExecutions,
        @Nullable Input<String> role,
        @Nullable Input<Either<String,Runtime>> runtime,
        @Nullable Input<String> s3Bucket,
        @Nullable Input<String> s3Key,
        @Nullable Input<String> s3ObjectVersion,
        @Nullable Input<String> signingJobArn,
        @Nullable Input<String> signingProfileVersionArn,
        @Nullable Input<String> sourceCodeHash,
        @Nullable Input<Integer> sourceCodeSize,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Integer> timeout,
        @Nullable Input<FunctionTracingConfigGetArgs> tracingConfig,
        @Nullable Input<String> version,
        @Nullable Input<FunctionVpcConfigGetArgs> vpcConfig) {
        this.architectures = architectures;
        this.arn = arn;
        this.code = code;
        this.codeSigningConfigArn = codeSigningConfigArn;
        this.deadLetterConfig = deadLetterConfig;
        this.description = description;
        this.environment = environment;
        this.fileSystemConfig = fileSystemConfig;
        this.handler = handler;
        this.imageConfig = imageConfig;
        this.imageUri = imageUri;
        this.invokeArn = invokeArn;
        this.kmsKeyArn = kmsKeyArn;
        this.lastModified = lastModified;
        this.layers = layers;
        this.memorySize = memorySize;
        this.name = name;
        this.packageType = packageType;
        this.publish = publish;
        this.qualifiedArn = qualifiedArn;
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
        this.role = role;
        this.runtime = runtime;
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
        this.s3ObjectVersion = s3ObjectVersion;
        this.signingJobArn = signingJobArn;
        this.signingProfileVersionArn = signingProfileVersionArn;
        this.sourceCodeHash = sourceCodeHash;
        this.sourceCodeSize = sourceCodeSize;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.timeout = timeout;
        this.tracingConfig = tracingConfig;
        this.version = version;
        this.vpcConfig = vpcConfig;
    }

    private FunctionState() {
        this.architectures = Input.empty();
        this.arn = Input.empty();
        this.code = Input.empty();
        this.codeSigningConfigArn = Input.empty();
        this.deadLetterConfig = Input.empty();
        this.description = Input.empty();
        this.environment = Input.empty();
        this.fileSystemConfig = Input.empty();
        this.handler = Input.empty();
        this.imageConfig = Input.empty();
        this.imageUri = Input.empty();
        this.invokeArn = Input.empty();
        this.kmsKeyArn = Input.empty();
        this.lastModified = Input.empty();
        this.layers = Input.empty();
        this.memorySize = Input.empty();
        this.name = Input.empty();
        this.packageType = Input.empty();
        this.publish = Input.empty();
        this.qualifiedArn = Input.empty();
        this.reservedConcurrentExecutions = Input.empty();
        this.role = Input.empty();
        this.runtime = Input.empty();
        this.s3Bucket = Input.empty();
        this.s3Key = Input.empty();
        this.s3ObjectVersion = Input.empty();
        this.signingJobArn = Input.empty();
        this.signingProfileVersionArn = Input.empty();
        this.sourceCodeHash = Input.empty();
        this.sourceCodeSize = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.timeout = Input.empty();
        this.tracingConfig = Input.empty();
        this.version = Input.empty();
        this.vpcConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> architectures;
        private @Nullable Input<String> arn;
        private @Nullable Input<Archive> code;
        private @Nullable Input<String> codeSigningConfigArn;
        private @Nullable Input<FunctionDeadLetterConfigGetArgs> deadLetterConfig;
        private @Nullable Input<String> description;
        private @Nullable Input<FunctionEnvironmentGetArgs> environment;
        private @Nullable Input<FunctionFileSystemConfigGetArgs> fileSystemConfig;
        private @Nullable Input<String> handler;
        private @Nullable Input<FunctionImageConfigGetArgs> imageConfig;
        private @Nullable Input<String> imageUri;
        private @Nullable Input<String> invokeArn;
        private @Nullable Input<String> kmsKeyArn;
        private @Nullable Input<String> lastModified;
        private @Nullable Input<List<String>> layers;
        private @Nullable Input<Integer> memorySize;
        private @Nullable Input<String> name;
        private @Nullable Input<String> packageType;
        private @Nullable Input<Boolean> publish;
        private @Nullable Input<String> qualifiedArn;
        private @Nullable Input<Integer> reservedConcurrentExecutions;
        private @Nullable Input<String> role;
        private @Nullable Input<Either<String,Runtime>> runtime;
        private @Nullable Input<String> s3Bucket;
        private @Nullable Input<String> s3Key;
        private @Nullable Input<String> s3ObjectVersion;
        private @Nullable Input<String> signingJobArn;
        private @Nullable Input<String> signingProfileVersionArn;
        private @Nullable Input<String> sourceCodeHash;
        private @Nullable Input<Integer> sourceCodeSize;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<FunctionTracingConfigGetArgs> tracingConfig;
        private @Nullable Input<String> version;
        private @Nullable Input<FunctionVpcConfigGetArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architectures = defaults.architectures;
    	      this.arn = defaults.arn;
    	      this.code = defaults.code;
    	      this.codeSigningConfigArn = defaults.codeSigningConfigArn;
    	      this.deadLetterConfig = defaults.deadLetterConfig;
    	      this.description = defaults.description;
    	      this.environment = defaults.environment;
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.handler = defaults.handler;
    	      this.imageConfig = defaults.imageConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.invokeArn = defaults.invokeArn;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.lastModified = defaults.lastModified;
    	      this.layers = defaults.layers;
    	      this.memorySize = defaults.memorySize;
    	      this.name = defaults.name;
    	      this.packageType = defaults.packageType;
    	      this.publish = defaults.publish;
    	      this.qualifiedArn = defaults.qualifiedArn;
    	      this.reservedConcurrentExecutions = defaults.reservedConcurrentExecutions;
    	      this.role = defaults.role;
    	      this.runtime = defaults.runtime;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
    	      this.s3ObjectVersion = defaults.s3ObjectVersion;
    	      this.signingJobArn = defaults.signingJobArn;
    	      this.signingProfileVersionArn = defaults.signingProfileVersionArn;
    	      this.sourceCodeHash = defaults.sourceCodeHash;
    	      this.sourceCodeSize = defaults.sourceCodeSize;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.timeout = defaults.timeout;
    	      this.tracingConfig = defaults.tracingConfig;
    	      this.version = defaults.version;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setArchitectures(@Nullable Input<List<String>> architectures) {
            this.architectures = architectures;
            return this;
        }

        public Builder setArchitectures(@Nullable List<String> architectures) {
            this.architectures = Input.ofNullable(architectures);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCode(@Nullable Input<Archive> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable Archive code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setCodeSigningConfigArn(@Nullable Input<String> codeSigningConfigArn) {
            this.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }

        public Builder setCodeSigningConfigArn(@Nullable String codeSigningConfigArn) {
            this.codeSigningConfigArn = Input.ofNullable(codeSigningConfigArn);
            return this;
        }

        public Builder setDeadLetterConfig(@Nullable Input<FunctionDeadLetterConfigGetArgs> deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }

        public Builder setDeadLetterConfig(@Nullable FunctionDeadLetterConfigGetArgs deadLetterConfig) {
            this.deadLetterConfig = Input.ofNullable(deadLetterConfig);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnvironment(@Nullable Input<FunctionEnvironmentGetArgs> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setEnvironment(@Nullable FunctionEnvironmentGetArgs environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder setFileSystemConfig(@Nullable Input<FunctionFileSystemConfigGetArgs> fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }

        public Builder setFileSystemConfig(@Nullable FunctionFileSystemConfigGetArgs fileSystemConfig) {
            this.fileSystemConfig = Input.ofNullable(fileSystemConfig);
            return this;
        }

        public Builder setHandler(@Nullable Input<String> handler) {
            this.handler = handler;
            return this;
        }

        public Builder setHandler(@Nullable String handler) {
            this.handler = Input.ofNullable(handler);
            return this;
        }

        public Builder setImageConfig(@Nullable Input<FunctionImageConfigGetArgs> imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        public Builder setImageConfig(@Nullable FunctionImageConfigGetArgs imageConfig) {
            this.imageConfig = Input.ofNullable(imageConfig);
            return this;
        }

        public Builder setImageUri(@Nullable Input<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        public Builder setImageUri(@Nullable String imageUri) {
            this.imageUri = Input.ofNullable(imageUri);
            return this;
        }

        public Builder setInvokeArn(@Nullable Input<String> invokeArn) {
            this.invokeArn = invokeArn;
            return this;
        }

        public Builder setInvokeArn(@Nullable String invokeArn) {
            this.invokeArn = Input.ofNullable(invokeArn);
            return this;
        }

        public Builder setKmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder setLastModified(@Nullable Input<String> lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder setLastModified(@Nullable String lastModified) {
            this.lastModified = Input.ofNullable(lastModified);
            return this;
        }

        public Builder setLayers(@Nullable Input<List<String>> layers) {
            this.layers = layers;
            return this;
        }

        public Builder setLayers(@Nullable List<String> layers) {
            this.layers = Input.ofNullable(layers);
            return this;
        }

        public Builder setMemorySize(@Nullable Input<Integer> memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        public Builder setMemorySize(@Nullable Integer memorySize) {
            this.memorySize = Input.ofNullable(memorySize);
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

        public Builder setPackageType(@Nullable Input<String> packageType) {
            this.packageType = packageType;
            return this;
        }

        public Builder setPackageType(@Nullable String packageType) {
            this.packageType = Input.ofNullable(packageType);
            return this;
        }

        public Builder setPublish(@Nullable Input<Boolean> publish) {
            this.publish = publish;
            return this;
        }

        public Builder setPublish(@Nullable Boolean publish) {
            this.publish = Input.ofNullable(publish);
            return this;
        }

        public Builder setQualifiedArn(@Nullable Input<String> qualifiedArn) {
            this.qualifiedArn = qualifiedArn;
            return this;
        }

        public Builder setQualifiedArn(@Nullable String qualifiedArn) {
            this.qualifiedArn = Input.ofNullable(qualifiedArn);
            return this;
        }

        public Builder setReservedConcurrentExecutions(@Nullable Input<Integer> reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }

        public Builder setReservedConcurrentExecutions(@Nullable Integer reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = Input.ofNullable(reservedConcurrentExecutions);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setRuntime(@Nullable Input<Either<String,Runtime>> runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder setRuntime(@Nullable Either<String,Runtime> runtime) {
            this.runtime = Input.ofNullable(runtime);
            return this;
        }

        public Builder setS3Bucket(@Nullable Input<String> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        public Builder setS3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = Input.ofNullable(s3Bucket);
            return this;
        }

        public Builder setS3Key(@Nullable Input<String> s3Key) {
            this.s3Key = s3Key;
            return this;
        }

        public Builder setS3Key(@Nullable String s3Key) {
            this.s3Key = Input.ofNullable(s3Key);
            return this;
        }

        public Builder setS3ObjectVersion(@Nullable Input<String> s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }

        public Builder setS3ObjectVersion(@Nullable String s3ObjectVersion) {
            this.s3ObjectVersion = Input.ofNullable(s3ObjectVersion);
            return this;
        }

        public Builder setSigningJobArn(@Nullable Input<String> signingJobArn) {
            this.signingJobArn = signingJobArn;
            return this;
        }

        public Builder setSigningJobArn(@Nullable String signingJobArn) {
            this.signingJobArn = Input.ofNullable(signingJobArn);
            return this;
        }

        public Builder setSigningProfileVersionArn(@Nullable Input<String> signingProfileVersionArn) {
            this.signingProfileVersionArn = signingProfileVersionArn;
            return this;
        }

        public Builder setSigningProfileVersionArn(@Nullable String signingProfileVersionArn) {
            this.signingProfileVersionArn = Input.ofNullable(signingProfileVersionArn);
            return this;
        }

        public Builder setSourceCodeHash(@Nullable Input<String> sourceCodeHash) {
            this.sourceCodeHash = sourceCodeHash;
            return this;
        }

        public Builder setSourceCodeHash(@Nullable String sourceCodeHash) {
            this.sourceCodeHash = Input.ofNullable(sourceCodeHash);
            return this;
        }

        public Builder setSourceCodeSize(@Nullable Input<Integer> sourceCodeSize) {
            this.sourceCodeSize = sourceCodeSize;
            return this;
        }

        public Builder setSourceCodeSize(@Nullable Integer sourceCodeSize) {
            this.sourceCodeSize = Input.ofNullable(sourceCodeSize);
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

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setTracingConfig(@Nullable Input<FunctionTracingConfigGetArgs> tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }

        public Builder setTracingConfig(@Nullable FunctionTracingConfigGetArgs tracingConfig) {
            this.tracingConfig = Input.ofNullable(tracingConfig);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setVpcConfig(@Nullable Input<FunctionVpcConfigGetArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable FunctionVpcConfigGetArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }
        public FunctionState build() {
            return new FunctionState(architectures, arn, code, codeSigningConfigArn, deadLetterConfig, description, environment, fileSystemConfig, handler, imageConfig, imageUri, invokeArn, kmsKeyArn, lastModified, layers, memorySize, name, packageType, publish, qualifiedArn, reservedConcurrentExecutions, role, runtime, s3Bucket, s3Key, s3ObjectVersion, signingJobArn, signingProfileVersionArn, sourceCodeHash, sourceCodeSize, tags, tagsAll, timeout, tracingConfig, version, vpcConfig);
        }
    }
}
