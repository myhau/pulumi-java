// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.ShareSubscriptionArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:datashare:ShareSubscription")
public class ShareSubscription extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    @OutputExport(name="expirationDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> expirationDate;

    public Output</* @Nullable */ String> getExpirationDate() {
        return this.expirationDate;
    }
    @OutputExport(name="invitationId", type=String.class, parameters={})
    private Output<String> invitationId;

    public Output<String> getInvitationId() {
        return this.invitationId;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="providerEmail", type=String.class, parameters={})
    private Output<String> providerEmail;

    public Output<String> getProviderEmail() {
        return this.providerEmail;
    }
    @OutputExport(name="providerName", type=String.class, parameters={})
    private Output<String> providerName;

    public Output<String> getProviderName() {
        return this.providerName;
    }
    @OutputExport(name="providerTenantName", type=String.class, parameters={})
    private Output<String> providerTenantName;

    public Output<String> getProviderTenantName() {
        return this.providerTenantName;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="shareDescription", type=String.class, parameters={})
    private Output<String> shareDescription;

    public Output<String> getShareDescription() {
        return this.shareDescription;
    }
    @OutputExport(name="shareKind", type=String.class, parameters={})
    private Output<String> shareKind;

    public Output<String> getShareKind() {
        return this.shareKind;
    }
    @OutputExport(name="shareName", type=String.class, parameters={})
    private Output<String> shareName;

    public Output<String> getShareName() {
        return this.shareName;
    }
    @OutputExport(name="shareSubscriptionStatus", type=String.class, parameters={})
    private Output<String> shareSubscriptionStatus;

    public Output<String> getShareSubscriptionStatus() {
        return this.shareSubscriptionStatus;
    }
    @OutputExport(name="shareTerms", type=String.class, parameters={})
    private Output<String> shareTerms;

    public Output<String> getShareTerms() {
        return this.shareTerms;
    }
    @OutputExport(name="sourceShareLocation", type=String.class, parameters={})
    private Output<String> sourceShareLocation;

    public Output<String> getSourceShareLocation() {
        return this.sourceShareLocation;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="userEmail", type=String.class, parameters={})
    private Output<String> userEmail;

    public Output<String> getUserEmail() {
        return this.userEmail;
    }
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public ShareSubscription(String name, ShareSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ShareSubscription", name, args == null ? ShareSubscriptionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ShareSubscription(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ShareSubscription", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:ShareSubscription").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:ShareSubscription").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:ShareSubscription").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:ShareSubscription").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:ShareSubscription").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ShareSubscription get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ShareSubscription(name, id, options);
    }
}