// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListTopLevelDomainAgreementsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListTopLevelDomainAgreementsArgs Empty = new ListTopLevelDomainAgreementsArgs();

    /**
     * If <code>true</code>, then the list of agreements will include agreements for domain transfer as well; otherwise, <code>false</code>.
     * 
     */
    @Import(name="forTransfer")
      private final @Nullable Boolean forTransfer;

    public Optional<Boolean> forTransfer() {
        return this.forTransfer == null ? Optional.empty() : Optional.ofNullable(this.forTransfer);
    }

    /**
     * If <code>true</code>, then the list of agreements will include agreements for domain privacy as well; otherwise, <code>false</code>.
     * 
     */
    @Import(name="includePrivacy")
      private final @Nullable Boolean includePrivacy;

    public Optional<Boolean> includePrivacy() {
        return this.includePrivacy == null ? Optional.empty() : Optional.ofNullable(this.includePrivacy);
    }

    /**
     * Name of the top-level domain.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public ListTopLevelDomainAgreementsArgs(
        @Nullable Boolean forTransfer,
        @Nullable Boolean includePrivacy,
        String name) {
        this.forTransfer = forTransfer;
        this.includePrivacy = includePrivacy;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ListTopLevelDomainAgreementsArgs() {
        this.forTransfer = null;
        this.includePrivacy = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTopLevelDomainAgreementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean forTransfer;
        private @Nullable Boolean includePrivacy;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTopLevelDomainAgreementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forTransfer = defaults.forTransfer;
    	      this.includePrivacy = defaults.includePrivacy;
    	      this.name = defaults.name;
        }

        public Builder forTransfer(@Nullable Boolean forTransfer) {
            this.forTransfer = forTransfer;
            return this;
        }
        public Builder includePrivacy(@Nullable Boolean includePrivacy) {
            this.includePrivacy = includePrivacy;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ListTopLevelDomainAgreementsArgs build() {
            return new ListTopLevelDomainAgreementsArgs(forTransfer, includePrivacy, name);
        }
    }
}
