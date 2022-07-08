// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings specific to keys that can be used by iOS apps.
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs Empty = new GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs();

    /**
     * If set to true, allowed_bundle_ids are not enforced.
     * 
     */
    @Import(name="allowAllBundleIds")
    private @Nullable Output<Boolean> allowAllBundleIds;

    /**
     * @return If set to true, allowed_bundle_ids are not enforced.
     * 
     */
    public Optional<Output<Boolean>> allowAllBundleIds() {
        return Optional.ofNullable(this.allowAllBundleIds);
    }

    /**
     * iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
     * 
     */
    @Import(name="allowedBundleIds")
    private @Nullable Output<List<String>> allowedBundleIds;

    /**
     * @return iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
     * 
     */
    public Optional<Output<List<String>>> allowedBundleIds() {
        return Optional.ofNullable(this.allowedBundleIds);
    }

    private GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs() {}

    private GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs $) {
        this.allowAllBundleIds = $.allowAllBundleIds;
        this.allowedBundleIds = $.allowedBundleIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs $;

        public Builder() {
            $ = new GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs();
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs defaults) {
            $ = new GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowAllBundleIds If set to true, allowed_bundle_ids are not enforced.
         * 
         * @return builder
         * 
         */
        public Builder allowAllBundleIds(@Nullable Output<Boolean> allowAllBundleIds) {
            $.allowAllBundleIds = allowAllBundleIds;
            return this;
        }

        /**
         * @param allowAllBundleIds If set to true, allowed_bundle_ids are not enforced.
         * 
         * @return builder
         * 
         */
        public Builder allowAllBundleIds(Boolean allowAllBundleIds) {
            return allowAllBundleIds(Output.of(allowAllBundleIds));
        }

        /**
         * @param allowedBundleIds iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(@Nullable Output<List<String>> allowedBundleIds) {
            $.allowedBundleIds = allowedBundleIds;
            return this;
        }

        /**
         * @param allowedBundleIds iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(List<String> allowedBundleIds) {
            return allowedBundleIds(Output.of(allowedBundleIds));
        }

        /**
         * @param allowedBundleIds iOS bundle ids of apps allowed to use the key. Example: &#39;com.companyname.productname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }

        public GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs build() {
            return $;
        }
    }

}
