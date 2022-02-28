// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrailAdvancedEventSelectorFieldSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailAdvancedEventSelectorFieldSelectorArgs Empty = new TrailAdvancedEventSelectorFieldSelectorArgs();

    /**
     * A list of values that includes events that match the last few characters of the event record field specified as the value of `field`.
     * 
     */
    @InputImport(name="endsWiths")
      private final @Nullable Input<List<String>> endsWiths;

    public Input<List<String>> getEndsWiths() {
        return this.endsWiths == null ? Input.empty() : this.endsWiths;
    }

    /**
     * A list of values that includes events that match the exact value of the event record field specified as the value of `field`. This is the only valid operator that you can use with the `readOnly`, `eventCategory`, and `resources.type` fields.
     * 
     */
    @InputImport(name="equals")
      private final @Nullable Input<List<String>> equals;

    public Input<List<String>> getEquals() {
        return this.equals == null ? Input.empty() : this.equals;
    }

    /**
     * Specifies a field in an event record on which to filter events to be logged. You can specify only the following values: `readOnly`, `eventSource`, `eventName`, `eventCategory`, `resources.type`, `resources.ARN`.
     * 
     */
    @InputImport(name="field", required=true)
      private final Input<String> field;

    public Input<String> getField() {
        return this.field;
    }

    /**
     * A list of values that excludes events that match the last few characters of the event record field specified as the value of `field`.
     * 
     */
    @InputImport(name="notEndsWiths")
      private final @Nullable Input<List<String>> notEndsWiths;

    public Input<List<String>> getNotEndsWiths() {
        return this.notEndsWiths == null ? Input.empty() : this.notEndsWiths;
    }

    /**
     * A list of values that excludes events that match the exact value of the event record field specified as the value of `field`.
     * 
     */
    @InputImport(name="notEquals")
      private final @Nullable Input<List<String>> notEquals;

    public Input<List<String>> getNotEquals() {
        return this.notEquals == null ? Input.empty() : this.notEquals;
    }

    /**
     * A list of values that excludes events that match the first few characters of the event record field specified as the value of `field`.
     * 
     */
    @InputImport(name="notStartsWiths")
      private final @Nullable Input<List<String>> notStartsWiths;

    public Input<List<String>> getNotStartsWiths() {
        return this.notStartsWiths == null ? Input.empty() : this.notStartsWiths;
    }

    /**
     * A list of values that includes events that match the first few characters of the event record field specified as the value of `field`.
     * 
     */
    @InputImport(name="startsWiths")
      private final @Nullable Input<List<String>> startsWiths;

    public Input<List<String>> getStartsWiths() {
        return this.startsWiths == null ? Input.empty() : this.startsWiths;
    }

    public TrailAdvancedEventSelectorFieldSelectorArgs(
        @Nullable Input<List<String>> endsWiths,
        @Nullable Input<List<String>> equals,
        Input<String> field,
        @Nullable Input<List<String>> notEndsWiths,
        @Nullable Input<List<String>> notEquals,
        @Nullable Input<List<String>> notStartsWiths,
        @Nullable Input<List<String>> startsWiths) {
        this.endsWiths = endsWiths;
        this.equals = equals;
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.notEndsWiths = notEndsWiths;
        this.notEquals = notEquals;
        this.notStartsWiths = notStartsWiths;
        this.startsWiths = startsWiths;
    }

    private TrailAdvancedEventSelectorFieldSelectorArgs() {
        this.endsWiths = Input.empty();
        this.equals = Input.empty();
        this.field = Input.empty();
        this.notEndsWiths = Input.empty();
        this.notEquals = Input.empty();
        this.notStartsWiths = Input.empty();
        this.startsWiths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailAdvancedEventSelectorFieldSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> endsWiths;
        private @Nullable Input<List<String>> equals;
        private Input<String> field;
        private @Nullable Input<List<String>> notEndsWiths;
        private @Nullable Input<List<String>> notEquals;
        private @Nullable Input<List<String>> notStartsWiths;
        private @Nullable Input<List<String>> startsWiths;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailAdvancedEventSelectorFieldSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endsWiths = defaults.endsWiths;
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
    	      this.notEndsWiths = defaults.notEndsWiths;
    	      this.notEquals = defaults.notEquals;
    	      this.notStartsWiths = defaults.notStartsWiths;
    	      this.startsWiths = defaults.startsWiths;
        }

        public Builder setEndsWiths(@Nullable Input<List<String>> endsWiths) {
            this.endsWiths = endsWiths;
            return this;
        }

        public Builder setEndsWiths(@Nullable List<String> endsWiths) {
            this.endsWiths = Input.ofNullable(endsWiths);
            return this;
        }

        public Builder setEquals(@Nullable Input<List<String>> equals) {
            this.equals = equals;
            return this;
        }

        public Builder setEquals(@Nullable List<String> equals) {
            this.equals = Input.ofNullable(equals);
            return this;
        }

        public Builder setField(Input<String> field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setField(String field) {
            this.field = Input.of(Objects.requireNonNull(field));
            return this;
        }

        public Builder setNotEndsWiths(@Nullable Input<List<String>> notEndsWiths) {
            this.notEndsWiths = notEndsWiths;
            return this;
        }

        public Builder setNotEndsWiths(@Nullable List<String> notEndsWiths) {
            this.notEndsWiths = Input.ofNullable(notEndsWiths);
            return this;
        }

        public Builder setNotEquals(@Nullable Input<List<String>> notEquals) {
            this.notEquals = notEquals;
            return this;
        }

        public Builder setNotEquals(@Nullable List<String> notEquals) {
            this.notEquals = Input.ofNullable(notEquals);
            return this;
        }

        public Builder setNotStartsWiths(@Nullable Input<List<String>> notStartsWiths) {
            this.notStartsWiths = notStartsWiths;
            return this;
        }

        public Builder setNotStartsWiths(@Nullable List<String> notStartsWiths) {
            this.notStartsWiths = Input.ofNullable(notStartsWiths);
            return this;
        }

        public Builder setStartsWiths(@Nullable Input<List<String>> startsWiths) {
            this.startsWiths = startsWiths;
            return this;
        }

        public Builder setStartsWiths(@Nullable List<String> startsWiths) {
            this.startsWiths = Input.ofNullable(startsWiths);
            return this;
        }
        public TrailAdvancedEventSelectorFieldSelectorArgs build() {
            return new TrailAdvancedEventSelectorFieldSelectorArgs(endsWiths, equals, field, notEndsWiths, notEquals, notStartsWiths, startsWiths);
        }
    }
}
