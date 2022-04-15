// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetComputePolicyResult {
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The maximum degree of parallelism per job this user can use to submit jobs.
     * 
     */
    private final Integer maxDegreeOfParallelismPerJob;
    /**
     * The minimum priority per job this user can use to submit jobs.
     * 
     */
    private final Integer minPriorityPerJob;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The AAD object identifier for the entity to create a policy for.
     * 
     */
    private final String objectId;
    /**
     * The type of AAD object the object identifier refers to.
     * 
     */
    private final String objectType;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetComputePolicyResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("maxDegreeOfParallelismPerJob") Integer maxDegreeOfParallelismPerJob,
        @CustomType.Parameter("minPriorityPerJob") Integer minPriorityPerJob,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("objectId") String objectId,
        @CustomType.Parameter("objectType") String objectType,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        this.minPriorityPerJob = minPriorityPerJob;
        this.name = name;
        this.objectId = objectId;
        this.objectType = objectType;
        this.type = type;
    }

    /**
     * The resource identifier.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The maximum degree of parallelism per job this user can use to submit jobs.
     * 
    */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }
    /**
     * The minimum priority per job this user can use to submit jobs.
     * 
    */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }
    /**
     * The resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The AAD object identifier for the entity to create a policy for.
     * 
    */
    public String objectId() {
        return this.objectId;
    }
    /**
     * The type of AAD object the object identifier refers to.
     * 
    */
    public String objectType() {
        return this.objectType;
    }
    /**
     * The resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComputePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Integer maxDegreeOfParallelismPerJob;
        private Integer minPriorityPerJob;
        private String name;
        private String objectId;
        private String objectType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComputePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.maxDegreeOfParallelismPerJob = defaults.maxDegreeOfParallelismPerJob;
    	      this.minPriorityPerJob = defaults.minPriorityPerJob;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.objectType = defaults.objectType;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder maxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
            this.maxDegreeOfParallelismPerJob = Objects.requireNonNull(maxDegreeOfParallelismPerJob);
            return this;
        }
        public Builder minPriorityPerJob(Integer minPriorityPerJob) {
            this.minPriorityPerJob = Objects.requireNonNull(minPriorityPerJob);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetComputePolicyResult build() {
            return new GetComputePolicyResult(id, maxDegreeOfParallelismPerJob, minPriorityPerJob, name, objectId, objectType, type);
        }
    }
}
