// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetSSLProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetSSLProxyArgs Empty = new TargetSSLProxyArgs();

    /**
     * A reference to the BackendService resource.
     * 
     */
    @InputImport(name="backendService", required=true)
    private final Input<String> backendService;

    public Input<String> getBackendService() {
        return this.backendService;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Specifies the type of proxy header to append before sending data to
     * the backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    @InputImport(name="proxyHeader")
    private final @Nullable Input<String> proxyHeader;

    public Input<String> getProxyHeader() {
        return this.proxyHeader == null ? Input.empty() : this.proxyHeader;
    }

    /**
     * A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one
     * SSL certificate must be specified.
     * 
     */
    @InputImport(name="sslCertificates", required=true)
    private final Input<List<String>> sslCertificates;

    public Input<List<String>> getSslCertificates() {
        return this.sslCertificates;
    }

    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetSslProxy resource. If not set, the TargetSslProxy
     * resource will not have any SSL policy configured.
     * 
     */
    @InputImport(name="sslPolicy")
    private final @Nullable Input<String> sslPolicy;

    public Input<String> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    public TargetSSLProxyArgs(
        Input<String> backendService,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> proxyHeader,
        Input<List<String>> sslCertificates,
        @Nullable Input<String> sslPolicy) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
        this.description = description;
        this.name = name;
        this.project = project;
        this.proxyHeader = proxyHeader;
        this.sslCertificates = Objects.requireNonNull(sslCertificates, "expected parameter 'sslCertificates' to be non-null");
        this.sslPolicy = sslPolicy;
    }

    private TargetSSLProxyArgs() {
        this.backendService = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.proxyHeader = Input.empty();
        this.sslCertificates = Input.empty();
        this.sslPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetSSLProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backendService;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> proxyHeader;
        private Input<List<String>> sslCertificates;
        private @Nullable Input<String> sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetSSLProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder setBackendService(Input<String> backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Input.of(Objects.requireNonNull(backendService));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setProxyHeader(@Nullable Input<String> proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }

        public Builder setProxyHeader(@Nullable String proxyHeader) {
            this.proxyHeader = Input.ofNullable(proxyHeader);
            return this;
        }

        public Builder setSslCertificates(Input<List<String>> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }

        public Builder setSslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Input.of(Objects.requireNonNull(sslCertificates));
            return this;
        }

        public Builder setSslPolicy(@Nullable Input<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder setSslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Input.ofNullable(sslPolicy);
            return this;
        }

        public TargetSSLProxyArgs build() {
            return new TargetSSLProxyArgs(backendService, description, name, project, proxyHeader, sslCertificates, sslPolicy);
        }
    }
}
