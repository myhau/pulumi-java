// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The WAF service that uses this key.
     * 
     */
    @EnumType
    public enum GoogleCloudRecaptchaenterpriseV1WafSettingsWafService {
        /**
         * Undefined WAF
         * 
         */
        WafServiceUnspecified("WAF_SERVICE_UNSPECIFIED"),
        /**
         * Cloud Armor
         * 
         */
        Ca("CA");

        private final String value;

        GoogleCloudRecaptchaenterpriseV1WafSettingsWafService(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudRecaptchaenterpriseV1WafSettingsWafService[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
