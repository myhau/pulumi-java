// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CisBenchmarkResponse {
    private final Integer profileLevel;
    private final String severity;

    @OutputCustomType.Constructor({"profileLevel","severity"})
    private CisBenchmarkResponse(
        Integer profileLevel,
        String severity) {
        this.profileLevel = profileLevel;
        this.severity = severity;
    }

    public Integer getProfileLevel() {
        return this.profileLevel;
    }
    public String getSeverity() {
        return this.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CisBenchmarkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer profileLevel;
        private String severity;

        public Builder() {
    	      // Empty
        }

        public Builder(CisBenchmarkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileLevel = defaults.profileLevel;
    	      this.severity = defaults.severity;
        }

        public Builder setProfileLevel(Integer profileLevel) {
            this.profileLevel = Objects.requireNonNull(profileLevel);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public CisBenchmarkResponse build() {
            return new CisBenchmarkResponse(profileLevel, severity);
        }
    }
}
