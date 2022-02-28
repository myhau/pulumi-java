// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inputs.ProviderAssumeRoleArgs;
import io.pulumi.aws.inputs.ProviderDefaultTagsArgs;
import io.pulumi.aws.inputs.ProviderEndpointArgs;
import io.pulumi.aws.inputs.ProviderIgnoreTagsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * 
     */
    @InputImport(name="accessKey")
      private final @Nullable Input<String> accessKey;

    public Input<String> getAccessKey() {
        return this.accessKey == null ? Input.empty() : this.accessKey;
    }

    @InputImport(name="allowedAccountIds", json=true)
      private final @Nullable Input<List<String>> allowedAccountIds;

    public Input<List<String>> getAllowedAccountIds() {
        return this.allowedAccountIds == null ? Input.empty() : this.allowedAccountIds;
    }

    @InputImport(name="assumeRole", json=true)
      private final @Nullable Input<ProviderAssumeRoleArgs> assumeRole;

    public Input<ProviderAssumeRoleArgs> getAssumeRole() {
        return this.assumeRole == null ? Input.empty() : this.assumeRole;
    }

    /**
     * Configuration block with settings to default resource tags across all resources.
     * 
     */
    @InputImport(name="defaultTags", json=true)
      private final @Nullable Input<ProviderDefaultTagsArgs> defaultTags;

    public Input<ProviderDefaultTagsArgs> getDefaultTags() {
        return this.defaultTags == null ? Input.empty() : this.defaultTags;
    }

    @InputImport(name="endpoints", json=true)
      private final @Nullable Input<List<ProviderEndpointArgs>> endpoints;

    public Input<List<ProviderEndpointArgs>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    @InputImport(name="forbiddenAccountIds", json=true)
      private final @Nullable Input<List<String>> forbiddenAccountIds;

    public Input<List<String>> getForbiddenAccountIds() {
        return this.forbiddenAccountIds == null ? Input.empty() : this.forbiddenAccountIds;
    }

    /**
     * The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
     * `HTTPS_PROXY` environment variables.
     * 
     */
    @InputImport(name="httpProxy")
      private final @Nullable Input<String> httpProxy;

    public Input<String> getHttpProxy() {
        return this.httpProxy == null ? Input.empty() : this.httpProxy;
    }

    /**
     * Configuration block with settings to ignore resource tags across all resources.
     * 
     */
    @InputImport(name="ignoreTags", json=true)
      private final @Nullable Input<ProviderIgnoreTagsArgs> ignoreTags;

    public Input<ProviderIgnoreTagsArgs> getIgnoreTags() {
        return this.ignoreTags == null ? Input.empty() : this.ignoreTags;
    }

    /**
     * Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`
     * 
     */
    @InputImport(name="insecure", json=true)
      private final @Nullable Input<Boolean> insecure;

    public Input<Boolean> getInsecure() {
        return this.insecure == null ? Input.empty() : this.insecure;
    }

    /**
     * The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
     * 
     */
    @InputImport(name="maxRetries", json=true)
      private final @Nullable Input<Integer> maxRetries;

    public Input<Integer> getMaxRetries() {
        return this.maxRetries == null ? Input.empty() : this.maxRetries;
    }

    /**
     * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
     * 
     */
    @InputImport(name="profile")
      private final @Nullable Input<String> profile;

    public Input<String> getProfile() {
        return this.profile == null ? Input.empty() : this.profile;
    }

    /**
     * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
     * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
     * Specific to the Amazon S3 service.
     * 
     */
    @InputImport(name="s3ForcePathStyle", json=true)
      private final @Nullable Input<Boolean> s3ForcePathStyle;

    public Input<Boolean> getS3ForcePathStyle() {
        return this.s3ForcePathStyle == null ? Input.empty() : this.s3ForcePathStyle;
    }

    /**
     * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * 
     */
    @InputImport(name="secretKey")
      private final @Nullable Input<String> secretKey;

    public Input<String> getSecretKey() {
        return this.secretKey == null ? Input.empty() : this.secretKey;
    }

    /**
     * The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
     * 
     */
    @InputImport(name="sharedCredentialsFile")
      private final @Nullable Input<String> sharedCredentialsFile;

    public Input<String> getSharedCredentialsFile() {
        return this.sharedCredentialsFile == null ? Input.empty() : this.sharedCredentialsFile;
    }

    /**
     * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
     * available/implemented.
     * 
     */
    @InputImport(name="skipCredentialsValidation", json=true)
      private final @Nullable Input<Boolean> skipCredentialsValidation;

    public Input<Boolean> getSkipCredentialsValidation() {
        return this.skipCredentialsValidation == null ? Input.empty() : this.skipCredentialsValidation;
    }

    /**
     * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
     * 
     */
    @InputImport(name="skipGetEc2Platforms", json=true)
      private final @Nullable Input<Boolean> skipGetEc2Platforms;

    public Input<Boolean> getSkipGetEc2Platforms() {
        return this.skipGetEc2Platforms == null ? Input.empty() : this.skipGetEc2Platforms;
    }

    @InputImport(name="skipMetadataApiCheck", json=true)
      private final @Nullable Input<Boolean> skipMetadataApiCheck;

    public Input<Boolean> getSkipMetadataApiCheck() {
        return this.skipMetadataApiCheck == null ? Input.empty() : this.skipMetadataApiCheck;
    }

    /**
     * Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
     * not public (yet).
     * 
     */
    @InputImport(name="skipRegionValidation", json=true)
      private final @Nullable Input<Boolean> skipRegionValidation;

    public Input<Boolean> getSkipRegionValidation() {
        return this.skipRegionValidation == null ? Input.empty() : this.skipRegionValidation;
    }

    /**
     * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
     * 
     */
    @InputImport(name="skipRequestingAccountId", json=true)
      private final @Nullable Input<Boolean> skipRequestingAccountId;

    public Input<Boolean> getSkipRequestingAccountId() {
        return this.skipRequestingAccountId == null ? Input.empty() : this.skipRequestingAccountId;
    }

    /**
     * session token. A session token is only required if you are using temporary security credentials.
     * 
     */
    @InputImport(name="token")
      private final @Nullable Input<String> token;

    public Input<String> getToken() {
        return this.token == null ? Input.empty() : this.token;
    }

    public ProviderArgs(
        @Nullable Input<String> accessKey,
        @Nullable Input<List<String>> allowedAccountIds,
        @Nullable Input<ProviderAssumeRoleArgs> assumeRole,
        @Nullable Input<ProviderDefaultTagsArgs> defaultTags,
        @Nullable Input<List<ProviderEndpointArgs>> endpoints,
        @Nullable Input<List<String>> forbiddenAccountIds,
        @Nullable Input<String> httpProxy,
        @Nullable Input<ProviderIgnoreTagsArgs> ignoreTags,
        @Nullable Input<Boolean> insecure,
        @Nullable Input<Integer> maxRetries,
        @Nullable Input<String> profile,
        @Nullable Input<String> region,
        @Nullable Input<Boolean> s3ForcePathStyle,
        @Nullable Input<String> secretKey,
        @Nullable Input<String> sharedCredentialsFile,
        @Nullable Input<Boolean> skipCredentialsValidation,
        @Nullable Input<Boolean> skipGetEc2Platforms,
        @Nullable Input<Boolean> skipMetadataApiCheck,
        @Nullable Input<Boolean> skipRegionValidation,
        @Nullable Input<Boolean> skipRequestingAccountId,
        @Nullable Input<String> token) {
        this.accessKey = accessKey;
        this.allowedAccountIds = allowedAccountIds;
        this.assumeRole = assumeRole;
        this.defaultTags = defaultTags;
        this.endpoints = endpoints;
        this.forbiddenAccountIds = forbiddenAccountIds;
        this.httpProxy = httpProxy;
        this.ignoreTags = ignoreTags;
        this.insecure = insecure;
        this.maxRetries = maxRetries;
        this.profile = profile == null ? Input.ofNullable(Utilities.getEnv("AWS_PROFILE").orElse(null)) : profile;
        this.region = region == null ? Input.ofNullable(Utilities.getEnv("AWS_REGION", "AWS_DEFAULT_REGION").orElse(null)) : region;
        this.s3ForcePathStyle = s3ForcePathStyle;
        this.secretKey = secretKey;
        this.sharedCredentialsFile = sharedCredentialsFile;
        this.skipCredentialsValidation = skipCredentialsValidation == null ? Input.ofNullable(true) : skipCredentialsValidation;
        this.skipGetEc2Platforms = skipGetEc2Platforms == null ? Input.ofNullable(true) : skipGetEc2Platforms;
        this.skipMetadataApiCheck = skipMetadataApiCheck == null ? Input.ofNullable(true) : skipMetadataApiCheck;
        this.skipRegionValidation = skipRegionValidation == null ? Input.ofNullable(true) : skipRegionValidation;
        this.skipRequestingAccountId = skipRequestingAccountId;
        this.token = token;
    }

    private ProviderArgs() {
        this.accessKey = Input.empty();
        this.allowedAccountIds = Input.empty();
        this.assumeRole = Input.empty();
        this.defaultTags = Input.empty();
        this.endpoints = Input.empty();
        this.forbiddenAccountIds = Input.empty();
        this.httpProxy = Input.empty();
        this.ignoreTags = Input.empty();
        this.insecure = Input.empty();
        this.maxRetries = Input.empty();
        this.profile = Input.empty();
        this.region = Input.empty();
        this.s3ForcePathStyle = Input.empty();
        this.secretKey = Input.empty();
        this.sharedCredentialsFile = Input.empty();
        this.skipCredentialsValidation = Input.empty();
        this.skipGetEc2Platforms = Input.empty();
        this.skipMetadataApiCheck = Input.empty();
        this.skipRegionValidation = Input.empty();
        this.skipRequestingAccountId = Input.empty();
        this.token = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessKey;
        private @Nullable Input<List<String>> allowedAccountIds;
        private @Nullable Input<ProviderAssumeRoleArgs> assumeRole;
        private @Nullable Input<ProviderDefaultTagsArgs> defaultTags;
        private @Nullable Input<List<ProviderEndpointArgs>> endpoints;
        private @Nullable Input<List<String>> forbiddenAccountIds;
        private @Nullable Input<String> httpProxy;
        private @Nullable Input<ProviderIgnoreTagsArgs> ignoreTags;
        private @Nullable Input<Boolean> insecure;
        private @Nullable Input<Integer> maxRetries;
        private @Nullable Input<String> profile;
        private @Nullable Input<String> region;
        private @Nullable Input<Boolean> s3ForcePathStyle;
        private @Nullable Input<String> secretKey;
        private @Nullable Input<String> sharedCredentialsFile;
        private @Nullable Input<Boolean> skipCredentialsValidation;
        private @Nullable Input<Boolean> skipGetEc2Platforms;
        private @Nullable Input<Boolean> skipMetadataApiCheck;
        private @Nullable Input<Boolean> skipRegionValidation;
        private @Nullable Input<Boolean> skipRequestingAccountId;
        private @Nullable Input<String> token;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.allowedAccountIds = defaults.allowedAccountIds;
    	      this.assumeRole = defaults.assumeRole;
    	      this.defaultTags = defaults.defaultTags;
    	      this.endpoints = defaults.endpoints;
    	      this.forbiddenAccountIds = defaults.forbiddenAccountIds;
    	      this.httpProxy = defaults.httpProxy;
    	      this.ignoreTags = defaults.ignoreTags;
    	      this.insecure = defaults.insecure;
    	      this.maxRetries = defaults.maxRetries;
    	      this.profile = defaults.profile;
    	      this.region = defaults.region;
    	      this.s3ForcePathStyle = defaults.s3ForcePathStyle;
    	      this.secretKey = defaults.secretKey;
    	      this.sharedCredentialsFile = defaults.sharedCredentialsFile;
    	      this.skipCredentialsValidation = defaults.skipCredentialsValidation;
    	      this.skipGetEc2Platforms = defaults.skipGetEc2Platforms;
    	      this.skipMetadataApiCheck = defaults.skipMetadataApiCheck;
    	      this.skipRegionValidation = defaults.skipRegionValidation;
    	      this.skipRequestingAccountId = defaults.skipRequestingAccountId;
    	      this.token = defaults.token;
        }

        public Builder setAccessKey(@Nullable Input<String> accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder setAccessKey(@Nullable String accessKey) {
            this.accessKey = Input.ofNullable(accessKey);
            return this;
        }

        public Builder setAllowedAccountIds(@Nullable Input<List<String>> allowedAccountIds) {
            this.allowedAccountIds = allowedAccountIds;
            return this;
        }

        public Builder setAllowedAccountIds(@Nullable List<String> allowedAccountIds) {
            this.allowedAccountIds = Input.ofNullable(allowedAccountIds);
            return this;
        }

        public Builder setAssumeRole(@Nullable Input<ProviderAssumeRoleArgs> assumeRole) {
            this.assumeRole = assumeRole;
            return this;
        }

        public Builder setAssumeRole(@Nullable ProviderAssumeRoleArgs assumeRole) {
            this.assumeRole = Input.ofNullable(assumeRole);
            return this;
        }

        public Builder setDefaultTags(@Nullable Input<ProviderDefaultTagsArgs> defaultTags) {
            this.defaultTags = defaultTags;
            return this;
        }

        public Builder setDefaultTags(@Nullable ProviderDefaultTagsArgs defaultTags) {
            this.defaultTags = Input.ofNullable(defaultTags);
            return this;
        }

        public Builder setEndpoints(@Nullable Input<List<ProviderEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEndpoints(@Nullable List<ProviderEndpointArgs> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder setForbiddenAccountIds(@Nullable Input<List<String>> forbiddenAccountIds) {
            this.forbiddenAccountIds = forbiddenAccountIds;
            return this;
        }

        public Builder setForbiddenAccountIds(@Nullable List<String> forbiddenAccountIds) {
            this.forbiddenAccountIds = Input.ofNullable(forbiddenAccountIds);
            return this;
        }

        public Builder setHttpProxy(@Nullable Input<String> httpProxy) {
            this.httpProxy = httpProxy;
            return this;
        }

        public Builder setHttpProxy(@Nullable String httpProxy) {
            this.httpProxy = Input.ofNullable(httpProxy);
            return this;
        }

        public Builder setIgnoreTags(@Nullable Input<ProviderIgnoreTagsArgs> ignoreTags) {
            this.ignoreTags = ignoreTags;
            return this;
        }

        public Builder setIgnoreTags(@Nullable ProviderIgnoreTagsArgs ignoreTags) {
            this.ignoreTags = Input.ofNullable(ignoreTags);
            return this;
        }

        public Builder setInsecure(@Nullable Input<Boolean> insecure) {
            this.insecure = insecure;
            return this;
        }

        public Builder setInsecure(@Nullable Boolean insecure) {
            this.insecure = Input.ofNullable(insecure);
            return this;
        }

        public Builder setMaxRetries(@Nullable Input<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder setMaxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Input.ofNullable(maxRetries);
            return this;
        }

        public Builder setProfile(@Nullable Input<String> profile) {
            this.profile = profile;
            return this;
        }

        public Builder setProfile(@Nullable String profile) {
            this.profile = Input.ofNullable(profile);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setS3ForcePathStyle(@Nullable Input<Boolean> s3ForcePathStyle) {
            this.s3ForcePathStyle = s3ForcePathStyle;
            return this;
        }

        public Builder setS3ForcePathStyle(@Nullable Boolean s3ForcePathStyle) {
            this.s3ForcePathStyle = Input.ofNullable(s3ForcePathStyle);
            return this;
        }

        public Builder setSecretKey(@Nullable Input<String> secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public Builder setSecretKey(@Nullable String secretKey) {
            this.secretKey = Input.ofNullable(secretKey);
            return this;
        }

        public Builder setSharedCredentialsFile(@Nullable Input<String> sharedCredentialsFile) {
            this.sharedCredentialsFile = sharedCredentialsFile;
            return this;
        }

        public Builder setSharedCredentialsFile(@Nullable String sharedCredentialsFile) {
            this.sharedCredentialsFile = Input.ofNullable(sharedCredentialsFile);
            return this;
        }

        public Builder setSkipCredentialsValidation(@Nullable Input<Boolean> skipCredentialsValidation) {
            this.skipCredentialsValidation = skipCredentialsValidation;
            return this;
        }

        public Builder setSkipCredentialsValidation(@Nullable Boolean skipCredentialsValidation) {
            this.skipCredentialsValidation = Input.ofNullable(skipCredentialsValidation);
            return this;
        }

        public Builder setSkipGetEc2Platforms(@Nullable Input<Boolean> skipGetEc2Platforms) {
            this.skipGetEc2Platforms = skipGetEc2Platforms;
            return this;
        }

        public Builder setSkipGetEc2Platforms(@Nullable Boolean skipGetEc2Platforms) {
            this.skipGetEc2Platforms = Input.ofNullable(skipGetEc2Platforms);
            return this;
        }

        public Builder setSkipMetadataApiCheck(@Nullable Input<Boolean> skipMetadataApiCheck) {
            this.skipMetadataApiCheck = skipMetadataApiCheck;
            return this;
        }

        public Builder setSkipMetadataApiCheck(@Nullable Boolean skipMetadataApiCheck) {
            this.skipMetadataApiCheck = Input.ofNullable(skipMetadataApiCheck);
            return this;
        }

        public Builder setSkipRegionValidation(@Nullable Input<Boolean> skipRegionValidation) {
            this.skipRegionValidation = skipRegionValidation;
            return this;
        }

        public Builder setSkipRegionValidation(@Nullable Boolean skipRegionValidation) {
            this.skipRegionValidation = Input.ofNullable(skipRegionValidation);
            return this;
        }

        public Builder setSkipRequestingAccountId(@Nullable Input<Boolean> skipRequestingAccountId) {
            this.skipRequestingAccountId = skipRequestingAccountId;
            return this;
        }

        public Builder setSkipRequestingAccountId(@Nullable Boolean skipRequestingAccountId) {
            this.skipRequestingAccountId = Input.ofNullable(skipRequestingAccountId);
            return this;
        }

        public Builder setToken(@Nullable Input<String> token) {
            this.token = token;
            return this;
        }

        public Builder setToken(@Nullable String token) {
            this.token = Input.ofNullable(token);
            return this;
        }
        public ProviderArgs build() {
            return new ProviderArgs(accessKey, allowedAccountIds, assumeRole, defaultTags, endpoints, forbiddenAccountIds, httpProxy, ignoreTags, insecure, maxRetries, profile, region, s3ForcePathStyle, secretKey, sharedCredentialsFile, skipCredentialsValidation, skipGetEc2Platforms, skipMetadataApiCheck, skipRegionValidation, skipRequestingAccountId, token);
        }
    }
}
