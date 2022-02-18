// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CryptoKeyState extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyState Empty = new CryptoKeyState();

    /**
     * The period of time that versions of this key spend in the DESTROY_SCHEDULED state before transitioning to DESTROYED.
     * If not specified at creation time, the default duration is 24 hours.
     * 
     */
    @InputImport(name="destroyScheduledDuration")
    private final @Nullable Input<String> destroyScheduledDuration;

    public Input<String> getDestroyScheduledDuration() {
        return this.destroyScheduledDuration == null ? Input.empty() : this.destroyScheduledDuration;
    }

    /**
     * Whether this key may contain imported versions only.
     * 
     */
    @InputImport(name="importOnly")
    private final @Nullable Input<Boolean> importOnly;

    public Input<Boolean> getImportOnly() {
        return this.importOnly == null ? Input.empty() : this.importOnly;
    }

    /**
     * The KeyRing that this key belongs to.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}'`.
     * 
     */
    @InputImport(name="keyRing")
    private final @Nullable Input<String> keyRing;

    public Input<String> getKeyRing() {
        return this.keyRing == null ? Input.empty() : this.keyRing;
    }

    /**
     * Labels with user-defined metadata to apply to this resource.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The resource name for the CryptoKey.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The immutable purpose of this CryptoKey. See the
     * [purpose reference](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKeyPurpose)
     * for possible inputs.
     * Default value is `ENCRYPT_DECRYPT`.
     * Possible values are `ENCRYPT_DECRYPT`, `ASYMMETRIC_SIGN`, and `ASYMMETRIC_DECRYPT`.
     * 
     */
    @InputImport(name="purpose")
    private final @Nullable Input<String> purpose;

    public Input<String> getPurpose() {
        return this.purpose == null ? Input.empty() : this.purpose;
    }

    /**
     * Every time this period passes, generate a new CryptoKeyVersion and set it as the primary.
     * The first rotation will take place after the specified period. The rotation period has
     * the format of a decimal number with up to 9 fractional digits, followed by the
     * letter `s` (seconds). It must be greater than a day (ie, 86400).
     * 
     */
    @InputImport(name="rotationPeriod")
    private final @Nullable Input<String> rotationPeriod;

    public Input<String> getRotationPeriod() {
        return this.rotationPeriod == null ? Input.empty() : this.rotationPeriod;
    }

    /**
     * If set to true, the request will create a CryptoKey without any CryptoKeyVersions.
     * You must use the `gcp.kms.KeyRingImportJob` resource to import the CryptoKeyVersion.
     * 
     */
    @InputImport(name="skipInitialVersionCreation")
    private final @Nullable Input<Boolean> skipInitialVersionCreation;

    public Input<Boolean> getSkipInitialVersionCreation() {
        return this.skipInitialVersionCreation == null ? Input.empty() : this.skipInitialVersionCreation;
    }

    /**
     * A template describing settings for new crypto key versions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="versionTemplate")
    private final @Nullable Input<CryptoKeyVersionTemplateGetArgs> versionTemplate;

    public Input<CryptoKeyVersionTemplateGetArgs> getVersionTemplate() {
        return this.versionTemplate == null ? Input.empty() : this.versionTemplate;
    }

    public CryptoKeyState(
        @Nullable Input<String> destroyScheduledDuration,
        @Nullable Input<Boolean> importOnly,
        @Nullable Input<String> keyRing,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> purpose,
        @Nullable Input<String> rotationPeriod,
        @Nullable Input<Boolean> skipInitialVersionCreation,
        @Nullable Input<CryptoKeyVersionTemplateGetArgs> versionTemplate) {
        this.destroyScheduledDuration = destroyScheduledDuration;
        this.importOnly = importOnly;
        this.keyRing = keyRing;
        this.labels = labels;
        this.name = name;
        this.purpose = purpose;
        this.rotationPeriod = rotationPeriod;
        this.skipInitialVersionCreation = skipInitialVersionCreation;
        this.versionTemplate = versionTemplate;
    }

    private CryptoKeyState() {
        this.destroyScheduledDuration = Input.empty();
        this.importOnly = Input.empty();
        this.keyRing = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.purpose = Input.empty();
        this.rotationPeriod = Input.empty();
        this.skipInitialVersionCreation = Input.empty();
        this.versionTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> destroyScheduledDuration;
        private @Nullable Input<Boolean> importOnly;
        private @Nullable Input<String> keyRing;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> purpose;
        private @Nullable Input<String> rotationPeriod;
        private @Nullable Input<Boolean> skipInitialVersionCreation;
        private @Nullable Input<CryptoKeyVersionTemplateGetArgs> versionTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destroyScheduledDuration = defaults.destroyScheduledDuration;
    	      this.importOnly = defaults.importOnly;
    	      this.keyRing = defaults.keyRing;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.purpose = defaults.purpose;
    	      this.rotationPeriod = defaults.rotationPeriod;
    	      this.skipInitialVersionCreation = defaults.skipInitialVersionCreation;
    	      this.versionTemplate = defaults.versionTemplate;
        }

        public Builder setDestroyScheduledDuration(@Nullable Input<String> destroyScheduledDuration) {
            this.destroyScheduledDuration = destroyScheduledDuration;
            return this;
        }

        public Builder setDestroyScheduledDuration(@Nullable String destroyScheduledDuration) {
            this.destroyScheduledDuration = Input.ofNullable(destroyScheduledDuration);
            return this;
        }

        public Builder setImportOnly(@Nullable Input<Boolean> importOnly) {
            this.importOnly = importOnly;
            return this;
        }

        public Builder setImportOnly(@Nullable Boolean importOnly) {
            this.importOnly = Input.ofNullable(importOnly);
            return this;
        }

        public Builder setKeyRing(@Nullable Input<String> keyRing) {
            this.keyRing = keyRing;
            return this;
        }

        public Builder setKeyRing(@Nullable String keyRing) {
            this.keyRing = Input.ofNullable(keyRing);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPurpose(@Nullable Input<String> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder setPurpose(@Nullable String purpose) {
            this.purpose = Input.ofNullable(purpose);
            return this;
        }

        public Builder setRotationPeriod(@Nullable Input<String> rotationPeriod) {
            this.rotationPeriod = rotationPeriod;
            return this;
        }

        public Builder setRotationPeriod(@Nullable String rotationPeriod) {
            this.rotationPeriod = Input.ofNullable(rotationPeriod);
            return this;
        }

        public Builder setSkipInitialVersionCreation(@Nullable Input<Boolean> skipInitialVersionCreation) {
            this.skipInitialVersionCreation = skipInitialVersionCreation;
            return this;
        }

        public Builder setSkipInitialVersionCreation(@Nullable Boolean skipInitialVersionCreation) {
            this.skipInitialVersionCreation = Input.ofNullable(skipInitialVersionCreation);
            return this;
        }

        public Builder setVersionTemplate(@Nullable Input<CryptoKeyVersionTemplateGetArgs> versionTemplate) {
            this.versionTemplate = versionTemplate;
            return this;
        }

        public Builder setVersionTemplate(@Nullable CryptoKeyVersionTemplateGetArgs versionTemplate) {
            this.versionTemplate = Input.ofNullable(versionTemplate);
            return this;
        }

        public CryptoKeyState build() {
            return new CryptoKeyState(destroyScheduledDuration, importOnly, keyRing, labels, name, purpose, rotationPeriod, skipInitialVersionCreation, versionTemplate);
        }
    }
}
