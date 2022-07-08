// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Targets a group of VM instances by using their [assigned labels](https://cloud.google.com/compute/docs/labeling-resources). Labels are key-value pairs. A `GroupLabel` is a combination of labels that is used to target VMs for a patch job. For example, a patch job can target VMs that have the following `GroupLabel`: `{&#34;env&#34;:&#34;test&#34;, &#34;app&#34;:&#34;web&#34;}`. This means that the patch job is applied to VMs that have both the labels `env=test` and `app=web`.
 * 
 */
public final class PatchInstanceFilterGroupLabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchInstanceFilterGroupLabelArgs Empty = new PatchInstanceFilterGroupLabelArgs();

    /**
     * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private PatchInstanceFilterGroupLabelArgs() {}

    private PatchInstanceFilterGroupLabelArgs(PatchInstanceFilterGroupLabelArgs $) {
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchInstanceFilterGroupLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchInstanceFilterGroupLabelArgs $;

        public Builder() {
            $ = new PatchInstanceFilterGroupLabelArgs();
        }

        public Builder(PatchInstanceFilterGroupLabelArgs defaults) {
            $ = new PatchInstanceFilterGroupLabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public PatchInstanceFilterGroupLabelArgs build() {
            return $;
        }
    }

}
