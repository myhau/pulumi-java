// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.websecurityscanner_v1beta.outputs.ScanConfigErrorResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScanRunErrorTraceResponse {
    /**
     * Indicates the error reason code.
     * 
     */
    private final String code;
    /**
     * If the scan encounters TOO_MANY_HTTP_ERRORS, this field indicates the most common HTTP error code, if such is available. For example, if this code is 404, the scan has encountered too many NOT_FOUND responses.
     * 
     */
    private final Integer mostCommonHttpErrorCode;
    /**
     * If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error message encountered during scan configuration validation that is performed before each scan run.
     * 
     */
    private final ScanConfigErrorResponse scanConfigError;

    @OutputCustomType.Constructor({"code","mostCommonHttpErrorCode","scanConfigError"})
    private ScanRunErrorTraceResponse(
        String code,
        Integer mostCommonHttpErrorCode,
        ScanConfigErrorResponse scanConfigError) {
        this.code = code;
        this.mostCommonHttpErrorCode = mostCommonHttpErrorCode;
        this.scanConfigError = scanConfigError;
    }

    /**
     * Indicates the error reason code.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * If the scan encounters TOO_MANY_HTTP_ERRORS, this field indicates the most common HTTP error code, if such is available. For example, if this code is 404, the scan has encountered too many NOT_FOUND responses.
     * 
    */
    public Integer getMostCommonHttpErrorCode() {
        return this.mostCommonHttpErrorCode;
    }
    /**
     * If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error message encountered during scan configuration validation that is performed before each scan run.
     * 
    */
    public ScanConfigErrorResponse getScanConfigError() {
        return this.scanConfigError;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunErrorTraceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private Integer mostCommonHttpErrorCode;
        private ScanConfigErrorResponse scanConfigError;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunErrorTraceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.mostCommonHttpErrorCode = defaults.mostCommonHttpErrorCode;
    	      this.scanConfigError = defaults.scanConfigError;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setMostCommonHttpErrorCode(Integer mostCommonHttpErrorCode) {
            this.mostCommonHttpErrorCode = Objects.requireNonNull(mostCommonHttpErrorCode);
            return this;
        }

        public Builder setScanConfigError(ScanConfigErrorResponse scanConfigError) {
            this.scanConfigError = Objects.requireNonNull(scanConfigError);
            return this;
        }
        public ScanRunErrorTraceResponse build() {
            return new ScanRunErrorTraceResponse(code, mostCommonHttpErrorCode, scanConfigError);
        }
    }
}
