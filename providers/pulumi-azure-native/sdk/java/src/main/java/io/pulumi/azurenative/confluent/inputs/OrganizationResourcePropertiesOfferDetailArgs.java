// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confluent.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Confluent offer detail
 * 
 */
public final class OrganizationResourcePropertiesOfferDetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationResourcePropertiesOfferDetailArgs Empty = new OrganizationResourcePropertiesOfferDetailArgs();

    /**
     * Offer Id
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Offer Plan Id
     * 
     */
    @Import(name="planId")
      private final @Nullable Output<String> planId;

    public Output<String> planId() {
        return this.planId == null ? Codegen.empty() : this.planId;
    }

    /**
     * Offer Plan Name
     * 
     */
    @Import(name="planName")
      private final @Nullable Output<String> planName;

    public Output<String> planName() {
        return this.planName == null ? Codegen.empty() : this.planName;
    }

    /**
     * Publisher Id
     * 
     */
    @Import(name="publisherId")
      private final @Nullable Output<String> publisherId;

    public Output<String> publisherId() {
        return this.publisherId == null ? Codegen.empty() : this.publisherId;
    }

    /**
     * Offer Plan Term unit
     * 
     */
    @Import(name="termUnit")
      private final @Nullable Output<String> termUnit;

    public Output<String> termUnit() {
        return this.termUnit == null ? Codegen.empty() : this.termUnit;
    }

    public OrganizationResourcePropertiesOfferDetailArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> planId,
        @Nullable Output<String> planName,
        @Nullable Output<String> publisherId,
        @Nullable Output<String> termUnit) {
        this.id = id;
        this.planId = planId;
        this.planName = planName;
        this.publisherId = publisherId;
        this.termUnit = termUnit;
    }

    private OrganizationResourcePropertiesOfferDetailArgs() {
        this.id = Codegen.empty();
        this.planId = Codegen.empty();
        this.planName = Codegen.empty();
        this.publisherId = Codegen.empty();
        this.termUnit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationResourcePropertiesOfferDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> planId;
        private @Nullable Output<String> planName;
        private @Nullable Output<String> publisherId;
        private @Nullable Output<String> termUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationResourcePropertiesOfferDetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.planId = defaults.planId;
    	      this.planName = defaults.planName;
    	      this.publisherId = defaults.publisherId;
    	      this.termUnit = defaults.termUnit;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder planId(@Nullable Output<String> planId) {
            this.planId = planId;
            return this;
        }
        public Builder planId(@Nullable String planId) {
            this.planId = Codegen.ofNullable(planId);
            return this;
        }
        public Builder planName(@Nullable Output<String> planName) {
            this.planName = planName;
            return this;
        }
        public Builder planName(@Nullable String planName) {
            this.planName = Codegen.ofNullable(planName);
            return this;
        }
        public Builder publisherId(@Nullable Output<String> publisherId) {
            this.publisherId = publisherId;
            return this;
        }
        public Builder publisherId(@Nullable String publisherId) {
            this.publisherId = Codegen.ofNullable(publisherId);
            return this;
        }
        public Builder termUnit(@Nullable Output<String> termUnit) {
            this.termUnit = termUnit;
            return this;
        }
        public Builder termUnit(@Nullable String termUnit) {
            this.termUnit = Codegen.ofNullable(termUnit);
            return this;
        }        public OrganizationResourcePropertiesOfferDetailArgs build() {
            return new OrganizationResourcePropertiesOfferDetailArgs(id, planId, planName, publisherId, termUnit);
        }
    }
}
