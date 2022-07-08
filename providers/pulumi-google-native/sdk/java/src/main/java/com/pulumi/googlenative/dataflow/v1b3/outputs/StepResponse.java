// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class StepResponse {
    /**
     * @return The kind of step in the Cloud Dataflow job.
     * 
     */
    private final String kind;
    /**
     * @return The name that identifies the step. This must be unique for each step with respect to all other steps in the Cloud Dataflow job.
     * 
     */
    private final String name;
    /**
     * @return Named properties associated with the step. Each kind of predefined step has its own required set of properties. Must be provided on Create. Only retrieved with JOB_VIEW_ALL.
     * 
     */
    private final Map<String,String> properties;

    @CustomType.Constructor
    private StepResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") Map<String,String> properties) {
        this.kind = kind;
        this.name = name;
        this.properties = properties;
    }

    /**
     * @return The kind of step in the Cloud Dataflow job.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name that identifies the step. This must be unique for each step with respect to all other steps in the Cloud Dataflow job.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Named properties associated with the step. Each kind of predefined step has its own required set of properties. Must be provided on Create. Only retrieved with JOB_VIEW_ALL.
     * 
     */
    public Map<String,String> properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String name;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(StepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public StepResponse build() {
            return new StepResponse(kind, name, properties);
        }
    }
}
