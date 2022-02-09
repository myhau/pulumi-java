// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.AlertingActionResponse;
import io.pulumi.azurenative.insights.outputs.LogToMetricActionResponse;
import io.pulumi.azurenative.insights.outputs.ScheduleResponse;
import io.pulumi.azurenative.insights.outputs.SourceResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScheduledQueryRuleResult {
    private final Either<AlertingActionResponse,LogToMetricActionResponse> action;
    private final @Nullable Boolean autoMitigate;
    private final String createdWithApiVersion;
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final @Nullable String enabled;
    private final String etag;
    private final String id;
    private final Boolean isLegacyLogAnalyticsRule;
    private final String kind;
    private final String lastUpdatedTime;
    private final String location;
    private final String name;
    private final String provisioningState;
    private final @Nullable ScheduleResponse schedule;
    private final SourceResponse source;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"action","autoMitigate","createdWithApiVersion","description","displayName","enabled","etag","id","isLegacyLogAnalyticsRule","kind","lastUpdatedTime","location","name","provisioningState","schedule","source","tags","type"})
    private GetScheduledQueryRuleResult(
        Either<AlertingActionResponse,LogToMetricActionResponse> action,
        @Nullable Boolean autoMitigate,
        String createdWithApiVersion,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String enabled,
        String etag,
        String id,
        Boolean isLegacyLogAnalyticsRule,
        String kind,
        String lastUpdatedTime,
        String location,
        String name,
        String provisioningState,
        @Nullable ScheduleResponse schedule,
        SourceResponse source,
        @Nullable Map<String,String> tags,
        String type) {
        this.action = Objects.requireNonNull(action);
        this.autoMitigate = autoMitigate;
        this.createdWithApiVersion = Objects.requireNonNull(createdWithApiVersion);
        this.description = description;
        this.displayName = displayName;
        this.enabled = enabled;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.isLegacyLogAnalyticsRule = Objects.requireNonNull(isLegacyLogAnalyticsRule);
        this.kind = Objects.requireNonNull(kind);
        this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.schedule = schedule;
        this.source = Objects.requireNonNull(source);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Either<AlertingActionResponse,LogToMetricActionResponse> getAction() {
        return this.action;
    }
    public Optional<Boolean> getAutoMitigate() {
        return Optional.ofNullable(this.autoMitigate);
    }
    public String getCreatedWithApiVersion() {
        return this.createdWithApiVersion;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public Boolean getIsLegacyLogAnalyticsRule() {
        return this.isLegacyLogAnalyticsRule;
    }
    public String getKind() {
        return this.kind;
    }
    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<ScheduleResponse> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    public SourceResponse getSource() {
        return this.source;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledQueryRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Either<AlertingActionResponse,LogToMetricActionResponse> action;
        private @Nullable Boolean autoMitigate;
        private String createdWithApiVersion;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String enabled;
        private String etag;
        private String id;
        private Boolean isLegacyLogAnalyticsRule;
        private String kind;
        private String lastUpdatedTime;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable ScheduleResponse schedule;
        private SourceResponse source;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledQueryRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.autoMitigate = defaults.autoMitigate;
    	      this.createdWithApiVersion = defaults.createdWithApiVersion;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.isLegacyLogAnalyticsRule = defaults.isLegacyLogAnalyticsRule;
    	      this.kind = defaults.kind;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.schedule = defaults.schedule;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAction(Either<AlertingActionResponse,LogToMetricActionResponse> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAutoMitigate(@Nullable Boolean autoMitigate) {
            this.autoMitigate = autoMitigate;
            return this;
        }

        public Builder setCreatedWithApiVersion(String createdWithApiVersion) {
            this.createdWithApiVersion = Objects.requireNonNull(createdWithApiVersion);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEnabled(@Nullable String enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsLegacyLogAnalyticsRule(Boolean isLegacyLogAnalyticsRule) {
            this.isLegacyLogAnalyticsRule = Objects.requireNonNull(isLegacyLogAnalyticsRule);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLastUpdatedTime(String lastUpdatedTime) {
            this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSchedule(@Nullable ScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSource(SourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetScheduledQueryRuleResult build() {
            return new GetScheduledQueryRuleResult(action, autoMitigate, createdWithApiVersion, description, displayName, enabled, etag, id, isLegacyLogAnalyticsRule, kind, lastUpdatedTime, location, name, provisioningState, schedule, source, tags, type);
        }
    }
}