// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Video flags contain information about the available video actions and its dynamic properties based on the current video state.
 * 
 */
public final class VideoFlagsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoFlagsResponse Empty = new VideoFlagsResponse();

    /**
     * Value indicating whether or not the video can be streamed. Only "archive" type videos can be streamed.
     * 
     */
    @Import(name="canStream", required=true)
      private final Boolean canStream;

    public Boolean canStream() {
        return this.canStream;
    }

    /**
     * Value indicating whether or not there has ever been data recorded or uploaded into the video. Newly created videos have this value set to false.
     * 
     */
    @Import(name="hasData", required=true)
      private final Boolean hasData;

    public Boolean hasData() {
        return this.hasData;
    }

    /**
     * Value indicating whether or not the video is currently being referenced be an active live pipeline. The fact that is being referenced, doesn't necessarily indicate that data is being received. For example, video recording may be gated on events or camera may not be accessible at the time.
     * 
     */
    @Import(name="isRecording", required=true)
      private final Boolean isRecording;

    public Boolean isRecording() {
        return this.isRecording;
    }

    public VideoFlagsResponse(
        Boolean canStream,
        Boolean hasData,
        Boolean isRecording) {
        this.canStream = Objects.requireNonNull(canStream, "expected parameter 'canStream' to be non-null");
        this.hasData = Objects.requireNonNull(hasData, "expected parameter 'hasData' to be non-null");
        this.isRecording = Objects.requireNonNull(isRecording, "expected parameter 'isRecording' to be non-null");
    }

    private VideoFlagsResponse() {
        this.canStream = null;
        this.hasData = null;
        this.isRecording = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoFlagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canStream;
        private Boolean hasData;
        private Boolean isRecording;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoFlagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canStream = defaults.canStream;
    	      this.hasData = defaults.hasData;
    	      this.isRecording = defaults.isRecording;
        }

        public Builder canStream(Boolean canStream) {
            this.canStream = Objects.requireNonNull(canStream);
            return this;
        }
        public Builder hasData(Boolean hasData) {
            this.hasData = Objects.requireNonNull(hasData);
            return this;
        }
        public Builder isRecording(Boolean isRecording) {
            this.isRecording = Objects.requireNonNull(isRecording);
            return this;
        }        public VideoFlagsResponse build() {
            return new VideoFlagsResponse(canStream, hasData, isRecording);
        }
    }
}
