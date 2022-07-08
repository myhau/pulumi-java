// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaseml.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * State common to all model types. Includes publishing and validation information.
 * 
 */
public final class ModelStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelStateArgs Empty = new ModelStateArgs();

    /**
     * Indicates if this model has been published.
     * 
     */
    @Import(name="published")
    private @Nullable Output<Boolean> published;

    /**
     * @return Indicates if this model has been published.
     * 
     */
    public Optional<Output<Boolean>> published() {
        return Optional.ofNullable(this.published);
    }

    private ModelStateArgs() {}

    private ModelStateArgs(ModelStateArgs $) {
        this.published = $.published;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelStateArgs $;

        public Builder() {
            $ = new ModelStateArgs();
        }

        public Builder(ModelStateArgs defaults) {
            $ = new ModelStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param published Indicates if this model has been published.
         * 
         * @return builder
         * 
         */
        public Builder published(@Nullable Output<Boolean> published) {
            $.published = published;
            return this;
        }

        /**
         * @param published Indicates if this model has been published.
         * 
         * @return builder
         * 
         */
        public Builder published(Boolean published) {
            return published(Output.of(published));
        }

        public ModelStateArgs build() {
            return $;
        }
    }

}
