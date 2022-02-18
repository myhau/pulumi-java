// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigKeyUsageArgs Empty = new AuthorityConfigX509ConfigKeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="baseKeyUsage", required=true)
    private final Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage;

    public Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> getBaseKeyUsage() {
        return this.baseKeyUsage;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="extendedKeyUsage", required=true)
    private final Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;

    public Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> getExtendedKeyUsage() {
        return this.extendedKeyUsage;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    @InputImport(name="unknownExtendedKeyUsages")
    private final @Nullable Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

    public Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Input.empty() : this.unknownExtendedKeyUsages;
    }

    public AuthorityConfigX509ConfigKeyUsageArgs(
        Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage,
        Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage,
        @Nullable Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage, "expected parameter 'baseKeyUsage' to be non-null");
        this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage, "expected parameter 'extendedKeyUsage' to be non-null");
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private AuthorityConfigX509ConfigKeyUsageArgs() {
        this.baseKeyUsage = Input.empty();
        this.extendedKeyUsage = Input.empty();
        this.unknownExtendedKeyUsages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage;
        private Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;
        private @Nullable Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsage(Input<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }

        public Builder setBaseKeyUsage(AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs baseKeyUsage) {
            this.baseKeyUsage = Input.of(Objects.requireNonNull(baseKeyUsage));
            return this;
        }

        public Builder setExtendedKeyUsage(Input<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }

        public Builder setExtendedKeyUsage(AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs extendedKeyUsage) {
            this.extendedKeyUsage = Input.of(Objects.requireNonNull(extendedKeyUsage));
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable Input<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Input.ofNullable(unknownExtendedKeyUsages);
            return this;
        }

        public AuthorityConfigX509ConfigKeyUsageArgs build() {
            return new AuthorityConfigX509ConfigKeyUsageArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
