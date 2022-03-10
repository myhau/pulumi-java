// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SymptomResponse {
    /**
     * Timestamp when the Symptom is created.
     * 
     */
    private final String createTime;
    /**
     * Detailed information of the current Symptom.
     * 
     */
    private final String details;
    /**
     * Type of the Symptom.
     * 
     */
    private final String symptomType;
    /**
     * A string used to uniquely distinguish a worker within a TPU node.
     * 
     */
    private final String workerId;

    @OutputCustomType.Constructor
    private SymptomResponse(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("details") String details,
        @OutputCustomType.Parameter("symptomType") String symptomType,
        @OutputCustomType.Parameter("workerId") String workerId) {
        this.createTime = createTime;
        this.details = details;
        this.symptomType = symptomType;
        this.workerId = workerId;
    }

    /**
     * Timestamp when the Symptom is created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Detailed information of the current Symptom.
     * 
    */
    public String getDetails() {
        return this.details;
    }
    /**
     * Type of the Symptom.
     * 
    */
    public String getSymptomType() {
        return this.symptomType;
    }
    /**
     * A string used to uniquely distinguish a worker within a TPU node.
     * 
    */
    public String getWorkerId() {
        return this.workerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SymptomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String details;
        private String symptomType;
        private String workerId;

        public Builder() {
    	      // Empty
        }

        public Builder(SymptomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.details = defaults.details;
    	      this.symptomType = defaults.symptomType;
    	      this.workerId = defaults.workerId;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDetails(String details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setSymptomType(String symptomType) {
            this.symptomType = Objects.requireNonNull(symptomType);
            return this;
        }

        public Builder setWorkerId(String workerId) {
            this.workerId = Objects.requireNonNull(workerId);
            return this;
        }
        public SymptomResponse build() {
            return new SymptomResponse(createTime, details, symptomType, workerId);
        }
    }
}
