// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager.v1.inputs.DevicePolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A condition necessary for an `AccessLevel` to be granted. The Condition is an AND over its fields. So a Condition is true if: 1) the request IP is from one of the listed subnetworks AND 2) the originating device complies with the listed device policy AND 3) all listed access levels are granted AND 4) the request was sent at a time allowed by the DateTimeRestriction.
 * 
 */
public final class ConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * Device specific restrictions, all restrictions must hold for the Condition to be true. If not specified, all devices are allowed.
     * 
     */
    @Import(name="devicePolicy")
    private @Nullable Output<DevicePolicyArgs> devicePolicy;

    /**
     * @return Device specific restrictions, all restrictions must hold for the Condition to be true. If not specified, all devices are allowed.
     * 
     */
    public Optional<Output<DevicePolicyArgs>> devicePolicy() {
        return Optional.ofNullable(this.devicePolicy);
    }

    /**
     * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host bits must be zero) or the input is considered malformed. For example, &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly, for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34; is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
     * 
     */
    @Import(name="ipSubnetworks")
    private @Nullable Output<List<String>> ipSubnetworks;

    /**
     * @return CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host bits must be zero) or the input is considered malformed. For example, &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly, for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34; is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
     * 
     */
    public Optional<Output<List<String>>> ipSubnetworks() {
        return Optional.ofNullable(this.ipSubnetworks);
    }

    /**
     * The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid}` `serviceAccount:{emailid}` If not specified, a request may come from any user.
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<String>> members;

    /**
     * @return The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid}` `serviceAccount:{emailid}` If not specified, a request may come from any user.
     * 
     */
    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
     * 
     */
    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    /**
     * @return Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    /**
     * The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes.
     * 
     */
    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    /**
     * @return The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes.
     * 
     */
    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
    }

    /**
     * A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be granted for the Condition to be true. Example: &#34;`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME&#34;`
     * 
     */
    @Import(name="requiredAccessLevels")
    private @Nullable Output<List<String>> requiredAccessLevels;

    /**
     * @return A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be granted for the Condition to be true. Example: &#34;`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME&#34;`
     * 
     */
    public Optional<Output<List<String>>> requiredAccessLevels() {
        return Optional.ofNullable(this.requiredAccessLevels);
    }

    private ConditionArgs() {}

    private ConditionArgs(ConditionArgs $) {
        this.devicePolicy = $.devicePolicy;
        this.ipSubnetworks = $.ipSubnetworks;
        this.members = $.members;
        this.negate = $.negate;
        this.regions = $.regions;
        this.requiredAccessLevels = $.requiredAccessLevels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionArgs $;

        public Builder() {
            $ = new ConditionArgs();
        }

        public Builder(ConditionArgs defaults) {
            $ = new ConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param devicePolicy Device specific restrictions, all restrictions must hold for the Condition to be true. If not specified, all devices are allowed.
         * 
         * @return builder
         * 
         */
        public Builder devicePolicy(@Nullable Output<DevicePolicyArgs> devicePolicy) {
            $.devicePolicy = devicePolicy;
            return this;
        }

        /**
         * @param devicePolicy Device specific restrictions, all restrictions must hold for the Condition to be true. If not specified, all devices are allowed.
         * 
         * @return builder
         * 
         */
        public Builder devicePolicy(DevicePolicyArgs devicePolicy) {
            return devicePolicy(Output.of(devicePolicy));
        }

        /**
         * @param ipSubnetworks CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host bits must be zero) or the input is considered malformed. For example, &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly, for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34; is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
         * 
         * @return builder
         * 
         */
        public Builder ipSubnetworks(@Nullable Output<List<String>> ipSubnetworks) {
            $.ipSubnetworks = ipSubnetworks;
            return this;
        }

        /**
         * @param ipSubnetworks CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host bits must be zero) or the input is considered malformed. For example, &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly, for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34; is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
         * 
         * @return builder
         * 
         */
        public Builder ipSubnetworks(List<String> ipSubnetworks) {
            return ipSubnetworks(Output.of(ipSubnetworks));
        }

        /**
         * @param ipSubnetworks CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host bits must be zero) or the input is considered malformed. For example, &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly, for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34; is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
         * 
         * @return builder
         * 
         */
        public Builder ipSubnetworks(String... ipSubnetworks) {
            return ipSubnetworks(List.of(ipSubnetworks));
        }

        /**
         * @param members The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid}` `serviceAccount:{emailid}` If not specified, a request may come from any user.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid}` `serviceAccount:{emailid}` If not specified, a request may come from any user.
         * 
         * @return builder
         * 
         */
        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        /**
         * @param members The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid}` `serviceAccount:{emailid}` If not specified, a request may come from any user.
         * 
         * @return builder
         * 
         */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param negate Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        /**
         * @param negate Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        /**
         * @param regions The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes.
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes.
         * 
         * @return builder
         * 
         */
        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        /**
         * @param regions The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes.
         * 
         * @return builder
         * 
         */
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        /**
         * @param requiredAccessLevels A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be granted for the Condition to be true. Example: &#34;`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME&#34;`
         * 
         * @return builder
         * 
         */
        public Builder requiredAccessLevels(@Nullable Output<List<String>> requiredAccessLevels) {
            $.requiredAccessLevels = requiredAccessLevels;
            return this;
        }

        /**
         * @param requiredAccessLevels A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be granted for the Condition to be true. Example: &#34;`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME&#34;`
         * 
         * @return builder
         * 
         */
        public Builder requiredAccessLevels(List<String> requiredAccessLevels) {
            return requiredAccessLevels(Output.of(requiredAccessLevels));
        }

        /**
         * @param requiredAccessLevels A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be granted for the Condition to be true. Example: &#34;`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME&#34;`
         * 
         * @return builder
         * 
         */
        public Builder requiredAccessLevels(String... requiredAccessLevels) {
            return requiredAccessLevels(List.of(requiredAccessLevels));
        }

        public ConditionArgs build() {
            return $;
        }
    }

}
