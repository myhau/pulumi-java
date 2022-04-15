// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CognitiveServicesAccountSkuChangeInfoResponse {
    /**
     * Gets the count of downgrades.
     * 
     */
    private final Double countOfDowngrades;
    /**
     * Gets the count of upgrades after downgrades.
     * 
     */
    private final Double countOfUpgradesAfterDowngrades;
    /**
     * Gets the last change date.
     * 
     */
    private final String lastChangeDate;

    @CustomType.Constructor
    private CognitiveServicesAccountSkuChangeInfoResponse(
        @CustomType.Parameter("countOfDowngrades") Double countOfDowngrades,
        @CustomType.Parameter("countOfUpgradesAfterDowngrades") Double countOfUpgradesAfterDowngrades,
        @CustomType.Parameter("lastChangeDate") String lastChangeDate) {
        this.countOfDowngrades = countOfDowngrades;
        this.countOfUpgradesAfterDowngrades = countOfUpgradesAfterDowngrades;
        this.lastChangeDate = lastChangeDate;
    }

    /**
     * Gets the count of downgrades.
     * 
    */
    public Double countOfDowngrades() {
        return this.countOfDowngrades;
    }
    /**
     * Gets the count of upgrades after downgrades.
     * 
    */
    public Double countOfUpgradesAfterDowngrades() {
        return this.countOfUpgradesAfterDowngrades;
    }
    /**
     * Gets the last change date.
     * 
    */
    public String lastChangeDate() {
        return this.lastChangeDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountSkuChangeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double countOfDowngrades;
        private Double countOfUpgradesAfterDowngrades;
        private String lastChangeDate;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountSkuChangeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countOfDowngrades = defaults.countOfDowngrades;
    	      this.countOfUpgradesAfterDowngrades = defaults.countOfUpgradesAfterDowngrades;
    	      this.lastChangeDate = defaults.lastChangeDate;
        }

        public Builder countOfDowngrades(Double countOfDowngrades) {
            this.countOfDowngrades = Objects.requireNonNull(countOfDowngrades);
            return this;
        }
        public Builder countOfUpgradesAfterDowngrades(Double countOfUpgradesAfterDowngrades) {
            this.countOfUpgradesAfterDowngrades = Objects.requireNonNull(countOfUpgradesAfterDowngrades);
            return this;
        }
        public Builder lastChangeDate(String lastChangeDate) {
            this.lastChangeDate = Objects.requireNonNull(lastChangeDate);
            return this;
        }        public CognitiveServicesAccountSkuChangeInfoResponse build() {
            return new CognitiveServicesAccountSkuChangeInfoResponse(countOfDowngrades, countOfUpgradesAfterDowngrades, lastChangeDate);
        }
    }
}
