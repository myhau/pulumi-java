// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeScriptActionResponse {
    /**
     * The application name of the script action, if any.
     * 
     */
    private final String applicationName;
    /**
     * The name of the script action.
     * 
     */
    private final String name;
    /**
     * The parameters for the script
     * 
     */
    private final @Nullable String parameters;
    /**
     * The list of roles where script will be executed.
     * 
     */
    private final List<String> roles;
    /**
     * The URI to the script.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private RuntimeScriptActionResponse(
        @CustomType.Parameter("applicationName") String applicationName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable String parameters,
        @CustomType.Parameter("roles") List<String> roles,
        @CustomType.Parameter("uri") String uri) {
        this.applicationName = applicationName;
        this.name = name;
        this.parameters = parameters;
        this.roles = roles;
        this.uri = uri;
    }

    /**
     * The application name of the script action, if any.
     * 
    */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * The name of the script action.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The parameters for the script
     * 
    */
    public Optional<String> parameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * The list of roles where script will be executed.
     * 
    */
    public List<String> roles() {
        return this.roles;
    }
    /**
     * The URI to the script.
     * 
    */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeScriptActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String name;
        private @Nullable String parameters;
        private List<String> roles;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeScriptActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.roles = defaults.roles;
    	      this.uri = defaults.uri;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder roles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public RuntimeScriptActionResponse build() {
            return new RuntimeScriptActionResponse(applicationName, name, parameters, roles, uri);
        }
    }
}
