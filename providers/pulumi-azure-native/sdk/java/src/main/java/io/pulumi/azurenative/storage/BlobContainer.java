// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.BlobContainerArgs;
import io.pulumi.azurenative.storage.outputs.ImmutabilityPolicyPropertiesResponse;
import io.pulumi.azurenative.storage.outputs.LegalHoldPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:storage:BlobContainer")
public class BlobContainer extends io.pulumi.resources.CustomResource {
    @OutputExport(name="defaultEncryptionScope", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultEncryptionScope;

    public Output</* @Nullable */ String> getDefaultEncryptionScope() {
        return this.defaultEncryptionScope;
    }
    @OutputExport(name="deleted", type=Boolean.class, parameters={})
    private Output<Boolean> deleted;

    public Output<Boolean> getDeleted() {
        return this.deleted;
    }
    @OutputExport(name="deletedTime", type=String.class, parameters={})
    private Output<String> deletedTime;

    public Output<String> getDeletedTime() {
        return this.deletedTime;
    }
    @OutputExport(name="denyEncryptionScopeOverride", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> denyEncryptionScopeOverride;

    public Output</* @Nullable */ Boolean> getDenyEncryptionScopeOverride() {
        return this.denyEncryptionScopeOverride;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="hasImmutabilityPolicy", type=Boolean.class, parameters={})
    private Output<Boolean> hasImmutabilityPolicy;

    public Output<Boolean> getHasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }
    @OutputExport(name="hasLegalHold", type=Boolean.class, parameters={})
    private Output<Boolean> hasLegalHold;

    public Output<Boolean> getHasLegalHold() {
        return this.hasLegalHold;
    }
    @OutputExport(name="immutabilityPolicy", type=ImmutabilityPolicyPropertiesResponse.class, parameters={})
    private Output<ImmutabilityPolicyPropertiesResponse> immutabilityPolicy;

    public Output<ImmutabilityPolicyPropertiesResponse> getImmutabilityPolicy() {
        return this.immutabilityPolicy;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="leaseDuration", type=String.class, parameters={})
    private Output<String> leaseDuration;

    public Output<String> getLeaseDuration() {
        return this.leaseDuration;
    }
    @OutputExport(name="leaseState", type=String.class, parameters={})
    private Output<String> leaseState;

    public Output<String> getLeaseState() {
        return this.leaseState;
    }
    @OutputExport(name="leaseStatus", type=String.class, parameters={})
    private Output<String> leaseStatus;

    public Output<String> getLeaseStatus() {
        return this.leaseStatus;
    }
    @OutputExport(name="legalHold", type=LegalHoldPropertiesResponse.class, parameters={})
    private Output<LegalHoldPropertiesResponse> legalHold;

    public Output<LegalHoldPropertiesResponse> getLegalHold() {
        return this.legalHold;
    }
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="publicAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicAccess;

    public Output</* @Nullable */ String> getPublicAccess() {
        return this.publicAccess;
    }
    @OutputExport(name="remainingRetentionDays", type=Integer.class, parameters={})
    private Output<Integer> remainingRetentionDays;

    public Output<Integer> getRemainingRetentionDays() {
        return this.remainingRetentionDays;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public BlobContainer(String name, BlobContainerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobContainer", name, args == null ? BlobContainerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BlobContainer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobContainer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storage/v20180201:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20180301preview:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20180701:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20181101:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20190401:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20190601:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20200801preview:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210101:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210201:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210401:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210601:BlobContainer").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210801:BlobContainer").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static BlobContainer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BlobContainer(name, id, options);
    }
}