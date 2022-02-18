// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tpu.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTensorflowVersionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String project;
    /**
     * The list of TensorFlow versions available for the given project and zone.
     * 
     */
    private final List<String> versions;
    private final String zone;

    @OutputCustomType.Constructor({"id","project","versions","zone"})
    private GetTensorflowVersionsResult(
        String id,
        String project,
        List<String> versions,
        String zone) {
        this.id = Objects.requireNonNull(id);
        this.project = Objects.requireNonNull(project);
        this.versions = Objects.requireNonNull(versions);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getProject() {
        return this.project;
    }
    /**
     * The list of TensorFlow versions available for the given project and zone.
     * 
     */
    public List<String> getVersions() {
        return this.versions;
    }
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTensorflowVersionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String project;
        private List<String> versions;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTensorflowVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.versions = defaults.versions;
    	      this.zone = defaults.zone;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setVersions(List<String> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetTensorflowVersionsResult build() {
            return new GetTensorflowVersionsResult(id, project, versions, zone);
        }
    }
}
