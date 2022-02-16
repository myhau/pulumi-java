// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BackupVaultNotificationObjectType {
    private final List<String> backupVaultEvents;
    private final String sNSTopicArn;

    @OutputCustomType.Constructor({"backupVaultEvents","sNSTopicArn"})
    private BackupVaultNotificationObjectType(
        List<String> backupVaultEvents,
        String sNSTopicArn) {
        this.backupVaultEvents = Objects.requireNonNull(backupVaultEvents);
        this.sNSTopicArn = Objects.requireNonNull(sNSTopicArn);
    }

    public List<String> getBackupVaultEvents() {
        return this.backupVaultEvents;
    }
    public String getSNSTopicArn() {
        return this.sNSTopicArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultNotificationObjectType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> backupVaultEvents;
        private String sNSTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultNotificationObjectType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultEvents = defaults.backupVaultEvents;
    	      this.sNSTopicArn = defaults.sNSTopicArn;
        }

        public Builder setBackupVaultEvents(List<String> backupVaultEvents) {
            this.backupVaultEvents = Objects.requireNonNull(backupVaultEvents);
            return this;
        }

        public Builder setSNSTopicArn(String sNSTopicArn) {
            this.sNSTopicArn = Objects.requireNonNull(sNSTopicArn);
            return this;
        }

        public BackupVaultNotificationObjectType build() {
            return new BackupVaultNotificationObjectType(backupVaultEvents, sNSTopicArn);
        }
    }
}