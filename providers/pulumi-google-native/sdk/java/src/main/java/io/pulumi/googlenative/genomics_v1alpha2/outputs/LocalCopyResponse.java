// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LocalCopyResponse {
    /**
     * The name of the disk where this parameter is located. Can be the name of one of the disks specified in the Resources field, or "boot", which represents the Docker instance's boot disk and has a mount point of `/`.
     * 
     */
    private final String disk;
    /**
     * The path within the user's docker container where this input should be localized to and from, relative to the specified disk's mount point. For example: file.txt,
     * 
     */
    private final String path;

    @OutputCustomType.Constructor({"disk","path"})
    private LocalCopyResponse(
        String disk,
        String path) {
        this.disk = disk;
        this.path = path;
    }

    /**
     * The name of the disk where this parameter is located. Can be the name of one of the disks specified in the Resources field, or "boot", which represents the Docker instance's boot disk and has a mount point of `/`.
     * 
    */
    public String getDisk() {
        return this.disk;
    }
    /**
     * The path within the user's docker container where this input should be localized to and from, relative to the specified disk's mount point. For example: file.txt,
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalCopyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String disk;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalCopyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.path = defaults.path;
        }

        public Builder setDisk(String disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public LocalCopyResponse build() {
            return new LocalCopyResponse(disk, path);
        }
    }
}
