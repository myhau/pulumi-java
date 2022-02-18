// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.diagflow.outputs.CxIntentTrainingPhrasePart;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxIntentTrainingPhrase {
    /**
     * The unique identifier of the parameter. This field is used by training phrases to annotate their parts.
     * 
     */
    private final @Nullable String id;
    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase.
     * Note: The API does not automatically annotate training phrases like the Dialogflow Console does.
     * Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated.
     * If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set.
     * If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways:
     * Part.text is set to a part of the phrase that has no parameters.
     * Part.text is set to a part of the phrase that you want to annotate, and the parameterId field is set.
     * Structure is documented below.
     * 
     */
    private final List<CxIntentTrainingPhrasePart> parts;
    /**
     * Indicates how many times this example was added to the intent.
     * 
     */
    private final @Nullable Integer repeatCount;

    @OutputCustomType.Constructor({"id","parts","repeatCount"})
    private CxIntentTrainingPhrase(
        @Nullable String id,
        List<CxIntentTrainingPhrasePart> parts,
        @Nullable Integer repeatCount) {
        this.id = id;
        this.parts = Objects.requireNonNull(parts);
        this.repeatCount = repeatCount;
    }

    /**
     * The unique identifier of the parameter. This field is used by training phrases to annotate their parts.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase.
     * Note: The API does not automatically annotate training phrases like the Dialogflow Console does.
     * Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated.
     * If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set.
     * If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways:
     * Part.text is set to a part of the phrase that has no parameters.
     * Part.text is set to a part of the phrase that you want to annotate, and the parameterId field is set.
     * Structure is documented below.
     * 
     */
    public List<CxIntentTrainingPhrasePart> getParts() {
        return this.parts;
    }
    /**
     * Indicates how many times this example was added to the intent.
     * 
     */
    public Optional<Integer> getRepeatCount() {
        return Optional.ofNullable(this.repeatCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxIntentTrainingPhrase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private List<CxIntentTrainingPhrasePart> parts;
        private @Nullable Integer repeatCount;

        public Builder() {
    	      // Empty
        }

        public Builder(CxIntentTrainingPhrase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parts = defaults.parts;
    	      this.repeatCount = defaults.repeatCount;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setParts(List<CxIntentTrainingPhrasePart> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder setRepeatCount(@Nullable Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }

        public CxIntentTrainingPhrase build() {
            return new CxIntentTrainingPhrase(id, parts, repeatCount);
        }
    }
}
