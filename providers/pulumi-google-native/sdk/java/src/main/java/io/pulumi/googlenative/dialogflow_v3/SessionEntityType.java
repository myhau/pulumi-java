// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3.SessionEntityTypeArgs;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3EntityTypeEntityResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:dialogflow/v3:SessionEntityType")
public class SessionEntityType extends io.pulumi.resources.CustomResource {
    @OutputExport(name="entities", type=List.class, parameters={GoogleCloudDialogflowCxV3EntityTypeEntityResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3EntityTypeEntityResponse>> entities;

    public Output<List<GoogleCloudDialogflowCxV3EntityTypeEntityResponse>> getEntities() {
        return this.entities;
    }
    @OutputExport(name="entityOverrideMode", type=String.class, parameters={})
    private Output<String> entityOverrideMode;

    public Output<String> getEntityOverrideMode() {
        return this.entityOverrideMode;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public SessionEntityType(String name, SessionEntityTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:SessionEntityType", name, args == null ? SessionEntityTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SessionEntityType(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:SessionEntityType", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SessionEntityType get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SessionEntityType(name, id, options);
    }
}