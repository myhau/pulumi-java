// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute.v1.RegionDiskArgs;
import com.pulumi.googlenative.compute.v1.outputs.CustomerEncryptionKeyResponse;
import com.pulumi.googlenative.compute.v1.outputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a persistent regional disk in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/v1:RegionDisk")
public class RegionDisk extends com.pulumi.resources.CustomResource {
    /**
     * The architecture of the disk. Valid values are ARM64 or X86_64.
     * 
     */
    @Export(name="architecture", type=String.class, parameters={})
    private Output<String> architecture;

    /**
     * @return The architecture of the disk. Valid values are ARM64 or X86_64.
     * 
     */
    public Output<String> architecture() {
        return this.architecture;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Encrypts the disk using a customer-supplied encryption key or a customer-managed encryption key. Encryption keys do not protect access to metadata of the disk. After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later. For example, to create a disk snapshot, to create a disk image, to create a machine image, or to attach the disk to a virtual machine. After you encrypt a disk with a customer-managed key, the diskEncryptionKey.kmsKeyName is set to a key *version* name once the disk is created. The disk is encrypted with this version of the key. In the response, diskEncryptionKey.kmsKeyName appears in the following format: &#34;diskEncryptionKey.kmsKeyName&#34;: &#34;projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key /cryptoKeysVersions/version If you do not provide an encryption key when creating the disk, then the disk is encrypted using an automatically generated key and you don&#39;t need to provide a key to use the disk later.
     * 
     */
    @Export(name="diskEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> diskEncryptionKey;

    /**
     * @return Encrypts the disk using a customer-supplied encryption key or a customer-managed encryption key. Encryption keys do not protect access to metadata of the disk. After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later. For example, to create a disk snapshot, to create a disk image, to create a machine image, or to attach the disk to a virtual machine. After you encrypt a disk with a customer-managed key, the diskEncryptionKey.kmsKeyName is set to a key *version* name once the disk is created. The disk is encrypted with this version of the key. In the response, diskEncryptionKey.kmsKeyName appears in the following format: &#34;diskEncryptionKey.kmsKeyName&#34;: &#34;projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key /cryptoKeysVersions/version If you do not provide an encryption key when creating the disk, then the disk is encrypted using an automatically generated key and you don&#39;t need to provide a key to use the disk later.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> diskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    @Export(name="guestOsFeatures", type=List.class, parameters={GuestOsFeatureResponse.class})
    private Output<List<GuestOsFeatureResponse>> guestOsFeatures;

    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    public Output<List<GuestOsFeatureResponse>> guestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * Type of the resource. Always compute#disk for disks.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#disk for disks.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this disk, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a disk.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this disk, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a disk.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this disk. These can be later modified by the setLabels method.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this disk. These can be later modified by the setLabels method.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Last attach timestamp in RFC3339 text format.
     * 
     */
    @Export(name="lastAttachTimestamp", type=String.class, parameters={})
    private Output<String> lastAttachTimestamp;

    /**
     * @return Last attach timestamp in RFC3339 text format.
     * 
     */
    public Output<String> lastAttachTimestamp() {
        return this.lastAttachTimestamp;
    }
    /**
     * Last detach timestamp in RFC3339 text format.
     * 
     */
    @Export(name="lastDetachTimestamp", type=String.class, parameters={})
    private Output<String> lastDetachTimestamp;

    /**
     * @return Last detach timestamp in RFC3339 text format.
     * 
     */
    public Output<String> lastDetachTimestamp() {
        return this.lastDetachTimestamp;
    }
    /**
     * Integer license codes indicating which licenses are attached to this disk.
     * 
     */
    @Export(name="licenseCodes", type=List.class, parameters={String.class})
    private Output<List<String>> licenseCodes;

    /**
     * @return Integer license codes indicating which licenses are attached to this disk.
     * 
     */
    public Output<List<String>> licenseCodes() {
        return this.licenseCodes;
    }
    /**
     * A list of publicly visible licenses. Reserved for Google&#39;s use.
     * 
     */
    @Export(name="licenses", type=List.class, parameters={String.class})
    private Output<List<String>> licenses;

    /**
     * @return A list of publicly visible licenses. Reserved for Google&#39;s use.
     * 
     */
    public Output<List<String>> licenses() {
        return this.licenses;
    }
    /**
     * An opaque location hint used to place the disk close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @Export(name="locationHint", type=String.class, parameters={})
    private Output<String> locationHint;

    /**
     * @return An opaque location hint used to place the disk close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    public Output<String> locationHint() {
        return this.locationHint;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Internal use only.
     * 
     */
    @Export(name="options", type=String.class, parameters={})
    private Output<String> options;

    /**
     * @return Internal use only.
     * 
     */
    public Output<String> options() {
        return this.options;
    }
    /**
     * Physical block size of the persistent disk, in bytes. If not present in a request, a default value is used. The currently supported size is 4096, other sizes may be added in the future. If an unsupported value is requested, the error message will list the supported values for the caller&#39;s project.
     * 
     */
    @Export(name="physicalBlockSizeBytes", type=String.class, parameters={})
    private Output<String> physicalBlockSizeBytes;

    /**
     * @return Physical block size of the persistent disk, in bytes. If not present in a request, a default value is used. The currently supported size is 4096, other sizes may be added in the future. If an unsupported value is requested, the error message will list the supported values for the caller&#39;s project.
     * 
     */
    public Output<String> physicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    @Export(name="provisionedIops", type=String.class, parameters={})
    private Output<String> provisionedIops;

    /**
     * @return Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    public Output<String> provisionedIops() {
        return this.provisionedIops;
    }
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    /**
     * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
     */
    @Export(name="replicaZones", type=List.class, parameters={String.class})
    private Output<List<String>> replicaZones;

    /**
     * @return URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
     */
    public Output<List<String>> replicaZones() {
        return this.replicaZones;
    }
    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Resource policies applied to this disk for automatic snapshot creations.
     * 
     */
    @Export(name="resourcePolicies", type=List.class, parameters={String.class})
    private Output<List<String>> resourcePolicies;

    /**
     * @return Resource policies applied to this disk for automatic snapshot creations.
     * 
     */
    public Output<List<String>> resourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * Reserved for future use.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Size, in GB, of the persistent disk. You can specify this field when creating a persistent disk using the sourceImage, sourceSnapshot, or sourceDisk parameter, or specify it alone to create an empty persistent disk. If you specify this field along with a source, the value of sizeGb must not be less than the size of the source. Acceptable values are 1 to 65536, inclusive.
     * 
     */
    @Export(name="sizeGb", type=String.class, parameters={})
    private Output<String> sizeGb;

    /**
     * @return Size, in GB, of the persistent disk. You can specify this field when creating a persistent disk using the sourceImage, sourceSnapshot, or sourceDisk parameter, or specify it alone to create an empty persistent disk. If you specify this field along with a source, the value of sizeGb must not be less than the size of the source. Acceptable values are 1 to 65536, inclusive.
     * 
     */
    public Output<String> sizeGb() {
        return this.sizeGb;
    }
    /**
     * The source disk used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    @Export(name="sourceDisk", type=String.class, parameters={})
    private Output<String> sourceDisk;

    /**
     * @return The source disk used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    public Output<String> sourceDisk() {
        return this.sourceDisk;
    }
    /**
     * The unique ID of the disk used to create this disk. This value identifies the exact disk that was used to create this persistent disk. For example, if you created the persistent disk from a disk that was later deleted and recreated under the same name, the source disk ID would identify the exact version of the disk that was used.
     * 
     */
    @Export(name="sourceDiskId", type=String.class, parameters={})
    private Output<String> sourceDiskId;

    /**
     * @return The unique ID of the disk used to create this disk. This value identifies the exact disk that was used to create this persistent disk. For example, if you created the persistent disk from a disk that was later deleted and recreated under the same name, the source disk ID would identify the exact version of the disk that was used.
     * 
     */
    public Output<String> sourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * Source image to restore onto a disk. This field is optional.
     * 
     */
    @Export(name="sourceImage", type=String.class, parameters={})
    private Output<String> sourceImage;

    /**
     * @return Source image to restore onto a disk. This field is optional.
     * 
     */
    public Output<String> sourceImage() {
        return this.sourceImage;
    }
    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    @Export(name="sourceImageEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceImageEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> sourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    /**
     * The ID value of the image used to create this disk. This value identifies the exact image that was used to create this persistent disk. For example, if you created the persistent disk from an image that was later deleted and recreated under the same name, the source image ID would identify the exact version of the image that was used.
     * 
     */
    @Export(name="sourceImageId", type=String.class, parameters={})
    private Output<String> sourceImageId;

    /**
     * @return The ID value of the image used to create this disk. This value identifies the exact image that was used to create this persistent disk. For example, if you created the persistent disk from an image that was later deleted and recreated under the same name, the source image ID would identify the exact version of the image that was used.
     * 
     */
    public Output<String> sourceImageId() {
        return this.sourceImageId;
    }
    /**
     * The source snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project /global/snapshots/snapshot - projects/project/global/snapshots/snapshot - global/snapshots/snapshot
     * 
     */
    @Export(name="sourceSnapshot", type=String.class, parameters={})
    private Output<String> sourceSnapshot;

    /**
     * @return The source snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project /global/snapshots/snapshot - projects/project/global/snapshots/snapshot - global/snapshots/snapshot
     * 
     */
    public Output<String> sourceSnapshot() {
        return this.sourceSnapshot;
    }
    /**
     * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    @Export(name="sourceSnapshotEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceSnapshotEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> sourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }
    /**
     * The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    @Export(name="sourceSnapshotId", type=String.class, parameters={})
    private Output<String> sourceSnapshotId;

    /**
     * @return The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    public Output<String> sourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    /**
     * The full Google Cloud Storage URI where the disk image is stored. This file must be a gzip-compressed tarball whose name ends in .tar.gz or virtual machine disk whose name ends in vmdk. Valid URIs may start with gs:// or https://storage.googleapis.com/. This flag is not optimized for creating multiple disks from a source storage object. To create many disks from a source storage object, use gcloud compute images import instead.
     * 
     */
    @Export(name="sourceStorageObject", type=String.class, parameters={})
    private Output<String> sourceStorageObject;

    /**
     * @return The full Google Cloud Storage URI where the disk image is stored. This file must be a gzip-compressed tarball whose name ends in .tar.gz or virtual machine disk whose name ends in vmdk. Valid URIs may start with gs:// or https://storage.googleapis.com/. This flag is not optimized for creating multiple disks from a source storage object. To create many disks from a source storage object, use gcloud compute images import instead.
     * 
     */
    public Output<String> sourceStorageObject() {
        return this.sourceStorageObject;
    }
    /**
     * The status of disk creation. - CREATING: Disk is provisioning. - RESTORING: Source data is being copied into the disk. - FAILED: Disk creation failed. - READY: Disk is ready for use. - DELETING: Disk is deleting.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of disk creation. - CREATING: Disk is provisioning. - RESTORING: Source data is being copied into the disk. - FAILED: Disk creation failed. - READY: Disk is ready for use. - DELETING: Disk is deleting.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * URL of the disk type resource describing which disk type to use to create the disk. Provide this when creating the disk. For example: projects/project /zones/zone/diskTypes/pd-ssd . See Persistent disk types.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return URL of the disk type resource describing which disk type to use to create the disk. Provide this when creating the disk. For example: projects/project /zones/zone/diskTypes/pd-ssd . See Persistent disk types.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Links to the users of the disk (attached instances) in form: projects/project/zones/zone/instances/instance
     * 
     */
    @Export(name="users", type=List.class, parameters={String.class})
    private Output<List<String>> users;

    /**
     * @return Links to the users of the disk (attached instances) in form: projects/project/zones/zone/instances/instance
     * 
     */
    public Output<List<String>> users() {
        return this.users;
    }
    /**
     * URL of the zone where the disk resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return URL of the zone where the disk resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionDisk(String name) {
        this(name, RegionDiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionDisk(String name, RegionDiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionDisk(String name, RegionDiskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:RegionDisk", name, args == null ? RegionDiskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionDisk(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:RegionDisk", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegionDisk get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionDisk(name, id, options);
    }
}
