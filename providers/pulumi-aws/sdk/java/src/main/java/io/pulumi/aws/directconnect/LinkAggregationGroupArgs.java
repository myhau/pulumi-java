// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkAggregationGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkAggregationGroupArgs Empty = new LinkAggregationGroupArgs();

    /**
     * The ID of an existing dedicated connection to migrate to the LAG.
     * 
     */
    @InputImport(name="connectionId")
      private final @Nullable Input<String> connectionId;

    public Input<String> getConnectionId() {
        return this.connectionId == null ? Input.empty() : this.connectionId;
    }

    /**
     * The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
     * 
     */
    @InputImport(name="connectionsBandwidth", required=true)
      private final Input<String> connectionsBandwidth;

    public Input<String> getConnectionsBandwidth() {
        return this.connectionsBandwidth;
    }

    /**
     * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    @InputImport(name="forceDestroy")
      private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * The name of the LAG.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the service provider associated with the LAG.
     * 
     */
    @InputImport(name="providerName")
      private final @Nullable Input<String> providerName;

    public Input<String> getProviderName() {
        return this.providerName == null ? Input.empty() : this.providerName;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LinkAggregationGroupArgs(
        @Nullable Input<String> connectionId,
        Input<String> connectionsBandwidth,
        @Nullable Input<Boolean> forceDestroy,
        Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> providerName,
        @Nullable Input<Map<String,String>> tags) {
        this.connectionId = connectionId;
        this.connectionsBandwidth = Objects.requireNonNull(connectionsBandwidth, "expected parameter 'connectionsBandwidth' to be non-null");
        this.forceDestroy = forceDestroy;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.providerName = providerName;
        this.tags = tags;
    }

    private LinkAggregationGroupArgs() {
        this.connectionId = Input.empty();
        this.connectionsBandwidth = Input.empty();
        this.forceDestroy = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.providerName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkAggregationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectionId;
        private Input<String> connectionsBandwidth;
        private @Nullable Input<Boolean> forceDestroy;
        private Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> providerName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkAggregationGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionId = defaults.connectionId;
    	      this.connectionsBandwidth = defaults.connectionsBandwidth;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.providerName = defaults.providerName;
    	      this.tags = defaults.tags;
        }

        public Builder setConnectionId(@Nullable Input<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        public Builder setConnectionId(@Nullable String connectionId) {
            this.connectionId = Input.ofNullable(connectionId);
            return this;
        }

        public Builder setConnectionsBandwidth(Input<String> connectionsBandwidth) {
            this.connectionsBandwidth = Objects.requireNonNull(connectionsBandwidth);
            return this;
        }

        public Builder setConnectionsBandwidth(String connectionsBandwidth) {
            this.connectionsBandwidth = Input.of(Objects.requireNonNull(connectionsBandwidth));
            return this;
        }

        public Builder setForceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder setForceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
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

        public Builder setProviderName(@Nullable Input<String> providerName) {
            this.providerName = providerName;
            return this;
        }

        public Builder setProviderName(@Nullable String providerName) {
            this.providerName = Input.ofNullable(providerName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LinkAggregationGroupArgs build() {
            return new LinkAggregationGroupArgs(connectionId, connectionsBandwidth, forceDestroy, location, name, providerName, tags);
        }
    }
}
