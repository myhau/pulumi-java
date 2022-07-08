// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRunV2TrafficTargetResponse {
    /**
     * @return Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    private final Integer percent;
    /**
     * @return Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    private final String revision;
    /**
     * @return Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    private final String tag;
    /**
     * @return The allocation type for this traffic target.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GoogleCloudRunV2TrafficTargetResponse(
        @CustomType.Parameter("percent") Integer percent,
        @CustomType.Parameter("revision") String revision,
        @CustomType.Parameter("tag") String tag,
        @CustomType.Parameter("type") String type) {
        this.percent = percent;
        this.revision = revision;
        this.tag = tag;
        this.type = type;
    }

    /**
     * @return Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    public Integer percent() {
        return this.percent;
    }
    /**
     * @return Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    public String revision() {
        return this.revision;
    }
    /**
     * @return Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    public String tag() {
        return this.tag;
    }
    /**
     * @return The allocation type for this traffic target.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunV2TrafficTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer percent;
        private String revision;
        private String tag;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunV2TrafficTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percent = defaults.percent;
    	      this.revision = defaults.revision;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
        }

        public Builder percent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }
        public Builder revision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudRunV2TrafficTargetResponse build() {
            return new GoogleCloudRunV2TrafficTargetResponse(percent, revision, tag, type);
        }
    }
}
