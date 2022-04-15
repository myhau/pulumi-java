// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.AlertRuleKind;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertRuleArgs Empty = new AlertRuleArgs();

    /**
     * The alert rule kind
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,AlertRuleKind>> kind;

    public Output<Either<String,AlertRuleKind>> kind() {
        return this.kind;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Alert rule ID
     * 
     */
    @Import(name="ruleId")
      private final @Nullable Output<String> ruleId;

    public Output<String> ruleId() {
        return this.ruleId == null ? Codegen.empty() : this.ruleId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public AlertRuleArgs(
        Output<Either<String,AlertRuleKind>> kind,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleId,
        Output<String> workspaceName) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleId = ruleId;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private AlertRuleArgs() {
        this.kind = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.ruleId = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,AlertRuleKind>> kind;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleId;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleId = defaults.ruleId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder kind(Output<Either<String,AlertRuleKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,AlertRuleKind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder ruleId(@Nullable Output<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Builder ruleId(@Nullable String ruleId) {
            this.ruleId = Codegen.ofNullable(ruleId);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public AlertRuleArgs build() {
            return new AlertRuleArgs(kind, resourceGroupName, ruleId, workspaceName);
        }
    }
}
