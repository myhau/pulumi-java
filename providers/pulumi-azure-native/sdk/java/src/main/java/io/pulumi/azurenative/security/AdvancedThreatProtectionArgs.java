// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AdvancedThreatProtectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdvancedThreatProtectionArgs Empty = new AdvancedThreatProtectionArgs();

    /**
     * Indicates whether Advanced Threat Protection is enabled.
     * 
     */
    @Import(name="isEnabled")
      private final @Nullable Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled == null ? Codegen.empty() : this.isEnabled;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * Advanced Threat Protection setting name.
     * 
     */
    @Import(name="settingName")
      private final @Nullable Output<String> settingName;

    public Output<String> settingName() {
        return this.settingName == null ? Codegen.empty() : this.settingName;
    }

    public AdvancedThreatProtectionArgs(
        @Nullable Output<Boolean> isEnabled,
        Output<String> resourceId,
        @Nullable Output<String> settingName) {
        this.isEnabled = isEnabled;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.settingName = settingName;
    }

    private AdvancedThreatProtectionArgs() {
        this.isEnabled = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.settingName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedThreatProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isEnabled;
        private Output<String> resourceId;
        private @Nullable Output<String> settingName;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedThreatProtectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.resourceId = defaults.resourceId;
    	      this.settingName = defaults.settingName;
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Codegen.ofNullable(isEnabled);
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public Builder settingName(@Nullable Output<String> settingName) {
            this.settingName = settingName;
            return this;
        }
        public Builder settingName(@Nullable String settingName) {
            this.settingName = Codegen.ofNullable(settingName);
            return this;
        }        public AdvancedThreatProtectionArgs build() {
            return new AdvancedThreatProtectionArgs(isEnabled, resourceId, settingName);
        }
    }
}
