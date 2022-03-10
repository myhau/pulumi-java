// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManifestResponse {
    /**
     * The name of the generated file. The default is `manifest` with the extension suffix corresponding to the `Manifest.type`.
     * 
     */
    private final String fileName;
    /**
     * List of user given `MuxStream.key`s that should appear in this manifest. When `Manifest.type` is `HLS`, a media manifest with name `MuxStream.key` and `.m3u8` extension is generated for each element of the `Manifest.mux_streams`.
     * 
     */
    private final List<String> muxStreams;
    /**
     * Type of the manifest, can be `HLS` or `DASH`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ManifestResponse(
        @OutputCustomType.Parameter("fileName") String fileName,
        @OutputCustomType.Parameter("muxStreams") List<String> muxStreams,
        @OutputCustomType.Parameter("type") String type) {
        this.fileName = fileName;
        this.muxStreams = muxStreams;
        this.type = type;
    }

    /**
     * The name of the generated file. The default is `manifest` with the extension suffix corresponding to the `Manifest.type`.
     * 
    */
    public String getFileName() {
        return this.fileName;
    }
    /**
     * List of user given `MuxStream.key`s that should appear in this manifest. When `Manifest.type` is `HLS`, a media manifest with name `MuxStream.key` and `.m3u8` extension is generated for each element of the `Manifest.mux_streams`.
     * 
    */
    public List<String> getMuxStreams() {
        return this.muxStreams;
    }
    /**
     * Type of the manifest, can be `HLS` or `DASH`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManifestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileName;
        private List<String> muxStreams;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManifestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.muxStreams = defaults.muxStreams;
    	      this.type = defaults.type;
        }

        public Builder setFileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }

        public Builder setMuxStreams(List<String> muxStreams) {
            this.muxStreams = Objects.requireNonNull(muxStreams);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManifestResponse build() {
            return new ManifestResponse(fileName, muxStreams, type);
        }
    }
}
