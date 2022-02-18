// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.oslogin.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshPublicKeyState extends io.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyState Empty = new SshPublicKeyState();

    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    @InputImport(name="expirationTimeUsec")
    private final @Nullable Input<String> expirationTimeUsec;

    public Input<String> getExpirationTimeUsec() {
        return this.expirationTimeUsec == null ? Input.empty() : this.expirationTimeUsec;
    }

    /**
     * The SHA-256 fingerprint of the SSH public key.
     * 
     */
    @InputImport(name="fingerprint")
    private final @Nullable Input<String> fingerprint;

    public Input<String> getFingerprint() {
        return this.fingerprint == null ? Input.empty() : this.fingerprint;
    }

    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * The project ID of the Google Cloud Platform project.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The user email.
     * 
     */
    @InputImport(name="user")
    private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public SshPublicKeyState(
        @Nullable Input<String> expirationTimeUsec,
        @Nullable Input<String> fingerprint,
        @Nullable Input<String> key,
        @Nullable Input<String> project,
        @Nullable Input<String> user) {
        this.expirationTimeUsec = expirationTimeUsec;
        this.fingerprint = fingerprint;
        this.key = key;
        this.project = project;
        this.user = user;
    }

    private SshPublicKeyState() {
        this.expirationTimeUsec = Input.empty();
        this.fingerprint = Input.empty();
        this.key = Input.empty();
        this.project = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expirationTimeUsec;
        private @Nullable Input<String> fingerprint;
        private @Nullable Input<String> key;
        private @Nullable Input<String> project;
        private @Nullable Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTimeUsec = defaults.expirationTimeUsec;
    	      this.fingerprint = defaults.fingerprint;
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.user = defaults.user;
        }

        public Builder setExpirationTimeUsec(@Nullable Input<String> expirationTimeUsec) {
            this.expirationTimeUsec = expirationTimeUsec;
            return this;
        }

        public Builder setExpirationTimeUsec(@Nullable String expirationTimeUsec) {
            this.expirationTimeUsec = Input.ofNullable(expirationTimeUsec);
            return this;
        }

        public Builder setFingerprint(@Nullable Input<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder setFingerprint(@Nullable String fingerprint) {
            this.fingerprint = Input.ofNullable(fingerprint);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setUser(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }

        public SshPublicKeyState build() {
            return new SshPublicKeyState(expirationTimeUsec, fingerprint, key, project, user);
        }
    }
}
