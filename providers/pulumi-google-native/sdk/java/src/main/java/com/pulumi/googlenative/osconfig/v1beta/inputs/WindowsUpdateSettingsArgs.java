// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig.v1beta.enums.WindowsUpdateSettingsClassificationsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Windows patching is performed using the Windows Update Agent.
 * 
 */
public final class WindowsUpdateSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsUpdateSettingsArgs Empty = new WindowsUpdateSettingsArgs();

    /**
     * Only apply updates of these windows update classifications. If empty, all updates are applied.
     * 
     */
    @Import(name="classifications")
    private @Nullable Output<List<WindowsUpdateSettingsClassificationsItem>> classifications;

    /**
     * @return Only apply updates of these windows update classifications. If empty, all updates are applied.
     * 
     */
    public Optional<Output<List<WindowsUpdateSettingsClassificationsItem>>> classifications() {
        return Optional.ofNullable(this.classifications);
    }

    /**
     * List of KBs to exclude from update.
     * 
     */
    @Import(name="excludes")
    private @Nullable Output<List<String>> excludes;

    /**
     * @return List of KBs to exclude from update.
     * 
     */
    public Optional<Output<List<String>>> excludes() {
        return Optional.ofNullable(this.excludes);
    }

    /**
     * An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
     * 
     */
    @Import(name="exclusivePatches")
    private @Nullable Output<List<String>> exclusivePatches;

    /**
     * @return An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
     * 
     */
    public Optional<Output<List<String>>> exclusivePatches() {
        return Optional.ofNullable(this.exclusivePatches);
    }

    private WindowsUpdateSettingsArgs() {}

    private WindowsUpdateSettingsArgs(WindowsUpdateSettingsArgs $) {
        this.classifications = $.classifications;
        this.excludes = $.excludes;
        this.exclusivePatches = $.exclusivePatches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsUpdateSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsUpdateSettingsArgs $;

        public Builder() {
            $ = new WindowsUpdateSettingsArgs();
        }

        public Builder(WindowsUpdateSettingsArgs defaults) {
            $ = new WindowsUpdateSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classifications Only apply updates of these windows update classifications. If empty, all updates are applied.
         * 
         * @return builder
         * 
         */
        public Builder classifications(@Nullable Output<List<WindowsUpdateSettingsClassificationsItem>> classifications) {
            $.classifications = classifications;
            return this;
        }

        /**
         * @param classifications Only apply updates of these windows update classifications. If empty, all updates are applied.
         * 
         * @return builder
         * 
         */
        public Builder classifications(List<WindowsUpdateSettingsClassificationsItem> classifications) {
            return classifications(Output.of(classifications));
        }

        /**
         * @param classifications Only apply updates of these windows update classifications. If empty, all updates are applied.
         * 
         * @return builder
         * 
         */
        public Builder classifications(WindowsUpdateSettingsClassificationsItem... classifications) {
            return classifications(List.of(classifications));
        }

        /**
         * @param excludes List of KBs to exclude from update.
         * 
         * @return builder
         * 
         */
        public Builder excludes(@Nullable Output<List<String>> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes List of KBs to exclude from update.
         * 
         * @return builder
         * 
         */
        public Builder excludes(List<String> excludes) {
            return excludes(Output.of(excludes));
        }

        /**
         * @param excludes List of KBs to exclude from update.
         * 
         * @return builder
         * 
         */
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        /**
         * @param exclusivePatches An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePatches(@Nullable Output<List<String>> exclusivePatches) {
            $.exclusivePatches = exclusivePatches;
            return this;
        }

        /**
         * @param exclusivePatches An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePatches(List<String> exclusivePatches) {
            return exclusivePatches(Output.of(exclusivePatches));
        }

        /**
         * @param exclusivePatches An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePatches(String... exclusivePatches) {
            return exclusivePatches(List.of(exclusivePatches));
        }

        public WindowsUpdateSettingsArgs build() {
            return $;
        }
    }

}
