// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Teams data type connection.
 * 
 */
public final class OfficeDataConnectorDataTypesResponseTeams extends io.pulumi.resources.InvokeArgs {

    public static final OfficeDataConnectorDataTypesResponseTeams Empty = new OfficeDataConnectorDataTypesResponseTeams();

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> state() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public OfficeDataConnectorDataTypesResponseTeams(@Nullable String state) {
        this.state = state;
    }

    private OfficeDataConnectorDataTypesResponseTeams() {
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OfficeDataConnectorDataTypesResponseTeams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(OfficeDataConnectorDataTypesResponseTeams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public OfficeDataConnectorDataTypesResponseTeams build() {
            return new OfficeDataConnectorDataTypesResponseTeams(state);
        }
    }
}
