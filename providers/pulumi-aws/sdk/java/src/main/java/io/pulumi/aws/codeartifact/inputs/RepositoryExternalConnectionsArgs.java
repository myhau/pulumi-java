// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryExternalConnectionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryExternalConnectionsArgs Empty = new RepositoryExternalConnectionsArgs();

    /**
     * The name of the external connection associated with a repository.
     * 
     */
    @InputImport(name="externalConnectionName", required=true)
      private final Input<String> externalConnectionName;

    public Input<String> getExternalConnectionName() {
        return this.externalConnectionName;
    }

    @InputImport(name="packageFormat")
      private final @Nullable Input<String> packageFormat;

    public Input<String> getPackageFormat() {
        return this.packageFormat == null ? Input.empty() : this.packageFormat;
    }

    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public RepositoryExternalConnectionsArgs(
        Input<String> externalConnectionName,
        @Nullable Input<String> packageFormat,
        @Nullable Input<String> status) {
        this.externalConnectionName = Objects.requireNonNull(externalConnectionName, "expected parameter 'externalConnectionName' to be non-null");
        this.packageFormat = packageFormat;
        this.status = status;
    }

    private RepositoryExternalConnectionsArgs() {
        this.externalConnectionName = Input.empty();
        this.packageFormat = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryExternalConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> externalConnectionName;
        private @Nullable Input<String> packageFormat;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryExternalConnectionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalConnectionName = defaults.externalConnectionName;
    	      this.packageFormat = defaults.packageFormat;
    	      this.status = defaults.status;
        }

        public Builder setExternalConnectionName(Input<String> externalConnectionName) {
            this.externalConnectionName = Objects.requireNonNull(externalConnectionName);
            return this;
        }

        public Builder setExternalConnectionName(String externalConnectionName) {
            this.externalConnectionName = Input.of(Objects.requireNonNull(externalConnectionName));
            return this;
        }

        public Builder setPackageFormat(@Nullable Input<String> packageFormat) {
            this.packageFormat = packageFormat;
            return this;
        }

        public Builder setPackageFormat(@Nullable String packageFormat) {
            this.packageFormat = Input.ofNullable(packageFormat);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public RepositoryExternalConnectionsArgs build() {
            return new RepositoryExternalConnectionsArgs(externalConnectionName, packageFormat, status);
        }
    }
}
