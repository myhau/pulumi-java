// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The multi cloud account's organizational data
 * 
 */
public final class SecurityConnectorPropertiesResponseOrganizationalData extends io.pulumi.resources.InvokeArgs {

    public static final SecurityConnectorPropertiesResponseOrganizationalData Empty = new SecurityConnectorPropertiesResponseOrganizationalData();

    /**
     * If the multi cloud account is of membership type organization, list of accounts excluded from offering
     * 
     */
    @Import(name="excludedAccountIds")
      private final @Nullable List<String> excludedAccountIds;

    public List<String> excludedAccountIds() {
        return this.excludedAccountIds == null ? List.of() : this.excludedAccountIds;
    }

    /**
     * The multi cloud account's membership type in the organization
     * 
     */
    @Import(name="organizationMembershipType")
      private final @Nullable String organizationMembershipType;

    public Optional<String> organizationMembershipType() {
        return this.organizationMembershipType == null ? Optional.empty() : Optional.ofNullable(this.organizationMembershipType);
    }

    /**
     * If the multi cloud account is not of membership type organization, this will be the ID of the account's parent
     * 
     */
    @Import(name="parentHierarchyId")
      private final @Nullable String parentHierarchyId;

    public Optional<String> parentHierarchyId() {
        return this.parentHierarchyId == null ? Optional.empty() : Optional.ofNullable(this.parentHierarchyId);
    }

    /**
     * If the multi cloud account is of membership type organization, this will be the name of the onboarding stackset
     * 
     */
    @Import(name="stacksetName")
      private final @Nullable String stacksetName;

    public Optional<String> stacksetName() {
        return this.stacksetName == null ? Optional.empty() : Optional.ofNullable(this.stacksetName);
    }

    public SecurityConnectorPropertiesResponseOrganizationalData(
        @Nullable List<String> excludedAccountIds,
        @Nullable String organizationMembershipType,
        @Nullable String parentHierarchyId,
        @Nullable String stacksetName) {
        this.excludedAccountIds = excludedAccountIds;
        this.organizationMembershipType = organizationMembershipType;
        this.parentHierarchyId = parentHierarchyId;
        this.stacksetName = stacksetName;
    }

    private SecurityConnectorPropertiesResponseOrganizationalData() {
        this.excludedAccountIds = List.of();
        this.organizationMembershipType = null;
        this.parentHierarchyId = null;
        this.stacksetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConnectorPropertiesResponseOrganizationalData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedAccountIds;
        private @Nullable String organizationMembershipType;
        private @Nullable String parentHierarchyId;
        private @Nullable String stacksetName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConnectorPropertiesResponseOrganizationalData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedAccountIds = defaults.excludedAccountIds;
    	      this.organizationMembershipType = defaults.organizationMembershipType;
    	      this.parentHierarchyId = defaults.parentHierarchyId;
    	      this.stacksetName = defaults.stacksetName;
        }

        public Builder excludedAccountIds(@Nullable List<String> excludedAccountIds) {
            this.excludedAccountIds = excludedAccountIds;
            return this;
        }
        public Builder excludedAccountIds(String... excludedAccountIds) {
            return excludedAccountIds(List.of(excludedAccountIds));
        }
        public Builder organizationMembershipType(@Nullable String organizationMembershipType) {
            this.organizationMembershipType = organizationMembershipType;
            return this;
        }
        public Builder parentHierarchyId(@Nullable String parentHierarchyId) {
            this.parentHierarchyId = parentHierarchyId;
            return this;
        }
        public Builder stacksetName(@Nullable String stacksetName) {
            this.stacksetName = stacksetName;
            return this;
        }        public SecurityConnectorPropertiesResponseOrganizationalData build() {
            return new SecurityConnectorPropertiesResponseOrganizationalData(excludedAccountIds, organizationMembershipType, parentHierarchyId, stacksetName);
        }
    }
}
