// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileSystemPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemPolicyArgs Empty = new FileSystemPolicyArgs();

    /**
     * A flag to indicate whether to bypass the `aws.efs.FileSystemPolicy` lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request will be locked out from making future `PutFileSystemPolicy` requests on the file system. Set `bypass_policy_lockout_safety_check` to `true` only when you intend to prevent the principal that is making the request from making a subsequent `PutFileSystemPolicy` request on the file system. The default value is `false`.
     * 
     */
    @InputImport(name="bypassPolicyLockoutSafetyCheck")
      private final @Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck;

    public Input<Boolean> getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck == null ? Input.empty() : this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * The ID of the EFS file system.
     * 
     */
    @InputImport(name="fileSystemId", required=true)
      private final Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    public FileSystemPolicyArgs(
        @Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck,
        Input<String> fileSystemId,
        Input<String> policy) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private FileSystemPolicyArgs() {
        this.bypassPolicyLockoutSafetyCheck = Input.empty();
        this.fileSystemId = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck;
        private Input<String> fileSystemId;
        private Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypassPolicyLockoutSafetyCheck = defaults.bypassPolicyLockoutSafetyCheck;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.policy = defaults.policy;
        }

        public Builder setBypassPolicyLockoutSafetyCheck(@Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }

        public Builder setBypassPolicyLockoutSafetyCheck(@Nullable Boolean bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = Input.ofNullable(bypassPolicyLockoutSafetyCheck);
            return this;
        }

        public Builder setFileSystemId(Input<String> fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder setFileSystemId(String fileSystemId) {
            this.fileSystemId = Input.of(Objects.requireNonNull(fileSystemId));
            return this;
        }

        public Builder setPolicy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPolicy(String policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }
        public FileSystemPolicyArgs build() {
            return new FileSystemPolicyArgs(bypassPolicyLockoutSafetyCheck, fileSystemId, policy);
        }
    }
}
