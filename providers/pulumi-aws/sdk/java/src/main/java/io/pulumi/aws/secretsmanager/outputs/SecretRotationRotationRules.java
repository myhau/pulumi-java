// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class SecretRotationRotationRules {
    /**
     * Specifies the number of days between automatic scheduled rotations of the secret.
     * 
     */
    private final Integer automaticallyAfterDays;

    @OutputCustomType.Constructor({"automaticallyAfterDays"})
    private SecretRotationRotationRules(Integer automaticallyAfterDays) {
        this.automaticallyAfterDays = Objects.requireNonNull(automaticallyAfterDays);
    }

    /**
     * Specifies the number of days between automatic scheduled rotations of the secret.
     * 
     */
    public Integer getAutomaticallyAfterDays() {
        return this.automaticallyAfterDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretRotationRotationRules defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer automaticallyAfterDays;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretRotationRotationRules defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticallyAfterDays = defaults.automaticallyAfterDays;
        }

        public Builder setAutomaticallyAfterDays(Integer automaticallyAfterDays) {
            this.automaticallyAfterDays = Objects.requireNonNull(automaticallyAfterDays);
            return this;
        }
        public SecretRotationRotationRules build() {
            return new SecretRotationRotationRules(automaticallyAfterDays);
        }
    }
}
