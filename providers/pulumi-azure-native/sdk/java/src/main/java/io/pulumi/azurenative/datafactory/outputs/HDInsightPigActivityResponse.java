// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HDInsightPigActivityResponse {
    /**
     * User specified arguments to HDInsightActivity. Type: array (or Expression with resultType array).
     * 
     */
    private final @Nullable Object arguments;
    /**
     * Allows user to specify defines for Pig job request.
     * 
     */
    private final @Nullable Map<String,Object> defines;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Debug info option.
     * 
     */
    private final @Nullable String getDebugInfo;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Script linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse scriptLinkedService;
    /**
     * Script path. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object scriptPath;
    /**
     * Storage linked service references.
     * 
     */
    private final @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
    /**
     * Type of activity.
     * Expected value is 'HDInsightPig'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private HDInsightPigActivityResponse(
        @CustomType.Parameter("arguments") @Nullable Object arguments,
        @CustomType.Parameter("defines") @Nullable Map<String,Object> defines,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("getDebugInfo") @Nullable String getDebugInfo,
        @CustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @CustomType.Parameter("scriptLinkedService") @Nullable LinkedServiceReferenceResponse scriptLinkedService,
        @CustomType.Parameter("scriptPath") @Nullable Object scriptPath,
        @CustomType.Parameter("storageLinkedServices") @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.arguments = arguments;
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.getDebugInfo = getDebugInfo;
        this.linkedServiceName = linkedServiceName;
        this.name = name;
        this.policy = policy;
        this.scriptLinkedService = scriptLinkedService;
        this.scriptPath = scriptPath;
        this.storageLinkedServices = storageLinkedServices;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * User specified arguments to HDInsightActivity. Type: array (or Expression with resultType array).
     * 
    */
    public Optional<Object> arguments() {
        return Optional.ofNullable(this.arguments);
    }
    /**
     * Allows user to specify defines for Pig job request.
     * 
    */
    public Map<String,Object> defines() {
        return this.defines == null ? Map.of() : this.defines;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Debug info option.
     * 
    */
    public Optional<String> getDebugInfo() {
        return Optional.ofNullable(this.getDebugInfo);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Activity name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Script linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> scriptLinkedService() {
        return Optional.ofNullable(this.scriptLinkedService);
    }
    /**
     * Script path. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> scriptPath() {
        return Optional.ofNullable(this.scriptPath);
    }
    /**
     * Storage linked service references.
     * 
    */
    public List<LinkedServiceReferenceResponse> storageLinkedServices() {
        return this.storageLinkedServices == null ? List.of() : this.storageLinkedServices;
    }
    /**
     * Type of activity.
     * Expected value is 'HDInsightPig'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightPigActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object arguments;
        private @Nullable Map<String,Object> defines;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable String getDebugInfo;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable LinkedServiceReferenceResponse scriptLinkedService;
        private @Nullable Object scriptPath;
        private @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightPigActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.defines = defaults.defines;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.scriptLinkedService = defaults.scriptLinkedService;
    	      this.scriptPath = defaults.scriptPath;
    	      this.storageLinkedServices = defaults.storageLinkedServices;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder arguments(@Nullable Object arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder defines(@Nullable Map<String,Object> defines) {
            this.defines = defines;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder getDebugInfo(@Nullable String getDebugInfo) {
            this.getDebugInfo = getDebugInfo;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder scriptLinkedService(@Nullable LinkedServiceReferenceResponse scriptLinkedService) {
            this.scriptLinkedService = scriptLinkedService;
            return this;
        }
        public Builder scriptPath(@Nullable Object scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }
        public Builder storageLinkedServices(@Nullable List<LinkedServiceReferenceResponse> storageLinkedServices) {
            this.storageLinkedServices = storageLinkedServices;
            return this;
        }
        public Builder storageLinkedServices(LinkedServiceReferenceResponse... storageLinkedServices) {
            return storageLinkedServices(List.of(storageLinkedServices));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public HDInsightPigActivityResponse build() {
            return new HDInsightPigActivityResponse(arguments, defines, dependsOn, description, getDebugInfo, linkedServiceName, name, policy, scriptLinkedService, scriptPath, storageLinkedServices, type, userProperties);
        }
    }
}
