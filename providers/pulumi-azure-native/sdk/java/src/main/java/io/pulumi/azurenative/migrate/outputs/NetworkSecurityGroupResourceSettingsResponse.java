// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.NsgSecurityRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkSecurityGroupResourceSettingsResponse {
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/networkSecurityGroups'.
     * 
     */
    private final String resourceType;
    /**
     * Gets or sets Security rules of network security group.
     * 
     */
    private final @Nullable List<NsgSecurityRuleResponse> securityRules;
    /**
     * Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;

    @OutputCustomType.Constructor({"resourceType","securityRules","targetResourceName"})
    private NetworkSecurityGroupResourceSettingsResponse(
        String resourceType,
        @Nullable List<NsgSecurityRuleResponse> securityRules,
        String targetResourceName) {
        this.resourceType = resourceType;
        this.securityRules = securityRules;
        this.targetResourceName = targetResourceName;
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/networkSecurityGroups'.
     * 
    */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Gets or sets Security rules of network security group.
     * 
    */
    public List<NsgSecurityRuleResponse> getSecurityRules() {
        return this.securityRules == null ? List.of() : this.securityRules;
    }
    /**
     * Gets or sets the target Resource name.
     * 
    */
    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private @Nullable List<NsgSecurityRuleResponse> securityRules;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.securityRules = defaults.securityRules;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setSecurityRules(@Nullable List<NsgSecurityRuleResponse> securityRules) {
            this.securityRules = securityRules;
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }
        public NetworkSecurityGroupResourceSettingsResponse build() {
            return new NetworkSecurityGroupResourceSettingsResponse(resourceType, securityRules, targetResourceName);
        }
    }
}
