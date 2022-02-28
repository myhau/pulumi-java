// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.outputs;

import io.pulumi.aws.guardduty.outputs.OrganizationConfigurationDatasourcesS3Logs;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OrganizationConfigurationDatasources {
    /**
     * Configuration for the builds to store logs to S3.
     * 
     */
    private final @Nullable OrganizationConfigurationDatasourcesS3Logs s3Logs;

    @OutputCustomType.Constructor({"s3Logs"})
    private OrganizationConfigurationDatasources(@Nullable OrganizationConfigurationDatasourcesS3Logs s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * Configuration for the builds to store logs to S3.
     * 
     */
    public Optional<OrganizationConfigurationDatasourcesS3Logs> getS3Logs() {
        return Optional.ofNullable(this.s3Logs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConfigurationDatasources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OrganizationConfigurationDatasourcesS3Logs s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConfigurationDatasources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder setS3Logs(@Nullable OrganizationConfigurationDatasourcesS3Logs s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }
        public OrganizationConfigurationDatasources build() {
            return new OrganizationConfigurationDatasources(s3Logs);
        }
    }
}
