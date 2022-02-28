// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResponseHeadersPolicyCustomHeadersConfigItem {
    /**
     * The HTTP response header name.
     * 
     */
    private final String header;
    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private final Boolean override;
    /**
     * The value for the HTTP response header.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"header","override","value"})
    private ResponseHeadersPolicyCustomHeadersConfigItem(
        String header,
        Boolean override,
        String value) {
        this.header = Objects.requireNonNull(header);
        this.override = Objects.requireNonNull(override);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The HTTP response header name.
     * 
     */
    public String getHeader() {
        return this.header;
    }
    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Boolean getOverride() {
        return this.override;
    }
    /**
     * The value for the HTTP response header.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCustomHeadersConfigItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String header;
        private Boolean override;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCustomHeadersConfigItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.override = defaults.override;
    	      this.value = defaults.value;
        }

        public Builder setHeader(String header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }

        public Builder setOverride(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ResponseHeadersPolicyCustomHeadersConfigItem build() {
            return new ResponseHeadersPolicyCustomHeadersConfigItem(header, override, value);
        }
    }
}
