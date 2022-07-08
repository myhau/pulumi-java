// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.genomics.v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * LocalCopy defines how a remote file should be copied to and from the VM.
 * 
 */
public final class LocalCopyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalCopyArgs Empty = new LocalCopyArgs();

    /**
     * The name of the disk where this parameter is located. Can be the name of one of the disks specified in the Resources field, or &#34;boot&#34;, which represents the Docker instance&#39;s boot disk and has a mount point of `/`.
     * 
     */
    @Import(name="disk", required=true)
    private Output<String> disk;

    /**
     * @return The name of the disk where this parameter is located. Can be the name of one of the disks specified in the Resources field, or &#34;boot&#34;, which represents the Docker instance&#39;s boot disk and has a mount point of `/`.
     * 
     */
    public Output<String> disk() {
        return this.disk;
    }

    /**
     * The path within the user&#39;s docker container where this input should be localized to and from, relative to the specified disk&#39;s mount point. For example: file.txt,
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path within the user&#39;s docker container where this input should be localized to and from, relative to the specified disk&#39;s mount point. For example: file.txt,
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private LocalCopyArgs() {}

    private LocalCopyArgs(LocalCopyArgs $) {
        this.disk = $.disk;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalCopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalCopyArgs $;

        public Builder() {
            $ = new LocalCopyArgs();
        }

        public Builder(LocalCopyArgs defaults) {
            $ = new LocalCopyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disk The name of the disk where this parameter is located. Can be the name of one of the disks specified in the Resources field, or &#34;boot&#34;, which represents the Docker instance&#39;s boot disk and has a mount point of `/`.
         * 
         * @return builder
         * 
         */
        public Builder disk(Output<String> disk) {
            $.disk = disk;
            return this;
        }

        /**
         * @param disk The name of the disk where this parameter is located. Can be the name of one of the disks specified in the Resources field, or &#34;boot&#34;, which represents the Docker instance&#39;s boot disk and has a mount point of `/`.
         * 
         * @return builder
         * 
         */
        public Builder disk(String disk) {
            return disk(Output.of(disk));
        }

        /**
         * @param path The path within the user&#39;s docker container where this input should be localized to and from, relative to the specified disk&#39;s mount point. For example: file.txt,
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path within the user&#39;s docker container where this input should be localized to and from, relative to the specified disk&#39;s mount point. For example: file.txt,
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public LocalCopyArgs build() {
            $.disk = Objects.requireNonNull($.disk, "expected parameter 'disk' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
