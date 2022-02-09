// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetApiIssueAttachmentResult {
    private final String content;
    private final String contentFormat;
    private final String id;
    private final String name;
    private final String title;
    private final String type;

    @OutputCustomType.Constructor({"content","contentFormat","id","name","title","type"})
    private GetApiIssueAttachmentResult(
        String content,
        String contentFormat,
        String id,
        String name,
        String title,
        String type) {
        this.content = Objects.requireNonNull(content);
        this.contentFormat = Objects.requireNonNull(contentFormat);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.title = Objects.requireNonNull(title);
        this.type = Objects.requireNonNull(type);
    }

    public String getContent() {
        return this.content;
    }
    public String getContentFormat() {
        return this.contentFormat;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getTitle() {
        return this.title;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiIssueAttachmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String contentFormat;
        private String id;
        private String name;
        private String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiIssueAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentFormat = defaults.contentFormat;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContentFormat(String contentFormat) {
            this.contentFormat = Objects.requireNonNull(contentFormat);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetApiIssueAttachmentResult build() {
            return new GetApiIssueAttachmentResult(content, contentFormat, id, name, title, type);
        }
    }
}