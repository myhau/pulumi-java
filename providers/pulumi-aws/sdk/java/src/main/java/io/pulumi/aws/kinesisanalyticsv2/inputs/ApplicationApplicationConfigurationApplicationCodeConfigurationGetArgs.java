// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs Empty = new ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs();

    /**
     * The location and type of the application code.
     * 
     */
    @InputImport(name="codeContent")
      private final @Nullable Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs> codeContent;

    public Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs> getCodeContent() {
        return this.codeContent == null ? Input.empty() : this.codeContent;
    }

    /**
     * Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
     * 
     */
    @InputImport(name="codeContentType", required=true)
      private final Input<String> codeContentType;

    public Input<String> getCodeContentType() {
        return this.codeContentType;
    }

    public ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs(
        @Nullable Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs> codeContent,
        Input<String> codeContentType) {
        this.codeContent = codeContent;
        this.codeContentType = Objects.requireNonNull(codeContentType, "expected parameter 'codeContentType' to be non-null");
    }

    private ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs() {
        this.codeContent = Input.empty();
        this.codeContentType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs> codeContent;
        private Input<String> codeContentType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeContent = defaults.codeContent;
    	      this.codeContentType = defaults.codeContentType;
        }

        public Builder setCodeContent(@Nullable Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs> codeContent) {
            this.codeContent = codeContent;
            return this;
        }

        public Builder setCodeContent(@Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs codeContent) {
            this.codeContent = Input.ofNullable(codeContent);
            return this;
        }

        public Builder setCodeContentType(Input<String> codeContentType) {
            this.codeContentType = Objects.requireNonNull(codeContentType);
            return this;
        }

        public Builder setCodeContentType(String codeContentType) {
            this.codeContentType = Input.of(Objects.requireNonNull(codeContentType));
            return this;
        }
        public ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs(codeContent, codeContentType);
        }
    }
}
