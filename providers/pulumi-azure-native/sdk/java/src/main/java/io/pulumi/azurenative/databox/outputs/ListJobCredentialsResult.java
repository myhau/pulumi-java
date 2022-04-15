// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.UnencryptedCredentialsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListJobCredentialsResult {
    /**
     * Link for the next set of unencrypted credentials.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * List of unencrypted credentials.
     * 
     */
    private final @Nullable List<UnencryptedCredentialsResponse> value;

    @CustomType.Constructor
    private ListJobCredentialsResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") @Nullable List<UnencryptedCredentialsResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link for the next set of unencrypted credentials.
     * 
    */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * List of unencrypted credentials.
     * 
    */
    public List<UnencryptedCredentialsResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListJobCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<UnencryptedCredentialsResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListJobCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        public Builder value(@Nullable List<UnencryptedCredentialsResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(UnencryptedCredentialsResponse... value) {
            return value(List.of(value));
        }        public ListJobCredentialsResult build() {
            return new ListJobCredentialsResult(nextLink, value);
        }
    }
}
