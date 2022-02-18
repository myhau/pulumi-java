// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetZonesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A list of zones available in the given region
     * 
     */
    private final List<String> names;
    private final String project;
    private final @Nullable String region;
    private final @Nullable String status;

    @OutputCustomType.Constructor({"id","names","project","region","status"})
    private GetZonesResult(
        String id,
        List<String> names,
        String project,
        @Nullable String region,
        @Nullable String status) {
        this.id = Objects.requireNonNull(id);
        this.names = Objects.requireNonNull(names);
        this.project = Objects.requireNonNull(project);
        this.region = region;
        this.status = status;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * A list of zones available in the given region
     * 
     */
    public List<String> getNames() {
        return this.names;
    }
    public String getProject() {
        return this.project;
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> names;
        private String project;
        private @Nullable String region;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZonesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.names = defaults.names;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public GetZonesResult build() {
            return new GetZonesResult(id, names, project, region, status);
        }
    }
}
