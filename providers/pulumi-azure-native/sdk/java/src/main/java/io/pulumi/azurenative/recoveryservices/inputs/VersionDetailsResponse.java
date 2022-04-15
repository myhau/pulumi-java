// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Version related details.
 * 
 */
public final class VersionDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VersionDetailsResponse Empty = new VersionDetailsResponse();

    /**
     * Version expiry date.
     * 
     */
    @Import(name="expiryDate")
      private final @Nullable String expiryDate;

    public Optional<String> expiryDate() {
        return this.expiryDate == null ? Optional.empty() : Optional.ofNullable(this.expiryDate);
    }

    /**
     * A value indicating whether security update required.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * The agent version.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public VersionDetailsResponse(
        @Nullable String expiryDate,
        @Nullable String status,
        @Nullable String version) {
        this.expiryDate = expiryDate;
        this.status = status;
        this.version = version;
    }

    private VersionDetailsResponse() {
        this.expiryDate = null;
        this.status = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expiryDate;
        private @Nullable String status;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryDate = defaults.expiryDate;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
        }

        public Builder expiryDate(@Nullable String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public VersionDetailsResponse build() {
            return new VersionDetailsResponse(expiryDate, status, version);
        }
    }
}
