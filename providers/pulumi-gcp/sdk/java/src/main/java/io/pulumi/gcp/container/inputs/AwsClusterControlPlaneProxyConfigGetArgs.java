// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AwsClusterControlPlaneProxyConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterControlPlaneProxyConfigGetArgs Empty = new AwsClusterControlPlaneProxyConfigGetArgs();

    /**
     * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy configuration.
     * 
     */
    @InputImport(name="secretArn", required=true)
    private final Input<String> secretArn;

    public Input<String> getSecretArn() {
        return this.secretArn;
    }

    /**
     * The version string of the AWS Secret Manager secret that contains the HTTP(S) proxy configuration.
     * 
     */
    @InputImport(name="secretVersion", required=true)
    private final Input<String> secretVersion;

    public Input<String> getSecretVersion() {
        return this.secretVersion;
    }

    public AwsClusterControlPlaneProxyConfigGetArgs(
        Input<String> secretArn,
        Input<String> secretVersion) {
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
        this.secretVersion = Objects.requireNonNull(secretVersion, "expected parameter 'secretVersion' to be non-null");
    }

    private AwsClusterControlPlaneProxyConfigGetArgs() {
        this.secretArn = Input.empty();
        this.secretVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneProxyConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> secretArn;
        private Input<String> secretVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneProxyConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretArn = defaults.secretArn;
    	      this.secretVersion = defaults.secretVersion;
        }

        public Builder setSecretArn(Input<String> secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder setSecretArn(String secretArn) {
            this.secretArn = Input.of(Objects.requireNonNull(secretArn));
            return this;
        }

        public Builder setSecretVersion(Input<String> secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }

        public Builder setSecretVersion(String secretVersion) {
            this.secretVersion = Input.of(Objects.requireNonNull(secretVersion));
            return this;
        }

        public AwsClusterControlPlaneProxyConfigGetArgs build() {
            return new AwsClusterControlPlaneProxyConfigGetArgs(secretArn, secretVersion);
        }
    }
}
