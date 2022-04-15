// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.DirectLineSiteResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DirectLineChannelPropertiesResponse {
    /**
     * Direct Line embed code of the resource
     * 
     */
    private final @Nullable String directLineEmbedCode;
    /**
     * The list of Direct Line sites
     * 
     */
    private final @Nullable List<DirectLineSiteResponse> sites;

    @CustomType.Constructor
    private DirectLineChannelPropertiesResponse(
        @CustomType.Parameter("directLineEmbedCode") @Nullable String directLineEmbedCode,
        @CustomType.Parameter("sites") @Nullable List<DirectLineSiteResponse> sites) {
        this.directLineEmbedCode = directLineEmbedCode;
        this.sites = sites;
    }

    /**
     * Direct Line embed code of the resource
     * 
    */
    public Optional<String> directLineEmbedCode() {
        return Optional.ofNullable(this.directLineEmbedCode);
    }
    /**
     * The list of Direct Line sites
     * 
    */
    public List<DirectLineSiteResponse> sites() {
        return this.sites == null ? List.of() : this.sites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String directLineEmbedCode;
        private @Nullable List<DirectLineSiteResponse> sites;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directLineEmbedCode = defaults.directLineEmbedCode;
    	      this.sites = defaults.sites;
        }

        public Builder directLineEmbedCode(@Nullable String directLineEmbedCode) {
            this.directLineEmbedCode = directLineEmbedCode;
            return this;
        }
        public Builder sites(@Nullable List<DirectLineSiteResponse> sites) {
            this.sites = sites;
            return this;
        }
        public Builder sites(DirectLineSiteResponse... sites) {
            return sites(List.of(sites));
        }        public DirectLineChannelPropertiesResponse build() {
            return new DirectLineChannelPropertiesResponse(directLineEmbedCode, sites);
        }
    }
}
