// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupConnectivityInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GroupConnectivityInformationResponse Empty = new GroupConnectivityInformationResponse();

    @InputImport(name="customerVisibleFqdns")
    private final @Nullable List<String> customerVisibleFqdns;

    public List<String> getCustomerVisibleFqdns() {
        return this.customerVisibleFqdns == null ? List.of() : this.customerVisibleFqdns;
    }

    @InputImport(name="groupId", required=true)
    private final String groupId;

    public String getGroupId() {
        return this.groupId;
    }

    @InputImport(name="internalFqdn", required=true)
    private final String internalFqdn;

    public String getInternalFqdn() {
        return this.internalFqdn;
    }

    @InputImport(name="memberName", required=true)
    private final String memberName;

    public String getMemberName() {
        return this.memberName;
    }

    @InputImport(name="privateLinkServiceArmRegion")
    private final @Nullable String privateLinkServiceArmRegion;

    public Optional<String> getPrivateLinkServiceArmRegion() {
        return this.privateLinkServiceArmRegion == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceArmRegion);
    }

    @InputImport(name="redirectMapId")
    private final @Nullable String redirectMapId;

    public Optional<String> getRedirectMapId() {
        return this.redirectMapId == null ? Optional.empty() : Optional.ofNullable(this.redirectMapId);
    }

    public GroupConnectivityInformationResponse(
        @Nullable List<String> customerVisibleFqdns,
        String groupId,
        String internalFqdn,
        String memberName,
        @Nullable String privateLinkServiceArmRegion,
        @Nullable String redirectMapId) {
        this.customerVisibleFqdns = customerVisibleFqdns;
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.internalFqdn = Objects.requireNonNull(internalFqdn, "expected parameter 'internalFqdn' to be non-null");
        this.memberName = Objects.requireNonNull(memberName, "expected parameter 'memberName' to be non-null");
        this.privateLinkServiceArmRegion = privateLinkServiceArmRegion;
        this.redirectMapId = redirectMapId;
    }

    private GroupConnectivityInformationResponse() {
        this.customerVisibleFqdns = List.of();
        this.groupId = null;
        this.internalFqdn = null;
        this.memberName = null;
        this.privateLinkServiceArmRegion = null;
        this.redirectMapId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupConnectivityInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customerVisibleFqdns;
        private String groupId;
        private String internalFqdn;
        private String memberName;
        private @Nullable String privateLinkServiceArmRegion;
        private @Nullable String redirectMapId;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupConnectivityInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerVisibleFqdns = defaults.customerVisibleFqdns;
    	      this.groupId = defaults.groupId;
    	      this.internalFqdn = defaults.internalFqdn;
    	      this.memberName = defaults.memberName;
    	      this.privateLinkServiceArmRegion = defaults.privateLinkServiceArmRegion;
    	      this.redirectMapId = defaults.redirectMapId;
        }

        public Builder setCustomerVisibleFqdns(@Nullable List<String> customerVisibleFqdns) {
            this.customerVisibleFqdns = customerVisibleFqdns;
            return this;
        }

        public Builder setGroupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder setInternalFqdn(String internalFqdn) {
            this.internalFqdn = Objects.requireNonNull(internalFqdn);
            return this;
        }

        public Builder setMemberName(String memberName) {
            this.memberName = Objects.requireNonNull(memberName);
            return this;
        }

        public Builder setPrivateLinkServiceArmRegion(@Nullable String privateLinkServiceArmRegion) {
            this.privateLinkServiceArmRegion = privateLinkServiceArmRegion;
            return this;
        }

        public Builder setRedirectMapId(@Nullable String redirectMapId) {
            this.redirectMapId = redirectMapId;
            return this;
        }

        public GroupConnectivityInformationResponse build() {
            return new GroupConnectivityInformationResponse(customerVisibleFqdns, groupId, internalFqdn, memberName, privateLinkServiceArmRegion, redirectMapId);
        }
    }
}