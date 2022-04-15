// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Library requirements for a Big Data pool powered by Apache Spark
 * 
 */
public final class LibraryRequirementsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LibraryRequirementsResponse Empty = new LibraryRequirementsResponse();

    /**
     * The library requirements.
     * 
     */
    @Import(name="content")
      private final @Nullable String content;

    public Optional<String> content() {
        return this.content == null ? Optional.empty() : Optional.ofNullable(this.content);
    }

    /**
     * The filename of the library requirements file.
     * 
     */
    @Import(name="filename")
      private final @Nullable String filename;

    public Optional<String> filename() {
        return this.filename == null ? Optional.empty() : Optional.ofNullable(this.filename);
    }

    /**
     * The last update time of the library requirements file.
     * 
     */
    @Import(name="time", required=true)
      private final String time;

    public String time() {
        return this.time;
    }

    public LibraryRequirementsResponse(
        @Nullable String content,
        @Nullable String filename,
        String time) {
        this.content = content;
        this.filename = filename;
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private LibraryRequirementsResponse() {
        this.content = null;
        this.filename = null;
        this.time = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String filename;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.filename = defaults.filename;
    	      this.time = defaults.time;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        public Builder filename(@Nullable String filename) {
            this.filename = filename;
            return this;
        }
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public LibraryRequirementsResponse build() {
            return new LibraryRequirementsResponse(content, filename, time);
        }
    }
}
