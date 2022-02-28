// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetListenerDefaultActionRedirect extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionRedirect Empty = new GetListenerDefaultActionRedirect();

    @InputImport(name="host", required=true)
      private final String host;

    public String getHost() {
        return this.host;
    }

    @InputImport(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * Port of the listener. Required if `arn` is not set.
     * 
     */
    @InputImport(name="port", required=true)
      private final String port;

    public String getPort() {
        return this.port;
    }

    @InputImport(name="protocol", required=true)
      private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    @InputImport(name="query", required=true)
      private final String query;

    public String getQuery() {
        return this.query;
    }

    @InputImport(name="statusCode", required=true)
      private final String statusCode;

    public String getStatusCode() {
        return this.statusCode;
    }

    public GetListenerDefaultActionRedirect(
        String host,
        String path,
        String port,
        String protocol,
        String query,
        String statusCode) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private GetListenerDefaultActionRedirect() {
        this.host = null;
        this.path = null;
        this.port = null;
        this.protocol = null;
        this.query = null;
        this.statusCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionRedirect defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private String path;
        private String port;
        private String protocol;
        private String query;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPort(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setStatusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public GetListenerDefaultActionRedirect build() {
            return new GetListenerDefaultActionRedirect(host, path, port, protocol, query, statusCode);
        }
    }
}
