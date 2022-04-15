// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.costmanagement.inputs.SettingsPropertiesCacheArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SettingArgs Empty = new SettingArgs();

    /**
     * Array of scopes with additional details used by Cost Management in the Azure portal.
     * 
     */
    @Import(name="cache")
      private final @Nullable Output<List<SettingsPropertiesCacheArgs>> cache;

    public Output<List<SettingsPropertiesCacheArgs>> cache() {
        return this.cache == null ? Codegen.empty() : this.cache;
    }

    /**
     * Sets the default scope the current user will see when they sign into Azure Cost Management in the Azure portal.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    /**
     * Name of the setting. Allowed values: myscope
     * 
     */
    @Import(name="settingName")
      private final @Nullable Output<String> settingName;

    public Output<String> settingName() {
        return this.settingName == null ? Codegen.empty() : this.settingName;
    }

    /**
     * Indicates what scope Cost Management in the Azure portal should default to. Allowed values: LastUsed.
     * 
     */
    @Import(name="startOn")
      private final @Nullable Output<String> startOn;

    public Output<String> startOn() {
        return this.startOn == null ? Codegen.empty() : this.startOn;
    }

    public SettingArgs(
        @Nullable Output<List<SettingsPropertiesCacheArgs>> cache,
        Output<String> scope,
        @Nullable Output<String> settingName,
        @Nullable Output<String> startOn) {
        this.cache = cache;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.settingName = settingName;
        this.startOn = startOn;
    }

    private SettingArgs() {
        this.cache = Codegen.empty();
        this.scope = Codegen.empty();
        this.settingName = Codegen.empty();
        this.startOn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SettingsPropertiesCacheArgs>> cache;
        private Output<String> scope;
        private @Nullable Output<String> settingName;
        private @Nullable Output<String> startOn;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cache = defaults.cache;
    	      this.scope = defaults.scope;
    	      this.settingName = defaults.settingName;
    	      this.startOn = defaults.startOn;
        }

        public Builder cache(@Nullable Output<List<SettingsPropertiesCacheArgs>> cache) {
            this.cache = cache;
            return this;
        }
        public Builder cache(@Nullable List<SettingsPropertiesCacheArgs> cache) {
            this.cache = Codegen.ofNullable(cache);
            return this;
        }
        public Builder cache(SettingsPropertiesCacheArgs... cache) {
            return cache(List.of(cache));
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder settingName(@Nullable Output<String> settingName) {
            this.settingName = settingName;
            return this;
        }
        public Builder settingName(@Nullable String settingName) {
            this.settingName = Codegen.ofNullable(settingName);
            return this;
        }
        public Builder startOn(@Nullable Output<String> startOn) {
            this.startOn = startOn;
            return this;
        }
        public Builder startOn(@Nullable String startOn) {
            this.startOn = Codegen.ofNullable(startOn);
            return this;
        }        public SettingArgs build() {
            return new SettingArgs(cache, scope, settingName, startOn);
        }
    }
}
