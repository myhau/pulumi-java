// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1AnalysisResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConversationResult {
    /**
     * @return An opaque, user-specified string representing the human agent who handled the conversation.
     * 
     */
    private final String agentId;
    /**
     * @return Call-specific metadata.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse callMetadata;
    /**
     * @return The time at which the conversation was created.
     * 
     */
    private final String createTime;
    /**
     * @return The source of the audio and transcription for the conversation.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse dataSource;
    /**
     * @return All the matched Dialogflow intents in the call. The key corresponds to a Dialogflow intent, format: projects/{project}/agent/{agent}/intents/{intent}
     * 
     */
    private final Map<String,String> dialogflowIntents;
    /**
     * @return The duration of the conversation.
     * 
     */
    private final String duration;
    /**
     * @return The time at which this conversation should expire. After this time, the conversation data and any associated analyses will be deleted.
     * 
     */
    private final String expireTime;
    /**
     * @return A map for the user to specify any custom fields. A maximum of 20 labels per conversation is allowed, with a maximum of 256 characters per entry.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return A user-specified language code for the conversation.
     * 
     */
    private final String languageCode;
    /**
     * @return The conversation&#39;s latest analysis, if one exists.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1AnalysisResponse latestAnalysis;
    /**
     * @return Immutable. The conversation medium, if unspecified will default to PHONE_CALL.
     * 
     */
    private final String medium;
    /**
     * @return Immutable. The resource name of the conversation. Format: projects/{project}/locations/{location}/conversations/{conversation}
     * 
     */
    private final String name;
    /**
     * @return Obfuscated user ID which the customer sent to us.
     * 
     */
    private final String obfuscatedUserId;
    /**
     * @return The annotations that were generated during the customer and agent interaction.
     * 
     */
    private final List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> runtimeAnnotations;
    /**
     * @return The time at which the conversation started.
     * 
     */
    private final String startTime;
    /**
     * @return The conversation transcript.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse transcript;
    /**
     * @return Input only. The TTL for this resource. If specified, then this TTL will be used to calculate the expire time.
     * 
     */
    private final String ttl;
    /**
     * @return The number of turns in the conversation.
     * 
     */
    private final Integer turnCount;
    /**
     * @return The most recent time at which the conversation was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetConversationResult(
        @CustomType.Parameter("agentId") String agentId,
        @CustomType.Parameter("callMetadata") GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse callMetadata,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("dataSource") GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse dataSource,
        @CustomType.Parameter("dialogflowIntents") Map<String,String> dialogflowIntents,
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("languageCode") String languageCode,
        @CustomType.Parameter("latestAnalysis") GoogleCloudContactcenterinsightsV1AnalysisResponse latestAnalysis,
        @CustomType.Parameter("medium") String medium,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("obfuscatedUserId") String obfuscatedUserId,
        @CustomType.Parameter("runtimeAnnotations") List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> runtimeAnnotations,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("transcript") GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse transcript,
        @CustomType.Parameter("ttl") String ttl,
        @CustomType.Parameter("turnCount") Integer turnCount,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.agentId = agentId;
        this.callMetadata = callMetadata;
        this.createTime = createTime;
        this.dataSource = dataSource;
        this.dialogflowIntents = dialogflowIntents;
        this.duration = duration;
        this.expireTime = expireTime;
        this.labels = labels;
        this.languageCode = languageCode;
        this.latestAnalysis = latestAnalysis;
        this.medium = medium;
        this.name = name;
        this.obfuscatedUserId = obfuscatedUserId;
        this.runtimeAnnotations = runtimeAnnotations;
        this.startTime = startTime;
        this.transcript = transcript;
        this.ttl = ttl;
        this.turnCount = turnCount;
        this.updateTime = updateTime;
    }

    /**
     * @return An opaque, user-specified string representing the human agent who handled the conversation.
     * 
     */
    public String agentId() {
        return this.agentId;
    }
    /**
     * @return Call-specific metadata.
     * 
     */
    public GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse callMetadata() {
        return this.callMetadata;
    }
    /**
     * @return The time at which the conversation was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The source of the audio and transcription for the conversation.
     * 
     */
    public GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse dataSource() {
        return this.dataSource;
    }
    /**
     * @return All the matched Dialogflow intents in the call. The key corresponds to a Dialogflow intent, format: projects/{project}/agent/{agent}/intents/{intent}
     * 
     */
    public Map<String,String> dialogflowIntents() {
        return this.dialogflowIntents;
    }
    /**
     * @return The duration of the conversation.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return The time at which this conversation should expire. After this time, the conversation data and any associated analyses will be deleted.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return A map for the user to specify any custom fields. A maximum of 20 labels per conversation is allowed, with a maximum of 256 characters per entry.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return A user-specified language code for the conversation.
     * 
     */
    public String languageCode() {
        return this.languageCode;
    }
    /**
     * @return The conversation&#39;s latest analysis, if one exists.
     * 
     */
    public GoogleCloudContactcenterinsightsV1AnalysisResponse latestAnalysis() {
        return this.latestAnalysis;
    }
    /**
     * @return Immutable. The conversation medium, if unspecified will default to PHONE_CALL.
     * 
     */
    public String medium() {
        return this.medium;
    }
    /**
     * @return Immutable. The resource name of the conversation. Format: projects/{project}/locations/{location}/conversations/{conversation}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Obfuscated user ID which the customer sent to us.
     * 
     */
    public String obfuscatedUserId() {
        return this.obfuscatedUserId;
    }
    /**
     * @return The annotations that were generated during the customer and agent interaction.
     * 
     */
    public List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> runtimeAnnotations() {
        return this.runtimeAnnotations;
    }
    /**
     * @return The time at which the conversation started.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The conversation transcript.
     * 
     */
    public GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse transcript() {
        return this.transcript;
    }
    /**
     * @return Input only. The TTL for this resource. If specified, then this TTL will be used to calculate the expire time.
     * 
     */
    public String ttl() {
        return this.ttl;
    }
    /**
     * @return The number of turns in the conversation.
     * 
     */
    public Integer turnCount() {
        return this.turnCount;
    }
    /**
     * @return The most recent time at which the conversation was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConversationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse callMetadata;
        private String createTime;
        private GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse dataSource;
        private Map<String,String> dialogflowIntents;
        private String duration;
        private String expireTime;
        private Map<String,String> labels;
        private String languageCode;
        private GoogleCloudContactcenterinsightsV1AnalysisResponse latestAnalysis;
        private String medium;
        private String name;
        private String obfuscatedUserId;
        private List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> runtimeAnnotations;
        private String startTime;
        private GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse transcript;
        private String ttl;
        private Integer turnCount;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConversationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.callMetadata = defaults.callMetadata;
    	      this.createTime = defaults.createTime;
    	      this.dataSource = defaults.dataSource;
    	      this.dialogflowIntents = defaults.dialogflowIntents;
    	      this.duration = defaults.duration;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.languageCode = defaults.languageCode;
    	      this.latestAnalysis = defaults.latestAnalysis;
    	      this.medium = defaults.medium;
    	      this.name = defaults.name;
    	      this.obfuscatedUserId = defaults.obfuscatedUserId;
    	      this.runtimeAnnotations = defaults.runtimeAnnotations;
    	      this.startTime = defaults.startTime;
    	      this.transcript = defaults.transcript;
    	      this.ttl = defaults.ttl;
    	      this.turnCount = defaults.turnCount;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder agentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }
        public Builder callMetadata(GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse callMetadata) {
            this.callMetadata = Objects.requireNonNull(callMetadata);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder dataSource(GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }
        public Builder dialogflowIntents(Map<String,String> dialogflowIntents) {
            this.dialogflowIntents = Objects.requireNonNull(dialogflowIntents);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        public Builder latestAnalysis(GoogleCloudContactcenterinsightsV1AnalysisResponse latestAnalysis) {
            this.latestAnalysis = Objects.requireNonNull(latestAnalysis);
            return this;
        }
        public Builder medium(String medium) {
            this.medium = Objects.requireNonNull(medium);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder obfuscatedUserId(String obfuscatedUserId) {
            this.obfuscatedUserId = Objects.requireNonNull(obfuscatedUserId);
            return this;
        }
        public Builder runtimeAnnotations(List<GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse> runtimeAnnotations) {
            this.runtimeAnnotations = Objects.requireNonNull(runtimeAnnotations);
            return this;
        }
        public Builder runtimeAnnotations(GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse... runtimeAnnotations) {
            return runtimeAnnotations(List.of(runtimeAnnotations));
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder transcript(GoogleCloudContactcenterinsightsV1ConversationTranscriptResponse transcript) {
            this.transcript = Objects.requireNonNull(transcript);
            return this;
        }
        public Builder ttl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public Builder turnCount(Integer turnCount) {
            this.turnCount = Objects.requireNonNull(turnCount);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetConversationResult build() {
            return new GetConversationResult(agentId, callMetadata, createTime, dataSource, dialogflowIntents, duration, expireTime, labels, languageCode, latestAnalysis, medium, name, obfuscatedUserId, runtimeAnnotations, startTime, transcript, ttl, turnCount, updateTime);
        }
    }
}
