// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretVersionArgs Empty = new GetSecretVersionArgs();

    /**
     * The project to get the secret version for. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The secret to get the secret version for.
     * 
     */
    @InputImport(name="secret", required=true)
    private final String secret;

    public String getSecret() {
        return this.secret;
    }

    /**
     * The version of the secret to get. If it
     * is not provided, the latest version is retrieved.
     * 
     */
    @InputImport(name="version")
    private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GetSecretVersionArgs(
        @Nullable String project,
        String secret,
        @Nullable String version) {
        this.project = project;
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
        this.version = version;
    }

    private GetSecretVersionArgs() {
        this.project = null;
        this.secret = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String secret;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.version = defaults.version;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public GetSecretVersionArgs build() {
            return new GetSecretVersionArgs(project, secret, version);
        }
    }
}
