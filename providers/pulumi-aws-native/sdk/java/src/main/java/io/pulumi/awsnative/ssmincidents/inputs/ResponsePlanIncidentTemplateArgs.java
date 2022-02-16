// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.awsnative.ssmincidents.inputs.ResponsePlanNotificationTargetItemArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponsePlanIncidentTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponsePlanIncidentTemplateArgs Empty = new ResponsePlanIncidentTemplateArgs();

    @InputImport(name="dedupeString")
    private final @Nullable Input<String> dedupeString;

    public Input<String> getDedupeString() {
        return this.dedupeString == null ? Input.empty() : this.dedupeString;
    }

    @InputImport(name="impact", required=true)
    private final Input<Integer> impact;

    public Input<Integer> getImpact() {
        return this.impact;
    }

    @InputImport(name="notificationTargets")
    private final @Nullable Input<List<ResponsePlanNotificationTargetItemArgs>> notificationTargets;

    public Input<List<ResponsePlanNotificationTargetItemArgs>> getNotificationTargets() {
        return this.notificationTargets == null ? Input.empty() : this.notificationTargets;
    }

    @InputImport(name="summary")
    private final @Nullable Input<String> summary;

    public Input<String> getSummary() {
        return this.summary == null ? Input.empty() : this.summary;
    }

    @InputImport(name="title", required=true)
    private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    public ResponsePlanIncidentTemplateArgs(
        @Nullable Input<String> dedupeString,
        Input<Integer> impact,
        @Nullable Input<List<ResponsePlanNotificationTargetItemArgs>> notificationTargets,
        @Nullable Input<String> summary,
        Input<String> title) {
        this.dedupeString = dedupeString;
        this.impact = Objects.requireNonNull(impact, "expected parameter 'impact' to be non-null");
        this.notificationTargets = notificationTargets;
        this.summary = summary;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private ResponsePlanIncidentTemplateArgs() {
        this.dedupeString = Input.empty();
        this.impact = Input.empty();
        this.notificationTargets = Input.empty();
        this.summary = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanIncidentTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dedupeString;
        private Input<Integer> impact;
        private @Nullable Input<List<ResponsePlanNotificationTargetItemArgs>> notificationTargets;
        private @Nullable Input<String> summary;
        private Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanIncidentTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedupeString = defaults.dedupeString;
    	      this.impact = defaults.impact;
    	      this.notificationTargets = defaults.notificationTargets;
    	      this.summary = defaults.summary;
    	      this.title = defaults.title;
        }

        public Builder setDedupeString(@Nullable Input<String> dedupeString) {
            this.dedupeString = dedupeString;
            return this;
        }

        public Builder setDedupeString(@Nullable String dedupeString) {
            this.dedupeString = Input.ofNullable(dedupeString);
            return this;
        }

        public Builder setImpact(Input<Integer> impact) {
            this.impact = Objects.requireNonNull(impact);
            return this;
        }

        public Builder setImpact(Integer impact) {
            this.impact = Input.of(Objects.requireNonNull(impact));
            return this;
        }

        public Builder setNotificationTargets(@Nullable Input<List<ResponsePlanNotificationTargetItemArgs>> notificationTargets) {
            this.notificationTargets = notificationTargets;
            return this;
        }

        public Builder setNotificationTargets(@Nullable List<ResponsePlanNotificationTargetItemArgs> notificationTargets) {
            this.notificationTargets = Input.ofNullable(notificationTargets);
            return this;
        }

        public Builder setSummary(@Nullable Input<String> summary) {
            this.summary = summary;
            return this;
        }

        public Builder setSummary(@Nullable String summary) {
            this.summary = Input.ofNullable(summary);
            return this;
        }

        public Builder setTitle(Input<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Input.of(Objects.requireNonNull(title));
            return this;
        }

        public ResponsePlanIncidentTemplateArgs build() {
            return new ResponsePlanIncidentTemplateArgs(dedupeString, impact, notificationTargets, summary, title);
        }
    }
}