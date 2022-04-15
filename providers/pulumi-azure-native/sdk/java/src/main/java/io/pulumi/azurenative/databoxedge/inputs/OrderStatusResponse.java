// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.TrackingInfoResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a single status change.
 * 
 */
public final class OrderStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final OrderStatusResponse Empty = new OrderStatusResponse();

    /**
     * Dictionary to hold generic information which is not stored
     * by the already existing properties
     * 
     */
    @Import(name="additionalOrderDetails", required=true)
      private final Map<String,String> additionalOrderDetails;

    public Map<String,String> additionalOrderDetails() {
        return this.additionalOrderDetails;
    }

    /**
     * Comments related to this status change.
     * 
     */
    @Import(name="comments")
      private final @Nullable String comments;

    public Optional<String> comments() {
        return this.comments == null ? Optional.empty() : Optional.ofNullable(this.comments);
    }

    /**
     * Status of the order as per the allowed status types.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    /**
     * Tracking information related to the state in the ordering flow
     * 
     */
    @Import(name="trackingInformation", required=true)
      private final TrackingInfoResponse trackingInformation;

    public TrackingInfoResponse trackingInformation() {
        return this.trackingInformation;
    }

    /**
     * Time of status update.
     * 
     */
    @Import(name="updateDateTime", required=true)
      private final String updateDateTime;

    public String updateDateTime() {
        return this.updateDateTime;
    }

    public OrderStatusResponse(
        Map<String,String> additionalOrderDetails,
        @Nullable String comments,
        String status,
        TrackingInfoResponse trackingInformation,
        String updateDateTime) {
        this.additionalOrderDetails = Objects.requireNonNull(additionalOrderDetails, "expected parameter 'additionalOrderDetails' to be non-null");
        this.comments = comments;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.trackingInformation = Objects.requireNonNull(trackingInformation, "expected parameter 'trackingInformation' to be non-null");
        this.updateDateTime = Objects.requireNonNull(updateDateTime, "expected parameter 'updateDateTime' to be non-null");
    }

    private OrderStatusResponse() {
        this.additionalOrderDetails = Map.of();
        this.comments = null;
        this.status = null;
        this.trackingInformation = null;
        this.updateDateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> additionalOrderDetails;
        private @Nullable String comments;
        private String status;
        private TrackingInfoResponse trackingInformation;
        private String updateDateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalOrderDetails = defaults.additionalOrderDetails;
    	      this.comments = defaults.comments;
    	      this.status = defaults.status;
    	      this.trackingInformation = defaults.trackingInformation;
    	      this.updateDateTime = defaults.updateDateTime;
        }

        public Builder additionalOrderDetails(Map<String,String> additionalOrderDetails) {
            this.additionalOrderDetails = Objects.requireNonNull(additionalOrderDetails);
            return this;
        }
        public Builder comments(@Nullable String comments) {
            this.comments = comments;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder trackingInformation(TrackingInfoResponse trackingInformation) {
            this.trackingInformation = Objects.requireNonNull(trackingInformation);
            return this;
        }
        public Builder updateDateTime(String updateDateTime) {
            this.updateDateTime = Objects.requireNonNull(updateDateTime);
            return this;
        }        public OrderStatusResponse build() {
            return new OrderStatusResponse(additionalOrderDetails, comments, status, trackingInformation, updateDateTime);
        }
    }
}
