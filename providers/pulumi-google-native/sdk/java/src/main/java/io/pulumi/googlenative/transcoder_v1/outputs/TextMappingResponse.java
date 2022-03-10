// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TextMappingResponse {
    /**
     * The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
     * 
     */
    private final String atomKey;
    /**
     * The `Input.key` that identifies the input file.
     * 
     */
    private final String inputKey;
    /**
     * The zero-based index of the track in the input file.
     * 
     */
    private final Integer inputTrack;

    @OutputCustomType.Constructor
    private TextMappingResponse(
        @OutputCustomType.Parameter("atomKey") String atomKey,
        @OutputCustomType.Parameter("inputKey") String inputKey,
        @OutputCustomType.Parameter("inputTrack") Integer inputTrack) {
        this.atomKey = atomKey;
        this.inputKey = inputKey;
        this.inputTrack = inputTrack;
    }

    /**
     * The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
     * 
    */
    public String getAtomKey() {
        return this.atomKey;
    }
    /**
     * The `Input.key` that identifies the input file.
     * 
    */
    public String getInputKey() {
        return this.inputKey;
    }
    /**
     * The zero-based index of the track in the input file.
     * 
    */
    public Integer getInputTrack() {
        return this.inputTrack;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TextMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String atomKey;
        private String inputKey;
        private Integer inputTrack;

        public Builder() {
    	      // Empty
        }

        public Builder(TextMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atomKey = defaults.atomKey;
    	      this.inputKey = defaults.inputKey;
    	      this.inputTrack = defaults.inputTrack;
        }

        public Builder setAtomKey(String atomKey) {
            this.atomKey = Objects.requireNonNull(atomKey);
            return this;
        }

        public Builder setInputKey(String inputKey) {
            this.inputKey = Objects.requireNonNull(inputKey);
            return this;
        }

        public Builder setInputTrack(Integer inputTrack) {
            this.inputTrack = Objects.requireNonNull(inputTrack);
            return this;
        }
        public TextMappingResponse build() {
            return new TextMappingResponse(atomKey, inputKey, inputTrack);
        }
    }
}
