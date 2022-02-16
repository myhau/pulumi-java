// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentMessageTextArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageEntryFulfillmentMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageEntryFulfillmentMessageArgs Empty = new CxPageEntryFulfillmentMessageArgs();

    @InputImport(name="text")
    private final @Nullable Input<CxPageEntryFulfillmentMessageTextArgs> text;

    public Input<CxPageEntryFulfillmentMessageTextArgs> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public CxPageEntryFulfillmentMessageArgs(@Nullable Input<CxPageEntryFulfillmentMessageTextArgs> text) {
        this.text = text;
    }

    private CxPageEntryFulfillmentMessageArgs() {
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageEntryFulfillmentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CxPageEntryFulfillmentMessageTextArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageEntryFulfillmentMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(@Nullable Input<CxPageEntryFulfillmentMessageTextArgs> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable CxPageEntryFulfillmentMessageTextArgs text) {
            this.text = Input.ofNullable(text);
            return this;
        }

        public CxPageEntryFulfillmentMessageArgs build() {
            return new CxPageEntryFulfillmentMessageArgs(text);
        }
    }
}