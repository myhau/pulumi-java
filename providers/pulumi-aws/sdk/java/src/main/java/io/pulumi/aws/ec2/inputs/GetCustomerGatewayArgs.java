// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetCustomerGatewayFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCustomerGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCustomerGatewayArgs Empty = new GetCustomerGatewayArgs();

    /**
     * One or more [name-value pairs][dcg-filters] to filter by.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable List<GetCustomerGatewayFilter> filters;

    public List<GetCustomerGatewayFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The ID of the gateway.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Map of key-value pairs assigned to the gateway.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetCustomerGatewayArgs(
        @Nullable List<GetCustomerGatewayFilter> filters,
        @Nullable String id,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.tags = tags;
    }

    private GetCustomerGatewayArgs() {
        this.filters = List.of();
        this.id = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomerGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetCustomerGatewayFilter> filters;
        private @Nullable String id;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomerGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetCustomerGatewayFilter> filters) {
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
        public GetCustomerGatewayArgs build() {
            return new GetCustomerGatewayArgs(filters, id, tags);
        }
    }
}
