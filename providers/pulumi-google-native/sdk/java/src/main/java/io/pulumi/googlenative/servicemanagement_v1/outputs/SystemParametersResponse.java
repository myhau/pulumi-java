// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.SystemParameterRuleResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SystemParametersResponse {
    /**
     * Define system parameters. The parameters defined here will override the default parameters implemented by the system. If this field is missing from the service config, default system parameters will be used. Default system parameters and names is implementation-dependent. Example: define api key for all methods system_parameters rules: - selector: "*" parameters: - name: api_key url_query_parameter: api_key Example: define 2 api key names for a specific method. system_parameters rules: - selector: "/ListShelves" parameters: - name: api_key http_header: Api-Key1 - name: api_key http_header: Api-Key2 **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    private final List<SystemParameterRuleResponse> rules;

    @OutputCustomType.Constructor
    private SystemParametersResponse(@OutputCustomType.Parameter("rules") List<SystemParameterRuleResponse> rules) {
        this.rules = rules;
    }

    /**
     * Define system parameters. The parameters defined here will override the default parameters implemented by the system. If this field is missing from the service config, default system parameters will be used. Default system parameters and names is implementation-dependent. Example: define api key for all methods system_parameters rules: - selector: "*" parameters: - name: api_key url_query_parameter: api_key Example: define 2 api key names for a specific method. system_parameters rules: - selector: "/ListShelves" parameters: - name: api_key http_header: Api-Key1 - name: api_key http_header: Api-Key2 **NOTE:** All service configuration rules follow "last one wins" order.
     * 
    */
    public List<SystemParameterRuleResponse> getRules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SystemParameterRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(List<SystemParameterRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public SystemParametersResponse build() {
            return new SystemParametersResponse(rules);
        }
    }
}
