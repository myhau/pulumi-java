// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM host maintenance policy.
     * 
     */
    @EnumType
    public enum SchedulingOnHostMaintenance {
        /**
         * *[Default]* Allows Compute Engine to automatically migrate instances out of the way of maintenance events.
         * 
         */
        Migrate("MIGRATE"),
        /**
         * Tells Compute Engine to terminate and (optionally) restart the instance away from the maintenance activity. If you would like your instance to be restarted, set the automaticRestart flag to true. Your instance may be restarted more than once, and it may be restarted outside the window of maintenance events.
         * 
         */
        Terminate("TERMINATE");

        private final String value;

        SchedulingOnHostMaintenance(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SchedulingOnHostMaintenance[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
