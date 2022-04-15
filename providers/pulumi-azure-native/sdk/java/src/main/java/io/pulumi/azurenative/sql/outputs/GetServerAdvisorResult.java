// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.RecommendedActionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServerAdvisorResult {
    /**
     * Gets the status of availability of this advisor to customers. Possible values are 'GA', 'PublicPreview', 'LimitedPublicPreview' and 'PrivatePreview'.
     * 
     */
    private final String advisorStatus;
    /**
     * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'
     * 
     */
    private final String autoExecuteStatus;
    /**
     * Gets the resource from which current value of auto-execute status is inherited. Auto-execute status can be set on (and inherited from) different levels in the resource hierarchy. Possible values are 'Subscription', 'Server', 'ElasticPool', 'Database' and 'Default' (when status is not explicitly set on any level).
     * 
     */
    private final String autoExecuteStatusInheritedFrom;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource kind.
     * 
     */
    private final String kind;
    /**
     * Gets the time when the current resource was analyzed for recommendations by this advisor.
     * 
     */
    private final String lastChecked;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Gets that status of recommendations for this advisor and reason for not having any recommendations. Possible values include, but are not limited to, 'Ok' (Recommendations available),LowActivity (not enough workload to analyze), 'DbSeemsTuned' (Database is doing well), etc.
     * 
     */
    private final String recommendationsStatus;
    /**
     * Gets the recommended actions for this advisor.
     * 
     */
    private final List<RecommendedActionResponse> recommendedActions;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServerAdvisorResult(
        @CustomType.Parameter("advisorStatus") String advisorStatus,
        @CustomType.Parameter("autoExecuteStatus") String autoExecuteStatus,
        @CustomType.Parameter("autoExecuteStatusInheritedFrom") String autoExecuteStatusInheritedFrom,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("lastChecked") String lastChecked,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("recommendationsStatus") String recommendationsStatus,
        @CustomType.Parameter("recommendedActions") List<RecommendedActionResponse> recommendedActions,
        @CustomType.Parameter("type") String type) {
        this.advisorStatus = advisorStatus;
        this.autoExecuteStatus = autoExecuteStatus;
        this.autoExecuteStatusInheritedFrom = autoExecuteStatusInheritedFrom;
        this.id = id;
        this.kind = kind;
        this.lastChecked = lastChecked;
        this.location = location;
        this.name = name;
        this.recommendationsStatus = recommendationsStatus;
        this.recommendedActions = recommendedActions;
        this.type = type;
    }

    /**
     * Gets the status of availability of this advisor to customers. Possible values are 'GA', 'PublicPreview', 'LimitedPublicPreview' and 'PrivatePreview'.
     * 
    */
    public String advisorStatus() {
        return this.advisorStatus;
    }
    /**
     * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'
     * 
    */
    public String autoExecuteStatus() {
        return this.autoExecuteStatus;
    }
    /**
     * Gets the resource from which current value of auto-execute status is inherited. Auto-execute status can be set on (and inherited from) different levels in the resource hierarchy. Possible values are 'Subscription', 'Server', 'ElasticPool', 'Database' and 'Default' (when status is not explicitly set on any level).
     * 
    */
    public String autoExecuteStatusInheritedFrom() {
        return this.autoExecuteStatusInheritedFrom;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource kind.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Gets the time when the current resource was analyzed for recommendations by this advisor.
     * 
    */
    public String lastChecked() {
        return this.lastChecked;
    }
    /**
     * Resource location.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Gets that status of recommendations for this advisor and reason for not having any recommendations. Possible values include, but are not limited to, 'Ok' (Recommendations available),LowActivity (not enough workload to analyze), 'DbSeemsTuned' (Database is doing well), etc.
     * 
    */
    public String recommendationsStatus() {
        return this.recommendationsStatus;
    }
    /**
     * Gets the recommended actions for this advisor.
     * 
    */
    public List<RecommendedActionResponse> recommendedActions() {
        return this.recommendedActions;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerAdvisorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advisorStatus;
        private String autoExecuteStatus;
        private String autoExecuteStatusInheritedFrom;
        private String id;
        private String kind;
        private String lastChecked;
        private String location;
        private String name;
        private String recommendationsStatus;
        private List<RecommendedActionResponse> recommendedActions;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerAdvisorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advisorStatus = defaults.advisorStatus;
    	      this.autoExecuteStatus = defaults.autoExecuteStatus;
    	      this.autoExecuteStatusInheritedFrom = defaults.autoExecuteStatusInheritedFrom;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastChecked = defaults.lastChecked;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.recommendationsStatus = defaults.recommendationsStatus;
    	      this.recommendedActions = defaults.recommendedActions;
    	      this.type = defaults.type;
        }

        public Builder advisorStatus(String advisorStatus) {
            this.advisorStatus = Objects.requireNonNull(advisorStatus);
            return this;
        }
        public Builder autoExecuteStatus(String autoExecuteStatus) {
            this.autoExecuteStatus = Objects.requireNonNull(autoExecuteStatus);
            return this;
        }
        public Builder autoExecuteStatusInheritedFrom(String autoExecuteStatusInheritedFrom) {
            this.autoExecuteStatusInheritedFrom = Objects.requireNonNull(autoExecuteStatusInheritedFrom);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder lastChecked(String lastChecked) {
            this.lastChecked = Objects.requireNonNull(lastChecked);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder recommendationsStatus(String recommendationsStatus) {
            this.recommendationsStatus = Objects.requireNonNull(recommendationsStatus);
            return this;
        }
        public Builder recommendedActions(List<RecommendedActionResponse> recommendedActions) {
            this.recommendedActions = Objects.requireNonNull(recommendedActions);
            return this;
        }
        public Builder recommendedActions(RecommendedActionResponse... recommendedActions) {
            return recommendedActions(List.of(recommendedActions));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServerAdvisorResult build() {
            return new GetServerAdvisorResult(advisorStatus, autoExecuteStatus, autoExecuteStatusInheritedFrom, id, kind, lastChecked, location, name, recommendationsStatus, recommendedActions, type);
        }
    }
}
