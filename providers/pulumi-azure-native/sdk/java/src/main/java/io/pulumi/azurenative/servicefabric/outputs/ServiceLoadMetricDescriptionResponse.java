// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLoadMetricDescriptionResponse {
    /**
     * Used only for Stateless services. The default amount of load, as a number, that this service creates for this metric.
     * 
     */
    private final @Nullable Integer defaultLoad;
    /**
     * The name of the metric. If the service chooses to report load during runtime, the load metric name should match the name that is specified in Name exactly. Note that metric names are case sensitive.
     * 
     */
    private final String name;
    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Primary replica.
     * 
     */
    private final @Nullable Integer primaryDefaultLoad;
    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Secondary replica.
     * 
     */
    private final @Nullable Integer secondaryDefaultLoad;
    /**
     * The service load metric relative weight, compared to other metrics configured for this service, as a number.
     * 
     */
    private final @Nullable String weight;

    @CustomType.Constructor
    private ServiceLoadMetricDescriptionResponse(
        @CustomType.Parameter("defaultLoad") @Nullable Integer defaultLoad,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("primaryDefaultLoad") @Nullable Integer primaryDefaultLoad,
        @CustomType.Parameter("secondaryDefaultLoad") @Nullable Integer secondaryDefaultLoad,
        @CustomType.Parameter("weight") @Nullable String weight) {
        this.defaultLoad = defaultLoad;
        this.name = name;
        this.primaryDefaultLoad = primaryDefaultLoad;
        this.secondaryDefaultLoad = secondaryDefaultLoad;
        this.weight = weight;
    }

    /**
     * Used only for Stateless services. The default amount of load, as a number, that this service creates for this metric.
     * 
    */
    public Optional<Integer> defaultLoad() {
        return Optional.ofNullable(this.defaultLoad);
    }
    /**
     * The name of the metric. If the service chooses to report load during runtime, the load metric name should match the name that is specified in Name exactly. Note that metric names are case sensitive.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Primary replica.
     * 
    */
    public Optional<Integer> primaryDefaultLoad() {
        return Optional.ofNullable(this.primaryDefaultLoad);
    }
    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Secondary replica.
     * 
    */
    public Optional<Integer> secondaryDefaultLoad() {
        return Optional.ofNullable(this.secondaryDefaultLoad);
    }
    /**
     * The service load metric relative weight, compared to other metrics configured for this service, as a number.
     * 
    */
    public Optional<String> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLoadMetricDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer defaultLoad;
        private String name;
        private @Nullable Integer primaryDefaultLoad;
        private @Nullable Integer secondaryDefaultLoad;
        private @Nullable String weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLoadMetricDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultLoad = defaults.defaultLoad;
    	      this.name = defaults.name;
    	      this.primaryDefaultLoad = defaults.primaryDefaultLoad;
    	      this.secondaryDefaultLoad = defaults.secondaryDefaultLoad;
    	      this.weight = defaults.weight;
        }

        public Builder defaultLoad(@Nullable Integer defaultLoad) {
            this.defaultLoad = defaultLoad;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder primaryDefaultLoad(@Nullable Integer primaryDefaultLoad) {
            this.primaryDefaultLoad = primaryDefaultLoad;
            return this;
        }
        public Builder secondaryDefaultLoad(@Nullable Integer secondaryDefaultLoad) {
            this.secondaryDefaultLoad = secondaryDefaultLoad;
            return this;
        }
        public Builder weight(@Nullable String weight) {
            this.weight = weight;
            return this;
        }        public ServiceLoadMetricDescriptionResponse build() {
            return new ServiceLoadMetricDescriptionResponse(defaultLoad, name, primaryDefaultLoad, secondaryDefaultLoad, weight);
        }
    }
}
