// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetUserPoolClientAnalyticsConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final GetUserPoolClientAnalyticsConfiguration Empty = new GetUserPoolClientAnalyticsConfiguration();

    /**
     * (Optional) Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    @InputImport(name="applicationArn", required=true)
      private final String applicationArn;

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * (Optional) Application ID for an Amazon Pinpoint application.
     * 
     */
    @InputImport(name="applicationId", required=true)
      private final String applicationId;

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * (Optional) ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    @InputImport(name="externalId", required=true)
      private final String externalId;

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * (Optional) ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * * `user_data_shared` (Optional) If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="userDataShared", required=true)
      private final Boolean userDataShared;

    public Boolean getUserDataShared() {
        return this.userDataShared;
    }

    public GetUserPoolClientAnalyticsConfiguration(
        String applicationArn,
        String applicationId,
        String externalId,
        String roleArn,
        Boolean userDataShared) {
        this.applicationArn = Objects.requireNonNull(applicationArn, "expected parameter 'applicationArn' to be non-null");
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.externalId = Objects.requireNonNull(externalId, "expected parameter 'externalId' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.userDataShared = Objects.requireNonNull(userDataShared, "expected parameter 'userDataShared' to be non-null");
    }

    private GetUserPoolClientAnalyticsConfiguration() {
        this.applicationArn = null;
        this.applicationId = null;
        this.externalId = null;
        this.roleArn = null;
        this.userDataShared = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolClientAnalyticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationArn;
        private String applicationId;
        private String externalId;
        private String roleArn;
        private Boolean userDataShared;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolClientAnalyticsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationArn = defaults.applicationArn;
    	      this.applicationId = defaults.applicationId;
    	      this.externalId = defaults.externalId;
    	      this.roleArn = defaults.roleArn;
    	      this.userDataShared = defaults.userDataShared;
        }

        public Builder setApplicationArn(String applicationArn) {
            this.applicationArn = Objects.requireNonNull(applicationArn);
            return this;
        }

        public Builder setApplicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setUserDataShared(Boolean userDataShared) {
            this.userDataShared = Objects.requireNonNull(userDataShared);
            return this;
        }
        public GetUserPoolClientAnalyticsConfiguration build() {
            return new GetUserPoolClientAnalyticsConfiguration(applicationArn, applicationId, externalId, roleArn, userDataShared);
        }
    }
}
