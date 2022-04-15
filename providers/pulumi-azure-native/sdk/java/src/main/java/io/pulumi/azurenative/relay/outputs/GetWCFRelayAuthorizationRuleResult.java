// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWCFRelayAuthorizationRuleResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The rights associated with the rule.
     * 
     */
    private final List<String> rights;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWCFRelayAuthorizationRuleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rights") List<String> rights,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.rights = rights;
        this.type = type;
    }

    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The rights associated with the rule.
     * 
    */
    public List<String> rights() {
        return this.rights;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWCFRelayAuthorizationRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private List<String> rights;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWCFRelayAuthorizationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rights = defaults.rights;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder rights(List<String> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }
        public Builder rights(String... rights) {
            return rights(List.of(rights));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWCFRelayAuthorizationRuleResult build() {
            return new GetWCFRelayAuthorizationRuleResult(id, name, rights, type);
        }
    }
}
