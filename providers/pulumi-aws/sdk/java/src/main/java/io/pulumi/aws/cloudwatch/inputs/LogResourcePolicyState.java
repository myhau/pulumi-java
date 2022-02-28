// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogResourcePolicyState extends io.pulumi.resources.ResourceArgs {

    public static final LogResourcePolicyState Empty = new LogResourcePolicyState();

    /**
     * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * 
     */
    @InputImport(name="policyDocument")
      private final @Nullable Input<String> policyDocument;

    public Input<String> getPolicyDocument() {
        return this.policyDocument == null ? Input.empty() : this.policyDocument;
    }

    /**
     * Name of the resource policy.
     * 
     */
    @InputImport(name="policyName")
      private final @Nullable Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName == null ? Input.empty() : this.policyName;
    }

    public LogResourcePolicyState(
        @Nullable Input<String> policyDocument,
        @Nullable Input<String> policyName) {
        this.policyDocument = policyDocument;
        this.policyName = policyName;
    }

    private LogResourcePolicyState() {
        this.policyDocument = Input.empty();
        this.policyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogResourcePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> policyDocument;
        private @Nullable Input<String> policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(LogResourcePolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyName = defaults.policyName;
        }

        public Builder setPolicyDocument(@Nullable Input<String> policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }

        public Builder setPolicyDocument(@Nullable String policyDocument) {
            this.policyDocument = Input.ofNullable(policyDocument);
            return this;
        }

        public Builder setPolicyName(@Nullable Input<String> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = Input.ofNullable(policyName);
            return this;
        }
        public LogResourcePolicyState build() {
            return new LogResourcePolicyState(policyDocument, policyName);
        }
    }
}
