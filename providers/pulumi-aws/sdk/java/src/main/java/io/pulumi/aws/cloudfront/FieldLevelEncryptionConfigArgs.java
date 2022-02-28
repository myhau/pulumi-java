// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigArgs;
import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigArgs Empty = new FieldLevelEncryptionConfigArgs();

    /**
     * An optional comment about the Field Level Encryption Config.
     * 
     */
    @InputImport(name="comment")
      private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * Content Type Profile Config specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
     * 
     */
    @InputImport(name="contentTypeProfileConfig", required=true)
      private final Input<FieldLevelEncryptionConfigContentTypeProfileConfigArgs> contentTypeProfileConfig;

    public Input<FieldLevelEncryptionConfigContentTypeProfileConfigArgs> getContentTypeProfileConfig() {
        return this.contentTypeProfileConfig;
    }

    /**
     * Query Arg Profile Config that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
     * 
     */
    @InputImport(name="queryArgProfileConfig", required=true)
      private final Input<FieldLevelEncryptionConfigQueryArgProfileConfigArgs> queryArgProfileConfig;

    public Input<FieldLevelEncryptionConfigQueryArgProfileConfigArgs> getQueryArgProfileConfig() {
        return this.queryArgProfileConfig;
    }

    public FieldLevelEncryptionConfigArgs(
        @Nullable Input<String> comment,
        Input<FieldLevelEncryptionConfigContentTypeProfileConfigArgs> contentTypeProfileConfig,
        Input<FieldLevelEncryptionConfigQueryArgProfileConfigArgs> queryArgProfileConfig) {
        this.comment = comment;
        this.contentTypeProfileConfig = Objects.requireNonNull(contentTypeProfileConfig, "expected parameter 'contentTypeProfileConfig' to be non-null");
        this.queryArgProfileConfig = Objects.requireNonNull(queryArgProfileConfig, "expected parameter 'queryArgProfileConfig' to be non-null");
    }

    private FieldLevelEncryptionConfigArgs() {
        this.comment = Input.empty();
        this.contentTypeProfileConfig = Input.empty();
        this.queryArgProfileConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> comment;
        private Input<FieldLevelEncryptionConfigContentTypeProfileConfigArgs> contentTypeProfileConfig;
        private Input<FieldLevelEncryptionConfigQueryArgProfileConfigArgs> queryArgProfileConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.contentTypeProfileConfig = defaults.contentTypeProfileConfig;
    	      this.queryArgProfileConfig = defaults.queryArgProfileConfig;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder setContentTypeProfileConfig(Input<FieldLevelEncryptionConfigContentTypeProfileConfigArgs> contentTypeProfileConfig) {
            this.contentTypeProfileConfig = Objects.requireNonNull(contentTypeProfileConfig);
            return this;
        }

        public Builder setContentTypeProfileConfig(FieldLevelEncryptionConfigContentTypeProfileConfigArgs contentTypeProfileConfig) {
            this.contentTypeProfileConfig = Input.of(Objects.requireNonNull(contentTypeProfileConfig));
            return this;
        }

        public Builder setQueryArgProfileConfig(Input<FieldLevelEncryptionConfigQueryArgProfileConfigArgs> queryArgProfileConfig) {
            this.queryArgProfileConfig = Objects.requireNonNull(queryArgProfileConfig);
            return this;
        }

        public Builder setQueryArgProfileConfig(FieldLevelEncryptionConfigQueryArgProfileConfigArgs queryArgProfileConfig) {
            this.queryArgProfileConfig = Input.of(Objects.requireNonNull(queryArgProfileConfig));
            return this;
        }
        public FieldLevelEncryptionConfigArgs build() {
            return new FieldLevelEncryptionConfigArgs(comment, contentTypeProfileConfig, queryArgProfileConfig);
        }
    }
}
