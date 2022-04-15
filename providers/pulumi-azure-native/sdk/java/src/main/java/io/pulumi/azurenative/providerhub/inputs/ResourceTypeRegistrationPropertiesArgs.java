// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.ProvisioningState;
import io.pulumi.azurenative.providerhub.enums.Regionality;
import io.pulumi.azurenative.providerhub.enums.ResourceDeletionPolicy;
import io.pulumi.azurenative.providerhub.enums.RoutingType;
import io.pulumi.azurenative.providerhub.inputs.AuthorizationActionMappingArgs;
import io.pulumi.azurenative.providerhub.inputs.ExtendedLocationOptionsArgs;
import io.pulumi.azurenative.providerhub.inputs.LinkedAccessCheckArgs;
import io.pulumi.azurenative.providerhub.inputs.LoggingRuleArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeEndpointArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesExtensionOptionsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesFeaturesRuleArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesIdentityManagementArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesResourceMovePolicyArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs;
import io.pulumi.azurenative.providerhub.inputs.ServiceTreeInfoArgs;
import io.pulumi.azurenative.providerhub.inputs.SubscriptionStateRuleArgs;
import io.pulumi.azurenative.providerhub.inputs.SwaggerSpecificationArgs;
import io.pulumi.azurenative.providerhub.inputs.ThrottlingRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesArgs Empty = new ResourceTypeRegistrationPropertiesArgs();

    @Import(name="allowedUnauthorizedActions")
      private final @Nullable Output<List<String>> allowedUnauthorizedActions;

    public Output<List<String>> allowedUnauthorizedActions() {
        return this.allowedUnauthorizedActions == null ? Codegen.empty() : this.allowedUnauthorizedActions;
    }

    @Import(name="authorizationActionMappings")
      private final @Nullable Output<List<AuthorizationActionMappingArgs>> authorizationActionMappings;

    public Output<List<AuthorizationActionMappingArgs>> authorizationActionMappings() {
        return this.authorizationActionMappings == null ? Codegen.empty() : this.authorizationActionMappings;
    }

    @Import(name="checkNameAvailabilitySpecifications")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications;

    public Output<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications() {
        return this.checkNameAvailabilitySpecifications == null ? Codegen.empty() : this.checkNameAvailabilitySpecifications;
    }

    @Import(name="defaultApiVersion")
      private final @Nullable Output<String> defaultApiVersion;

    public Output<String> defaultApiVersion() {
        return this.defaultApiVersion == null ? Codegen.empty() : this.defaultApiVersion;
    }

    @Import(name="disallowedActionVerbs")
      private final @Nullable Output<List<String>> disallowedActionVerbs;

    public Output<List<String>> disallowedActionVerbs() {
        return this.disallowedActionVerbs == null ? Codegen.empty() : this.disallowedActionVerbs;
    }

    @Import(name="enableAsyncOperation")
      private final @Nullable Output<Boolean> enableAsyncOperation;

    public Output<Boolean> enableAsyncOperation() {
        return this.enableAsyncOperation == null ? Codegen.empty() : this.enableAsyncOperation;
    }

    @Import(name="enableThirdPartyS2S")
      private final @Nullable Output<Boolean> enableThirdPartyS2S;

    public Output<Boolean> enableThirdPartyS2S() {
        return this.enableThirdPartyS2S == null ? Codegen.empty() : this.enableThirdPartyS2S;
    }

    @Import(name="endpoints")
      private final @Nullable Output<List<ResourceTypeEndpointArgs>> endpoints;

    public Output<List<ResourceTypeEndpointArgs>> endpoints() {
        return this.endpoints == null ? Codegen.empty() : this.endpoints;
    }

    @Import(name="extendedLocations")
      private final @Nullable Output<List<ExtendedLocationOptionsArgs>> extendedLocations;

    public Output<List<ExtendedLocationOptionsArgs>> extendedLocations() {
        return this.extendedLocations == null ? Codegen.empty() : this.extendedLocations;
    }

    @Import(name="extensionOptions")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions;

    public Output<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions() {
        return this.extensionOptions == null ? Codegen.empty() : this.extensionOptions;
    }

    @Import(name="featuresRule")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule;

    public Output<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule() {
        return this.featuresRule == null ? Codegen.empty() : this.featuresRule;
    }

    @Import(name="identityManagement")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement;

    public Output<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement() {
        return this.identityManagement == null ? Codegen.empty() : this.identityManagement;
    }

    @Import(name="isPureProxy")
      private final @Nullable Output<Boolean> isPureProxy;

    public Output<Boolean> isPureProxy() {
        return this.isPureProxy == null ? Codegen.empty() : this.isPureProxy;
    }

    @Import(name="linkedAccessChecks")
      private final @Nullable Output<List<LinkedAccessCheckArgs>> linkedAccessChecks;

    public Output<List<LinkedAccessCheckArgs>> linkedAccessChecks() {
        return this.linkedAccessChecks == null ? Codegen.empty() : this.linkedAccessChecks;
    }

    @Import(name="loggingRules")
      private final @Nullable Output<List<LoggingRuleArgs>> loggingRules;

    public Output<List<LoggingRuleArgs>> loggingRules() {
        return this.loggingRules == null ? Codegen.empty() : this.loggingRules;
    }

    @Import(name="marketplaceType")
      private final @Nullable Output<String> marketplaceType;

    public Output<String> marketplaceType() {
        return this.marketplaceType == null ? Codegen.empty() : this.marketplaceType;
    }

    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,ProvisioningState>> provisioningState;

    public Output<Either<String,ProvisioningState>> provisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
    }

    @Import(name="regionality")
      private final @Nullable Output<Either<String,Regionality>> regionality;

    public Output<Either<String,Regionality>> regionality() {
        return this.regionality == null ? Codegen.empty() : this.regionality;
    }

    @Import(name="requestHeaderOptions")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions;

    public Output<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions() {
        return this.requestHeaderOptions == null ? Codegen.empty() : this.requestHeaderOptions;
    }

    @Import(name="requiredFeatures")
      private final @Nullable Output<List<String>> requiredFeatures;

    public Output<List<String>> requiredFeatures() {
        return this.requiredFeatures == null ? Codegen.empty() : this.requiredFeatures;
    }

    @Import(name="resourceDeletionPolicy")
      private final @Nullable Output<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy;

    public Output<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy() {
        return this.resourceDeletionPolicy == null ? Codegen.empty() : this.resourceDeletionPolicy;
    }

    @Import(name="resourceMovePolicy")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy;

    public Output<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy() {
        return this.resourceMovePolicy == null ? Codegen.empty() : this.resourceMovePolicy;
    }

    @Import(name="routingType")
      private final @Nullable Output<Either<String,RoutingType>> routingType;

    public Output<Either<String,RoutingType>> routingType() {
        return this.routingType == null ? Codegen.empty() : this.routingType;
    }

    @Import(name="serviceTreeInfos")
      private final @Nullable Output<List<ServiceTreeInfoArgs>> serviceTreeInfos;

    public Output<List<ServiceTreeInfoArgs>> serviceTreeInfos() {
        return this.serviceTreeInfos == null ? Codegen.empty() : this.serviceTreeInfos;
    }

    @Import(name="subscriptionLifecycleNotificationSpecifications")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications;

    public Output<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications() {
        return this.subscriptionLifecycleNotificationSpecifications == null ? Codegen.empty() : this.subscriptionLifecycleNotificationSpecifications;
    }

    @Import(name="subscriptionStateRules")
      private final @Nullable Output<List<SubscriptionStateRuleArgs>> subscriptionStateRules;

    public Output<List<SubscriptionStateRuleArgs>> subscriptionStateRules() {
        return this.subscriptionStateRules == null ? Codegen.empty() : this.subscriptionStateRules;
    }

    @Import(name="swaggerSpecifications")
      private final @Nullable Output<List<SwaggerSpecificationArgs>> swaggerSpecifications;

    public Output<List<SwaggerSpecificationArgs>> swaggerSpecifications() {
        return this.swaggerSpecifications == null ? Codegen.empty() : this.swaggerSpecifications;
    }

    @Import(name="templateDeploymentOptions")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions;

    public Output<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions() {
        return this.templateDeploymentOptions == null ? Codegen.empty() : this.templateDeploymentOptions;
    }

    @Import(name="throttlingRules")
      private final @Nullable Output<List<ThrottlingRuleArgs>> throttlingRules;

    public Output<List<ThrottlingRuleArgs>> throttlingRules() {
        return this.throttlingRules == null ? Codegen.empty() : this.throttlingRules;
    }

    public ResourceTypeRegistrationPropertiesArgs(
        @Nullable Output<List<String>> allowedUnauthorizedActions,
        @Nullable Output<List<AuthorizationActionMappingArgs>> authorizationActionMappings,
        @Nullable Output<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications,
        @Nullable Output<String> defaultApiVersion,
        @Nullable Output<List<String>> disallowedActionVerbs,
        @Nullable Output<Boolean> enableAsyncOperation,
        @Nullable Output<Boolean> enableThirdPartyS2S,
        @Nullable Output<List<ResourceTypeEndpointArgs>> endpoints,
        @Nullable Output<List<ExtendedLocationOptionsArgs>> extendedLocations,
        @Nullable Output<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions,
        @Nullable Output<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule,
        @Nullable Output<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement,
        @Nullable Output<Boolean> isPureProxy,
        @Nullable Output<List<LinkedAccessCheckArgs>> linkedAccessChecks,
        @Nullable Output<List<LoggingRuleArgs>> loggingRules,
        @Nullable Output<String> marketplaceType,
        @Nullable Output<Either<String,ProvisioningState>> provisioningState,
        @Nullable Output<Either<String,Regionality>> regionality,
        @Nullable Output<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions,
        @Nullable Output<List<String>> requiredFeatures,
        @Nullable Output<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy,
        @Nullable Output<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy,
        @Nullable Output<Either<String,RoutingType>> routingType,
        @Nullable Output<List<ServiceTreeInfoArgs>> serviceTreeInfos,
        @Nullable Output<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications,
        @Nullable Output<List<SubscriptionStateRuleArgs>> subscriptionStateRules,
        @Nullable Output<List<SwaggerSpecificationArgs>> swaggerSpecifications,
        @Nullable Output<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions,
        @Nullable Output<List<ThrottlingRuleArgs>> throttlingRules) {
        this.allowedUnauthorizedActions = allowedUnauthorizedActions;
        this.authorizationActionMappings = authorizationActionMappings;
        this.checkNameAvailabilitySpecifications = checkNameAvailabilitySpecifications;
        this.defaultApiVersion = defaultApiVersion;
        this.disallowedActionVerbs = disallowedActionVerbs;
        this.enableAsyncOperation = enableAsyncOperation;
        this.enableThirdPartyS2S = enableThirdPartyS2S;
        this.endpoints = endpoints;
        this.extendedLocations = extendedLocations;
        this.extensionOptions = extensionOptions;
        this.featuresRule = featuresRule;
        this.identityManagement = identityManagement;
        this.isPureProxy = isPureProxy;
        this.linkedAccessChecks = linkedAccessChecks;
        this.loggingRules = loggingRules;
        this.marketplaceType = marketplaceType;
        this.provisioningState = provisioningState;
        this.regionality = regionality;
        this.requestHeaderOptions = requestHeaderOptions;
        this.requiredFeatures = requiredFeatures;
        this.resourceDeletionPolicy = resourceDeletionPolicy;
        this.resourceMovePolicy = resourceMovePolicy;
        this.routingType = routingType;
        this.serviceTreeInfos = serviceTreeInfos;
        this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
        this.subscriptionStateRules = subscriptionStateRules;
        this.swaggerSpecifications = swaggerSpecifications;
        this.templateDeploymentOptions = templateDeploymentOptions;
        this.throttlingRules = throttlingRules;
    }

    private ResourceTypeRegistrationPropertiesArgs() {
        this.allowedUnauthorizedActions = Codegen.empty();
        this.authorizationActionMappings = Codegen.empty();
        this.checkNameAvailabilitySpecifications = Codegen.empty();
        this.defaultApiVersion = Codegen.empty();
        this.disallowedActionVerbs = Codegen.empty();
        this.enableAsyncOperation = Codegen.empty();
        this.enableThirdPartyS2S = Codegen.empty();
        this.endpoints = Codegen.empty();
        this.extendedLocations = Codegen.empty();
        this.extensionOptions = Codegen.empty();
        this.featuresRule = Codegen.empty();
        this.identityManagement = Codegen.empty();
        this.isPureProxy = Codegen.empty();
        this.linkedAccessChecks = Codegen.empty();
        this.loggingRules = Codegen.empty();
        this.marketplaceType = Codegen.empty();
        this.provisioningState = Codegen.empty();
        this.regionality = Codegen.empty();
        this.requestHeaderOptions = Codegen.empty();
        this.requiredFeatures = Codegen.empty();
        this.resourceDeletionPolicy = Codegen.empty();
        this.resourceMovePolicy = Codegen.empty();
        this.routingType = Codegen.empty();
        this.serviceTreeInfos = Codegen.empty();
        this.subscriptionLifecycleNotificationSpecifications = Codegen.empty();
        this.subscriptionStateRules = Codegen.empty();
        this.swaggerSpecifications = Codegen.empty();
        this.templateDeploymentOptions = Codegen.empty();
        this.throttlingRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedUnauthorizedActions;
        private @Nullable Output<List<AuthorizationActionMappingArgs>> authorizationActionMappings;
        private @Nullable Output<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications;
        private @Nullable Output<String> defaultApiVersion;
        private @Nullable Output<List<String>> disallowedActionVerbs;
        private @Nullable Output<Boolean> enableAsyncOperation;
        private @Nullable Output<Boolean> enableThirdPartyS2S;
        private @Nullable Output<List<ResourceTypeEndpointArgs>> endpoints;
        private @Nullable Output<List<ExtendedLocationOptionsArgs>> extendedLocations;
        private @Nullable Output<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions;
        private @Nullable Output<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule;
        private @Nullable Output<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement;
        private @Nullable Output<Boolean> isPureProxy;
        private @Nullable Output<List<LinkedAccessCheckArgs>> linkedAccessChecks;
        private @Nullable Output<List<LoggingRuleArgs>> loggingRules;
        private @Nullable Output<String> marketplaceType;
        private @Nullable Output<Either<String,ProvisioningState>> provisioningState;
        private @Nullable Output<Either<String,Regionality>> regionality;
        private @Nullable Output<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions;
        private @Nullable Output<List<String>> requiredFeatures;
        private @Nullable Output<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy;
        private @Nullable Output<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy;
        private @Nullable Output<Either<String,RoutingType>> routingType;
        private @Nullable Output<List<ServiceTreeInfoArgs>> serviceTreeInfos;
        private @Nullable Output<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications;
        private @Nullable Output<List<SubscriptionStateRuleArgs>> subscriptionStateRules;
        private @Nullable Output<List<SwaggerSpecificationArgs>> swaggerSpecifications;
        private @Nullable Output<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions;
        private @Nullable Output<List<ThrottlingRuleArgs>> throttlingRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedUnauthorizedActions = defaults.allowedUnauthorizedActions;
    	      this.authorizationActionMappings = defaults.authorizationActionMappings;
    	      this.checkNameAvailabilitySpecifications = defaults.checkNameAvailabilitySpecifications;
    	      this.defaultApiVersion = defaults.defaultApiVersion;
    	      this.disallowedActionVerbs = defaults.disallowedActionVerbs;
    	      this.enableAsyncOperation = defaults.enableAsyncOperation;
    	      this.enableThirdPartyS2S = defaults.enableThirdPartyS2S;
    	      this.endpoints = defaults.endpoints;
    	      this.extendedLocations = defaults.extendedLocations;
    	      this.extensionOptions = defaults.extensionOptions;
    	      this.featuresRule = defaults.featuresRule;
    	      this.identityManagement = defaults.identityManagement;
    	      this.isPureProxy = defaults.isPureProxy;
    	      this.linkedAccessChecks = defaults.linkedAccessChecks;
    	      this.loggingRules = defaults.loggingRules;
    	      this.marketplaceType = defaults.marketplaceType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.regionality = defaults.regionality;
    	      this.requestHeaderOptions = defaults.requestHeaderOptions;
    	      this.requiredFeatures = defaults.requiredFeatures;
    	      this.resourceDeletionPolicy = defaults.resourceDeletionPolicy;
    	      this.resourceMovePolicy = defaults.resourceMovePolicy;
    	      this.routingType = defaults.routingType;
    	      this.serviceTreeInfos = defaults.serviceTreeInfos;
    	      this.subscriptionLifecycleNotificationSpecifications = defaults.subscriptionLifecycleNotificationSpecifications;
    	      this.subscriptionStateRules = defaults.subscriptionStateRules;
    	      this.swaggerSpecifications = defaults.swaggerSpecifications;
    	      this.templateDeploymentOptions = defaults.templateDeploymentOptions;
    	      this.throttlingRules = defaults.throttlingRules;
        }

        public Builder allowedUnauthorizedActions(@Nullable Output<List<String>> allowedUnauthorizedActions) {
            this.allowedUnauthorizedActions = allowedUnauthorizedActions;
            return this;
        }
        public Builder allowedUnauthorizedActions(@Nullable List<String> allowedUnauthorizedActions) {
            this.allowedUnauthorizedActions = Codegen.ofNullable(allowedUnauthorizedActions);
            return this;
        }
        public Builder allowedUnauthorizedActions(String... allowedUnauthorizedActions) {
            return allowedUnauthorizedActions(List.of(allowedUnauthorizedActions));
        }
        public Builder authorizationActionMappings(@Nullable Output<List<AuthorizationActionMappingArgs>> authorizationActionMappings) {
            this.authorizationActionMappings = authorizationActionMappings;
            return this;
        }
        public Builder authorizationActionMappings(@Nullable List<AuthorizationActionMappingArgs> authorizationActionMappings) {
            this.authorizationActionMappings = Codegen.ofNullable(authorizationActionMappings);
            return this;
        }
        public Builder authorizationActionMappings(AuthorizationActionMappingArgs... authorizationActionMappings) {
            return authorizationActionMappings(List.of(authorizationActionMappings));
        }
        public Builder checkNameAvailabilitySpecifications(@Nullable Output<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications) {
            this.checkNameAvailabilitySpecifications = checkNameAvailabilitySpecifications;
            return this;
        }
        public Builder checkNameAvailabilitySpecifications(@Nullable ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs checkNameAvailabilitySpecifications) {
            this.checkNameAvailabilitySpecifications = Codegen.ofNullable(checkNameAvailabilitySpecifications);
            return this;
        }
        public Builder defaultApiVersion(@Nullable Output<String> defaultApiVersion) {
            this.defaultApiVersion = defaultApiVersion;
            return this;
        }
        public Builder defaultApiVersion(@Nullable String defaultApiVersion) {
            this.defaultApiVersion = Codegen.ofNullable(defaultApiVersion);
            return this;
        }
        public Builder disallowedActionVerbs(@Nullable Output<List<String>> disallowedActionVerbs) {
            this.disallowedActionVerbs = disallowedActionVerbs;
            return this;
        }
        public Builder disallowedActionVerbs(@Nullable List<String> disallowedActionVerbs) {
            this.disallowedActionVerbs = Codegen.ofNullable(disallowedActionVerbs);
            return this;
        }
        public Builder disallowedActionVerbs(String... disallowedActionVerbs) {
            return disallowedActionVerbs(List.of(disallowedActionVerbs));
        }
        public Builder enableAsyncOperation(@Nullable Output<Boolean> enableAsyncOperation) {
            this.enableAsyncOperation = enableAsyncOperation;
            return this;
        }
        public Builder enableAsyncOperation(@Nullable Boolean enableAsyncOperation) {
            this.enableAsyncOperation = Codegen.ofNullable(enableAsyncOperation);
            return this;
        }
        public Builder enableThirdPartyS2S(@Nullable Output<Boolean> enableThirdPartyS2S) {
            this.enableThirdPartyS2S = enableThirdPartyS2S;
            return this;
        }
        public Builder enableThirdPartyS2S(@Nullable Boolean enableThirdPartyS2S) {
            this.enableThirdPartyS2S = Codegen.ofNullable(enableThirdPartyS2S);
            return this;
        }
        public Builder endpoints(@Nullable Output<List<ResourceTypeEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(@Nullable List<ResourceTypeEndpointArgs> endpoints) {
            this.endpoints = Codegen.ofNullable(endpoints);
            return this;
        }
        public Builder endpoints(ResourceTypeEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder extendedLocations(@Nullable Output<List<ExtendedLocationOptionsArgs>> extendedLocations) {
            this.extendedLocations = extendedLocations;
            return this;
        }
        public Builder extendedLocations(@Nullable List<ExtendedLocationOptionsArgs> extendedLocations) {
            this.extendedLocations = Codegen.ofNullable(extendedLocations);
            return this;
        }
        public Builder extendedLocations(ExtendedLocationOptionsArgs... extendedLocations) {
            return extendedLocations(List.of(extendedLocations));
        }
        public Builder extensionOptions(@Nullable Output<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions) {
            this.extensionOptions = extensionOptions;
            return this;
        }
        public Builder extensionOptions(@Nullable ResourceTypeRegistrationPropertiesExtensionOptionsArgs extensionOptions) {
            this.extensionOptions = Codegen.ofNullable(extensionOptions);
            return this;
        }
        public Builder featuresRule(@Nullable Output<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule) {
            this.featuresRule = featuresRule;
            return this;
        }
        public Builder featuresRule(@Nullable ResourceTypeRegistrationPropertiesFeaturesRuleArgs featuresRule) {
            this.featuresRule = Codegen.ofNullable(featuresRule);
            return this;
        }
        public Builder identityManagement(@Nullable Output<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement) {
            this.identityManagement = identityManagement;
            return this;
        }
        public Builder identityManagement(@Nullable ResourceTypeRegistrationPropertiesIdentityManagementArgs identityManagement) {
            this.identityManagement = Codegen.ofNullable(identityManagement);
            return this;
        }
        public Builder isPureProxy(@Nullable Output<Boolean> isPureProxy) {
            this.isPureProxy = isPureProxy;
            return this;
        }
        public Builder isPureProxy(@Nullable Boolean isPureProxy) {
            this.isPureProxy = Codegen.ofNullable(isPureProxy);
            return this;
        }
        public Builder linkedAccessChecks(@Nullable Output<List<LinkedAccessCheckArgs>> linkedAccessChecks) {
            this.linkedAccessChecks = linkedAccessChecks;
            return this;
        }
        public Builder linkedAccessChecks(@Nullable List<LinkedAccessCheckArgs> linkedAccessChecks) {
            this.linkedAccessChecks = Codegen.ofNullable(linkedAccessChecks);
            return this;
        }
        public Builder linkedAccessChecks(LinkedAccessCheckArgs... linkedAccessChecks) {
            return linkedAccessChecks(List.of(linkedAccessChecks));
        }
        public Builder loggingRules(@Nullable Output<List<LoggingRuleArgs>> loggingRules) {
            this.loggingRules = loggingRules;
            return this;
        }
        public Builder loggingRules(@Nullable List<LoggingRuleArgs> loggingRules) {
            this.loggingRules = Codegen.ofNullable(loggingRules);
            return this;
        }
        public Builder loggingRules(LoggingRuleArgs... loggingRules) {
            return loggingRules(List.of(loggingRules));
        }
        public Builder marketplaceType(@Nullable Output<String> marketplaceType) {
            this.marketplaceType = marketplaceType;
            return this;
        }
        public Builder marketplaceType(@Nullable String marketplaceType) {
            this.marketplaceType = Codegen.ofNullable(marketplaceType);
            return this;
        }
        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,ProvisioningState> provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
            return this;
        }
        public Builder regionality(@Nullable Output<Either<String,Regionality>> regionality) {
            this.regionality = regionality;
            return this;
        }
        public Builder regionality(@Nullable Either<String,Regionality> regionality) {
            this.regionality = Codegen.ofNullable(regionality);
            return this;
        }
        public Builder requestHeaderOptions(@Nullable Output<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions) {
            this.requestHeaderOptions = requestHeaderOptions;
            return this;
        }
        public Builder requestHeaderOptions(@Nullable ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs requestHeaderOptions) {
            this.requestHeaderOptions = Codegen.ofNullable(requestHeaderOptions);
            return this;
        }
        public Builder requiredFeatures(@Nullable Output<List<String>> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }
        public Builder requiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = Codegen.ofNullable(requiredFeatures);
            return this;
        }
        public Builder requiredFeatures(String... requiredFeatures) {
            return requiredFeatures(List.of(requiredFeatures));
        }
        public Builder resourceDeletionPolicy(@Nullable Output<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy) {
            this.resourceDeletionPolicy = resourceDeletionPolicy;
            return this;
        }
        public Builder resourceDeletionPolicy(@Nullable Either<String,ResourceDeletionPolicy> resourceDeletionPolicy) {
            this.resourceDeletionPolicy = Codegen.ofNullable(resourceDeletionPolicy);
            return this;
        }
        public Builder resourceMovePolicy(@Nullable Output<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy) {
            this.resourceMovePolicy = resourceMovePolicy;
            return this;
        }
        public Builder resourceMovePolicy(@Nullable ResourceTypeRegistrationPropertiesResourceMovePolicyArgs resourceMovePolicy) {
            this.resourceMovePolicy = Codegen.ofNullable(resourceMovePolicy);
            return this;
        }
        public Builder routingType(@Nullable Output<Either<String,RoutingType>> routingType) {
            this.routingType = routingType;
            return this;
        }
        public Builder routingType(@Nullable Either<String,RoutingType> routingType) {
            this.routingType = Codegen.ofNullable(routingType);
            return this;
        }
        public Builder serviceTreeInfos(@Nullable Output<List<ServiceTreeInfoArgs>> serviceTreeInfos) {
            this.serviceTreeInfos = serviceTreeInfos;
            return this;
        }
        public Builder serviceTreeInfos(@Nullable List<ServiceTreeInfoArgs> serviceTreeInfos) {
            this.serviceTreeInfos = Codegen.ofNullable(serviceTreeInfos);
            return this;
        }
        public Builder serviceTreeInfos(ServiceTreeInfoArgs... serviceTreeInfos) {
            return serviceTreeInfos(List.of(serviceTreeInfos));
        }
        public Builder subscriptionLifecycleNotificationSpecifications(@Nullable Output<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications) {
            this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
            return this;
        }
        public Builder subscriptionLifecycleNotificationSpecifications(@Nullable ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs subscriptionLifecycleNotificationSpecifications) {
            this.subscriptionLifecycleNotificationSpecifications = Codegen.ofNullable(subscriptionLifecycleNotificationSpecifications);
            return this;
        }
        public Builder subscriptionStateRules(@Nullable Output<List<SubscriptionStateRuleArgs>> subscriptionStateRules) {
            this.subscriptionStateRules = subscriptionStateRules;
            return this;
        }
        public Builder subscriptionStateRules(@Nullable List<SubscriptionStateRuleArgs> subscriptionStateRules) {
            this.subscriptionStateRules = Codegen.ofNullable(subscriptionStateRules);
            return this;
        }
        public Builder subscriptionStateRules(SubscriptionStateRuleArgs... subscriptionStateRules) {
            return subscriptionStateRules(List.of(subscriptionStateRules));
        }
        public Builder swaggerSpecifications(@Nullable Output<List<SwaggerSpecificationArgs>> swaggerSpecifications) {
            this.swaggerSpecifications = swaggerSpecifications;
            return this;
        }
        public Builder swaggerSpecifications(@Nullable List<SwaggerSpecificationArgs> swaggerSpecifications) {
            this.swaggerSpecifications = Codegen.ofNullable(swaggerSpecifications);
            return this;
        }
        public Builder swaggerSpecifications(SwaggerSpecificationArgs... swaggerSpecifications) {
            return swaggerSpecifications(List.of(swaggerSpecifications));
        }
        public Builder templateDeploymentOptions(@Nullable Output<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions) {
            this.templateDeploymentOptions = templateDeploymentOptions;
            return this;
        }
        public Builder templateDeploymentOptions(@Nullable ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs templateDeploymentOptions) {
            this.templateDeploymentOptions = Codegen.ofNullable(templateDeploymentOptions);
            return this;
        }
        public Builder throttlingRules(@Nullable Output<List<ThrottlingRuleArgs>> throttlingRules) {
            this.throttlingRules = throttlingRules;
            return this;
        }
        public Builder throttlingRules(@Nullable List<ThrottlingRuleArgs> throttlingRules) {
            this.throttlingRules = Codegen.ofNullable(throttlingRules);
            return this;
        }
        public Builder throttlingRules(ThrottlingRuleArgs... throttlingRules) {
            return throttlingRules(List.of(throttlingRules));
        }        public ResourceTypeRegistrationPropertiesArgs build() {
            return new ResourceTypeRegistrationPropertiesArgs(allowedUnauthorizedActions, authorizationActionMappings, checkNameAvailabilitySpecifications, defaultApiVersion, disallowedActionVerbs, enableAsyncOperation, enableThirdPartyS2S, endpoints, extendedLocations, extensionOptions, featuresRule, identityManagement, isPureProxy, linkedAccessChecks, loggingRules, marketplaceType, provisioningState, regionality, requestHeaderOptions, requiredFeatures, resourceDeletionPolicy, resourceMovePolicy, routingType, serviceTreeInfos, subscriptionLifecycleNotificationSpecifications, subscriptionStateRules, swaggerSpecifications, templateDeploymentOptions, throttlingRules);
        }
    }
}
