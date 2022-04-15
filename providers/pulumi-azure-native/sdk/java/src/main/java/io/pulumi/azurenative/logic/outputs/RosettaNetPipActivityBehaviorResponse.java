// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RosettaNetPipActivityBehaviorResponse {
    /**
     * The value indicating whether the RosettaNet PIP is used for a single action.
     * 
     */
    private final String actionType;
    /**
     * The value indicating whether authorization is required.
     * 
     */
    private final Boolean isAuthorizationRequired;
    /**
     * The value indicating whether secured transport is required.
     * 
     */
    private final Boolean isSecuredTransportRequired;
    /**
     * The value indicating whether non-repudiation is for origin and content.
     * 
     */
    private final Boolean nonRepudiationOfOriginAndContent;
    /**
     * The persistent confidentiality encryption scope.
     * 
     */
    private final String persistentConfidentialityScope;
    /**
     * The value indicating whether the RosettaNet PIP communication is synchronous.
     * 
     */
    private final String responseType;
    /**
     * The value indicating retry count.
     * 
     */
    private final Integer retryCount;
    /**
     * The time to perform in seconds.
     * 
     */
    private final Integer timeToPerformInSeconds;

    @CustomType.Constructor
    private RosettaNetPipActivityBehaviorResponse(
        @CustomType.Parameter("actionType") String actionType,
        @CustomType.Parameter("isAuthorizationRequired") Boolean isAuthorizationRequired,
        @CustomType.Parameter("isSecuredTransportRequired") Boolean isSecuredTransportRequired,
        @CustomType.Parameter("nonRepudiationOfOriginAndContent") Boolean nonRepudiationOfOriginAndContent,
        @CustomType.Parameter("persistentConfidentialityScope") String persistentConfidentialityScope,
        @CustomType.Parameter("responseType") String responseType,
        @CustomType.Parameter("retryCount") Integer retryCount,
        @CustomType.Parameter("timeToPerformInSeconds") Integer timeToPerformInSeconds) {
        this.actionType = actionType;
        this.isAuthorizationRequired = isAuthorizationRequired;
        this.isSecuredTransportRequired = isSecuredTransportRequired;
        this.nonRepudiationOfOriginAndContent = nonRepudiationOfOriginAndContent;
        this.persistentConfidentialityScope = persistentConfidentialityScope;
        this.responseType = responseType;
        this.retryCount = retryCount;
        this.timeToPerformInSeconds = timeToPerformInSeconds;
    }

    /**
     * The value indicating whether the RosettaNet PIP is used for a single action.
     * 
    */
    public String actionType() {
        return this.actionType;
    }
    /**
     * The value indicating whether authorization is required.
     * 
    */
    public Boolean isAuthorizationRequired() {
        return this.isAuthorizationRequired;
    }
    /**
     * The value indicating whether secured transport is required.
     * 
    */
    public Boolean isSecuredTransportRequired() {
        return this.isSecuredTransportRequired;
    }
    /**
     * The value indicating whether non-repudiation is for origin and content.
     * 
    */
    public Boolean nonRepudiationOfOriginAndContent() {
        return this.nonRepudiationOfOriginAndContent;
    }
    /**
     * The persistent confidentiality encryption scope.
     * 
    */
    public String persistentConfidentialityScope() {
        return this.persistentConfidentialityScope;
    }
    /**
     * The value indicating whether the RosettaNet PIP communication is synchronous.
     * 
    */
    public String responseType() {
        return this.responseType;
    }
    /**
     * The value indicating retry count.
     * 
    */
    public Integer retryCount() {
        return this.retryCount;
    }
    /**
     * The time to perform in seconds.
     * 
    */
    public Integer timeToPerformInSeconds() {
        return this.timeToPerformInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipActivityBehaviorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private Boolean isAuthorizationRequired;
        private Boolean isSecuredTransportRequired;
        private Boolean nonRepudiationOfOriginAndContent;
        private String persistentConfidentialityScope;
        private String responseType;
        private Integer retryCount;
        private Integer timeToPerformInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipActivityBehaviorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.isAuthorizationRequired = defaults.isAuthorizationRequired;
    	      this.isSecuredTransportRequired = defaults.isSecuredTransportRequired;
    	      this.nonRepudiationOfOriginAndContent = defaults.nonRepudiationOfOriginAndContent;
    	      this.persistentConfidentialityScope = defaults.persistentConfidentialityScope;
    	      this.responseType = defaults.responseType;
    	      this.retryCount = defaults.retryCount;
    	      this.timeToPerformInSeconds = defaults.timeToPerformInSeconds;
        }

        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        public Builder isAuthorizationRequired(Boolean isAuthorizationRequired) {
            this.isAuthorizationRequired = Objects.requireNonNull(isAuthorizationRequired);
            return this;
        }
        public Builder isSecuredTransportRequired(Boolean isSecuredTransportRequired) {
            this.isSecuredTransportRequired = Objects.requireNonNull(isSecuredTransportRequired);
            return this;
        }
        public Builder nonRepudiationOfOriginAndContent(Boolean nonRepudiationOfOriginAndContent) {
            this.nonRepudiationOfOriginAndContent = Objects.requireNonNull(nonRepudiationOfOriginAndContent);
            return this;
        }
        public Builder persistentConfidentialityScope(String persistentConfidentialityScope) {
            this.persistentConfidentialityScope = Objects.requireNonNull(persistentConfidentialityScope);
            return this;
        }
        public Builder responseType(String responseType) {
            this.responseType = Objects.requireNonNull(responseType);
            return this;
        }
        public Builder retryCount(Integer retryCount) {
            this.retryCount = Objects.requireNonNull(retryCount);
            return this;
        }
        public Builder timeToPerformInSeconds(Integer timeToPerformInSeconds) {
            this.timeToPerformInSeconds = Objects.requireNonNull(timeToPerformInSeconds);
            return this;
        }        public RosettaNetPipActivityBehaviorResponse build() {
            return new RosettaNetPipActivityBehaviorResponse(actionType, isAuthorizationRequired, isSecuredTransportRequired, nonRepudiationOfOriginAndContent, persistentConfidentialityScope, responseType, retryCount, timeToPerformInSeconds);
        }
    }
}
