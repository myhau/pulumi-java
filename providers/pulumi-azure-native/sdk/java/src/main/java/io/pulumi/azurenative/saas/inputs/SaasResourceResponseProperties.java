// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas.inputs;

import io.pulumi.azurenative.saas.inputs.SaasPropertiesResponseTerm;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * saas properties
 * 
 */
public final class SaasResourceResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final SaasResourceResponseProperties Empty = new SaasResourceResponseProperties();

    /**
     * Whether the SaaS subscription will auto renew upon term end.
     * 
     */
    @Import(name="autoRenew")
      private final @Nullable Boolean autoRenew;

    public Optional<Boolean> autoRenew() {
        return this.autoRenew == null ? Optional.empty() : Optional.ofNullable(this.autoRenew);
    }

    /**
     * The created date of this resource.
     * 
     */
    @Import(name="created", required=true)
      private final String created;

    public String created() {
        return this.created;
    }

    /**
     * Whether the current term is a Free Trial term
     * 
     */
    @Import(name="isFreeTrial")
      private final @Nullable Boolean isFreeTrial;

    public Optional<Boolean> isFreeTrial() {
        return this.isFreeTrial == null ? Optional.empty() : Optional.ofNullable(this.isFreeTrial);
    }

    /**
     * The last modifier date if this resource.
     * 
     */
    @Import(name="lastModified")
      private final @Nullable String lastModified;

    public Optional<String> lastModified() {
        return this.lastModified == null ? Optional.empty() : Optional.ofNullable(this.lastModified);
    }

    /**
     * The offer id.
     * 
     */
    @Import(name="offerId")
      private final @Nullable String offerId;

    public Optional<String> offerId() {
        return this.offerId == null ? Optional.empty() : Optional.ofNullable(this.offerId);
    }

    /**
     * The metadata about the SaaS subscription such as the AzureSubscriptionId and ResourceUri.
     * 
     */
    @Import(name="paymentChannelMetadata")
      private final @Nullable Map<String,String> paymentChannelMetadata;

    public Map<String,String> paymentChannelMetadata() {
        return this.paymentChannelMetadata == null ? Map.of() : this.paymentChannelMetadata;
    }

    /**
     * The Payment channel for the SaasSubscription.
     * 
     */
    @Import(name="paymentChannelType")
      private final @Nullable String paymentChannelType;

    public Optional<String> paymentChannelType() {
        return this.paymentChannelType == null ? Optional.empty() : Optional.ofNullable(this.paymentChannelType);
    }

    /**
     * The publisher id.
     * 
     */
    @Import(name="publisherId")
      private final @Nullable String publisherId;

    public Optional<String> publisherId() {
        return this.publisherId == null ? Optional.empty() : Optional.ofNullable(this.publisherId);
    }

    /**
     * The environment in the publisher side for this resource.
     * 
     */
    @Import(name="publisherTestEnvironment")
      private final @Nullable String publisherTestEnvironment;

    public Optional<String> publisherTestEnvironment() {
        return this.publisherTestEnvironment == null ? Optional.empty() : Optional.ofNullable(this.publisherTestEnvironment);
    }

    /**
     * The seat count.
     * 
     */
    @Import(name="quantity")
      private final @Nullable Double quantity;

    public Optional<Double> quantity() {
        return this.quantity == null ? Optional.empty() : Optional.ofNullable(this.quantity);
    }

    /**
     * The SaaS resource name.
     * 
     */
    @Import(name="saasResourceName")
      private final @Nullable String saasResourceName;

    public Optional<String> saasResourceName() {
        return this.saasResourceName == null ? Optional.empty() : Optional.ofNullable(this.saasResourceName);
    }

    /**
     * The saas session id used for dev service migration request.
     * 
     */
    @Import(name="saasSessionId")
      private final @Nullable String saasSessionId;

    public Optional<String> saasSessionId() {
        return this.saasSessionId == null ? Optional.empty() : Optional.ofNullable(this.saasSessionId);
    }

    /**
     * The saas subscription id used for tenant to subscription level migration request.
     * 
     */
    @Import(name="saasSubscriptionId")
      private final @Nullable String saasSubscriptionId;

    public Optional<String> saasSubscriptionId() {
        return this.saasSubscriptionId == null ? Optional.empty() : Optional.ofNullable(this.saasSubscriptionId);
    }

    /**
     * The plan id.
     * 
     */
    @Import(name="skuId")
      private final @Nullable String skuId;

    public Optional<String> skuId() {
        return this.skuId == null ? Optional.empty() : Optional.ofNullable(this.skuId);
    }

    /**
     * The SaaS Subscription Status.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * The current Term object.
     * 
     */
    @Import(name="term")
      private final @Nullable SaasPropertiesResponseTerm term;

    public Optional<SaasPropertiesResponseTerm> term() {
        return this.term == null ? Optional.empty() : Optional.ofNullable(this.term);
    }

    /**
     * The current Term id.
     * 
     */
    @Import(name="termId")
      private final @Nullable String termId;

    public Optional<String> termId() {
        return this.termId == null ? Optional.empty() : Optional.ofNullable(this.termId);
    }

    public SaasResourceResponseProperties(
        @Nullable Boolean autoRenew,
        String created,
        @Nullable Boolean isFreeTrial,
        @Nullable String lastModified,
        @Nullable String offerId,
        @Nullable Map<String,String> paymentChannelMetadata,
        @Nullable String paymentChannelType,
        @Nullable String publisherId,
        @Nullable String publisherTestEnvironment,
        @Nullable Double quantity,
        @Nullable String saasResourceName,
        @Nullable String saasSessionId,
        @Nullable String saasSubscriptionId,
        @Nullable String skuId,
        @Nullable String status,
        @Nullable SaasPropertiesResponseTerm term,
        @Nullable String termId) {
        this.autoRenew = autoRenew;
        this.created = Objects.requireNonNull(created, "expected parameter 'created' to be non-null");
        this.isFreeTrial = isFreeTrial;
        this.lastModified = lastModified;
        this.offerId = offerId;
        this.paymentChannelMetadata = paymentChannelMetadata;
        this.paymentChannelType = paymentChannelType;
        this.publisherId = publisherId;
        this.publisherTestEnvironment = publisherTestEnvironment;
        this.quantity = quantity;
        this.saasResourceName = saasResourceName;
        this.saasSessionId = saasSessionId;
        this.saasSubscriptionId = saasSubscriptionId;
        this.skuId = skuId;
        this.status = status;
        this.term = term;
        this.termId = termId;
    }

    private SaasResourceResponseProperties() {
        this.autoRenew = null;
        this.created = null;
        this.isFreeTrial = null;
        this.lastModified = null;
        this.offerId = null;
        this.paymentChannelMetadata = Map.of();
        this.paymentChannelType = null;
        this.publisherId = null;
        this.publisherTestEnvironment = null;
        this.quantity = null;
        this.saasResourceName = null;
        this.saasSessionId = null;
        this.saasSubscriptionId = null;
        this.skuId = null;
        this.status = null;
        this.term = null;
        this.termId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SaasResourceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoRenew;
        private String created;
        private @Nullable Boolean isFreeTrial;
        private @Nullable String lastModified;
        private @Nullable String offerId;
        private @Nullable Map<String,String> paymentChannelMetadata;
        private @Nullable String paymentChannelType;
        private @Nullable String publisherId;
        private @Nullable String publisherTestEnvironment;
        private @Nullable Double quantity;
        private @Nullable String saasResourceName;
        private @Nullable String saasSessionId;
        private @Nullable String saasSubscriptionId;
        private @Nullable String skuId;
        private @Nullable String status;
        private @Nullable SaasPropertiesResponseTerm term;
        private @Nullable String termId;

        public Builder() {
    	      // Empty
        }

        public Builder(SaasResourceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenew = defaults.autoRenew;
    	      this.created = defaults.created;
    	      this.isFreeTrial = defaults.isFreeTrial;
    	      this.lastModified = defaults.lastModified;
    	      this.offerId = defaults.offerId;
    	      this.paymentChannelMetadata = defaults.paymentChannelMetadata;
    	      this.paymentChannelType = defaults.paymentChannelType;
    	      this.publisherId = defaults.publisherId;
    	      this.publisherTestEnvironment = defaults.publisherTestEnvironment;
    	      this.quantity = defaults.quantity;
    	      this.saasResourceName = defaults.saasResourceName;
    	      this.saasSessionId = defaults.saasSessionId;
    	      this.saasSubscriptionId = defaults.saasSubscriptionId;
    	      this.skuId = defaults.skuId;
    	      this.status = defaults.status;
    	      this.term = defaults.term;
    	      this.termId = defaults.termId;
        }

        public Builder autoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder isFreeTrial(@Nullable Boolean isFreeTrial) {
            this.isFreeTrial = isFreeTrial;
            return this;
        }
        public Builder lastModified(@Nullable String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Builder offerId(@Nullable String offerId) {
            this.offerId = offerId;
            return this;
        }
        public Builder paymentChannelMetadata(@Nullable Map<String,String> paymentChannelMetadata) {
            this.paymentChannelMetadata = paymentChannelMetadata;
            return this;
        }
        public Builder paymentChannelType(@Nullable String paymentChannelType) {
            this.paymentChannelType = paymentChannelType;
            return this;
        }
        public Builder publisherId(@Nullable String publisherId) {
            this.publisherId = publisherId;
            return this;
        }
        public Builder publisherTestEnvironment(@Nullable String publisherTestEnvironment) {
            this.publisherTestEnvironment = publisherTestEnvironment;
            return this;
        }
        public Builder quantity(@Nullable Double quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder saasResourceName(@Nullable String saasResourceName) {
            this.saasResourceName = saasResourceName;
            return this;
        }
        public Builder saasSessionId(@Nullable String saasSessionId) {
            this.saasSessionId = saasSessionId;
            return this;
        }
        public Builder saasSubscriptionId(@Nullable String saasSubscriptionId) {
            this.saasSubscriptionId = saasSubscriptionId;
            return this;
        }
        public Builder skuId(@Nullable String skuId) {
            this.skuId = skuId;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder term(@Nullable SaasPropertiesResponseTerm term) {
            this.term = term;
            return this;
        }
        public Builder termId(@Nullable String termId) {
            this.termId = termId;
            return this;
        }        public SaasResourceResponseProperties build() {
            return new SaasResourceResponseProperties(autoRenew, created, isFreeTrial, lastModified, offerId, paymentChannelMetadata, paymentChannelType, publisherId, publisherTestEnvironment, quantity, saasResourceName, saasSessionId, saasSubscriptionId, skuId, status, term, termId);
        }
    }
}
