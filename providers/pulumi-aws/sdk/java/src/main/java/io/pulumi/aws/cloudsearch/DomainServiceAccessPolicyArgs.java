// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DomainServiceAccessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainServiceAccessPolicyArgs Empty = new DomainServiceAccessPolicyArgs();

    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    @InputImport(name="accessPolicy", required=true)
      private final Input<String> accessPolicy;

    public Input<String> getAccessPolicy() {
        return this.accessPolicy;
    }

    /**
     * The CloudSearch domain name the policy applies to.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    public DomainServiceAccessPolicyArgs(
        Input<String> accessPolicy,
        Input<String> domainName) {
        this.accessPolicy = Objects.requireNonNull(accessPolicy, "expected parameter 'accessPolicy' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
    }

    private DomainServiceAccessPolicyArgs() {
        this.accessPolicy = Input.empty();
        this.domainName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainServiceAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accessPolicy;
        private Input<String> domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainServiceAccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.domainName = defaults.domainName;
        }

        public Builder setAccessPolicy(Input<String> accessPolicy) {
            this.accessPolicy = Objects.requireNonNull(accessPolicy);
            return this;
        }

        public Builder setAccessPolicy(String accessPolicy) {
            this.accessPolicy = Input.of(Objects.requireNonNull(accessPolicy));
            return this;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }
        public DomainServiceAccessPolicyArgs build() {
            return new DomainServiceAccessPolicyArgs(accessPolicy, domainName);
        }
    }
}
