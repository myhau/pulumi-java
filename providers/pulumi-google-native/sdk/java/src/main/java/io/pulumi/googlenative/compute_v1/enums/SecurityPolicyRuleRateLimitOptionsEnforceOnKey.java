// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum SecurityPolicyRuleRateLimitOptionsEnforceOnKey {
        All("ALL"),
        HttpCookie("HTTP_COOKIE"),
        HttpHeader("HTTP_HEADER"),
        Ip("IP"),
        XffIp("XFF_IP");

        private final String value;

        SecurityPolicyRuleRateLimitOptionsEnforceOnKey(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecurityPolicyRuleRateLimitOptionsEnforceOnKey[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }