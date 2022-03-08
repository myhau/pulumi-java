// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OutputFileResponse {
    /**
     * The list of labels that describe how the encoder should multiplex video and audio into an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio layer with label a1, then an array like '[v1, a1]' tells the encoder to produce an output file with the video track represented by v1 and the audio track represented by a1.
     * 
     */
    private final List<String> labels;

    @OutputCustomType.Constructor({"labels"})
    private OutputFileResponse(List<String> labels) {
        this.labels = labels;
    }

    /**
     * The list of labels that describe how the encoder should multiplex video and audio into an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio layer with label a1, then an array like '[v1, a1]' tells the encoder to produce an output file with the video track represented by v1 and the audio track represented by a1.
     * 
    */
    public List<String> getLabels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public OutputFileResponse build() {
            return new OutputFileResponse(labels);
        }
    }
}
