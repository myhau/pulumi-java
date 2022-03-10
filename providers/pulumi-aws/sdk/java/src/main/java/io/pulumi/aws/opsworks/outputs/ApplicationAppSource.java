// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationAppSource {
    /**
     * Password to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    private final @Nullable String password;
    /**
     * For sources that are version-aware, the revision to use.
     * 
     */
    private final @Nullable String revision;
    /**
     * SSH key to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    private final @Nullable String sshKey;
    /**
     * The type of source to use. For example, "archive".
     * 
     */
    private final String type;
    /**
     * The URL where the app resource can be found.
     * 
     */
    private final @Nullable String url;
    /**
     * Username to use when authenticating to the source.
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"password","revision","sshKey","type","url","username"})
    private ApplicationAppSource(
        @Nullable String password,
        @Nullable String revision,
        @Nullable String sshKey,
        String type,
        @Nullable String url,
        @Nullable String username) {
        this.password = password;
        this.revision = revision;
        this.sshKey = sshKey;
        this.type = type;
        this.url = url;
        this.username = username;
    }

    /**
     * Password to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * For sources that are version-aware, the revision to use.
     * 
    */
    public Optional<String> getRevision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * SSH key to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
    */
    public Optional<String> getSshKey() {
        return Optional.ofNullable(this.sshKey);
    }
    /**
     * The type of source to use. For example, "archive".
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The URL where the app resource can be found.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }
    /**
     * Username to use when authenticating to the source.
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAppSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable String revision;
        private @Nullable String sshKey;
        private String type;
        private @Nullable String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAppSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.revision = defaults.revision;
    	      this.sshKey = defaults.sshKey;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setRevision(@Nullable String revision) {
            this.revision = revision;
            return this;
        }

        public Builder setSshKey(@Nullable String sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }
        public ApplicationAppSource build() {
            return new ApplicationAppSource(password, revision, sshKey, type, url, username);
        }
    }
}