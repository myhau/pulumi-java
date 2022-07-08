// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.logging.v2.outputs.CmekSettingsResponse;
import com.pulumi.googlenative.logging.v2.outputs.IndexConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFolderBucketResult {
    /**
     * @return The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * 
     */
    private final CmekSettingsResponse cmekSettings;
    /**
     * @return The creation timestamp of the bucket. This is not set for any of the default buckets.
     * 
     */
    private final String createTime;
    /**
     * @return Describes this bucket.
     * 
     */
    private final String description;
    /**
     * @return A list of indexed fields and related configuration data.
     * 
     */
    private final List<IndexConfigResponse> indexConfigs;
    /**
     * @return The bucket lifecycle state.
     * 
     */
    private final String lifecycleState;
    /**
     * @return Whether the bucket is locked.The retention period on a locked bucket cannot be changed. Locked buckets may only be deleted if they are empty.
     * 
     */
    private final Boolean locked;
    /**
     * @return The resource name of the bucket.For example:projects/my-project/locations/global/buckets/my-bucketFor a list of supported locations, see Supported Regions (https://cloud.google.com/logging/docs/region-support)For the location of global it is unspecified where log entries are actually stored.After a bucket has been created, the location cannot be changed.
     * 
     */
    private final String name;
    /**
     * @return Log entry field paths that are denied access in this bucket.The following fields and their children are eligible: textPayload, jsonPayload, protoPayload, httpRequest, labels, sourceLocation.Restricting a repeated field will restrict all values. Adding a parent will block all child fields. (e.g. foo.bar will block foo.bar.baz)
     * 
     */
    private final List<String> restrictedFields;
    /**
     * @return Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used.
     * 
     */
    private final Integer retentionDays;
    /**
     * @return The last update timestamp of the bucket.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetFolderBucketResult(
        @CustomType.Parameter("cmekSettings") CmekSettingsResponse cmekSettings,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("indexConfigs") List<IndexConfigResponse> indexConfigs,
        @CustomType.Parameter("lifecycleState") String lifecycleState,
        @CustomType.Parameter("locked") Boolean locked,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("restrictedFields") List<String> restrictedFields,
        @CustomType.Parameter("retentionDays") Integer retentionDays,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.cmekSettings = cmekSettings;
        this.createTime = createTime;
        this.description = description;
        this.indexConfigs = indexConfigs;
        this.lifecycleState = lifecycleState;
        this.locked = locked;
        this.name = name;
        this.restrictedFields = restrictedFields;
        this.retentionDays = retentionDays;
        this.updateTime = updateTime;
    }

    /**
     * @return The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * 
     */
    public CmekSettingsResponse cmekSettings() {
        return this.cmekSettings;
    }
    /**
     * @return The creation timestamp of the bucket. This is not set for any of the default buckets.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Describes this bucket.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A list of indexed fields and related configuration data.
     * 
     */
    public List<IndexConfigResponse> indexConfigs() {
        return this.indexConfigs;
    }
    /**
     * @return The bucket lifecycle state.
     * 
     */
    public String lifecycleState() {
        return this.lifecycleState;
    }
    /**
     * @return Whether the bucket is locked.The retention period on a locked bucket cannot be changed. Locked buckets may only be deleted if they are empty.
     * 
     */
    public Boolean locked() {
        return this.locked;
    }
    /**
     * @return The resource name of the bucket.For example:projects/my-project/locations/global/buckets/my-bucketFor a list of supported locations, see Supported Regions (https://cloud.google.com/logging/docs/region-support)For the location of global it is unspecified where log entries are actually stored.After a bucket has been created, the location cannot be changed.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Log entry field paths that are denied access in this bucket.The following fields and their children are eligible: textPayload, jsonPayload, protoPayload, httpRequest, labels, sourceLocation.Restricting a repeated field will restrict all values. Adding a parent will block all child fields. (e.g. foo.bar will block foo.bar.baz)
     * 
     */
    public List<String> restrictedFields() {
        return this.restrictedFields;
    }
    /**
     * @return Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used.
     * 
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }
    /**
     * @return The last update timestamp of the bucket.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CmekSettingsResponse cmekSettings;
        private String createTime;
        private String description;
        private List<IndexConfigResponse> indexConfigs;
        private String lifecycleState;
        private Boolean locked;
        private String name;
        private List<String> restrictedFields;
        private Integer retentionDays;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmekSettings = defaults.cmekSettings;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.indexConfigs = defaults.indexConfigs;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.locked = defaults.locked;
    	      this.name = defaults.name;
    	      this.restrictedFields = defaults.restrictedFields;
    	      this.retentionDays = defaults.retentionDays;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder cmekSettings(CmekSettingsResponse cmekSettings) {
            this.cmekSettings = Objects.requireNonNull(cmekSettings);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder indexConfigs(List<IndexConfigResponse> indexConfigs) {
            this.indexConfigs = Objects.requireNonNull(indexConfigs);
            return this;
        }
        public Builder indexConfigs(IndexConfigResponse... indexConfigs) {
            return indexConfigs(List.of(indexConfigs));
        }
        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = Objects.requireNonNull(lifecycleState);
            return this;
        }
        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder restrictedFields(List<String> restrictedFields) {
            this.restrictedFields = Objects.requireNonNull(restrictedFields);
            return this;
        }
        public Builder restrictedFields(String... restrictedFields) {
            return restrictedFields(List.of(restrictedFields));
        }
        public Builder retentionDays(Integer retentionDays) {
            this.retentionDays = Objects.requireNonNull(retentionDays);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetFolderBucketResult build() {
            return new GetFolderBucketResult(cmekSettings, createTime, description, indexConfigs, lifecycleState, locked, name, restrictedFields, retentionDays, updateTime);
        }
    }
}
