// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GlobalTableStreamSpecification extends io.pulumi.resources.InvokeArgs {

    public static final GlobalTableStreamSpecification Empty = new GlobalTableStreamSpecification();

    @InputImport(name="streamViewType", required=true)
    private final String streamViewType;

    public String getStreamViewType() {
        return this.streamViewType;
    }

    public GlobalTableStreamSpecification(String streamViewType) {
        this.streamViewType = Objects.requireNonNull(streamViewType, "expected parameter 'streamViewType' to be non-null");
    }

    private GlobalTableStreamSpecification() {
        this.streamViewType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableStreamSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String streamViewType;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableStreamSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamViewType = defaults.streamViewType;
        }

        public Builder setStreamViewType(String streamViewType) {
            this.streamViewType = Objects.requireNonNull(streamViewType);
            return this;
        }

        public GlobalTableStreamSpecification build() {
            return new GlobalTableStreamSpecification(streamViewType);
        }
    }
}