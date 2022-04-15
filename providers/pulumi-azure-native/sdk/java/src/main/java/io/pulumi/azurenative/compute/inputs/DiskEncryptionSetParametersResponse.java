// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the parameter of customer managed disk encryption set resource id that can be specified for disk. <br><br> NOTE: The disk encryption set resource id can only be specified for managed disk. Please refer https://aka.ms/mdssewithcmkoverview for more details.
 * 
 */
public final class DiskEncryptionSetParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskEncryptionSetParametersResponse Empty = new DiskEncryptionSetParametersResponse();

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public DiskEncryptionSetParametersResponse(@Nullable String id) {
        this.id = id;
    }

    private DiskEncryptionSetParametersResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionSetParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionSetParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public DiskEncryptionSetParametersResponse build() {
            return new DiskEncryptionSetParametersResponse(id);
        }
    }
}
