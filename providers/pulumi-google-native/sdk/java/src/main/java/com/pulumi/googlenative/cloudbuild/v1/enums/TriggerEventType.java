// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * EventType allows the user to explicitly set the type of event to which this BuildTrigger should respond. This field will be validated against the rest of the configuration if it is set.
     * 
     */
    @EnumType
    public enum TriggerEventType {
        /**
         * EVENT_TYPE_UNSPECIFIED event_types are ignored.
         * 
         */
        EventTypeUnspecified("EVENT_TYPE_UNSPECIFIED"),
        /**
         * REPO corresponds to the supported VCS integrations.
         * 
         */
        Repo("REPO"),
        /**
         * WEBHOOK corresponds to webhook triggers.
         * 
         */
        Webhook("WEBHOOK"),
        /**
         * PUBSUB corresponds to pubsub triggers.
         * 
         */
        Pubsub("PUBSUB"),
        /**
         * MANUAL corresponds to manual-only invoked triggers.
         * 
         */
        Manual("MANUAL");

        private final String value;

        TriggerEventType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TriggerEventType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
