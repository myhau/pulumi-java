// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationAppRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationAppRoleArgs Empty = new ApplicationAppRoleArgs();

    /**
     * Specifies whether this app role definition can be assigned to users and groups by setting to `User`, or to other applications (that are accessing this application in a standalone scenario) by setting to `Application`, or to both.
     * 
     */
    @Import(name="allowedMemberTypes", required=true)
    private Output<List<String>> allowedMemberTypes;

    /**
     * @return Specifies whether this app role definition can be assigned to users and groups by setting to `User`, or to other applications (that are accessing this application in a standalone scenario) by setting to `Application`, or to both.
     * 
     */
    public Output<List<String>> allowedMemberTypes() {
        return this.allowedMemberTypes;
    }

    /**
     * Description of the app role that appears when the role is being assigned and, if the role functions as an application permissions, during the consent experiences.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description of the app role that appears when the role is being assigned and, if the role functions as an application permissions, during the consent experiences.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Display name for the app role that appears during app role assignment and in consent experiences.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Display name for the app role that appears during app role assignment and in consent experiences.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Determines if the app role is enabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Determines if the app role is enabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The unique identifier of the app role. Must be a valid UUID.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique identifier of the app role. Must be a valid UUID.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The value that is used for the `roles` claim in ID tokens and OAuth 2.0 access tokens that are authenticating an assigned service or user principal.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value that is used for the `roles` claim in ID tokens and OAuth 2.0 access tokens that are authenticating an assigned service or user principal.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ApplicationAppRoleArgs() {}

    private ApplicationAppRoleArgs(ApplicationAppRoleArgs $) {
        this.allowedMemberTypes = $.allowedMemberTypes;
        this.description = $.description;
        this.displayName = $.displayName;
        this.enabled = $.enabled;
        this.id = $.id;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationAppRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationAppRoleArgs $;

        public Builder() {
            $ = new ApplicationAppRoleArgs();
        }

        public Builder(ApplicationAppRoleArgs defaults) {
            $ = new ApplicationAppRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedMemberTypes Specifies whether this app role definition can be assigned to users and groups by setting to `User`, or to other applications (that are accessing this application in a standalone scenario) by setting to `Application`, or to both.
         * 
         * @return builder
         * 
         */
        public Builder allowedMemberTypes(Output<List<String>> allowedMemberTypes) {
            $.allowedMemberTypes = allowedMemberTypes;
            return this;
        }

        /**
         * @param allowedMemberTypes Specifies whether this app role definition can be assigned to users and groups by setting to `User`, or to other applications (that are accessing this application in a standalone scenario) by setting to `Application`, or to both.
         * 
         * @return builder
         * 
         */
        public Builder allowedMemberTypes(List<String> allowedMemberTypes) {
            return allowedMemberTypes(Output.of(allowedMemberTypes));
        }

        /**
         * @param allowedMemberTypes Specifies whether this app role definition can be assigned to users and groups by setting to `User`, or to other applications (that are accessing this application in a standalone scenario) by setting to `Application`, or to both.
         * 
         * @return builder
         * 
         */
        public Builder allowedMemberTypes(String... allowedMemberTypes) {
            return allowedMemberTypes(List.of(allowedMemberTypes));
        }

        /**
         * @param description Description of the app role that appears when the role is being assigned and, if the role functions as an application permissions, during the consent experiences.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the app role that appears when the role is being assigned and, if the role functions as an application permissions, during the consent experiences.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display name for the app role that appears during app role assignment and in consent experiences.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name for the app role that appears during app role assignment and in consent experiences.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enabled Determines if the app role is enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Determines if the app role is enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param id The unique identifier of the app role. Must be a valid UUID.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier of the app role. Must be a valid UUID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param value The value that is used for the `roles` claim in ID tokens and OAuth 2.0 access tokens that are authenticating an assigned service or user principal.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value that is used for the `roles` claim in ID tokens and OAuth 2.0 access tokens that are authenticating an assigned service or user principal.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ApplicationAppRoleArgs build() {
            $.allowedMemberTypes = Objects.requireNonNull($.allowedMemberTypes, "expected parameter 'allowedMemberTypes' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
