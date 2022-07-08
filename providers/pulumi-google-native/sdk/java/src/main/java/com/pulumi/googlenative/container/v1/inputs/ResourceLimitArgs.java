// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about amount of some resource in the cluster. For memory, value should be in GB.
 * 
 */
public final class ResourceLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceLimitArgs Empty = new ResourceLimitArgs();

    /**
     * Maximum amount of the resource in the cluster.
     * 
     */
    @Import(name="maximum")
    private @Nullable Output<String> maximum;

    /**
     * @return Maximum amount of the resource in the cluster.
     * 
     */
    public Optional<Output<String>> maximum() {
        return Optional.ofNullable(this.maximum);
    }

    /**
     * Minimum amount of the resource in the cluster.
     * 
     */
    @Import(name="minimum")
    private @Nullable Output<String> minimum;

    /**
     * @return Minimum amount of the resource in the cluster.
     * 
     */
    public Optional<Output<String>> minimum() {
        return Optional.ofNullable(this.minimum);
    }

    /**
     * Resource name &#34;cpu&#34;, &#34;memory&#34; or gpu-specific string.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return Resource name &#34;cpu&#34;, &#34;memory&#34; or gpu-specific string.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private ResourceLimitArgs() {}

    private ResourceLimitArgs(ResourceLimitArgs $) {
        this.maximum = $.maximum;
        this.minimum = $.minimum;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceLimitArgs $;

        public Builder() {
            $ = new ResourceLimitArgs();
        }

        public Builder(ResourceLimitArgs defaults) {
            $ = new ResourceLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maximum Maximum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder maximum(@Nullable Output<String> maximum) {
            $.maximum = maximum;
            return this;
        }

        /**
         * @param maximum Maximum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder maximum(String maximum) {
            return maximum(Output.of(maximum));
        }

        /**
         * @param minimum Minimum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder minimum(@Nullable Output<String> minimum) {
            $.minimum = minimum;
            return this;
        }

        /**
         * @param minimum Minimum amount of the resource in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder minimum(String minimum) {
            return minimum(Output.of(minimum));
        }

        /**
         * @param resourceType Resource name &#34;cpu&#34;, &#34;memory&#34; or gpu-specific string.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Resource name &#34;cpu&#34;, &#34;memory&#34; or gpu-specific string.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public ResourceLimitArgs build() {
            return $;
        }
    }

}
