// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameApiAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameApiAssociationState Empty = new DomainNameApiAssociationState();

    /**
     * The API ID.
     * 
     */
    @InputImport(name="apiId")
      private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * The Appsync domain name.
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    public DomainNameApiAssociationState(
        @Nullable Input<String> apiId,
        @Nullable Input<String> domainName) {
        this.apiId = apiId;
        this.domainName = domainName;
    }

    private DomainNameApiAssociationState() {
        this.apiId = Input.empty();
        this.domainName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameApiAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameApiAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.domainName = defaults.domainName;
        }

        public Builder setApiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder setApiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }
        public DomainNameApiAssociationState build() {
            return new DomainNameApiAssociationState(apiId, domainName);
        }
    }
}
