// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionDiskResourcePolicyAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final RegionDiskResourcePolicyAttachmentState Empty = new RegionDiskResourcePolicyAttachmentState();

    /**
     * The name of the regional disk in which the resource policies are attached to.
     * 
     */
    @InputImport(name="disk")
    private final @Nullable Input<String> disk;

    public Input<String> getDisk() {
        return this.disk == null ? Input.empty() : this.disk;
    }

    /**
     * The resource policy to be attached to the disk for scheduling snapshot
     * creation. Do not specify the self link.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A reference to the region where the disk resides.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public RegionDiskResourcePolicyAttachmentState(
        @Nullable Input<String> disk,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.disk = disk;
        this.name = name;
        this.project = project;
        this.region = region;
    }

    private RegionDiskResourcePolicyAttachmentState() {
        this.disk = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionDiskResourcePolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> disk;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionDiskResourcePolicyAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setDisk(@Nullable Input<String> disk) {
            this.disk = disk;
            return this;
        }

        public Builder setDisk(@Nullable String disk) {
            this.disk = Input.ofNullable(disk);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public RegionDiskResourcePolicyAttachmentState build() {
            return new RegionDiskResourcePolicyAttachmentState(disk, name, project, region);
        }
    }
}
