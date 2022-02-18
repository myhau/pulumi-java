// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs();

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cloudStoragePath")
    private final @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath;

    public Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs> getCloudStoragePath() {
        return this.cloudStoragePath == null ? Input.empty() : this.cloudStoragePath;
    }

    /**
     * List of words or phrases to search for.
     * Structure is documented below.
     * 
     */
    @InputImport(name="wordList")
    private final @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs> wordList;

    public Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs> getWordList() {
        return this.wordList == null ? Input.empty() : this.wordList;
    }

    public PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs(
        @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath,
        @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs> wordList) {
        this.cloudStoragePath = cloudStoragePath;
        this.wordList = wordList;
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs() {
        this.cloudStoragePath = Input.empty();
        this.wordList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath;
        private @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs> wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder setCloudStoragePath(@Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs> cloudStoragePath) {
            this.cloudStoragePath = cloudStoragePath;
            return this;
        }

        public Builder setCloudStoragePath(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs cloudStoragePath) {
            this.cloudStoragePath = Input.ofNullable(cloudStoragePath);
            return this;
        }

        public Builder setWordList(@Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs> wordList) {
            this.wordList = wordList;
            return this;
        }

        public Builder setWordList(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs wordList) {
            this.wordList = Input.ofNullable(wordList);
            return this;
        }

        public PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs build() {
            return new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryArgs(cloudStoragePath, wordList);
        }
    }
}
