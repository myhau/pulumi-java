// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.binaryauthorization.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.binaryauthorization.v1beta1.inputs.UserOwnedDrydockNoteArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttestorArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttestorArgs Empty = new AttestorArgs();

    /**
     * Required. The attestors ID.
     * 
     */
    @Import(name="attestorId", required=true)
    private Output<String> attestorId;

    /**
     * @return Required. The attestors ID.
     * 
     */
    public Output<String> attestorId() {
        return this.attestorId;
    }

    /**
     * Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. A checksum, returned by the server, that can be sent on update requests to ensure the attestor has an up-to-date value before attempting to update it. See https://google.aip.dev/154.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Optional. A checksum, returned by the server, that can be sent on update requests to ensure the attestor has an up-to-date value before attempting to update it. See https://google.aip.dev/154.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A Drydock ATTESTATION_AUTHORITY Note, created by the user.
     * 
     */
    @Import(name="userOwnedDrydockNote")
    private @Nullable Output<UserOwnedDrydockNoteArgs> userOwnedDrydockNote;

    /**
     * @return A Drydock ATTESTATION_AUTHORITY Note, created by the user.
     * 
     */
    public Optional<Output<UserOwnedDrydockNoteArgs>> userOwnedDrydockNote() {
        return Optional.ofNullable(this.userOwnedDrydockNote);
    }

    private AttestorArgs() {}

    private AttestorArgs(AttestorArgs $) {
        this.attestorId = $.attestorId;
        this.description = $.description;
        this.etag = $.etag;
        this.name = $.name;
        this.project = $.project;
        this.userOwnedDrydockNote = $.userOwnedDrydockNote;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttestorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestorArgs $;

        public Builder() {
            $ = new AttestorArgs();
        }

        public Builder(AttestorArgs defaults) {
            $ = new AttestorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestorId Required. The attestors ID.
         * 
         * @return builder
         * 
         */
        public Builder attestorId(Output<String> attestorId) {
            $.attestorId = attestorId;
            return this;
        }

        /**
         * @param attestorId Required. The attestors ID.
         * 
         * @return builder
         * 
         */
        public Builder attestorId(String attestorId) {
            return attestorId(Output.of(attestorId));
        }

        /**
         * @param description Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param etag Optional. A checksum, returned by the server, that can be sent on update requests to ensure the attestor has an up-to-date value before attempting to update it. See https://google.aip.dev/154.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Optional. A checksum, returned by the server, that can be sent on update requests to ensure the attestor has an up-to-date value before attempting to update it. See https://google.aip.dev/154.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param name The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param userOwnedDrydockNote A Drydock ATTESTATION_AUTHORITY Note, created by the user.
         * 
         * @return builder
         * 
         */
        public Builder userOwnedDrydockNote(@Nullable Output<UserOwnedDrydockNoteArgs> userOwnedDrydockNote) {
            $.userOwnedDrydockNote = userOwnedDrydockNote;
            return this;
        }

        /**
         * @param userOwnedDrydockNote A Drydock ATTESTATION_AUTHORITY Note, created by the user.
         * 
         * @return builder
         * 
         */
        public Builder userOwnedDrydockNote(UserOwnedDrydockNoteArgs userOwnedDrydockNote) {
            return userOwnedDrydockNote(Output.of(userOwnedDrydockNote));
        }

        public AttestorArgs build() {
            $.attestorId = Objects.requireNonNull($.attestorId, "expected parameter 'attestorId' to be non-null");
            return $;
        }
    }

}
