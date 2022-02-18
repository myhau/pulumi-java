// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxEntityTypeEntityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxEntityTypeEntityArgs Empty = new CxEntityTypeEntityArgs();

    /**
     * A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym could be green onions.
     * For KIND_LIST entity types: This collection must contain exactly one synonym equal to value.
     * 
     */
    @InputImport(name="synonyms")
    private final @Nullable Input<List<String>> synonyms;

    public Input<List<String>> getSynonyms() {
        return this.synonyms == null ? Input.empty() : this.synonyms;
    }

    /**
     * The word or phrase to be excluded.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public CxEntityTypeEntityArgs(
        @Nullable Input<List<String>> synonyms,
        @Nullable Input<String> value) {
        this.synonyms = synonyms;
        this.value = value;
    }

    private CxEntityTypeEntityArgs() {
        this.synonyms = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEntityTypeEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> synonyms;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEntityTypeEntityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder setSynonyms(@Nullable Input<List<String>> synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        public Builder setSynonyms(@Nullable List<String> synonyms) {
            this.synonyms = Input.ofNullable(synonyms);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public CxEntityTypeEntityArgs build() {
            return new CxEntityTypeEntityArgs(synonyms, value);
        }
    }
}
