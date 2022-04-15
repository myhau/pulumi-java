// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.BackendAuthorizationHeaderCredentialsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the Credentials used to connect to Backend.
 * 
 */
public final class BackendCredentialsContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendCredentialsContractResponse Empty = new BackendCredentialsContractResponse();

    /**
     * Authorization header authentication
     * 
     */
    @Import(name="authorization")
      private final @Nullable BackendAuthorizationHeaderCredentialsResponse authorization;

    public Optional<BackendAuthorizationHeaderCredentialsResponse> authorization() {
        return this.authorization == null ? Optional.empty() : Optional.ofNullable(this.authorization);
    }

    /**
     * List of Client Certificate Thumbprints. Will be ignored if certificatesIds are provided.
     * 
     */
    @Import(name="certificate")
      private final @Nullable List<String> certificate;

    public List<String> certificate() {
        return this.certificate == null ? List.of() : this.certificate;
    }

    /**
     * List of Client Certificate Ids.
     * 
     */
    @Import(name="certificateIds")
      private final @Nullable List<String> certificateIds;

    public List<String> certificateIds() {
        return this.certificateIds == null ? List.of() : this.certificateIds;
    }

    /**
     * Header Parameter description.
     * 
     */
    @Import(name="header")
      private final @Nullable Map<String,List<String>> header;

    public Map<String,List<String>> header() {
        return this.header == null ? Map.of() : this.header;
    }

    /**
     * Query Parameter description.
     * 
     */
    @Import(name="query")
      private final @Nullable Map<String,List<String>> query;

    public Map<String,List<String>> query() {
        return this.query == null ? Map.of() : this.query;
    }

    public BackendCredentialsContractResponse(
        @Nullable BackendAuthorizationHeaderCredentialsResponse authorization,
        @Nullable List<String> certificate,
        @Nullable List<String> certificateIds,
        @Nullable Map<String,List<String>> header,
        @Nullable Map<String,List<String>> query) {
        this.authorization = authorization;
        this.certificate = certificate;
        this.certificateIds = certificateIds;
        this.header = header;
        this.query = query;
    }

    private BackendCredentialsContractResponse() {
        this.authorization = null;
        this.certificate = List.of();
        this.certificateIds = List.of();
        this.header = Map.of();
        this.query = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendCredentialsContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BackendAuthorizationHeaderCredentialsResponse authorization;
        private @Nullable List<String> certificate;
        private @Nullable List<String> certificateIds;
        private @Nullable Map<String,List<String>> header;
        private @Nullable Map<String,List<String>> query;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendCredentialsContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.certificate = defaults.certificate;
    	      this.certificateIds = defaults.certificateIds;
    	      this.header = defaults.header;
    	      this.query = defaults.query;
        }

        public Builder authorization(@Nullable BackendAuthorizationHeaderCredentialsResponse authorization) {
            this.authorization = authorization;
            return this;
        }
        public Builder certificate(@Nullable List<String> certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificate(String... certificate) {
            return certificate(List.of(certificate));
        }
        public Builder certificateIds(@Nullable List<String> certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }
        public Builder certificateIds(String... certificateIds) {
            return certificateIds(List.of(certificateIds));
        }
        public Builder header(@Nullable Map<String,List<String>> header) {
            this.header = header;
            return this;
        }
        public Builder query(@Nullable Map<String,List<String>> query) {
            this.query = query;
            return this;
        }        public BackendCredentialsContractResponse build() {
            return new BackendCredentialsContractResponse(authorization, certificate, certificateIds, header, query);
        }
    }
}
