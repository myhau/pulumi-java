// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ImportFileResponse {
    /**
     * The contents of the file.
     * 
     */
    private final String content;
    /**
     * The name of the file.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"content","name"})
    private ImportFileResponse(
        String content,
        String name) {
        this.content = content;
        this.name = name;
    }

    /**
     * The contents of the file.
     * 
    */
    public String getContent() {
        return this.content;
    }
    /**
     * The name of the file.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImportFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ImportFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.name = defaults.name;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ImportFileResponse build() {
            return new ImportFileResponse(content, name);
        }
    }
}
