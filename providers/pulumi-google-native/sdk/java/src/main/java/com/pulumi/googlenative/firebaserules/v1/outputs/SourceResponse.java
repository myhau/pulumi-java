// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.firebaserules.v1.outputs.FileResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SourceResponse {
    /**
     * @return `File` set constituting the `Source` bundle.
     * 
     */
    private final List<FileResponse> files;

    @CustomType.Constructor
    private SourceResponse(@CustomType.Parameter("files") List<FileResponse> files) {
        this.files = files;
    }

    /**
     * @return `File` set constituting the `Source` bundle.
     * 
     */
    public List<FileResponse> files() {
        return this.files;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FileResponse> files;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.files = defaults.files;
        }

        public Builder files(List<FileResponse> files) {
            this.files = Objects.requireNonNull(files);
            return this;
        }
        public Builder files(FileResponse... files) {
            return files(List.of(files));
        }        public SourceResponse build() {
            return new SourceResponse(files);
        }
    }
}
