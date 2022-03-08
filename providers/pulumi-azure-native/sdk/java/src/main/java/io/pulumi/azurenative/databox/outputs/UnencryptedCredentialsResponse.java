// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.DataBoxDiskJobSecretsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxHeavyJobSecretsResponse;
import io.pulumi.azurenative.databox.outputs.DataboxJobSecretsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UnencryptedCredentialsResponse {
    /**
     * Name of the job.
     * 
     */
    private final String jobName;
    /**
     * Secrets related to this job.
     * 
     */
    private final Object jobSecrets;

    @OutputCustomType.Constructor({"jobName","jobSecrets"})
    private UnencryptedCredentialsResponse(
        String jobName,
        Object jobSecrets) {
        this.jobName = jobName;
        this.jobSecrets = jobSecrets;
    }

    /**
     * Name of the job.
     * 
    */
    public String getJobName() {
        return this.jobName;
    }
    /**
     * Secrets related to this job.
     * 
    */
    public Object getJobSecrets() {
        return this.jobSecrets;
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

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setJobSecrets(Object jobSecrets) {
            this.jobSecrets = Objects.requireNonNull(jobSecrets);
            return this;
        }
        public UnencryptedCredentialsResponse build() {
            return new UnencryptedCredentialsResponse(jobName, jobSecrets);
        }
    }
}
