// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentAttachmentsSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentAttachmentsSourceGetArgs Empty = new DocumentAttachmentsSourceGetArgs();

    /**
     * The key describing the location of an attachment to a document. Valid key types include: `SourceUrl` and `S3FileUrl`
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * The name of the document attachment file
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The value describing the location of an attachment to a document
     * 
     */
    @InputImport(name="values", required=true)
      private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public DocumentAttachmentsSourceGetArgs(
        Input<String> key,
        @Nullable Input<String> name,
        Input<List<String>> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.name = name;
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private DocumentAttachmentsSourceGetArgs() {
        this.key = Input.empty();
        this.name = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentAttachmentsSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private @Nullable Input<String> name;
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentAttachmentsSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setValues(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }
        public DocumentAttachmentsSourceGetArgs build() {
            return new DocumentAttachmentsSourceGetArgs(key, name, values);
        }
    }
}
