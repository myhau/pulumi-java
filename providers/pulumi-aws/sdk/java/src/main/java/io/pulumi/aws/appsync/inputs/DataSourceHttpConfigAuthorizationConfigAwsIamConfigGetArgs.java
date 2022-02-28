// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs Empty = new DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs();

    /**
     * The signing Amazon Web Services Region for IAM authorization.
     * 
     */
    @InputImport(name="signingRegion")
      private final @Nullable Input<String> signingRegion;

    public Input<String> getSigningRegion() {
        return this.signingRegion == null ? Input.empty() : this.signingRegion;
    }

    /**
     * The signing service name for IAM authorization.
     * 
     */
    @InputImport(name="signingServiceName")
      private final @Nullable Input<String> signingServiceName;

    public Input<String> getSigningServiceName() {
        return this.signingServiceName == null ? Input.empty() : this.signingServiceName;
    }

    public DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs(
        @Nullable Input<String> signingRegion,
        @Nullable Input<String> signingServiceName) {
        this.signingRegion = signingRegion;
        this.signingServiceName = signingServiceName;
    }

    private DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs() {
        this.signingRegion = Input.empty();
        this.signingServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> signingRegion;
        private @Nullable Input<String> signingServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingRegion = defaults.signingRegion;
    	      this.signingServiceName = defaults.signingServiceName;
        }

        public Builder setSigningRegion(@Nullable Input<String> signingRegion) {
            this.signingRegion = signingRegion;
            return this;
        }

        public Builder setSigningRegion(@Nullable String signingRegion) {
            this.signingRegion = Input.ofNullable(signingRegion);
            return this;
        }

        public Builder setSigningServiceName(@Nullable Input<String> signingServiceName) {
            this.signingServiceName = signingServiceName;
            return this;
        }

        public Builder setSigningServiceName(@Nullable String signingServiceName) {
            this.signingServiceName = Input.ofNullable(signingServiceName);
            return this;
        }
        public DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs build() {
            return new DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs(signingRegion, signingServiceName);
        }
    }
}
