// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleFieldToMatchArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ByteMatchSetByteMatchTupleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ByteMatchSetByteMatchTupleArgs Empty = new ByteMatchSetByteMatchTupleArgs();

    /**
     * Settings for the ByteMatchTuple. FieldToMatch documented below.
     * 
     */
    @InputImport(name="fieldToMatch", required=true)
      private final Input<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch;

    public Input<ByteMatchSetByteMatchTupleFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * Within the portion of a web request that you want to search.
     * 
     */
    @InputImport(name="positionalConstraint", required=true)
      private final Input<String> positionalConstraint;

    public Input<String> getPositionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
     * 
     */
    @InputImport(name="targetString")
      private final @Nullable Input<String> targetString;

    public Input<String> getTargetString() {
        return this.targetString == null ? Input.empty() : this.targetString;
    }

    /**
     * The formatting way for web request.
     * 
     */
    @InputImport(name="textTransformation", required=true)
      private final Input<String> textTransformation;

    public Input<String> getTextTransformation() {
        return this.textTransformation;
    }

    public ByteMatchSetByteMatchTupleArgs(
        Input<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch,
        Input<String> positionalConstraint,
        @Nullable Input<String> targetString,
        Input<String> textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
        this.targetString = targetString;
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private ByteMatchSetByteMatchTupleArgs() {
        this.fieldToMatch = Input.empty();
        this.positionalConstraint = Input.empty();
        this.targetString = Input.empty();
        this.textTransformation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByteMatchSetByteMatchTupleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch;
        private Input<String> positionalConstraint;
        private @Nullable Input<String> targetString;
        private Input<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(ByteMatchSetByteMatchTupleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.targetString = defaults.targetString;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder setFieldToMatch(Input<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setFieldToMatch(ByteMatchSetByteMatchTupleFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder setPositionalConstraint(Input<String> positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }

        public Builder setPositionalConstraint(String positionalConstraint) {
            this.positionalConstraint = Input.of(Objects.requireNonNull(positionalConstraint));
            return this;
        }

        public Builder setTargetString(@Nullable Input<String> targetString) {
            this.targetString = targetString;
            return this;
        }

        public Builder setTargetString(@Nullable String targetString) {
            this.targetString = Input.ofNullable(targetString);
            return this;
        }

        public Builder setTextTransformation(Input<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }

        public Builder setTextTransformation(String textTransformation) {
            this.textTransformation = Input.of(Objects.requireNonNull(textTransformation));
            return this;
        }
        public ByteMatchSetByteMatchTupleArgs build() {
            return new ByteMatchSetByteMatchTupleArgs(fieldToMatch, positionalConstraint, targetString, textTransformation);
        }
    }
}
