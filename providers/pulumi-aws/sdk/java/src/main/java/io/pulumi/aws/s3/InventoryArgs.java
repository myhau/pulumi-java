// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.s3.inputs.InventoryDestinationArgs;
import io.pulumi.aws.s3.inputs.InventoryFilterArgs;
import io.pulumi.aws.s3.inputs.InventoryScheduleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InventoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryArgs Empty = new InventoryArgs();

    /**
     * The name of the source bucket that inventory lists the objects for.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * Contains information about where to publish the inventory results (documented below).
     * 
     */
    @InputImport(name="destination", required=true)
      private final Input<InventoryDestinationArgs> destination;

    public Input<InventoryDestinationArgs> getDestination() {
        return this.destination;
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
      private final @Nullable Input<InventoryFilterArgs> filter;

    public Input<InventoryFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * Object versions to include in the inventory list. Valid values: `All`, `Current`.
     * 
     */
    @InputImport(name="includedObjectVersions", required=true)
      private final Input<String> includedObjectVersions;

    public Input<String> getIncludedObjectVersions() {
        return this.includedObjectVersions;
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
    @InputImport(name="schedule", required=true)
      private final Input<InventoryScheduleArgs> schedule;

    public Input<InventoryScheduleArgs> getSchedule() {
        return this.schedule;
    }

    public InventoryArgs(
        Input<String> bucket,
        Input<InventoryDestinationArgs> destination,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<InventoryFilterArgs> filter,
        Input<String> includedObjectVersions,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> optionalFields,
        Input<InventoryScheduleArgs> schedule) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.enabled = enabled;
        this.filter = filter;
        this.includedObjectVersions = Objects.requireNonNull(includedObjectVersions, "expected parameter 'includedObjectVersions' to be non-null");
        this.name = name;
        this.optionalFields = optionalFields;
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private InventoryArgs() {
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

    public static Builder builder(InventoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<InventoryDestinationArgs> destination;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<InventoryFilterArgs> filter;
        private Input<String> includedObjectVersions;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> optionalFields;
        private Input<InventoryScheduleArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryArgs defaults) {
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

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setDestination(Input<InventoryDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(InventoryDestinationArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
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

        public Builder setFilter(@Nullable Input<InventoryFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable InventoryFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setIncludedObjectVersions(Input<String> includedObjectVersions) {
            this.includedObjectVersions = Objects.requireNonNull(includedObjectVersions);
            return this;
        }

        public Builder setIncludedObjectVersions(String includedObjectVersions) {
            this.includedObjectVersions = Input.of(Objects.requireNonNull(includedObjectVersions));
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

        public Builder setSchedule(Input<InventoryScheduleArgs> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(InventoryScheduleArgs schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }
        public InventoryArgs build() {
            return new InventoryArgs(bucket, destination, enabled, filter, includedObjectVersions, name, optionalFields, schedule);
        }
    }
}
