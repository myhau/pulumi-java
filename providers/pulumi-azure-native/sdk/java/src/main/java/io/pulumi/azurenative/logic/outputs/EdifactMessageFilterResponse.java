// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EdifactMessageFilterResponse {
    private final String messageFilterType;

    @OutputCustomType.Constructor({"messageFilterType"})
    private EdifactMessageFilterResponse(String messageFilterType) {
        this.messageFilterType = Objects.requireNonNull(messageFilterType);
    }

    public String getMessageFilterType() {
        return this.messageFilterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactMessageFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageFilterType;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactMessageFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFilterType = defaults.messageFilterType;
        }

        public Builder setMessageFilterType(String messageFilterType) {
            this.messageFilterType = Objects.requireNonNull(messageFilterType);
            return this;
        }

        public EdifactMessageFilterResponse build() {
            return new EdifactMessageFilterResponse(messageFilterType);
        }
    }
}