// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Properties of the IoT Security solution's user defined resources.
 * 
 */
public final class UserDefinedResourcesPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserDefinedResourcesPropertiesArgs Empty = new UserDefinedResourcesPropertiesArgs();

    /**
     * Azure Resource Graph query which represents the security solution's user defined resources. Required to start with "where type != "Microsoft.Devices/IotHubs""
     * 
     */
    @Import(name="query", required=true)
      private final Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    /**
     * List of Azure subscription ids on which the user defined resources query should be executed.
     * 
     */
    @Import(name="querySubscriptions", required=true)
      private final Output<List<String>> querySubscriptions;

    public Output<List<String>> querySubscriptions() {
        return this.querySubscriptions;
    }

    public UserDefinedResourcesPropertiesArgs(
        Output<String> query,
        Output<List<String>> querySubscriptions) {
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.querySubscriptions = Objects.requireNonNull(querySubscriptions, "expected parameter 'querySubscriptions' to be non-null");
    }

    private UserDefinedResourcesPropertiesArgs() {
        this.query = Codegen.empty();
        this.querySubscriptions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDefinedResourcesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> query;
        private Output<List<String>> querySubscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(UserDefinedResourcesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.querySubscriptions = defaults.querySubscriptions;
        }

        public Builder query(Output<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder query(String query) {
            this.query = Output.of(Objects.requireNonNull(query));
            return this;
        }
        public Builder querySubscriptions(Output<List<String>> querySubscriptions) {
            this.querySubscriptions = Objects.requireNonNull(querySubscriptions);
            return this;
        }
        public Builder querySubscriptions(List<String> querySubscriptions) {
            this.querySubscriptions = Output.of(Objects.requireNonNull(querySubscriptions));
            return this;
        }
        public Builder querySubscriptions(String... querySubscriptions) {
            return querySubscriptions(List.of(querySubscriptions));
        }        public UserDefinedResourcesPropertiesArgs build() {
            return new UserDefinedResourcesPropertiesArgs(query, querySubscriptions);
        }
    }
}
