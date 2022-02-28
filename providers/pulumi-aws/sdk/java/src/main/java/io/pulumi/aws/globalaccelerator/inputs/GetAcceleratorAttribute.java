// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetAcceleratorAttribute extends io.pulumi.resources.InvokeArgs {

    public static final GetAcceleratorAttribute Empty = new GetAcceleratorAttribute();

    @InputImport(name="flowLogsEnabled", required=true)
      private final Boolean flowLogsEnabled;

    public Boolean getFlowLogsEnabled() {
        return this.flowLogsEnabled;
    }

    @InputImport(name="flowLogsS3Bucket", required=true)
      private final String flowLogsS3Bucket;

    public String getFlowLogsS3Bucket() {
        return this.flowLogsS3Bucket;
    }

    @InputImport(name="flowLogsS3Prefix", required=true)
      private final String flowLogsS3Prefix;

    public String getFlowLogsS3Prefix() {
        return this.flowLogsS3Prefix;
    }

    public GetAcceleratorAttribute(
        Boolean flowLogsEnabled,
        String flowLogsS3Bucket,
        String flowLogsS3Prefix) {
        this.flowLogsEnabled = Objects.requireNonNull(flowLogsEnabled, "expected parameter 'flowLogsEnabled' to be non-null");
        this.flowLogsS3Bucket = Objects.requireNonNull(flowLogsS3Bucket, "expected parameter 'flowLogsS3Bucket' to be non-null");
        this.flowLogsS3Prefix = Objects.requireNonNull(flowLogsS3Prefix, "expected parameter 'flowLogsS3Prefix' to be non-null");
    }

    private GetAcceleratorAttribute() {
        this.flowLogsEnabled = null;
        this.flowLogsS3Bucket = null;
        this.flowLogsS3Prefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAcceleratorAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean flowLogsEnabled;
        private String flowLogsS3Bucket;
        private String flowLogsS3Prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAcceleratorAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowLogsEnabled = defaults.flowLogsEnabled;
    	      this.flowLogsS3Bucket = defaults.flowLogsS3Bucket;
    	      this.flowLogsS3Prefix = defaults.flowLogsS3Prefix;
        }

        public Builder setFlowLogsEnabled(Boolean flowLogsEnabled) {
            this.flowLogsEnabled = Objects.requireNonNull(flowLogsEnabled);
            return this;
        }

        public Builder setFlowLogsS3Bucket(String flowLogsS3Bucket) {
            this.flowLogsS3Bucket = Objects.requireNonNull(flowLogsS3Bucket);
            return this;
        }

        public Builder setFlowLogsS3Prefix(String flowLogsS3Prefix) {
            this.flowLogsS3Prefix = Objects.requireNonNull(flowLogsS3Prefix);
            return this;
        }
        public GetAcceleratorAttribute build() {
            return new GetAcceleratorAttribute(flowLogsEnabled, flowLogsS3Bucket, flowLogsS3Prefix);
        }
    }
}
