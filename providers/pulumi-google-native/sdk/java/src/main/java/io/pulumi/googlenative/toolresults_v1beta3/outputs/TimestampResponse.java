// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TimestampResponse {
    private final Integer nanos;
    private final String seconds;

    @OutputCustomType.Constructor({"nanos","seconds"})
    private TimestampResponse(
        Integer nanos,
        String seconds) {
        this.nanos = Objects.requireNonNull(nanos);
        this.seconds = Objects.requireNonNull(seconds);
    }

    public Integer getNanos() {
        return this.nanos;
    }
    public String getSeconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimestampResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer nanos;
        private String seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TimestampResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setNanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }

        public Builder setSeconds(String seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }

        public TimestampResponse build() {
            return new TimestampResponse(nanos, seconds);
        }
    }
}