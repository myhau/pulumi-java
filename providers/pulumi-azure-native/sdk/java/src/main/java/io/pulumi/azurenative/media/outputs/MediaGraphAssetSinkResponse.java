// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MediaGraphAssetSinkResponse {
    /**
     * Asset name.
     * 
     */
    private final String assetName;
    /**
     * Sink inputs.
     * 
     */
    private final List<String> inputs;
    /**
     * Sink name.
     * 
     */
    private final String name;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphAssetSink'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"assetName","inputs","name","odataType"})
    private MediaGraphAssetSinkResponse(
        String assetName,
        List<String> inputs,
        String name,
        String odataType) {
        this.assetName = assetName;
        this.inputs = inputs;
        this.name = name;
        this.odataType = odataType;
    }

    /**
     * Asset name.
     * 
    */
    public String getAssetName() {
        return this.assetName;
    }
    /**
     * Sink inputs.
     * 
    */
    public List<String> getInputs() {
        return this.inputs;
    }
    /**
     * Sink name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphAssetSink'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphAssetSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetName;
        private List<String> inputs;
        private String name;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphAssetSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.inputs = defaults.inputs;
    	      this.name = defaults.name;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setInputs(List<String> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public MediaGraphAssetSinkResponse build() {
            return new MediaGraphAssetSinkResponse(assetName, inputs, name, odataType);
        }
    }
}
