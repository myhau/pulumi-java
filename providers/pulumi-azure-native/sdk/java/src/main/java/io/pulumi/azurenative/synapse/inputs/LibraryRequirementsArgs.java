// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LibraryRequirementsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LibraryRequirementsArgs Empty = new LibraryRequirementsArgs();

    @InputImport(name="content")
    private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    @InputImport(name="filename")
    private final @Nullable Input<String> filename;

    public Input<String> getFilename() {
        return this.filename == null ? Input.empty() : this.filename;
    }

    public LibraryRequirementsArgs(
        @Nullable Input<String> content,
        @Nullable Input<String> filename) {
        this.content = content;
        this.filename = filename;
    }

    private LibraryRequirementsArgs() {
        this.content = Input.empty();
        this.filename = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<String> filename;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryRequirementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.filename = defaults.filename;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder setFilename(@Nullable Input<String> filename) {
            this.filename = filename;
            return this;
        }

        public Builder setFilename(@Nullable String filename) {
            this.filename = Input.ofNullable(filename);
            return this;
        }

        public LibraryRequirementsArgs build() {
            return new LibraryRequirementsArgs(content, filename);
        }
    }
}