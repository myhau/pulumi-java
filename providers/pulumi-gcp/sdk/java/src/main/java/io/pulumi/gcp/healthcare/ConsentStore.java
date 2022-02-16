// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.ConsentStoreArgs;
import io.pulumi.gcp.healthcare.inputs.ConsentStoreState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="gcp:healthcare/consentStore:ConsentStore")
public class ConsentStore extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dataset", type=String.class, parameters={})
    private Output<String> dataset;

    public Output<String> getDataset() {
        return this.dataset;
    }
    @OutputExport(name="defaultConsentTtl", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultConsentTtl;

    public Output</* @Nullable */ String> getDefaultConsentTtl() {
        return this.defaultConsentTtl;
    }
    @OutputExport(name="enableConsentCreateOnUpdate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableConsentCreateOnUpdate;

    public Output</* @Nullable */ Boolean> getEnableConsentCreateOnUpdate() {
        return this.enableConsentCreateOnUpdate;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ConsentStore(String name, ConsentStoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/consentStore:ConsentStore", name, args == null ? ConsentStoreArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConsentStore(String name, Input<String> id, @Nullable ConsentStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/consentStore:ConsentStore", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ConsentStore get(String name, Input<String> id, @Nullable ConsentStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConsentStore(name, id, state, options);
    }
}