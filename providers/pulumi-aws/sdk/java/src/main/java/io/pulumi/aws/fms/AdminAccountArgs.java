// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fms;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AdminAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdminAccountArgs Empty = new AdminAccountArgs();

    /**
     * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
     * 
     */
    @InputImport(name="accountId")
      private final @Nullable Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId == null ? Input.empty() : this.accountId;
    }

    public AdminAccountArgs(@Nullable Input<String> accountId) {
        this.accountId = accountId;
    }

    private AdminAccountArgs() {
        this.accountId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdminAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountId;

        public Builder() {
    	      // Empty
        }

        public Builder(AdminAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
        }

        public Builder setAccountId(@Nullable Input<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = Input.ofNullable(accountId);
            return this;
        }
        public AdminAccountArgs build() {
            return new AdminAccountArgs(accountId);
        }
    }
}
