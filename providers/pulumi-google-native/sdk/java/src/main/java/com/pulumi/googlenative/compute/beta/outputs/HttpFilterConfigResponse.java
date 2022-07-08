// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HttpFilterConfigResponse {
    /**
     * @return The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
     * 
     */
    private final String config;
    /**
     * @return The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
     * 
     */
    private final String configTypeUrl;
    /**
     * @return Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
     * 
     */
    private final String filterName;

    @CustomType.Constructor
    private HttpFilterConfigResponse(
        @CustomType.Parameter("config") String config,
        @CustomType.Parameter("configTypeUrl") String configTypeUrl,
        @CustomType.Parameter("filterName") String filterName) {
        this.config = config;
        this.configTypeUrl = configTypeUrl;
        this.filterName = filterName;
    }

    /**
     * @return The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
     * 
     */
    public String config() {
        return this.config;
    }
    /**
     * @return The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
     * 
     */
    public String configTypeUrl() {
        return this.configTypeUrl;
    }
    /**
     * @return Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
     * 
     */
    public String filterName() {
        return this.filterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFilterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String config;
        private String configTypeUrl;
        private String filterName;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFilterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.configTypeUrl = defaults.configTypeUrl;
    	      this.filterName = defaults.filterName;
        }

        public Builder config(String config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder configTypeUrl(String configTypeUrl) {
            this.configTypeUrl = Objects.requireNonNull(configTypeUrl);
            return this;
        }
        public Builder filterName(String filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }        public HttpFilterConfigResponse build() {
            return new HttpFilterConfigResponse(config, configTypeUrl, filterName);
        }
    }
}
