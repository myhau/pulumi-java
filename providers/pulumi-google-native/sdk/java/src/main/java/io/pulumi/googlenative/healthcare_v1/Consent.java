// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1.ConsentArgs;
import io.pulumi.googlenative.healthcare_v1.outputs.GoogleCloudHealthcareV1ConsentPolicyResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:healthcare/v1:Consent")
public class Consent extends io.pulumi.resources.CustomResource {
    @OutputExport(name="consentArtifact", type=String.class, parameters={})
    private Output<String> consentArtifact;

    public Output<String> getConsentArtifact() {
        return this.consentArtifact;
    }
    @OutputExport(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="policies", type=List.class, parameters={GoogleCloudHealthcareV1ConsentPolicyResponse.class})
    private Output<List<GoogleCloudHealthcareV1ConsentPolicyResponse>> policies;

    public Output<List<GoogleCloudHealthcareV1ConsentPolicyResponse>> getPolicies() {
        return this.policies;
    }
    @OutputExport(name="revisionCreateTime", type=String.class, parameters={})
    private Output<String> revisionCreateTime;

    public Output<String> getRevisionCreateTime() {
        return this.revisionCreateTime;
    }
    @OutputExport(name="revisionId", type=String.class, parameters={})
    private Output<String> revisionId;

    public Output<String> getRevisionId() {
        return this.revisionId;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="ttl", type=String.class, parameters={})
    private Output<String> ttl;

    public Output<String> getTtl() {
        return this.ttl;
    }
    @OutputExport(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    public Output<String> getUserId() {
        return this.userId;
    }

    public Consent(String name, ConsentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:Consent", name, args == null ? ConsentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Consent(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:Consent", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Consent get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Consent(name, id, options);
    }
}