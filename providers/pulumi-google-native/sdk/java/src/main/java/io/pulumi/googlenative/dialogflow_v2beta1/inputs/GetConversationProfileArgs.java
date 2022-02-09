// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConversationProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConversationProfileArgs Empty = new GetConversationProfileArgs();

    @InputImport(name="conversationProfileId", required=true)
    private final String conversationProfileId;

    public String getConversationProfileId() {
        return this.conversationProfileId;
    }

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetConversationProfileArgs(
        String conversationProfileId,
        String location,
        @Nullable String project) {
        this.conversationProfileId = Objects.requireNonNull(conversationProfileId, "expected parameter 'conversationProfileId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetConversationProfileArgs() {
        this.conversationProfileId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConversationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String conversationProfileId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConversationProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationProfileId = defaults.conversationProfileId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setConversationProfileId(String conversationProfileId) {
            this.conversationProfileId = Objects.requireNonNull(conversationProfileId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetConversationProfileArgs build() {
            return new GetConversationProfileArgs(conversationProfileId, location, project);
        }
    }
}