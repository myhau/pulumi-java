// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The start and end date for recurrence schedule.
 * 
 */
public final class ReportRecurrencePeriodResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportRecurrencePeriodResponse Empty = new ReportRecurrencePeriodResponse();

    /**
     * The start date of recurrence.
     * 
     */
    @Import(name="from", required=true)
      private final String from;

    public String from() {
        return this.from;
    }

    /**
     * The end date of recurrence.
     * 
     */
    @Import(name="to")
      private final @Nullable String to;

    public Optional<String> to() {
        return this.to == null ? Optional.empty() : Optional.ofNullable(this.to);
    }

    public ReportRecurrencePeriodResponse(
        String from,
        @Nullable String to) {
        this.from = Objects.requireNonNull(from, "expected parameter 'from' to be non-null");
        this.to = to;
    }

    private ReportRecurrencePeriodResponse() {
        this.from = null;
        this.to = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportRecurrencePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String from;
        private @Nullable String to;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportRecurrencePeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(String from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }
        public Builder to(@Nullable String to) {
            this.to = to;
            return this;
        }        public ReportRecurrencePeriodResponse build() {
            return new ReportRecurrencePeriodResponse(from, to);
        }
    }
}
