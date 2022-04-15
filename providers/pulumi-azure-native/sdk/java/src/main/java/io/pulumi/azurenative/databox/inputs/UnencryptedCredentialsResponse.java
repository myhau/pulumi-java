// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.DataBoxDiskJobSecretsResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxHeavyJobSecretsResponse;
import io.pulumi.azurenative.databox.inputs.DataboxJobSecretsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * Unencrypted credentials for accessing device.
 * 
 */
public final class UnencryptedCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final UnencryptedCredentialsResponse Empty = new UnencryptedCredentialsResponse();

    /**
     * Name of the job.
     * 
     */
    @Import(name="jobName", required=true)
      private final String jobName;

    public String jobName() {
        return this.jobName;
    }

    /**
     * Secrets related to this job.
     * 
     */
    @Import(name="jobSecrets", required=true)
      private final Object jobSecrets;

    public Object jobSecrets() {
        return this.jobSecrets;
    }

    public UnencryptedCredentialsResponse(
        String jobName,
        Object jobSecrets) {
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.jobSecrets = Objects.requireNonNull(jobSecrets, "expected parameter 'jobSecrets' to be non-null");
    }

    private UnencryptedCredentialsResponse() {
        this.jobName = null;
        this.jobSecrets = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UnencryptedCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobName;
        private Object jobSecrets;

        public Builder() {
    	      // Empty
        }

        public Builder(UnencryptedCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobName = defaults.jobName;
    	      this.jobSecrets = defaults.jobSecrets;
        }

        public Builder jobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }
        public Builder jobSecrets(Object jobSecrets) {
            this.jobSecrets = Objects.requireNonNull(jobSecrets);
            return this;
        }        public UnencryptedCredentialsResponse build() {
            return new UnencryptedCredentialsResponse(jobName, jobSecrets);
        }
    }
}
