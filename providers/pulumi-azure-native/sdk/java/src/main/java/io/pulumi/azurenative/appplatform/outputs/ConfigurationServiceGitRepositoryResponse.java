// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationServiceGitRepositoryResponse {
    /**
     * Public sshKey of git repository.
     * 
     */
    private final @Nullable String hostKey;
    /**
     * SshKey algorithm of git repository.
     * 
     */
    private final @Nullable String hostKeyAlgorithm;
    /**
     * Label of the repository
     * 
     */
    private final String label;
    /**
     * Name of the repository
     * 
     */
    private final String name;
    /**
     * Password of git repository basic auth.
     * 
     */
    private final @Nullable String password;
    /**
     * Collection of patterns of the repository
     * 
     */
    private final List<String> patterns;
    /**
     * Private sshKey algorithm of git repository.
     * 
     */
    private final @Nullable String privateKey;
    /**
     * Searching path of the repository
     * 
     */
    private final @Nullable List<String> searchPaths;
    /**
     * Strict host key checking or not.
     * 
     */
    private final @Nullable Boolean strictHostKeyChecking;
    /**
     * URI of the repository
     * 
     */
    private final String uri;
    /**
     * Username of git repository basic auth.
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private ConfigurationServiceGitRepositoryResponse(
        @CustomType.Parameter("hostKey") @Nullable String hostKey,
        @CustomType.Parameter("hostKeyAlgorithm") @Nullable String hostKeyAlgorithm,
        @CustomType.Parameter("label") String label,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("patterns") List<String> patterns,
        @CustomType.Parameter("privateKey") @Nullable String privateKey,
        @CustomType.Parameter("searchPaths") @Nullable List<String> searchPaths,
        @CustomType.Parameter("strictHostKeyChecking") @Nullable Boolean strictHostKeyChecking,
        @CustomType.Parameter("uri") String uri,
        @CustomType.Parameter("username") @Nullable String username) {
        this.hostKey = hostKey;
        this.hostKeyAlgorithm = hostKeyAlgorithm;
        this.label = label;
        this.name = name;
        this.password = password;
        this.patterns = patterns;
        this.privateKey = privateKey;
        this.searchPaths = searchPaths;
        this.strictHostKeyChecking = strictHostKeyChecking;
        this.uri = uri;
        this.username = username;
    }

    /**
     * Public sshKey of git repository.
     * 
    */
    public Optional<String> hostKey() {
        return Optional.ofNullable(this.hostKey);
    }
    /**
     * SshKey algorithm of git repository.
     * 
    */
    public Optional<String> hostKeyAlgorithm() {
        return Optional.ofNullable(this.hostKeyAlgorithm);
    }
    /**
     * Label of the repository
     * 
    */
    public String label() {
        return this.label;
    }
    /**
     * Name of the repository
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Password of git repository basic auth.
     * 
    */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Collection of patterns of the repository
     * 
    */
    public List<String> patterns() {
        return this.patterns;
    }
    /**
     * Private sshKey algorithm of git repository.
     * 
    */
    public Optional<String> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }
    /**
     * Searching path of the repository
     * 
    */
    public List<String> searchPaths() {
        return this.searchPaths == null ? List.of() : this.searchPaths;
    }
    /**
     * Strict host key checking or not.
     * 
    */
    public Optional<Boolean> strictHostKeyChecking() {
        return Optional.ofNullable(this.strictHostKeyChecking);
    }
    /**
     * URI of the repository
     * 
    */
    public String uri() {
        return this.uri;
    }
    /**
     * Username of git repository basic auth.
     * 
    */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceGitRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostKey;
        private @Nullable String hostKeyAlgorithm;
        private String label;
        private String name;
        private @Nullable String password;
        private List<String> patterns;
        private @Nullable String privateKey;
        private @Nullable List<String> searchPaths;
        private @Nullable Boolean strictHostKeyChecking;
        private String uri;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceGitRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostKey = defaults.hostKey;
    	      this.hostKeyAlgorithm = defaults.hostKeyAlgorithm;
    	      this.label = defaults.label;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.patterns = defaults.patterns;
    	      this.privateKey = defaults.privateKey;
    	      this.searchPaths = defaults.searchPaths;
    	      this.strictHostKeyChecking = defaults.strictHostKeyChecking;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder hostKey(@Nullable String hostKey) {
            this.hostKey = hostKey;
            return this;
        }
        public Builder hostKeyAlgorithm(@Nullable String hostKeyAlgorithm) {
            this.hostKeyAlgorithm = hostKeyAlgorithm;
            return this;
        }
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder patterns(List<String> patterns) {
            this.patterns = Objects.requireNonNull(patterns);
            return this;
        }
        public Builder patterns(String... patterns) {
            return patterns(List.of(patterns));
        }
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public Builder searchPaths(@Nullable List<String> searchPaths) {
            this.searchPaths = searchPaths;
            return this;
        }
        public Builder searchPaths(String... searchPaths) {
            return searchPaths(List.of(searchPaths));
        }
        public Builder strictHostKeyChecking(@Nullable Boolean strictHostKeyChecking) {
            this.strictHostKeyChecking = strictHostKeyChecking;
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public ConfigurationServiceGitRepositoryResponse build() {
            return new ConfigurationServiceGitRepositoryResponse(hostKey, hostKeyAlgorithm, label, name, password, patterns, privateKey, searchPaths, strictHostKeyChecking, uri, username);
        }
    }
}
