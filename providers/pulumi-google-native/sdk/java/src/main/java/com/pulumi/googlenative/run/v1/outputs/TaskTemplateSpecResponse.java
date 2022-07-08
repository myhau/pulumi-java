// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run.v1.outputs.TaskSpecResponse;
import java.util.Objects;

@CustomType
public final class TaskTemplateSpecResponse {
    /**
     * @return Optional. Specification of the desired behavior of the task. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
     * 
     */
    private final TaskSpecResponse spec;

    @CustomType.Constructor
    private TaskTemplateSpecResponse(@CustomType.Parameter("spec") TaskSpecResponse spec) {
        this.spec = spec;
    }

    /**
     * @return Optional. Specification of the desired behavior of the task. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
     * 
     */
    public TaskSpecResponse spec() {
        return this.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskTemplateSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSpecResponse spec;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskTemplateSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spec = defaults.spec;
        }

        public Builder spec(TaskSpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }        public TaskTemplateSpecResponse build() {
            return new TaskTemplateSpecResponse(spec);
        }
    }
}
