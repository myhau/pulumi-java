// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2TableOptionsArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration to control jobs where the content being inspected is outside of Google Cloud Platform.
 * 
 */
public final class GooglePrivacyDlpV2HybridOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2HybridOptionsArgs Empty = new GooglePrivacyDlpV2HybridOptionsArgs();

    /**
     * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `&#34;environment&#34; : &#34;production&#34;` * `&#34;pipeline&#34; : &#34;etl&#34;`
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `&#34;environment&#34; : &#34;production&#34;` * `&#34;pipeline&#34; : &#34;etl&#34;`
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
     * 
     */
    @Import(name="requiredFindingLabelKeys")
    private @Nullable Output<List<String>> requiredFindingLabelKeys;

    /**
     * @return These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
     * 
     */
    public Optional<Output<List<String>>> requiredFindingLabelKeys() {
        return Optional.ofNullable(this.requiredFindingLabelKeys);
    }

    /**
     * If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
     * 
     */
    @Import(name="tableOptions")
    private @Nullable Output<GooglePrivacyDlpV2TableOptionsArgs> tableOptions;

    /**
     * @return If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2TableOptionsArgs>> tableOptions() {
        return Optional.ofNullable(this.tableOptions);
    }

    private GooglePrivacyDlpV2HybridOptionsArgs() {}

    private GooglePrivacyDlpV2HybridOptionsArgs(GooglePrivacyDlpV2HybridOptionsArgs $) {
        this.description = $.description;
        this.labels = $.labels;
        this.requiredFindingLabelKeys = $.requiredFindingLabelKeys;
        this.tableOptions = $.tableOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2HybridOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2HybridOptionsArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2HybridOptionsArgs();
        }

        public Builder(GooglePrivacyDlpV2HybridOptionsArgs defaults) {
            $ = new GooglePrivacyDlpV2HybridOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A short description of where the data is coming from. Will be stored once in the job. 256 max length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A short description of where the data is coming from. Will be stored once in the job. 256 max length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `&#34;environment&#34; : &#34;production&#34;` * `&#34;pipeline&#34; : &#34;etl&#34;`
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `&#34;environment&#34; : &#34;production&#34;` * `&#34;pipeline&#34; : &#34;etl&#34;`
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param requiredFindingLabelKeys These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
         * 
         * @return builder
         * 
         */
        public Builder requiredFindingLabelKeys(@Nullable Output<List<String>> requiredFindingLabelKeys) {
            $.requiredFindingLabelKeys = requiredFindingLabelKeys;
            return this;
        }

        /**
         * @param requiredFindingLabelKeys These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
         * 
         * @return builder
         * 
         */
        public Builder requiredFindingLabelKeys(List<String> requiredFindingLabelKeys) {
            return requiredFindingLabelKeys(Output.of(requiredFindingLabelKeys));
        }

        /**
         * @param requiredFindingLabelKeys These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
         * 
         * @return builder
         * 
         */
        public Builder requiredFindingLabelKeys(String... requiredFindingLabelKeys) {
            return requiredFindingLabelKeys(List.of(requiredFindingLabelKeys));
        }

        /**
         * @param tableOptions If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
         * 
         * @return builder
         * 
         */
        public Builder tableOptions(@Nullable Output<GooglePrivacyDlpV2TableOptionsArgs> tableOptions) {
            $.tableOptions = tableOptions;
            return this;
        }

        /**
         * @param tableOptions If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
         * 
         * @return builder
         * 
         */
        public Builder tableOptions(GooglePrivacyDlpV2TableOptionsArgs tableOptions) {
            return tableOptions(Output.of(tableOptions));
        }

        public GooglePrivacyDlpV2HybridOptionsArgs build() {
            return $;
        }
    }

}
