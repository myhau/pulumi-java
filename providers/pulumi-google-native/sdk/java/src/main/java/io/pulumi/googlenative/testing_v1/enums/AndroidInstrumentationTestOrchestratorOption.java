// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum AndroidInstrumentationTestOrchestratorOption {
        OrchestratorOptionUnspecified("ORCHESTRATOR_OPTION_UNSPECIFIED"),
        UseOrchestrator("USE_ORCHESTRATOR"),
        DoNotUseOrchestrator("DO_NOT_USE_ORCHESTRATOR");

        private final String value;

        AndroidInstrumentationTestOrchestratorOption(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AndroidInstrumentationTestOrchestratorOption[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }