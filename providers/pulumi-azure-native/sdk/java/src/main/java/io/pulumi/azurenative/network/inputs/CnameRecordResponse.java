// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A CNAME record.
 * 
 */
public final class CnameRecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final CnameRecordResponse Empty = new CnameRecordResponse();

    /**
     * The canonical name for this CNAME record.
     * 
     */
    @Import(name="cname")
      private final @Nullable String cname;

    public Optional<String> cname() {
        return this.cname == null ? Optional.empty() : Optional.ofNullable(this.cname);
    }

    public CnameRecordResponse(@Nullable String cname) {
        this.cname = cname;
    }

    private CnameRecordResponse() {
        this.cname = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CnameRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cname;

        public Builder() {
    	      // Empty
        }

        public Builder(CnameRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cname = defaults.cname;
        }

        public Builder cname(@Nullable String cname) {
            this.cname = cname;
            return this;
        }        public CnameRecordResponse build() {
            return new CnameRecordResponse(cname);
        }
    }
}
