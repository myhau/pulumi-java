// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PortfolioShareState extends io.pulumi.resources.ResourceArgs {

    public static final PortfolioShareState Empty = new PortfolioShareState();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @InputImport(name="acceptLanguage")
      private final @Nullable Input<String> acceptLanguage;

    public Input<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Input.empty() : this.acceptLanguage;
    }

    /**
     * Whether the shared portfolio is imported by the recipient account. If the recipient is organizational, the share is automatically imported, and the field is always set to true.
     * 
     */
    @InputImport(name="accepted")
      private final @Nullable Input<Boolean> accepted;

    public Input<Boolean> getAccepted() {
        return this.accepted == null ? Input.empty() : this.accepted;
    }

    /**
     * Portfolio identifier.
     * 
     */
    @InputImport(name="portfolioId")
      private final @Nullable Input<String> portfolioId;

    public Input<String> getPortfolioId() {
        return this.portfolioId == null ? Input.empty() : this.portfolioId;
    }

    /**
     * Identifier of the principal with whom you will share the portfolio. Valid values AWS account IDs and ARNs of AWS Organizations and organizational units.
     * 
     */
    @InputImport(name="principalId")
      private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    /**
     * Whether to enable sharing of `aws.servicecatalog.TagOption` resources when creating the portfolio share.
     * 
     */
    @InputImport(name="shareTagOptions")
      private final @Nullable Input<Boolean> shareTagOptions;

    public Input<Boolean> getShareTagOptions() {
        return this.shareTagOptions == null ? Input.empty() : this.shareTagOptions;
    }

    /**
     * Type of portfolio share. Valid values are `ACCOUNT` (an external account), `ORGANIZATION` (a share to every account in an organization), `ORGANIZATIONAL_UNIT`, `ORGANIZATION_MEMBER_ACCOUNT` (a share to an account in an organization).
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Whether to wait (up to the timeout) for the share to be accepted. Organizational shares are automatically accepted.
     * 
     */
    @InputImport(name="waitForAcceptance")
      private final @Nullable Input<Boolean> waitForAcceptance;

    public Input<Boolean> getWaitForAcceptance() {
        return this.waitForAcceptance == null ? Input.empty() : this.waitForAcceptance;
    }

    public PortfolioShareState(
        @Nullable Input<String> acceptLanguage,
        @Nullable Input<Boolean> accepted,
        @Nullable Input<String> portfolioId,
        @Nullable Input<String> principalId,
        @Nullable Input<Boolean> shareTagOptions,
        @Nullable Input<String> type,
        @Nullable Input<Boolean> waitForAcceptance) {
        this.acceptLanguage = acceptLanguage;
        this.accepted = accepted;
        this.portfolioId = portfolioId;
        this.principalId = principalId;
        this.shareTagOptions = shareTagOptions;
        this.type = type;
        this.waitForAcceptance = waitForAcceptance;
    }

    private PortfolioShareState() {
        this.acceptLanguage = Input.empty();
        this.accepted = Input.empty();
        this.portfolioId = Input.empty();
        this.principalId = Input.empty();
        this.shareTagOptions = Input.empty();
        this.type = Input.empty();
        this.waitForAcceptance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortfolioShareState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceptLanguage;
        private @Nullable Input<Boolean> accepted;
        private @Nullable Input<String> portfolioId;
        private @Nullable Input<String> principalId;
        private @Nullable Input<Boolean> shareTagOptions;
        private @Nullable Input<String> type;
        private @Nullable Input<Boolean> waitForAcceptance;

        public Builder() {
    	      // Empty
        }

        public Builder(PortfolioShareState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.accepted = defaults.accepted;
    	      this.portfolioId = defaults.portfolioId;
    	      this.principalId = defaults.principalId;
    	      this.shareTagOptions = defaults.shareTagOptions;
    	      this.type = defaults.type;
    	      this.waitForAcceptance = defaults.waitForAcceptance;
        }

        public Builder setAcceptLanguage(@Nullable Input<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setAcceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Input.ofNullable(acceptLanguage);
            return this;
        }

        public Builder setAccepted(@Nullable Input<Boolean> accepted) {
            this.accepted = accepted;
            return this;
        }

        public Builder setAccepted(@Nullable Boolean accepted) {
            this.accepted = Input.ofNullable(accepted);
            return this;
        }

        public Builder setPortfolioId(@Nullable Input<String> portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder setPortfolioId(@Nullable String portfolioId) {
            this.portfolioId = Input.ofNullable(portfolioId);
            return this;
        }

        public Builder setPrincipalId(@Nullable Input<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = Input.ofNullable(principalId);
            return this;
        }

        public Builder setShareTagOptions(@Nullable Input<Boolean> shareTagOptions) {
            this.shareTagOptions = shareTagOptions;
            return this;
        }

        public Builder setShareTagOptions(@Nullable Boolean shareTagOptions) {
            this.shareTagOptions = Input.ofNullable(shareTagOptions);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setWaitForAcceptance(@Nullable Input<Boolean> waitForAcceptance) {
            this.waitForAcceptance = waitForAcceptance;
            return this;
        }

        public Builder setWaitForAcceptance(@Nullable Boolean waitForAcceptance) {
            this.waitForAcceptance = Input.ofNullable(waitForAcceptance);
            return this;
        }
        public PortfolioShareState build() {
            return new PortfolioShareState(acceptLanguage, accepted, portfolioId, principalId, shareTagOptions, type, waitForAcceptance);
        }
    }
}
