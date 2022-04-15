// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.containerregistry.enums.WebhookAction;
import io.pulumi.azurenative.containerregistry.enums.WebhookStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * The list of actions that trigger the webhook to post notifications.
     * 
     */
    @Import(name="actions", required=true)
      private final Output<List<Either<String,WebhookAction>>> actions;

    public Output<List<Either<String,WebhookAction>>> actions() {
        return this.actions;
    }

    /**
     * Custom headers that will be added to the webhook notifications.
     * 
     */
    @Import(name="customHeaders")
      private final @Nullable Output<Map<String,String>> customHeaders;

    public Output<Map<String,String>> customHeaders() {
        return this.customHeaders == null ? Codegen.empty() : this.customHeaders;
    }

    /**
     * The location of the webhook. This cannot be changed after the resource is created.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
      private final Output<String> registryName;

    public Output<String> registryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    /**
     * The service URI for the webhook to post notifications.
     * 
     */
    @Import(name="serviceUri", required=true)
      private final Output<String> serviceUri;

    public Output<String> serviceUri() {
        return this.serviceUri;
    }

    /**
     * The status of the webhook at the time the operation was called.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,WebhookStatus>> status;

    public Output<Either<String,WebhookStatus>> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * The tags for the webhook.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The name of the webhook.
     * 
     */
    @Import(name="webhookName")
      private final @Nullable Output<String> webhookName;

    public Output<String> webhookName() {
        return this.webhookName == null ? Codegen.empty() : this.webhookName;
    }

    public WebhookArgs(
        Output<List<Either<String,WebhookAction>>> actions,
        @Nullable Output<Map<String,String>> customHeaders,
        @Nullable Output<String> location,
        Output<String> registryName,
        Output<String> resourceGroupName,
        @Nullable Output<String> scope,
        Output<String> serviceUri,
        @Nullable Output<Either<String,WebhookStatus>> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> webhookName) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.customHeaders = customHeaders;
        this.location = location;
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = scope;
        this.serviceUri = Objects.requireNonNull(serviceUri, "expected parameter 'serviceUri' to be non-null");
        this.status = status;
        this.tags = tags;
        this.webhookName = webhookName;
    }

    private WebhookArgs() {
        this.actions = Codegen.empty();
        this.customHeaders = Codegen.empty();
        this.location = Codegen.empty();
        this.registryName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.scope = Codegen.empty();
        this.serviceUri = Codegen.empty();
        this.status = Codegen.empty();
        this.tags = Codegen.empty();
        this.webhookName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<Either<String,WebhookAction>>> actions;
        private @Nullable Output<Map<String,String>> customHeaders;
        private @Nullable Output<String> location;
        private Output<String> registryName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> scope;
        private Output<String> serviceUri;
        private @Nullable Output<Either<String,WebhookStatus>> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> webhookName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.customHeaders = defaults.customHeaders;
    	      this.location = defaults.location;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.serviceUri = defaults.serviceUri;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.webhookName = defaults.webhookName;
        }

        public Builder actions(Output<List<Either<String,WebhookAction>>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(List<Either<String,WebhookAction>> actions) {
            this.actions = Output.of(Objects.requireNonNull(actions));
            return this;
        }
        public Builder actions(Either<String,WebhookAction>... actions) {
            return actions(List.of(actions));
        }
        public Builder customHeaders(@Nullable Output<Map<String,String>> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public Builder customHeaders(@Nullable Map<String,String> customHeaders) {
            this.customHeaders = Codegen.ofNullable(customHeaders);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder registryName(Output<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }
        public Builder registryName(String registryName) {
            this.registryName = Output.of(Objects.requireNonNull(registryName));
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
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }
        public Builder serviceUri(Output<String> serviceUri) {
            this.serviceUri = Objects.requireNonNull(serviceUri);
            return this;
        }
        public Builder serviceUri(String serviceUri) {
            this.serviceUri = Output.of(Objects.requireNonNull(serviceUri));
            return this;
        }
        public Builder status(@Nullable Output<Either<String,WebhookStatus>> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Either<String,WebhookStatus> status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder webhookName(@Nullable Output<String> webhookName) {
            this.webhookName = webhookName;
            return this;
        }
        public Builder webhookName(@Nullable String webhookName) {
            this.webhookName = Codegen.ofNullable(webhookName);
            return this;
        }        public WebhookArgs build() {
            return new WebhookArgs(actions, customHeaders, location, registryName, resourceGroupName, scope, serviceUri, status, tags, webhookName);
        }
    }
}
