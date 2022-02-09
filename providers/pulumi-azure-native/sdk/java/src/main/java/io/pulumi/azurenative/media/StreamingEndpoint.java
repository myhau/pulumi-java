// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.StreamingEndpointArgs;
import io.pulumi.azurenative.media.outputs.CrossSiteAccessPoliciesResponse;
import io.pulumi.azurenative.media.outputs.StreamingEndpointAccessControlResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:media:StreamingEndpoint")
public class StreamingEndpoint extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessControl", type=StreamingEndpointAccessControlResponse.class, parameters={})
    private Output</* @Nullable */ StreamingEndpointAccessControlResponse> accessControl;

    public Output</* @Nullable */ StreamingEndpointAccessControlResponse> getAccessControl() {
        return this.accessControl;
    }
    @OutputExport(name="availabilitySetName", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilitySetName;

    public Output</* @Nullable */ String> getAvailabilitySetName() {
        return this.availabilitySetName;
    }
    @OutputExport(name="cdnEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cdnEnabled;

    public Output</* @Nullable */ Boolean> getCdnEnabled() {
        return this.cdnEnabled;
    }
    @OutputExport(name="cdnProfile", type=String.class, parameters={})
    private Output</* @Nullable */ String> cdnProfile;

    public Output</* @Nullable */ String> getCdnProfile() {
        return this.cdnProfile;
    }
    @OutputExport(name="cdnProvider", type=String.class, parameters={})
    private Output</* @Nullable */ String> cdnProvider;

    public Output</* @Nullable */ String> getCdnProvider() {
        return this.cdnProvider;
    }
    @OutputExport(name="created", type=String.class, parameters={})
    private Output<String> created;

    public Output<String> getCreated() {
        return this.created;
    }
    @OutputExport(name="crossSiteAccessPolicies", type=CrossSiteAccessPoliciesResponse.class, parameters={})
    private Output</* @Nullable */ CrossSiteAccessPoliciesResponse> crossSiteAccessPolicies;

    public Output</* @Nullable */ CrossSiteAccessPoliciesResponse> getCrossSiteAccessPolicies() {
        return this.crossSiteAccessPolicies;
    }
    @OutputExport(name="customHostNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customHostNames;

    public Output</* @Nullable */ List<String>> getCustomHostNames() {
        return this.customHostNames;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="freeTrialEndTime", type=String.class, parameters={})
    private Output<String> freeTrialEndTime;

    public Output<String> getFreeTrialEndTime() {
        return this.freeTrialEndTime;
    }
    @OutputExport(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName;
    }
    @OutputExport(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    public Output<String> getLastModified() {
        return this.lastModified;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="maxCacheAge", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxCacheAge;

    public Output</* @Nullable */ Double> getMaxCacheAge() {
        return this.maxCacheAge;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    public Output<String> getResourceState() {
        return this.resourceState;
    }
    @OutputExport(name="scaleUnits", type=Integer.class, parameters={})
    private Output<Integer> scaleUnits;

    public Output<Integer> getScaleUnits() {
        return this.scaleUnits;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public StreamingEndpoint(String name, StreamingEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:StreamingEndpoint", name, args == null ? StreamingEndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StreamingEndpoint(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:StreamingEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:media/v20180330preview:StreamingEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20180601preview:StreamingEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20180701:StreamingEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20190501preview:StreamingEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20200501:StreamingEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20210601:StreamingEndpoint").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static StreamingEndpoint get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StreamingEndpoint(name, id, options);
    }
}