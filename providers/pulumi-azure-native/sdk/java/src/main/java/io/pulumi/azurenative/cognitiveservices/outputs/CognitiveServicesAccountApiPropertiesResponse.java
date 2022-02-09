// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CognitiveServicesAccountApiPropertiesResponse {
    private final @Nullable String aadClientId;
    private final @Nullable String aadTenantId;
    private final @Nullable String eventHubConnectionString;
    private final @Nullable String qnaAzureSearchEndpointId;
    private final @Nullable String qnaAzureSearchEndpointKey;
    private final @Nullable String qnaRuntimeEndpoint;
    private final @Nullable Boolean statisticsEnabled;
    private final @Nullable String storageAccountConnectionString;
    private final @Nullable String superUser;
    private final @Nullable String websiteName;

    @OutputCustomType.Constructor({"aadClientId","aadTenantId","eventHubConnectionString","qnaAzureSearchEndpointId","qnaAzureSearchEndpointKey","qnaRuntimeEndpoint","statisticsEnabled","storageAccountConnectionString","superUser","websiteName"})
    private CognitiveServicesAccountApiPropertiesResponse(
        @Nullable String aadClientId,
        @Nullable String aadTenantId,
        @Nullable String eventHubConnectionString,
        @Nullable String qnaAzureSearchEndpointId,
        @Nullable String qnaAzureSearchEndpointKey,
        @Nullable String qnaRuntimeEndpoint,
        @Nullable Boolean statisticsEnabled,
        @Nullable String storageAccountConnectionString,
        @Nullable String superUser,
        @Nullable String websiteName) {
        this.aadClientId = aadClientId;
        this.aadTenantId = aadTenantId;
        this.eventHubConnectionString = eventHubConnectionString;
        this.qnaAzureSearchEndpointId = qnaAzureSearchEndpointId;
        this.qnaAzureSearchEndpointKey = qnaAzureSearchEndpointKey;
        this.qnaRuntimeEndpoint = qnaRuntimeEndpoint;
        this.statisticsEnabled = statisticsEnabled;
        this.storageAccountConnectionString = storageAccountConnectionString;
        this.superUser = superUser;
        this.websiteName = websiteName;
    }

    public Optional<String> getAadClientId() {
        return Optional.ofNullable(this.aadClientId);
    }
    public Optional<String> getAadTenantId() {
        return Optional.ofNullable(this.aadTenantId);
    }
    public Optional<String> getEventHubConnectionString() {
        return Optional.ofNullable(this.eventHubConnectionString);
    }
    public Optional<String> getQnaAzureSearchEndpointId() {
        return Optional.ofNullable(this.qnaAzureSearchEndpointId);
    }
    public Optional<String> getQnaAzureSearchEndpointKey() {
        return Optional.ofNullable(this.qnaAzureSearchEndpointKey);
    }
    public Optional<String> getQnaRuntimeEndpoint() {
        return Optional.ofNullable(this.qnaRuntimeEndpoint);
    }
    public Optional<Boolean> getStatisticsEnabled() {
        return Optional.ofNullable(this.statisticsEnabled);
    }
    public Optional<String> getStorageAccountConnectionString() {
        return Optional.ofNullable(this.storageAccountConnectionString);
    }
    public Optional<String> getSuperUser() {
        return Optional.ofNullable(this.superUser);
    }
    public Optional<String> getWebsiteName() {
        return Optional.ofNullable(this.websiteName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountApiPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadClientId;
        private @Nullable String aadTenantId;
        private @Nullable String eventHubConnectionString;
        private @Nullable String qnaAzureSearchEndpointId;
        private @Nullable String qnaAzureSearchEndpointKey;
        private @Nullable String qnaRuntimeEndpoint;
        private @Nullable Boolean statisticsEnabled;
        private @Nullable String storageAccountConnectionString;
        private @Nullable String superUser;
        private @Nullable String websiteName;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountApiPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.eventHubConnectionString = defaults.eventHubConnectionString;
    	      this.qnaAzureSearchEndpointId = defaults.qnaAzureSearchEndpointId;
    	      this.qnaAzureSearchEndpointKey = defaults.qnaAzureSearchEndpointKey;
    	      this.qnaRuntimeEndpoint = defaults.qnaRuntimeEndpoint;
    	      this.statisticsEnabled = defaults.statisticsEnabled;
    	      this.storageAccountConnectionString = defaults.storageAccountConnectionString;
    	      this.superUser = defaults.superUser;
    	      this.websiteName = defaults.websiteName;
        }

        public Builder setAadClientId(@Nullable String aadClientId) {
            this.aadClientId = aadClientId;
            return this;
        }

        public Builder setAadTenantId(@Nullable String aadTenantId) {
            this.aadTenantId = aadTenantId;
            return this;
        }

        public Builder setEventHubConnectionString(@Nullable String eventHubConnectionString) {
            this.eventHubConnectionString = eventHubConnectionString;
            return this;
        }

        public Builder setQnaAzureSearchEndpointId(@Nullable String qnaAzureSearchEndpointId) {
            this.qnaAzureSearchEndpointId = qnaAzureSearchEndpointId;
            return this;
        }

        public Builder setQnaAzureSearchEndpointKey(@Nullable String qnaAzureSearchEndpointKey) {
            this.qnaAzureSearchEndpointKey = qnaAzureSearchEndpointKey;
            return this;
        }

        public Builder setQnaRuntimeEndpoint(@Nullable String qnaRuntimeEndpoint) {
            this.qnaRuntimeEndpoint = qnaRuntimeEndpoint;
            return this;
        }

        public Builder setStatisticsEnabled(@Nullable Boolean statisticsEnabled) {
            this.statisticsEnabled = statisticsEnabled;
            return this;
        }

        public Builder setStorageAccountConnectionString(@Nullable String storageAccountConnectionString) {
            this.storageAccountConnectionString = storageAccountConnectionString;
            return this;
        }

        public Builder setSuperUser(@Nullable String superUser) {
            this.superUser = superUser;
            return this;
        }

        public Builder setWebsiteName(@Nullable String websiteName) {
            this.websiteName = websiteName;
            return this;
        }

        public CognitiveServicesAccountApiPropertiesResponse build() {
            return new CognitiveServicesAccountApiPropertiesResponse(aadClientId, aadTenantId, eventHubConnectionString, qnaAzureSearchEndpointId, qnaAzureSearchEndpointKey, qnaRuntimeEndpoint, statisticsEnabled, storageAccountConnectionString, superUser, websiteName);
        }
    }
}