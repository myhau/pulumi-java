// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs.v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation is not disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    @EnumType
    public enum ProcessingOptionsHtmlSanitization {
        /**
         * Default value.
         * 
         */
        HtmlSanitizationUnspecified("HTML_SANITIZATION_UNSPECIFIED"),
        /**
         * Disables sanitization on HTML input.
         * 
         */
        HtmlSanitizationDisabled("HTML_SANITIZATION_DISABLED"),
        /**
         * Sanitizes HTML input, only accepts bold, italic, ordered list, and unordered list markup tags.
         * 
         */
        SimpleFormattingOnly("SIMPLE_FORMATTING_ONLY");

        private final String value;

        ProcessingOptionsHtmlSanitization(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProcessingOptionsHtmlSanitization[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
