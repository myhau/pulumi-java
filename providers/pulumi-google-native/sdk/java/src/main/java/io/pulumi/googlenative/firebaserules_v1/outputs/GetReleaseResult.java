// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetReleaseResult {
    /**
     * Time the release was created.
     * 
     */
    private final String createTime;
    /**
     * Format: `projects/{project_id}/releases/{release_id}`
     * 
     */
    private final String name;
    /**
     * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
     * 
     */
    private final String rulesetName;
    /**
     * Time the release was updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","name","rulesetName","updateTime"})
    private GetReleaseResult(
        String createTime,
        String name,
        String rulesetName,
        String updateTime) {
        this.createTime = createTime;
        this.name = name;
        this.rulesetName = rulesetName;
        this.updateTime = updateTime;
    }

    /**
     * Time the release was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Format: `projects/{project_id}/releases/{release_id}`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
     * 
    */
    public String getRulesetName() {
        return this.rulesetName;
    }
    /**
     * Time the release was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReleaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String name;
        private String rulesetName;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReleaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.rulesetName = defaults.rulesetName;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRulesetName(String rulesetName) {
            this.rulesetName = Objects.requireNonNull(rulesetName);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetReleaseResult build() {
            return new GetReleaseResult(createTime, name, rulesetName, updateTime);
        }
    }
}
