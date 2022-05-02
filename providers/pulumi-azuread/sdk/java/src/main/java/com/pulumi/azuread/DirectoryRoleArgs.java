// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DirectoryRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DirectoryRoleArgs Empty = new DirectoryRoleArgs();

    /**
     * The display name of the directory role to activate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the directory role to activate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The object ID of the role template from which to activate the directory role. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="templateId")
    private @Nullable Output<String> templateId;

    /**
     * @return The object ID of the role template from which to activate the directory role. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    private DirectoryRoleArgs() {}

    private DirectoryRoleArgs(DirectoryRoleArgs $) {
        this.displayName = $.displayName;
        this.templateId = $.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DirectoryRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DirectoryRoleArgs $;

        public Builder() {
            $ = new DirectoryRoleArgs();
        }

        public Builder(DirectoryRoleArgs defaults) {
            $ = new DirectoryRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The display name of the directory role to activate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the directory role to activate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param templateId The object ID of the role template from which to activate the directory role. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder templateId(@Nullable Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId The object ID of the role template from which to activate the directory role. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        public DirectoryRoleArgs build() {
            return $;
        }
    }

}
