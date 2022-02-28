// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.InventoryDestinationGetArgs;
import io.pulumi.aws.s3.inputs.InventoryFilterGetArgs;
import io.pulumi.aws.s3.inputs.InventoryScheduleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InventoryState extends io.pulumi.resources.ResourceArgs {

    public static final InventoryState Empty = new InventoryState();

    /**
     * The name of the source bucket that inventory lists the objects for.
     * 
     */
    @InputImport(name="bucket")
      private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * Contains information about where to publish the inventory results (documented below).
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Input<InventoryDestinationGetArgs> destination;

    public Input<InventoryDestinationGetArgs> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * Specifies whether the inventory is enabled or disabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria (documented below).
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<InventoryFilterGetArgs> filter;

    public Input<InventoryFilterGetArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * Object versions to include in the inventory list. Valid values: `All`, `Current`.
     * 
     */
    @InputImport(name="includedObjectVersions")
      private final @Nullable Input<String> includedObjectVersions;

    public Input<String> getIncludedObjectVersions() {
        return this.includedObjectVersions == null ? Input.empty() : this.includedObjectVersions;
    }

    /**
     * Unique identifier of the inventory configuration for the bucket.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * List of optional fields that are included in the inventory results. Please refer to the S3 [documentation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_InventoryConfiguration.html#AmazonS3-Type-InventoryConfiguration-OptionalFields) for more details.
     * 
     */
    @InputImport(name="optionalFields")
      private final @Nullable Input<List<String>> optionalFields;

    public Input<List<String>> getOptionalFields() {
        return this.optionalFields == null ? Input.empty() : this.optionalFields;
    }

    /**
     * Specifies the schedule for generating inventory results (documented below).
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<InventoryScheduleGetArgs> schedule;

    public Input<InventoryScheduleGetArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    public InventoryState(
        @Nullable Input<String> bucket,
        @Nullable Input<InventoryDestinationGetArgs> destination,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<InventoryFilterGetArgs> filter,
        @Nullable Input<String> includedObjectVersions,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> optionalFields,
        @Nullable Input<InventoryScheduleGetArgs> schedule) {
        this.bucket = bucket;
        this.destination = destination;
        this.enabled = enabled;
        this.filter = filter;
        this.includedObjectVersions = includedObjectVersions;
        this.name = name;
        this.optionalFields = optionalFields;
        this.schedule = schedule;
    }

    private InventoryState() {
        this.bucket = Input.empty();
        this.destination = Input.empty();
        this.enabled = Input.empty();
        this.filter = Input.empty();
        this.includedObjectVersions = Input.empty();
        this.name = Input.empty();
        this.optionalFields = Input.empty();
        this.schedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<InventoryDestinationGetArgs> destination;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<InventoryFilterGetArgs> filter;
        private @Nullable Input<String> includedObjectVersions;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> optionalFields;
        private @Nullable Input<InventoryScheduleGetArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.filter = defaults.filter;
    	      this.includedObjectVersions = defaults.includedObjectVersions;
    	      this.name = defaults.name;
    	      this.optionalFields = defaults.optionalFields;
    	      this.schedule = defaults.schedule;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setDestination(@Nullable Input<InventoryDestinationGetArgs> destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestination(@Nullable InventoryDestinationGetArgs destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setFilter(@Nullable Input<InventoryFilterGetArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable InventoryFilterGetArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setIncludedObjectVersions(@Nullable Input<String> includedObjectVersions) {
            this.includedObjectVersions = includedObjectVersions;
            return this;
        }

        public Builder setIncludedObjectVersions(@Nullable String includedObjectVersions) {
            this.includedObjectVersions = Input.ofNullable(includedObjectVersions);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOptionalFields(@Nullable Input<List<String>> optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }

        public Builder setOptionalFields(@Nullable List<String> optionalFields) {
            this.optionalFields = Input.ofNullable(optionalFields);
            return this;
        }

        public Builder setSchedule(@Nullable Input<InventoryScheduleGetArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable InventoryScheduleGetArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }
        public InventoryState build() {
            return new InventoryState(bucket, destination, enabled, filter, includedObjectVersions, name, optionalFields, schedule);
        }
    }
}
