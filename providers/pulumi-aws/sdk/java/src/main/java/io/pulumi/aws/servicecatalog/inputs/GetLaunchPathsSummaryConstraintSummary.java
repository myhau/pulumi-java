// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchPathsSummaryConstraintSummary extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchPathsSummaryConstraintSummary Empty = new GetLaunchPathsSummaryConstraintSummary();

    /**
     * Description of the constraint.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GetLaunchPathsSummaryConstraintSummary(
        String description,
        String type) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetLaunchPathsSummaryConstraintSummary() {
        this.description = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchPathsSummaryConstraintSummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchPathsSummaryConstraintSummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.type = defaults.type;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetLaunchPathsSummaryConstraintSummary build() {
            return new GetLaunchPathsSummaryConstraintSummary(description, type);
        }
    }
}
