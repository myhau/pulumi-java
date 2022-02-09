// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.managedidentities_v1alpha1.DomainArgs;
import io.pulumi.googlenative.managedidentities_v1alpha1.outputs.TrustResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:managedidentities/v1alpha1:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    @OutputExport(name="auditLogsEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> auditLogsEnabled;

    public Output<Boolean> getAuditLogsEnabled() {
        return this.auditLogsEnabled;
    }
    @OutputExport(name="authorizedNetworks", type=List.class, parameters={String.class})
    private Output<List<String>> authorizedNetworks;

    public Output<List<String>> getAuthorizedNetworks() {
        return this.authorizedNetworks;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    public Output<String> getFqdn() {
        return this.fqdn;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="locations", type=List.class, parameters={String.class})
    private Output<List<String>> locations;

    public Output<List<String>> getLocations() {
        return this.locations;
    }
    @OutputExport(name="managedIdentitiesAdminName", type=String.class, parameters={})
    private Output<String> managedIdentitiesAdminName;

    public Output<String> getManagedIdentitiesAdminName() {
        return this.managedIdentitiesAdminName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="reservedIpRange", type=String.class, parameters={})
    private Output<String> reservedIpRange;

    public Output<String> getReservedIpRange() {
        return this.reservedIpRange;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    @OutputExport(name="trusts", type=List.class, parameters={TrustResponse.class})
    private Output<List<TrustResponse>> trusts;

    public Output<List<TrustResponse>> getTrusts() {
        return this.trusts;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public Domain(String name, DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:managedidentities/v1alpha1:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Domain(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:managedidentities/v1alpha1:Domain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Domain get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}