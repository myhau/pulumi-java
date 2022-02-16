// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum IntegrationConnectorType {
        Salesforce("Salesforce"),
        Marketo("Marketo"),
        ServiceNow("ServiceNow"),
        Zendesk("Zendesk"),
        S3("S3");

        private final String value;

        IntegrationConnectorType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IntegrationConnectorType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }