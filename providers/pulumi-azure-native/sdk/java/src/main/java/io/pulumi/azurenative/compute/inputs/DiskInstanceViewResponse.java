// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DiskEncryptionSettingsResponse;
import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskInstanceViewResponse Empty = new DiskInstanceViewResponse();

    @InputImport(name="encryptionSettings")
    private final @Nullable List<DiskEncryptionSettingsResponse> encryptionSettings;

    public List<DiskEncryptionSettingsResponse> getEncryptionSettings() {
        return this.encryptionSettings == null ? List.of() : this.encryptionSettings;
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="statuses")
    private final @Nullable List<InstanceViewStatusResponse> statuses;

    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public DiskInstanceViewResponse(
        @Nullable List<DiskEncryptionSettingsResponse> encryptionSettings,
        @Nullable String name,
        @Nullable List<InstanceViewStatusResponse> statuses) {
        this.encryptionSettings = encryptionSettings;
        this.name = name;
        this.statuses = statuses;
    }

    private DiskInstanceViewResponse() {
        this.encryptionSettings = List.of();
        this.name = null;
        this.statuses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DiskEncryptionSettingsResponse> encryptionSettings;
        private @Nullable String name;
        private @Nullable List<InstanceViewStatusResponse> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.name = defaults.name;
    	      this.statuses = defaults.statuses;
        }

        public Builder setEncryptionSettings(@Nullable List<DiskEncryptionSettingsResponse> encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStatuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public DiskInstanceViewResponse build() {
            return new DiskInstanceViewResponse(encryptionSettings, name, statuses);
        }
    }
}