// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.inputs.EmailTemplateParametersContractPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EmailTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final EmailTemplateArgs Empty = new EmailTemplateArgs();

    /**
     * Email Template Body. This should be a valid XDocument
     * 
     */
    @Import(name="body")
      private final @Nullable Output<String> body;

    public Output<String> body() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * Description of the Email Template.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Email Template Parameter values.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<EmailTemplateParametersContractPropertiesArgs>> parameters;

    public Output<List<EmailTemplateParametersContractPropertiesArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Subject of the Template.
     * 
     */
    @Import(name="subject")
      private final @Nullable Output<String> subject;

    public Output<String> subject() {
        return this.subject == null ? Codegen.empty() : this.subject;
    }

    /**
     * Email Template Name Identifier.
     * 
     */
    @Import(name="templateName")
      private final @Nullable Output<String> templateName;

    public Output<String> templateName() {
        return this.templateName == null ? Codegen.empty() : this.templateName;
    }

    /**
     * Title of the Template.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> title() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    public EmailTemplateArgs(
        @Nullable Output<String> body,
        @Nullable Output<String> description,
        @Nullable Output<List<EmailTemplateParametersContractPropertiesArgs>> parameters,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        @Nullable Output<String> subject,
        @Nullable Output<String> templateName,
        @Nullable Output<String> title) {
        this.body = body;
        this.description = description;
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.subject = subject;
        this.templateName = templateName;
        this.title = title;
    }

    private EmailTemplateArgs() {
        this.body = Codegen.empty();
        this.description = Codegen.empty();
        this.parameters = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.subject = Codegen.empty();
        this.templateName = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> body;
        private @Nullable Output<String> description;
        private @Nullable Output<List<EmailTemplateParametersContractPropertiesArgs>> parameters;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private @Nullable Output<String> subject;
        private @Nullable Output<String> templateName;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.description = defaults.description;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.subject = defaults.subject;
    	      this.templateName = defaults.templateName;
    	      this.title = defaults.title;
        }

        public Builder body(@Nullable Output<String> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable String body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder parameters(@Nullable Output<List<EmailTemplateParametersContractPropertiesArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<EmailTemplateParametersContractPropertiesArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(EmailTemplateParametersContractPropertiesArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder subject(@Nullable Output<String> subject) {
            this.subject = subject;
            return this;
        }
        public Builder subject(@Nullable String subject) {
            this.subject = Codegen.ofNullable(subject);
            return this;
        }
        public Builder templateName(@Nullable Output<String> templateName) {
            this.templateName = templateName;
            return this;
        }
        public Builder templateName(@Nullable String templateName) {
            this.templateName = Codegen.ofNullable(templateName);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }        public EmailTemplateArgs build() {
            return new EmailTemplateArgs(body, description, parameters, resourceGroupName, serviceName, subject, templateName, title);
        }
    }
}
