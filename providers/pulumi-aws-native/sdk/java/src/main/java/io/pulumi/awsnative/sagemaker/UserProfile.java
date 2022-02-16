// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.UserProfileArgs;
import io.pulumi.awsnative.sagemaker.outputs.UserProfileTag;
import io.pulumi.awsnative.sagemaker.outputs.UserProfileUserSettings;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:sagemaker:UserProfile")
public class UserProfile extends io.pulumi.resources.CustomResource {
    @OutputExport(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    public Output<String> getDomainId() {
        return this.domainId;
    }
    @OutputExport(name="singleSignOnUserIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> singleSignOnUserIdentifier;

    public Output</* @Nullable */ String> getSingleSignOnUserIdentifier() {
        return this.singleSignOnUserIdentifier;
    }
    @OutputExport(name="singleSignOnUserValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> singleSignOnUserValue;

    public Output</* @Nullable */ String> getSingleSignOnUserValue() {
        return this.singleSignOnUserValue;
    }
    @OutputExport(name="tags", type=List.class, parameters={UserProfileTag.class})
    private Output</* @Nullable */ List<UserProfileTag>> tags;

    public Output</* @Nullable */ List<UserProfileTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="userProfileArn", type=String.class, parameters={})
    private Output<String> userProfileArn;

    public Output<String> getUserProfileArn() {
        return this.userProfileArn;
    }
    @OutputExport(name="userProfileName", type=String.class, parameters={})
    private Output<String> userProfileName;

    public Output<String> getUserProfileName() {
        return this.userProfileName;
    }
    @OutputExport(name="userSettings", type=UserProfileUserSettings.class, parameters={})
    private Output</* @Nullable */ UserProfileUserSettings> userSettings;

    public Output</* @Nullable */ UserProfileUserSettings> getUserSettings() {
        return this.userSettings;
    }

    public UserProfile(String name, UserProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:UserProfile", name, args == null ? UserProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private UserProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:UserProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static UserProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserProfile(name, id, options);
    }
}