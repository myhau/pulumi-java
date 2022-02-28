// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VaultNotificationsState extends io.pulumi.resources.ResourceArgs {

    public static final VaultNotificationsState Empty = new VaultNotificationsState();

    /**
     * The ARN of the vault.
     * 
     */
    @InputImport(name="backupVaultArn")
      private final @Nullable Input<String> backupVaultArn;

    public Input<String> getBackupVaultArn() {
        return this.backupVaultArn == null ? Input.empty() : this.backupVaultArn;
    }

    /**
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * 
     */
    @InputImport(name="backupVaultEvents")
      private final @Nullable Input<List<String>> backupVaultEvents;

    public Input<List<String>> getBackupVaultEvents() {
        return this.backupVaultEvents == null ? Input.empty() : this.backupVaultEvents;
    }

    /**
     * Name of the backup vault to add notifications for.
     * 
     */
    @InputImport(name="backupVaultName")
      private final @Nullable Input<String> backupVaultName;

    public Input<String> getBackupVaultName() {
        return this.backupVaultName == null ? Input.empty() : this.backupVaultName;
    }

    /**
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
     * 
     */
    @InputImport(name="snsTopicArn")
      private final @Nullable Input<String> snsTopicArn;

    public Input<String> getSnsTopicArn() {
        return this.snsTopicArn == null ? Input.empty() : this.snsTopicArn;
    }

    public VaultNotificationsState(
        @Nullable Input<String> backupVaultArn,
        @Nullable Input<List<String>> backupVaultEvents,
        @Nullable Input<String> backupVaultName,
        @Nullable Input<String> snsTopicArn) {
        this.backupVaultArn = backupVaultArn;
        this.backupVaultEvents = backupVaultEvents;
        this.backupVaultName = backupVaultName;
        this.snsTopicArn = snsTopicArn;
    }

    private VaultNotificationsState() {
        this.backupVaultArn = Input.empty();
        this.backupVaultEvents = Input.empty();
        this.backupVaultName = Input.empty();
        this.snsTopicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultNotificationsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backupVaultArn;
        private @Nullable Input<List<String>> backupVaultEvents;
        private @Nullable Input<String> backupVaultName;
        private @Nullable Input<String> snsTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultNotificationsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultArn = defaults.backupVaultArn;
    	      this.backupVaultEvents = defaults.backupVaultEvents;
    	      this.backupVaultName = defaults.backupVaultName;
    	      this.snsTopicArn = defaults.snsTopicArn;
        }

        public Builder setBackupVaultArn(@Nullable Input<String> backupVaultArn) {
            this.backupVaultArn = backupVaultArn;
            return this;
        }

        public Builder setBackupVaultArn(@Nullable String backupVaultArn) {
            this.backupVaultArn = Input.ofNullable(backupVaultArn);
            return this;
        }

        public Builder setBackupVaultEvents(@Nullable Input<List<String>> backupVaultEvents) {
            this.backupVaultEvents = backupVaultEvents;
            return this;
        }

        public Builder setBackupVaultEvents(@Nullable List<String> backupVaultEvents) {
            this.backupVaultEvents = Input.ofNullable(backupVaultEvents);
            return this;
        }

        public Builder setBackupVaultName(@Nullable Input<String> backupVaultName) {
            this.backupVaultName = backupVaultName;
            return this;
        }

        public Builder setBackupVaultName(@Nullable String backupVaultName) {
            this.backupVaultName = Input.ofNullable(backupVaultName);
            return this;
        }

        public Builder setSnsTopicArn(@Nullable Input<String> snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }

        public Builder setSnsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = Input.ofNullable(snsTopicArn);
            return this;
        }
        public VaultNotificationsState build() {
            return new VaultNotificationsState(backupVaultArn, backupVaultEvents, backupVaultName, snsTopicArn);
        }
    }
}
