// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HttpRouteRuleMatch criteria for field values that must stay within the specified integer range.
 * 
 */
public final class Int64RangeMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final Int64RangeMatchArgs Empty = new Int64RangeMatchArgs();

    /**
     * The end of the range (exclusive) in signed long integer format.
     * 
     */
    @Import(name="rangeEnd")
    private @Nullable Output<String> rangeEnd;

    /**
     * @return The end of the range (exclusive) in signed long integer format.
     * 
     */
    public Optional<Output<String>> rangeEnd() {
        return Optional.ofNullable(this.rangeEnd);
    }

    /**
     * The start of the range (inclusive) in signed long integer format.
     * 
     */
    @Import(name="rangeStart")
    private @Nullable Output<String> rangeStart;

    /**
     * @return The start of the range (inclusive) in signed long integer format.
     * 
     */
    public Optional<Output<String>> rangeStart() {
        return Optional.ofNullable(this.rangeStart);
    }

    private Int64RangeMatchArgs() {}

    private Int64RangeMatchArgs(Int64RangeMatchArgs $) {
        this.rangeEnd = $.rangeEnd;
        this.rangeStart = $.rangeStart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Int64RangeMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Int64RangeMatchArgs $;

        public Builder() {
            $ = new Int64RangeMatchArgs();
        }

        public Builder(Int64RangeMatchArgs defaults) {
            $ = new Int64RangeMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rangeEnd The end of the range (exclusive) in signed long integer format.
         * 
         * @return builder
         * 
         */
        public Builder rangeEnd(@Nullable Output<String> rangeEnd) {
            $.rangeEnd = rangeEnd;
            return this;
        }

        /**
         * @param rangeEnd The end of the range (exclusive) in signed long integer format.
         * 
         * @return builder
         * 
         */
        public Builder rangeEnd(String rangeEnd) {
            return rangeEnd(Output.of(rangeEnd));
        }

        /**
         * @param rangeStart The start of the range (inclusive) in signed long integer format.
         * 
         * @return builder
         * 
         */
        public Builder rangeStart(@Nullable Output<String> rangeStart) {
            $.rangeStart = rangeStart;
            return this;
        }

        /**
         * @param rangeStart The start of the range (inclusive) in signed long integer format.
         * 
         * @return builder
         * 
         */
        public Builder rangeStart(String rangeStart) {
            return rangeStart(Output.of(rangeStart));
        }

        public Int64RangeMatchArgs build() {
            return $;
        }
    }

}
