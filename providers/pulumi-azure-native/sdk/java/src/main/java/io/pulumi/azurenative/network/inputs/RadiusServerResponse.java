// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Radius Server Settings.
 * 
 */
public final class RadiusServerResponse extends io.pulumi.resources.InvokeArgs {

    public static final RadiusServerResponse Empty = new RadiusServerResponse();

    /**
     * The address of this radius server.
     * 
     */
    @Import(name="radiusServerAddress", required=true)
      private final String radiusServerAddress;

    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * The initial score assigned to this radius server.
     * 
     */
    @Import(name="radiusServerScore")
      private final @Nullable Double radiusServerScore;

    public Optional<Double> radiusServerScore() {
        return this.radiusServerScore == null ? Optional.empty() : Optional.ofNullable(this.radiusServerScore);
    }

    /**
     * The secret used for this radius server.
     * 
     */
    @Import(name="radiusServerSecret")
      private final @Nullable String radiusServerSecret;

    public Optional<String> radiusServerSecret() {
        return this.radiusServerSecret == null ? Optional.empty() : Optional.ofNullable(this.radiusServerSecret);
    }

    public RadiusServerResponse(
        String radiusServerAddress,
        @Nullable Double radiusServerScore,
        @Nullable String radiusServerSecret) {
        this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress, "expected parameter 'radiusServerAddress' to be non-null");
        this.radiusServerScore = radiusServerScore;
        this.radiusServerSecret = radiusServerSecret;
    }

    private RadiusServerResponse() {
        this.radiusServerAddress = null;
        this.radiusServerScore = null;
        this.radiusServerSecret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RadiusServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String radiusServerAddress;
        private @Nullable Double radiusServerScore;
        private @Nullable String radiusServerSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(RadiusServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerScore = defaults.radiusServerScore;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
        }

        public Builder radiusServerAddress(String radiusServerAddress) {
            this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress);
            return this;
        }
        public Builder radiusServerScore(@Nullable Double radiusServerScore) {
            this.radiusServerScore = radiusServerScore;
            return this;
        }
        public Builder radiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }        public RadiusServerResponse build() {
            return new RadiusServerResponse(radiusServerAddress, radiusServerScore, radiusServerSecret);
        }
    }
}
