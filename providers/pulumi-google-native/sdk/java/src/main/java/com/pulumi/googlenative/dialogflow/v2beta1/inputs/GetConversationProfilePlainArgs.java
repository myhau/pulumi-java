// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConversationProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConversationProfilePlainArgs Empty = new GetConversationProfilePlainArgs();

    @Import(name="conversationProfileId", required=true)
    private String conversationProfileId;

    public String conversationProfileId() {
        return this.conversationProfileId;
    }

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

    private GetConversationProfilePlainArgs() {}

    private GetConversationProfilePlainArgs(GetConversationProfilePlainArgs $) {
        this.conversationProfileId = $.conversationProfileId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConversationProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConversationProfilePlainArgs $;

        public Builder() {
            $ = new GetConversationProfilePlainArgs();
        }

        public Builder(GetConversationProfilePlainArgs defaults) {
            $ = new GetConversationProfilePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationProfileId(String conversationProfileId) {
            $.conversationProfileId = conversationProfileId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetConversationProfilePlainArgs build() {
            $.conversationProfileId = Objects.requireNonNull($.conversationProfileId, "expected parameter 'conversationProfileId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
