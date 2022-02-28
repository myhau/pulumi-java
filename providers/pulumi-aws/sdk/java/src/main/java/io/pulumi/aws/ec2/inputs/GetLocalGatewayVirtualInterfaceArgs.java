// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewayVirtualInterfaceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayVirtualInterfaceArgs Empty = new GetLocalGatewayVirtualInterfaceArgs();

    /**
     * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaces.html) for supported filters. Detailed below.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters;

    public List<GetLocalGatewayVirtualInterfaceFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * Identifier of EC2 Local Gateway Virtual Interface.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetLocalGatewayVirtualInterfaceArgs(
        @Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters,
        @Nullable String id,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.tags = tags;
    }

    private GetLocalGatewayVirtualInterfaceArgs() {
        this.filters = List.of();
        this.id = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayVirtualInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters;
        private @Nullable String id;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayVirtualInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetLocalGatewayVirtualInterfaceArgs build() {
            return new GetLocalGatewayVirtualInterfaceArgs(filters, id, tags);
        }
    }
}
