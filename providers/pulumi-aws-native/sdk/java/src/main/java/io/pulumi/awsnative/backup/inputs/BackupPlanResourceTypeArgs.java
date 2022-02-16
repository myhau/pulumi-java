// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.BackupPlanAdvancedBackupSettingResourceTypeArgs;
import io.pulumi.awsnative.backup.inputs.BackupPlanBackupRuleResourceTypeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupPlanResourceTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPlanResourceTypeArgs Empty = new BackupPlanResourceTypeArgs();

    @InputImport(name="advancedBackupSettings")
    private final @Nullable Input<List<BackupPlanAdvancedBackupSettingResourceTypeArgs>> advancedBackupSettings;

    public Input<List<BackupPlanAdvancedBackupSettingResourceTypeArgs>> getAdvancedBackupSettings() {
        return this.advancedBackupSettings == null ? Input.empty() : this.advancedBackupSettings;
    }

    @InputImport(name="backupPlanName", required=true)
    private final Input<String> backupPlanName;

    public Input<String> getBackupPlanName() {
        return this.backupPlanName;
    }

    @InputImport(name="backupPlanRule", required=true)
    private final Input<List<BackupPlanBackupRuleResourceTypeArgs>> backupPlanRule;

    public Input<List<BackupPlanBackupRuleResourceTypeArgs>> getBackupPlanRule() {
        return this.backupPlanRule;
    }

    public BackupPlanResourceTypeArgs(
        @Nullable Input<List<BackupPlanAdvancedBackupSettingResourceTypeArgs>> advancedBackupSettings,
        Input<String> backupPlanName,
        Input<List<BackupPlanBackupRuleResourceTypeArgs>> backupPlanRule) {
        this.advancedBackupSettings = advancedBackupSettings;
        this.backupPlanName = Objects.requireNonNull(backupPlanName, "expected parameter 'backupPlanName' to be non-null");
        this.backupPlanRule = Objects.requireNonNull(backupPlanRule, "expected parameter 'backupPlanRule' to be non-null");
    }

    private BackupPlanResourceTypeArgs() {
        this.advancedBackupSettings = Input.empty();
        this.backupPlanName = Input.empty();
        this.backupPlanRule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BackupPlanAdvancedBackupSettingResourceTypeArgs>> advancedBackupSettings;
        private Input<String> backupPlanName;
        private Input<List<BackupPlanBackupRuleResourceTypeArgs>> backupPlanRule;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanResourceTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedBackupSettings = defaults.advancedBackupSettings;
    	      this.backupPlanName = defaults.backupPlanName;
    	      this.backupPlanRule = defaults.backupPlanRule;
        }

        public Builder setAdvancedBackupSettings(@Nullable Input<List<BackupPlanAdvancedBackupSettingResourceTypeArgs>> advancedBackupSettings) {
            this.advancedBackupSettings = advancedBackupSettings;
            return this;
        }

        public Builder setAdvancedBackupSettings(@Nullable List<BackupPlanAdvancedBackupSettingResourceTypeArgs> advancedBackupSettings) {
            this.advancedBackupSettings = Input.ofNullable(advancedBackupSettings);
            return this;
        }

        public Builder setBackupPlanName(Input<String> backupPlanName) {
            this.backupPlanName = Objects.requireNonNull(backupPlanName);
            return this;
        }

        public Builder setBackupPlanName(String backupPlanName) {
            this.backupPlanName = Input.of(Objects.requireNonNull(backupPlanName));
            return this;
        }

        public Builder setBackupPlanRule(Input<List<BackupPlanBackupRuleResourceTypeArgs>> backupPlanRule) {
            this.backupPlanRule = Objects.requireNonNull(backupPlanRule);
            return this;
        }

        public Builder setBackupPlanRule(List<BackupPlanBackupRuleResourceTypeArgs> backupPlanRule) {
            this.backupPlanRule = Input.of(Objects.requireNonNull(backupPlanRule));
            return this;
        }

        public BackupPlanResourceTypeArgs build() {
            return new BackupPlanResourceTypeArgs(advancedBackupSettings, backupPlanName, backupPlanRule);
        }
    }
}