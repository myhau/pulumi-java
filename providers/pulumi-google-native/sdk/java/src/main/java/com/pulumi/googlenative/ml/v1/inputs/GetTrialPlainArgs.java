// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrialPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrialPlainArgs Empty = new GetTrialPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="studyId", required=true)
    private String studyId;

    public String studyId() {
        return this.studyId;
    }

    @Import(name="trialId", required=true)
    private String trialId;

    public String trialId() {
        return this.trialId;
    }

    private GetTrialPlainArgs() {}

    private GetTrialPlainArgs(GetTrialPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.studyId = $.studyId;
        this.trialId = $.trialId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrialPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrialPlainArgs $;

        public Builder() {
            $ = new GetTrialPlainArgs();
        }

        public Builder(GetTrialPlainArgs defaults) {
            $ = new GetTrialPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder studyId(String studyId) {
            $.studyId = studyId;
            return this;
        }

        public Builder trialId(String trialId) {
            $.trialId = trialId;
            return this;
        }

        public GetTrialPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.studyId = Objects.requireNonNull($.studyId, "expected parameter 'studyId' to be non-null");
            $.trialId = Objects.requireNonNull($.trialId, "expected parameter 'trialId' to be non-null");
            return $;
        }
    }

}
