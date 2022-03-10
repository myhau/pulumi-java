// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.clouddeploy_v1.outputs.PipelineConditionResponse;
import io.pulumi.googlenative.clouddeploy_v1.outputs.SerialPipelineResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class DeliveryPipelineResponse {
    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * Information around the state of the Delivery Pipeline.
     * 
     */
    private final PipelineConditionResponse condition;
    /**
     * Time at which the pipeline was created.
     * 
     */
    private final String createTime;
    /**
     * Description of the `DeliveryPipeline`. Max length is 255 characters.
     * 
     */
    private final String description;
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Optional. Name of the `DeliveryPipeline`. Format is projects/{project}/ locations/{location}/deliveryPipelines/a-z{0,62}.
     * 
     */
    private final String name;
    /**
     * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
     * 
     */
    private final SerialPipelineResponse serialPipeline;
    /**
     * Unique identifier of the `DeliveryPipeline`.
     * 
     */
    private final String uid;
    /**
     * Most recent time at which the pipeline was updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private DeliveryPipelineResponse(
        @OutputCustomType.Parameter("annotations") Map<String,String> annotations,
        @OutputCustomType.Parameter("condition") PipelineConditionResponse condition,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("serialPipeline") SerialPipelineResponse serialPipeline,
        @OutputCustomType.Parameter("uid") String uid,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.annotations = annotations;
        this.condition = condition;
        this.createTime = createTime;
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.name = name;
        this.serialPipeline = serialPipeline;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
    */
    public Map<String,String> getAnnotations() {
        return this.annotations;
    }
    /**
     * Information around the state of the Delivery Pipeline.
     * 
    */
    public PipelineConditionResponse getCondition() {
        return this.condition;
    }
    /**
     * Time at which the pipeline was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Description of the `DeliveryPipeline`. Max length is 255 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Name of the `DeliveryPipeline`. Format is projects/{project}/ locations/{location}/deliveryPipelines/a-z{0,62}.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
     * 
    */
    public SerialPipelineResponse getSerialPipeline() {
        return this.serialPipeline;
    }
    /**
     * Unique identifier of the `DeliveryPipeline`.
     * 
    */
    public String getUid() {
        return this.uid;
    }
    /**
     * Most recent time at which the pipeline was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private PipelineConditionResponse condition;
        private String createTime;
        private String description;
        private String etag;
        private Map<String,String> labels;
        private String name;
        private SerialPipelineResponse serialPipeline;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryPipelineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.condition = defaults.condition;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.serialPipeline = defaults.serialPipeline;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAnnotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder setCondition(PipelineConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSerialPipeline(SerialPipelineResponse serialPipeline) {
            this.serialPipeline = Objects.requireNonNull(serialPipeline);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public DeliveryPipelineResponse build() {
            return new DeliveryPipelineResponse(annotations, condition, createTime, description, etag, labels, name, serialPipeline, uid, updateTime);
        }
    }
}
