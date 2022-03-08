// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse {
    /**
     * A confidence estimate between 0.0 and 1.0 of the fidelity of this word. A default value of 0.0 indicates that the value is unset.
     * 
     */
    private final Double confidence;
    /**
     * Time offset of the end of this word relative to the beginning of the total conversation.
     * 
     */
    private final String endOffset;
    /**
     * Time offset of the start of this word relative to the beginning of the total conversation.
     * 
     */
    private final String startOffset;
    /**
     * The word itself. Includes punctuation marks that surround the word.
     * 
     */
    private final String word;

    @OutputCustomType.Constructor({"confidence","endOffset","startOffset","word"})
    private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse(
        Double confidence,
        String endOffset,
        String startOffset,
        String word) {
        this.confidence = confidence;
        this.endOffset = endOffset;
        this.startOffset = startOffset;
        this.word = word;
    }

    /**
     * A confidence estimate between 0.0 and 1.0 of the fidelity of this word. A default value of 0.0 indicates that the value is unset.
     * 
    */
    public Double getConfidence() {
        return this.confidence;
    }
    /**
     * Time offset of the end of this word relative to the beginning of the total conversation.
     * 
    */
    public String getEndOffset() {
        return this.endOffset;
    }
    /**
     * Time offset of the start of this word relative to the beginning of the total conversation.
     * 
    */
    public String getStartOffset() {
        return this.startOffset;
    }
    /**
     * The word itself. Includes punctuation marks that surround the word.
     * 
    */
    public String getWord() {
        return this.word;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidence;
        private String endOffset;
        private String startOffset;
        private String word;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidence = defaults.confidence;
    	      this.endOffset = defaults.endOffset;
    	      this.startOffset = defaults.startOffset;
    	      this.word = defaults.word;
        }

        public Builder setConfidence(Double confidence) {
            this.confidence = Objects.requireNonNull(confidence);
            return this;
        }

        public Builder setEndOffset(String endOffset) {
            this.endOffset = Objects.requireNonNull(endOffset);
            return this;
        }

        public Builder setStartOffset(String startOffset) {
            this.startOffset = Objects.requireNonNull(startOffset);
            return this;
        }

        public Builder setWord(String word) {
            this.word = Objects.requireNonNull(word);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse(confidence, endOffset, startOffset, word);
        }
    }
}
