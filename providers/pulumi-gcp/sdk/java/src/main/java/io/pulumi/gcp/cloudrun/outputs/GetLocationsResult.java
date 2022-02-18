// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetLocationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The list of Cloud Run locations available for the given project.
     * 
     */
    private final List<String> locations;
    private final String project;

    @OutputCustomType.Constructor({"id","locations","project"})
    private GetLocationsResult(
        String id,
        List<String> locations,
        String project) {
        this.id = Objects.requireNonNull(id);
        this.locations = Objects.requireNonNull(locations);
        this.project = Objects.requireNonNull(project);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The list of Cloud Run locations available for the given project.
     * 
     */
    public List<String> getLocations() {
        return this.locations;
    }
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> locations;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.locations = defaults.locations;
    	      this.project = defaults.project;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocations(List<String> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public GetLocationsResult build() {
            return new GetLocationsResult(id, locations, project);
        }
    }
}
