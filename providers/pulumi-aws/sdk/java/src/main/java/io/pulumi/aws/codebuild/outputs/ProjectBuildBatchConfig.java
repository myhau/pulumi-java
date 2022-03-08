// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.aws.codebuild.outputs.ProjectBuildBatchConfigRestrictions;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectBuildBatchConfig {
    /**
     * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * 
     */
    private final @Nullable Boolean combineArtifacts;
    /**
     * Specifies the restrictions for the batch build.
     * 
     */
    private final @Nullable ProjectBuildBatchConfigRestrictions restrictions;
    /**
     * Specifies the service role ARN for the batch build project.
     * 
     */
    private final String serviceRole;
    /**
     * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * 
     */
    private final @Nullable Integer timeoutInMins;

    @OutputCustomType.Constructor({"combineArtifacts","restrictions","serviceRole","timeoutInMins"})
    private ProjectBuildBatchConfig(
        @Nullable Boolean combineArtifacts,
        @Nullable ProjectBuildBatchConfigRestrictions restrictions,
        String serviceRole,
        @Nullable Integer timeoutInMins) {
        this.combineArtifacts = combineArtifacts;
        this.restrictions = restrictions;
        this.serviceRole = serviceRole;
        this.timeoutInMins = timeoutInMins;
    }

    /**
     * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * 
    */
    public Optional<Boolean> getCombineArtifacts() {
        return Optional.ofNullable(this.combineArtifacts);
    }
    /**
     * Specifies the restrictions for the batch build.
     * 
    */
    public Optional<ProjectBuildBatchConfigRestrictions> getRestrictions() {
        return Optional.ofNullable(this.restrictions);
    }
    /**
     * Specifies the service role ARN for the batch build project.
     * 
    */
    public String getServiceRole() {
        return this.serviceRole;
    }
    /**
     * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * 
    */
    public Optional<Integer> getTimeoutInMins() {
        return Optional.ofNullable(this.timeoutInMins);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectBuildBatchConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean combineArtifacts;
        private @Nullable ProjectBuildBatchConfigRestrictions restrictions;
        private String serviceRole;
        private @Nullable Integer timeoutInMins;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectBuildBatchConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combineArtifacts = defaults.combineArtifacts;
    	      this.restrictions = defaults.restrictions;
    	      this.serviceRole = defaults.serviceRole;
    	      this.timeoutInMins = defaults.timeoutInMins;
        }

        public Builder setCombineArtifacts(@Nullable Boolean combineArtifacts) {
            this.combineArtifacts = combineArtifacts;
            return this;
        }

        public Builder setRestrictions(@Nullable ProjectBuildBatchConfigRestrictions restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        public Builder setServiceRole(String serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }

        public Builder setTimeoutInMins(@Nullable Integer timeoutInMins) {
            this.timeoutInMins = timeoutInMins;
            return this;
        }
        public ProjectBuildBatchConfig build() {
            return new ProjectBuildBatchConfig(combineArtifacts, restrictions, serviceRole, timeoutInMins);
        }
    }
}
