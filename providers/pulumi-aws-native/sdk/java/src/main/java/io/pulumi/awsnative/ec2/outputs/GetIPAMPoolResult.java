// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.IPAMPoolIpamScopeType;
import io.pulumi.awsnative.ec2.enums.IPAMPoolState;
import io.pulumi.awsnative.ec2.outputs.IPAMPoolProvisionedCidr;
import io.pulumi.awsnative.ec2.outputs.IPAMPoolTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIPAMPoolResult {
    private final @Nullable Integer allocationDefaultNetmaskLength;
    private final @Nullable Integer allocationMaxNetmaskLength;
    private final @Nullable Integer allocationMinNetmaskLength;
    private final @Nullable List<IPAMPoolTag> allocationResourceTags;
    private final @Nullable String arn;
    private final @Nullable Boolean autoImport;
    private final @Nullable String description;
    private final @Nullable String ipamArn;
    private final @Nullable String ipamPoolId;
    private final @Nullable String ipamScopeArn;
    private final @Nullable IPAMPoolIpamScopeType ipamScopeType;
    private final @Nullable Integer poolDepth;
    private final @Nullable List<IPAMPoolProvisionedCidr> provisionedCidrs;
    private final @Nullable IPAMPoolState state;
    private final @Nullable String stateMessage;
    private final @Nullable List<IPAMPoolTag> tags;

    @OutputCustomType.Constructor({"allocationDefaultNetmaskLength","allocationMaxNetmaskLength","allocationMinNetmaskLength","allocationResourceTags","arn","autoImport","description","ipamArn","ipamPoolId","ipamScopeArn","ipamScopeType","poolDepth","provisionedCidrs","state","stateMessage","tags"})
    private GetIPAMPoolResult(
        @Nullable Integer allocationDefaultNetmaskLength,
        @Nullable Integer allocationMaxNetmaskLength,
        @Nullable Integer allocationMinNetmaskLength,
        @Nullable List<IPAMPoolTag> allocationResourceTags,
        @Nullable String arn,
        @Nullable Boolean autoImport,
        @Nullable String description,
        @Nullable String ipamArn,
        @Nullable String ipamPoolId,
        @Nullable String ipamScopeArn,
        @Nullable IPAMPoolIpamScopeType ipamScopeType,
        @Nullable Integer poolDepth,
        @Nullable List<IPAMPoolProvisionedCidr> provisionedCidrs,
        @Nullable IPAMPoolState state,
        @Nullable String stateMessage,
        @Nullable List<IPAMPoolTag> tags) {
        this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
        this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
        this.allocationMinNetmaskLength = allocationMinNetmaskLength;
        this.allocationResourceTags = allocationResourceTags;
        this.arn = arn;
        this.autoImport = autoImport;
        this.description = description;
        this.ipamArn = ipamArn;
        this.ipamPoolId = ipamPoolId;
        this.ipamScopeArn = ipamScopeArn;
        this.ipamScopeType = ipamScopeType;
        this.poolDepth = poolDepth;
        this.provisionedCidrs = provisionedCidrs;
        this.state = state;
        this.stateMessage = stateMessage;
        this.tags = tags;
    }

    public Optional<Integer> getAllocationDefaultNetmaskLength() {
        return Optional.ofNullable(this.allocationDefaultNetmaskLength);
    }
    public Optional<Integer> getAllocationMaxNetmaskLength() {
        return Optional.ofNullable(this.allocationMaxNetmaskLength);
    }
    public Optional<Integer> getAllocationMinNetmaskLength() {
        return Optional.ofNullable(this.allocationMinNetmaskLength);
    }
    public List<IPAMPoolTag> getAllocationResourceTags() {
        return this.allocationResourceTags == null ? List.of() : this.allocationResourceTags;
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Boolean> getAutoImport() {
        return Optional.ofNullable(this.autoImport);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getIpamArn() {
        return Optional.ofNullable(this.ipamArn);
    }
    public Optional<String> getIpamPoolId() {
        return Optional.ofNullable(this.ipamPoolId);
    }
    public Optional<String> getIpamScopeArn() {
        return Optional.ofNullable(this.ipamScopeArn);
    }
    public Optional<IPAMPoolIpamScopeType> getIpamScopeType() {
        return Optional.ofNullable(this.ipamScopeType);
    }
    public Optional<Integer> getPoolDepth() {
        return Optional.ofNullable(this.poolDepth);
    }
    public List<IPAMPoolProvisionedCidr> getProvisionedCidrs() {
        return this.provisionedCidrs == null ? List.of() : this.provisionedCidrs;
    }
    public Optional<IPAMPoolState> getState() {
        return Optional.ofNullable(this.state);
    }
    public Optional<String> getStateMessage() {
        return Optional.ofNullable(this.stateMessage);
    }
    public List<IPAMPoolTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIPAMPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allocationDefaultNetmaskLength;
        private @Nullable Integer allocationMaxNetmaskLength;
        private @Nullable Integer allocationMinNetmaskLength;
        private @Nullable List<IPAMPoolTag> allocationResourceTags;
        private @Nullable String arn;
        private @Nullable Boolean autoImport;
        private @Nullable String description;
        private @Nullable String ipamArn;
        private @Nullable String ipamPoolId;
        private @Nullable String ipamScopeArn;
        private @Nullable IPAMPoolIpamScopeType ipamScopeType;
        private @Nullable Integer poolDepth;
        private @Nullable List<IPAMPoolProvisionedCidr> provisionedCidrs;
        private @Nullable IPAMPoolState state;
        private @Nullable String stateMessage;
        private @Nullable List<IPAMPoolTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIPAMPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationDefaultNetmaskLength = defaults.allocationDefaultNetmaskLength;
    	      this.allocationMaxNetmaskLength = defaults.allocationMaxNetmaskLength;
    	      this.allocationMinNetmaskLength = defaults.allocationMinNetmaskLength;
    	      this.allocationResourceTags = defaults.allocationResourceTags;
    	      this.arn = defaults.arn;
    	      this.autoImport = defaults.autoImport;
    	      this.description = defaults.description;
    	      this.ipamArn = defaults.ipamArn;
    	      this.ipamPoolId = defaults.ipamPoolId;
    	      this.ipamScopeArn = defaults.ipamScopeArn;
    	      this.ipamScopeType = defaults.ipamScopeType;
    	      this.poolDepth = defaults.poolDepth;
    	      this.provisionedCidrs = defaults.provisionedCidrs;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.tags = defaults.tags;
        }

        public Builder setAllocationDefaultNetmaskLength(@Nullable Integer allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
            return this;
        }

        public Builder setAllocationMaxNetmaskLength(@Nullable Integer allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
            return this;
        }

        public Builder setAllocationMinNetmaskLength(@Nullable Integer allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = allocationMinNetmaskLength;
            return this;
        }

        public Builder setAllocationResourceTags(@Nullable List<IPAMPoolTag> allocationResourceTags) {
            this.allocationResourceTags = allocationResourceTags;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAutoImport(@Nullable Boolean autoImport) {
            this.autoImport = autoImport;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIpamArn(@Nullable String ipamArn) {
            this.ipamArn = ipamArn;
            return this;
        }

        public Builder setIpamPoolId(@Nullable String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }

        public Builder setIpamScopeArn(@Nullable String ipamScopeArn) {
            this.ipamScopeArn = ipamScopeArn;
            return this;
        }

        public Builder setIpamScopeType(@Nullable IPAMPoolIpamScopeType ipamScopeType) {
            this.ipamScopeType = ipamScopeType;
            return this;
        }

        public Builder setPoolDepth(@Nullable Integer poolDepth) {
            this.poolDepth = poolDepth;
            return this;
        }

        public Builder setProvisionedCidrs(@Nullable List<IPAMPoolProvisionedCidr> provisionedCidrs) {
            this.provisionedCidrs = provisionedCidrs;
            return this;
        }

        public Builder setState(@Nullable IPAMPoolState state) {
            this.state = state;
            return this;
        }

        public Builder setStateMessage(@Nullable String stateMessage) {
            this.stateMessage = stateMessage;
            return this;
        }

        public Builder setTags(@Nullable List<IPAMPoolTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetIPAMPoolResult build() {
            return new GetIPAMPoolResult(allocationDefaultNetmaskLength, allocationMaxNetmaskLength, allocationMinNetmaskLength, allocationResourceTags, arn, autoImport, description, ipamArn, ipamPoolId, ipamScopeArn, ipamScopeType, poolDepth, provisionedCidrs, state, stateMessage, tags);
        }
    }
}