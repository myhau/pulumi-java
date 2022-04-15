// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.EdifactDecimalIndicator;
import io.pulumi.azurenative.logic.enums.SegmentTerminatorSuffix;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Edifact delimiter override settings.
 * 
 */
public final class EdifactDelimiterOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactDelimiterOverrideArgs Empty = new EdifactDelimiterOverrideArgs();

    /**
     * The component separator.
     * 
     */
    @Import(name="componentSeparator", required=true)
      private final Output<Integer> componentSeparator;

    public Output<Integer> componentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @Import(name="dataElementSeparator", required=true)
      private final Output<Integer> dataElementSeparator;

    public Output<Integer> dataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The decimal point indicator.
     * 
     */
    @Import(name="decimalPointIndicator", required=true)
      private final Output<EdifactDecimalIndicator> decimalPointIndicator;

    public Output<EdifactDecimalIndicator> decimalPointIndicator() {
        return this.decimalPointIndicator;
    }

    /**
     * The message association assigned code.
     * 
     */
    @Import(name="messageAssociationAssignedCode")
      private final @Nullable Output<String> messageAssociationAssignedCode;

    public Output<String> messageAssociationAssignedCode() {
        return this.messageAssociationAssignedCode == null ? Codegen.empty() : this.messageAssociationAssignedCode;
    }

    /**
     * The message id.
     * 
     */
    @Import(name="messageId")
      private final @Nullable Output<String> messageId;

    public Output<String> messageId() {
        return this.messageId == null ? Codegen.empty() : this.messageId;
    }

    /**
     * The message release.
     * 
     */
    @Import(name="messageRelease")
      private final @Nullable Output<String> messageRelease;

    public Output<String> messageRelease() {
        return this.messageRelease == null ? Codegen.empty() : this.messageRelease;
    }

    /**
     * The message version.
     * 
     */
    @Import(name="messageVersion")
      private final @Nullable Output<String> messageVersion;

    public Output<String> messageVersion() {
        return this.messageVersion == null ? Codegen.empty() : this.messageVersion;
    }

    /**
     * The release indicator.
     * 
     */
    @Import(name="releaseIndicator", required=true)
      private final Output<Integer> releaseIndicator;

    public Output<Integer> releaseIndicator() {
        return this.releaseIndicator;
    }

    /**
     * The repetition separator.
     * 
     */
    @Import(name="repetitionSeparator", required=true)
      private final Output<Integer> repetitionSeparator;

    public Output<Integer> repetitionSeparator() {
        return this.repetitionSeparator;
    }

    /**
     * The segment terminator.
     * 
     */
    @Import(name="segmentTerminator", required=true)
      private final Output<Integer> segmentTerminator;

    public Output<Integer> segmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The segment terminator suffix.
     * 
     */
    @Import(name="segmentTerminatorSuffix", required=true)
      private final Output<SegmentTerminatorSuffix> segmentTerminatorSuffix;

    public Output<SegmentTerminatorSuffix> segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * The target namespace on which this delimiter settings has to be applied.
     * 
     */
    @Import(name="targetNamespace")
      private final @Nullable Output<String> targetNamespace;

    public Output<String> targetNamespace() {
        return this.targetNamespace == null ? Codegen.empty() : this.targetNamespace;
    }

    public EdifactDelimiterOverrideArgs(
        Output<Integer> componentSeparator,
        Output<Integer> dataElementSeparator,
        Output<EdifactDecimalIndicator> decimalPointIndicator,
        @Nullable Output<String> messageAssociationAssignedCode,
        @Nullable Output<String> messageId,
        @Nullable Output<String> messageRelease,
        @Nullable Output<String> messageVersion,
        Output<Integer> releaseIndicator,
        Output<Integer> repetitionSeparator,
        Output<Integer> segmentTerminator,
        Output<SegmentTerminatorSuffix> segmentTerminatorSuffix,
        @Nullable Output<String> targetNamespace) {
        this.componentSeparator = Objects.requireNonNull(componentSeparator, "expected parameter 'componentSeparator' to be non-null");
        this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
        this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator, "expected parameter 'decimalPointIndicator' to be non-null");
        this.messageAssociationAssignedCode = messageAssociationAssignedCode;
        this.messageId = messageId;
        this.messageRelease = messageRelease;
        this.messageVersion = messageVersion;
        this.releaseIndicator = Objects.requireNonNull(releaseIndicator, "expected parameter 'releaseIndicator' to be non-null");
        this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator, "expected parameter 'repetitionSeparator' to be non-null");
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
        this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
        this.targetNamespace = targetNamespace;
    }

    private EdifactDelimiterOverrideArgs() {
        this.componentSeparator = Codegen.empty();
        this.dataElementSeparator = Codegen.empty();
        this.decimalPointIndicator = Codegen.empty();
        this.messageAssociationAssignedCode = Codegen.empty();
        this.messageId = Codegen.empty();
        this.messageRelease = Codegen.empty();
        this.messageVersion = Codegen.empty();
        this.releaseIndicator = Codegen.empty();
        this.repetitionSeparator = Codegen.empty();
        this.segmentTerminator = Codegen.empty();
        this.segmentTerminatorSuffix = Codegen.empty();
        this.targetNamespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactDelimiterOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> componentSeparator;
        private Output<Integer> dataElementSeparator;
        private Output<EdifactDecimalIndicator> decimalPointIndicator;
        private @Nullable Output<String> messageAssociationAssignedCode;
        private @Nullable Output<String> messageId;
        private @Nullable Output<String> messageRelease;
        private @Nullable Output<String> messageVersion;
        private Output<Integer> releaseIndicator;
        private Output<Integer> repetitionSeparator;
        private Output<Integer> segmentTerminator;
        private Output<SegmentTerminatorSuffix> segmentTerminatorSuffix;
        private @Nullable Output<String> targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactDelimiterOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.decimalPointIndicator = defaults.decimalPointIndicator;
    	      this.messageAssociationAssignedCode = defaults.messageAssociationAssignedCode;
    	      this.messageId = defaults.messageId;
    	      this.messageRelease = defaults.messageRelease;
    	      this.messageVersion = defaults.messageVersion;
    	      this.releaseIndicator = defaults.releaseIndicator;
    	      this.repetitionSeparator = defaults.repetitionSeparator;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.segmentTerminatorSuffix = defaults.segmentTerminatorSuffix;
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder componentSeparator(Output<Integer> componentSeparator) {
            this.componentSeparator = Objects.requireNonNull(componentSeparator);
            return this;
        }
        public Builder componentSeparator(Integer componentSeparator) {
            this.componentSeparator = Output.of(Objects.requireNonNull(componentSeparator));
            return this;
        }
        public Builder dataElementSeparator(Output<Integer> dataElementSeparator) {
            this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator);
            return this;
        }
        public Builder dataElementSeparator(Integer dataElementSeparator) {
            this.dataElementSeparator = Output.of(Objects.requireNonNull(dataElementSeparator));
            return this;
        }
        public Builder decimalPointIndicator(Output<EdifactDecimalIndicator> decimalPointIndicator) {
            this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator);
            return this;
        }
        public Builder decimalPointIndicator(EdifactDecimalIndicator decimalPointIndicator) {
            this.decimalPointIndicator = Output.of(Objects.requireNonNull(decimalPointIndicator));
            return this;
        }
        public Builder messageAssociationAssignedCode(@Nullable Output<String> messageAssociationAssignedCode) {
            this.messageAssociationAssignedCode = messageAssociationAssignedCode;
            return this;
        }
        public Builder messageAssociationAssignedCode(@Nullable String messageAssociationAssignedCode) {
            this.messageAssociationAssignedCode = Codegen.ofNullable(messageAssociationAssignedCode);
            return this;
        }
        public Builder messageId(@Nullable Output<String> messageId) {
            this.messageId = messageId;
            return this;
        }
        public Builder messageId(@Nullable String messageId) {
            this.messageId = Codegen.ofNullable(messageId);
            return this;
        }
        public Builder messageRelease(@Nullable Output<String> messageRelease) {
            this.messageRelease = messageRelease;
            return this;
        }
        public Builder messageRelease(@Nullable String messageRelease) {
            this.messageRelease = Codegen.ofNullable(messageRelease);
            return this;
        }
        public Builder messageVersion(@Nullable Output<String> messageVersion) {
            this.messageVersion = messageVersion;
            return this;
        }
        public Builder messageVersion(@Nullable String messageVersion) {
            this.messageVersion = Codegen.ofNullable(messageVersion);
            return this;
        }
        public Builder releaseIndicator(Output<Integer> releaseIndicator) {
            this.releaseIndicator = Objects.requireNonNull(releaseIndicator);
            return this;
        }
        public Builder releaseIndicator(Integer releaseIndicator) {
            this.releaseIndicator = Output.of(Objects.requireNonNull(releaseIndicator));
            return this;
        }
        public Builder repetitionSeparator(Output<Integer> repetitionSeparator) {
            this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator);
            return this;
        }
        public Builder repetitionSeparator(Integer repetitionSeparator) {
            this.repetitionSeparator = Output.of(Objects.requireNonNull(repetitionSeparator));
            return this;
        }
        public Builder segmentTerminator(Output<Integer> segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }
        public Builder segmentTerminator(Integer segmentTerminator) {
            this.segmentTerminator = Output.of(Objects.requireNonNull(segmentTerminator));
            return this;
        }
        public Builder segmentTerminatorSuffix(Output<SegmentTerminatorSuffix> segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix);
            return this;
        }
        public Builder segmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Output.of(Objects.requireNonNull(segmentTerminatorSuffix));
            return this;
        }
        public Builder targetNamespace(@Nullable Output<String> targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }
        public Builder targetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = Codegen.ofNullable(targetNamespace);
            return this;
        }        public EdifactDelimiterOverrideArgs build() {
            return new EdifactDelimiterOverrideArgs(componentSeparator, dataElementSeparator, decimalPointIndicator, messageAssociationAssignedCode, messageId, messageRelease, messageVersion, releaseIndicator, repetitionSeparator, segmentTerminator, segmentTerminatorSuffix, targetNamespace);
        }
    }
}
