// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1CallAnnotationResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1IssueModelResultResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse Empty = new GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse();

    @InputImport(name="annotations", required=true)
    private final List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> annotations;

    public List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> getAnnotations() {
        return this.annotations;
    }

    @InputImport(name="entities", required=true)
    private final Map<String,String> entities;

    public Map<String,String> getEntities() {
        return this.entities;
    }

    @InputImport(name="intents", required=true)
    private final Map<String,String> intents;

    public Map<String,String> getIntents() {
        return this.intents;
    }

    @InputImport(name="issueModelResult", required=true)
    private final GoogleCloudContactcenterinsightsV1IssueModelResultResponse issueModelResult;

    public GoogleCloudContactcenterinsightsV1IssueModelResultResponse getIssueModelResult() {
        return this.issueModelResult;
    }

    @InputImport(name="phraseMatchers", required=true)
    private final Map<String,String> phraseMatchers;

    public Map<String,String> getPhraseMatchers() {
        return this.phraseMatchers;
    }

    @InputImport(name="sentiments", required=true)
    private final List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> sentiments;

    public List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> getSentiments() {
        return this.sentiments;
    }

    public GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse(
        List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> annotations,
        Map<String,String> entities,
        Map<String,String> intents,
        GoogleCloudContactcenterinsightsV1IssueModelResultResponse issueModelResult,
        Map<String,String> phraseMatchers,
        List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> sentiments) {
        this.annotations = Objects.requireNonNull(annotations, "expected parameter 'annotations' to be non-null");
        this.entities = Objects.requireNonNull(entities, "expected parameter 'entities' to be non-null");
        this.intents = Objects.requireNonNull(intents, "expected parameter 'intents' to be non-null");
        this.issueModelResult = Objects.requireNonNull(issueModelResult, "expected parameter 'issueModelResult' to be non-null");
        this.phraseMatchers = Objects.requireNonNull(phraseMatchers, "expected parameter 'phraseMatchers' to be non-null");
        this.sentiments = Objects.requireNonNull(sentiments, "expected parameter 'sentiments' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse() {
        this.annotations = List.of();
        this.entities = Map.of();
        this.intents = Map.of();
        this.issueModelResult = null;
        this.phraseMatchers = Map.of();
        this.sentiments = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> annotations;
        private Map<String,String> entities;
        private Map<String,String> intents;
        private GoogleCloudContactcenterinsightsV1IssueModelResultResponse issueModelResult;
        private Map<String,String> phraseMatchers;
        private List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> sentiments;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.entities = defaults.entities;
    	      this.intents = defaults.intents;
    	      this.issueModelResult = defaults.issueModelResult;
    	      this.phraseMatchers = defaults.phraseMatchers;
    	      this.sentiments = defaults.sentiments;
        }

        public Builder setAnnotations(List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder setEntities(Map<String,String> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }

        public Builder setIntents(Map<String,String> intents) {
            this.intents = Objects.requireNonNull(intents);
            return this;
        }

        public Builder setIssueModelResult(GoogleCloudContactcenterinsightsV1IssueModelResultResponse issueModelResult) {
            this.issueModelResult = Objects.requireNonNull(issueModelResult);
            return this;
        }

        public Builder setPhraseMatchers(Map<String,String> phraseMatchers) {
            this.phraseMatchers = Objects.requireNonNull(phraseMatchers);
            return this;
        }

        public Builder setSentiments(List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> sentiments) {
            this.sentiments = Objects.requireNonNull(sentiments);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse build() {
            return new GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse(annotations, entities, intents, issueModelResult, phraseMatchers, sentiments);
        }
    }
}