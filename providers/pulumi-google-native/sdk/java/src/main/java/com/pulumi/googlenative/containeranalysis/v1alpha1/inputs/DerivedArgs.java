// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.FingerprintArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.LayerArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Derived describes the derived image portion (Occurrence) of the DockerImage relationship. This image would be produced from a Dockerfile with FROM .
 * 
 */
public final class DerivedArgs extends com.pulumi.resources.ResourceArgs {

    public static final DerivedArgs Empty = new DerivedArgs();

    /**
     * The fingerprint of the derived image.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<FingerprintArgs> fingerprint;

    /**
     * @return The fingerprint of the derived image.
     * 
     */
    public Optional<Output<FingerprintArgs>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * This contains layer-specific metadata, if populated it has length &#34;distance&#34; and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
     * 
     */
    @Import(name="layerInfo")
    private @Nullable Output<List<LayerArgs>> layerInfo;

    /**
     * @return This contains layer-specific metadata, if populated it has length &#34;distance&#34; and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
     * 
     */
    public Optional<Output<List<LayerArgs>>> layerInfo() {
        return Optional.ofNullable(this.layerInfo);
    }

    private DerivedArgs() {}

    private DerivedArgs(DerivedArgs $) {
        this.fingerprint = $.fingerprint;
        this.layerInfo = $.layerInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DerivedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DerivedArgs $;

        public Builder() {
            $ = new DerivedArgs();
        }

        public Builder(DerivedArgs defaults) {
            $ = new DerivedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fingerprint The fingerprint of the derived image.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<FingerprintArgs> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint The fingerprint of the derived image.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(FingerprintArgs fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param layerInfo This contains layer-specific metadata, if populated it has length &#34;distance&#34; and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
         * 
         * @return builder
         * 
         */
        public Builder layerInfo(@Nullable Output<List<LayerArgs>> layerInfo) {
            $.layerInfo = layerInfo;
            return this;
        }

        /**
         * @param layerInfo This contains layer-specific metadata, if populated it has length &#34;distance&#34; and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
         * 
         * @return builder
         * 
         */
        public Builder layerInfo(List<LayerArgs> layerInfo) {
            return layerInfo(Output.of(layerInfo));
        }

        /**
         * @param layerInfo This contains layer-specific metadata, if populated it has length &#34;distance&#34; and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
         * 
         * @return builder
         * 
         */
        public Builder layerInfo(LayerArgs... layerInfo) {
            return layerInfo(List.of(layerInfo));
        }

        public DerivedArgs build() {
            return $;
        }
    }

}
