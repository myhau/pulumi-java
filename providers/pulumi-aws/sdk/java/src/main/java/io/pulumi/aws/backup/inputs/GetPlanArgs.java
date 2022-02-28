// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPlanArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPlanArgs Empty = new GetPlanArgs();

    /**
     * The backup plan ID.
     * 
     */
    @InputImport(name="planId", required=true)
      private final String planId;

    public String getPlanId() {
        return this.planId;
    }

    /**
     * Metadata that you can assign to help organize the plans you create.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetPlanArgs(
        String planId,
        @Nullable Map<String,String> tags) {
        this.planId = Objects.requireNonNull(planId, "expected parameter 'planId' to be non-null");
        this.tags = tags;
    }

    private GetPlanArgs() {
        this.planId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String planId;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.planId = defaults.planId;
    	      this.tags = defaults.tags;
        }

        public Builder setPlanId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetPlanArgs build() {
            return new GetPlanArgs(planId, tags);
        }
    }
}
