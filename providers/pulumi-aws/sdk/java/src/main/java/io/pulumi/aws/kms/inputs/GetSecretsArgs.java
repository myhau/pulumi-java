// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.inputs;

import io.pulumi.aws.kms.inputs.GetSecretsSecret;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class GetSecretsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretsArgs Empty = new GetSecretsArgs();

    /**
     * One or more encrypted payload definitions from the KMS service. See the Secret Definitions below.
     * 
     */
    @InputImport(name="secrets", required=true)
      private final List<GetSecretsSecret> secrets;

    public List<GetSecretsSecret> getSecrets() {
        return this.secrets;
    }

    public GetSecretsArgs(List<GetSecretsSecret> secrets) {
        this.secrets = Objects.requireNonNull(secrets, "expected parameter 'secrets' to be non-null");
    }

    private GetSecretsArgs() {
        this.secrets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSecretsSecret> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secrets = defaults.secrets;
        }

        public Builder setSecrets(List<GetSecretsSecret> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public GetSecretsArgs build() {
            return new GetSecretsArgs(secrets);
        }
    }
}
