// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointPolicyState Empty = new MultiRegionAccessPointPolicyState();

    @InputImport(name="accountId")
      private final @Nullable Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId == null ? Input.empty() : this.accountId;
    }

    /**
     * A configuration block containing details about the policy for the Multi-Region Access Point. See Details Configuration Block below for more details
     * 
     */
    @InputImport(name="details")
      private final @Nullable Input<MultiRegionAccessPointPolicyDetailsGetArgs> details;

    public Input<MultiRegionAccessPointPolicyDetailsGetArgs> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    /**
     * The last established policy for the Multi-Region Access Point.
     * 
     */
    @InputImport(name="established")
      private final @Nullable Input<String> established;

    public Input<String> getEstablished() {
        return this.established == null ? Input.empty() : this.established;
    }

    /**
     * The proposed policy for the Multi-Region Access Point.
     * 
     */
    @InputImport(name="proposed")
      private final @Nullable Input<String> proposed;

    public Input<String> getProposed() {
        return this.proposed == null ? Input.empty() : this.proposed;
    }

    public MultiRegionAccessPointPolicyState(
        @Nullable Input<String> accountId,
        @Nullable Input<MultiRegionAccessPointPolicyDetailsGetArgs> details,
        @Nullable Input<String> established,
        @Nullable Input<String> proposed) {
        this.accountId = accountId;
        this.details = details;
        this.established = established;
        this.proposed = proposed;
    }

    private MultiRegionAccessPointPolicyState() {
        this.accountId = Input.empty();
        this.details = Input.empty();
        this.established = Input.empty();
        this.proposed = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountId;
        private @Nullable Input<MultiRegionAccessPointPolicyDetailsGetArgs> details;
        private @Nullable Input<String> established;
        private @Nullable Input<String> proposed;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.details = defaults.details;
    	      this.established = defaults.established;
    	      this.proposed = defaults.proposed;
        }

        public Builder setAccountId(@Nullable Input<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setAccountId(@Nullable String accountId) {
            this.accountId = Input.ofNullable(accountId);
            return this;
        }

        public Builder setDetails(@Nullable Input<MultiRegionAccessPointPolicyDetailsGetArgs> details) {
            this.details = details;
            return this;
        }

        public Builder setDetails(@Nullable MultiRegionAccessPointPolicyDetailsGetArgs details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder setEstablished(@Nullable Input<String> established) {
            this.established = established;
            return this;
        }

        public Builder setEstablished(@Nullable String established) {
            this.established = Input.ofNullable(established);
            return this;
        }

        public Builder setProposed(@Nullable Input<String> proposed) {
            this.proposed = proposed;
            return this;
        }

        public Builder setProposed(@Nullable String proposed) {
            this.proposed = Input.ofNullable(proposed);
            return this;
        }
        public MultiRegionAccessPointPolicyState build() {
            return new MultiRegionAccessPointPolicyState(accountId, details, established, proposed);
        }
    }
}
