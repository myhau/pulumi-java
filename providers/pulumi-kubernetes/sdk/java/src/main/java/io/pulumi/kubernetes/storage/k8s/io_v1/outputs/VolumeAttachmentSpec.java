// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.storage.k8s.io_v1.outputs.VolumeAttachmentSource;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VolumeAttachmentSpec {
    /**
     * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    private final String attacher;
    /**
     * The node that the volume should be attached to.
     * 
     */
    private final String nodeName;
    /**
     * Source represents the volume that should be attached.
     * 
     */
    private final VolumeAttachmentSource source;

    @OutputCustomType.Constructor({"attacher","nodeName","source"})
    private VolumeAttachmentSpec(
        String attacher,
        String nodeName,
        VolumeAttachmentSource source) {
        this.attacher = attacher;
        this.nodeName = nodeName;
        this.source = source;
    }

    /**
     * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
    */
    public String getAttacher() {
        return this.attacher;
    }
    /**
     * The node that the volume should be attached to.
     * 
    */
    public String getNodeName() {
        return this.nodeName;
    }
    /**
     * Source represents the volume that should be attached.
     * 
    */
    public VolumeAttachmentSource getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attacher;
        private String nodeName;
        private VolumeAttachmentSource source;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attacher = defaults.attacher;
    	      this.nodeName = defaults.nodeName;
    	      this.source = defaults.source;
        }

        public Builder setAttacher(String attacher) {
            this.attacher = Objects.requireNonNull(attacher);
            return this;
        }

        public Builder setNodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }

        public Builder setSource(VolumeAttachmentSource source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public VolumeAttachmentSpec build() {
            return new VolumeAttachmentSpec(attacher, nodeName, source);
        }
    }
}
