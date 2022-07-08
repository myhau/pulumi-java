// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The conversation medium, if unspecified will default to PHONE_CALL.
     * 
     */
    @EnumType
    public enum ConversationMedium {
        /**
         * Default value, if unspecified will default to PHONE_CALL.
         * 
         */
        MediumUnspecified("MEDIUM_UNSPECIFIED"),
        /**
         * The format for conversations that took place over the phone.
         * 
         */
        PhoneCall("PHONE_CALL"),
        /**
         * The format for conversations that took place over chat.
         * 
         */
        Chat("CHAT");

        private final String value;

        ConversationMedium(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConversationMedium[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
