// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
     * 
     */
    @InputImport(name="bandwidth", required=true)
      private final Input<String> bandwidth;

    public Input<String> getBandwidth() {
        return this.bandwidth;
    }

    /**
     * The AWS Direct Connect location where the connection is located. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * The name of the connection.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the service provider associated with the connection.
     * 
     */
    @InputImport(name="providerName")
      private final @Nullable Input<String> providerName;

    public Input<String> getProviderName() {
        return this.providerName == null ? Input.empty() : this.providerName;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ConnectionArgs(
        Input<String> bandwidth,
        Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> providerName,
        @Nullable Input<Map<String,String>> tags) {
        this.bandwidth = Objects.requireNonNull(bandwidth, "expected parameter 'bandwidth' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.providerName = providerName;
        this.tags = tags;
    }

    private ConnectionArgs() {
        this.bandwidth = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.providerName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bandwidth;
        private Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> providerName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.providerName = defaults.providerName;
    	      this.tags = defaults.tags;
        }

        public Builder setBandwidth(Input<String> bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }

        public Builder setBandwidth(String bandwidth) {
            this.bandwidth = Input.of(Objects.requireNonNull(bandwidth));
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
        public ConnectionArgs build() {
            return new ConnectionArgs(bandwidth, location, name, providerName, tags);
        }
    }
}