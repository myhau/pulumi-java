// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LongTermRetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LongTermRetentionPolicyArgs Empty = new LongTermRetentionPolicyArgs();

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The monthly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    @Import(name="monthlyRetention")
      private final @Nullable Output<String> monthlyRetention;

    public Output<String> monthlyRetention() {
        return this.monthlyRetention == null ? Codegen.empty() : this.monthlyRetention;
    }

    /**
     * The policy name. Should always be Default.
     * 
     */
    @Import(name="policyName")
      private final @Nullable Output<String> policyName;

    public Output<String> policyName() {
        return this.policyName == null ? Codegen.empty() : this.policyName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The week of year to take the yearly backup in an ISO 8601 format.
     * 
     */
    @Import(name="weekOfYear")
      private final @Nullable Output<Integer> weekOfYear;

    public Output<Integer> weekOfYear() {
        return this.weekOfYear == null ? Codegen.empty() : this.weekOfYear;
    }

    /**
     * The weekly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    @Import(name="weeklyRetention")
      private final @Nullable Output<String> weeklyRetention;

    public Output<String> weeklyRetention() {
        return this.weeklyRetention == null ? Codegen.empty() : this.weeklyRetention;
    }

    /**
     * The yearly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    @Import(name="yearlyRetention")
      private final @Nullable Output<String> yearlyRetention;

    public Output<String> yearlyRetention() {
        return this.yearlyRetention == null ? Codegen.empty() : this.yearlyRetention;
    }

    public LongTermRetentionPolicyArgs(
        Output<String> databaseName,
        @Nullable Output<String> monthlyRetention,
        @Nullable Output<String> policyName,
        Output<String> resourceGroupName,
        Output<String> serverName,
        @Nullable Output<Integer> weekOfYear,
        @Nullable Output<String> weeklyRetention,
        @Nullable Output<String> yearlyRetention) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.monthlyRetention = monthlyRetention;
        this.policyName = policyName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.weekOfYear = weekOfYear;
        this.weeklyRetention = weeklyRetention;
        this.yearlyRetention = yearlyRetention;
    }

    private LongTermRetentionPolicyArgs() {
        this.databaseName = Codegen.empty();
        this.monthlyRetention = Codegen.empty();
        this.policyName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverName = Codegen.empty();
        this.weekOfYear = Codegen.empty();
        this.weeklyRetention = Codegen.empty();
        this.yearlyRetention = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LongTermRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> databaseName;
        private @Nullable Output<String> monthlyRetention;
        private @Nullable Output<String> policyName;
        private Output<String> resourceGroupName;
        private Output<String> serverName;
        private @Nullable Output<Integer> weekOfYear;
        private @Nullable Output<String> weeklyRetention;
        private @Nullable Output<String> yearlyRetention;

        public Builder() {
    	      // Empty
        }

        public Builder(LongTermRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.monthlyRetention = defaults.monthlyRetention;
    	      this.policyName = defaults.policyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.weekOfYear = defaults.weekOfYear;
    	      this.weeklyRetention = defaults.weeklyRetention;
    	      this.yearlyRetention = defaults.yearlyRetention;
        }

        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder monthlyRetention(@Nullable Output<String> monthlyRetention) {
            this.monthlyRetention = monthlyRetention;
            return this;
        }
        public Builder monthlyRetention(@Nullable String monthlyRetention) {
            this.monthlyRetention = Codegen.ofNullable(monthlyRetention);
            return this;
        }
        public Builder policyName(@Nullable Output<String> policyName) {
            this.policyName = policyName;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = Codegen.ofNullable(policyName);
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
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }
        public Builder weekOfYear(@Nullable Output<Integer> weekOfYear) {
            this.weekOfYear = weekOfYear;
            return this;
        }
        public Builder weekOfYear(@Nullable Integer weekOfYear) {
            this.weekOfYear = Codegen.ofNullable(weekOfYear);
            return this;
        }
        public Builder weeklyRetention(@Nullable Output<String> weeklyRetention) {
            this.weeklyRetention = weeklyRetention;
            return this;
        }
        public Builder weeklyRetention(@Nullable String weeklyRetention) {
            this.weeklyRetention = Codegen.ofNullable(weeklyRetention);
            return this;
        }
        public Builder yearlyRetention(@Nullable Output<String> yearlyRetention) {
            this.yearlyRetention = yearlyRetention;
            return this;
        }
        public Builder yearlyRetention(@Nullable String yearlyRetention) {
            this.yearlyRetention = Codegen.ofNullable(yearlyRetention);
            return this;
        }        public LongTermRetentionPolicyArgs build() {
            return new LongTermRetentionPolicyArgs(databaseName, monthlyRetention, policyName, resourceGroupName, serverName, weekOfYear, weeklyRetention, yearlyRetention);
        }
    }
}
