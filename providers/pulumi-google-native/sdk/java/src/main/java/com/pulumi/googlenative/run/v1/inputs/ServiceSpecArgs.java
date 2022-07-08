// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run.v1.inputs.RevisionTemplateArgs;
import com.pulumi.googlenative.run.v1.inputs.TrafficTargetArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ServiceSpec holds the desired state of the Route (from the client), which is used to manipulate the underlying Route and Configuration(s).
 * 
 */
public final class ServiceSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSpecArgs Empty = new ServiceSpecArgs();

    /**
     * Template holds the latest specification for the Revision to be stamped out.
     * 
     */
    @Import(name="template")
    private @Nullable Output<RevisionTemplateArgs> template;

    /**
     * @return Template holds the latest specification for the Revision to be stamped out.
     * 
     */
    public Optional<Output<RevisionTemplateArgs>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations.
     * 
     */
    @Import(name="traffic")
    private @Nullable Output<List<TrafficTargetArgs>> traffic;

    /**
     * @return Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations.
     * 
     */
    public Optional<Output<List<TrafficTargetArgs>>> traffic() {
        return Optional.ofNullable(this.traffic);
    }

    private ServiceSpecArgs() {}

    private ServiceSpecArgs(ServiceSpecArgs $) {
        this.template = $.template;
        this.traffic = $.traffic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSpecArgs $;

        public Builder() {
            $ = new ServiceSpecArgs();
        }

        public Builder(ServiceSpecArgs defaults) {
            $ = new ServiceSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param template Template holds the latest specification for the Revision to be stamped out.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<RevisionTemplateArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Template holds the latest specification for the Revision to be stamped out.
         * 
         * @return builder
         * 
         */
        public Builder template(RevisionTemplateArgs template) {
            return template(Output.of(template));
        }

        /**
         * @param traffic Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations.
         * 
         * @return builder
         * 
         */
        public Builder traffic(@Nullable Output<List<TrafficTargetArgs>> traffic) {
            $.traffic = traffic;
            return this;
        }

        /**
         * @param traffic Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations.
         * 
         * @return builder
         * 
         */
        public Builder traffic(List<TrafficTargetArgs> traffic) {
            return traffic(Output.of(traffic));
        }

        /**
         * @param traffic Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations.
         * 
         * @return builder
         * 
         */
        public Builder traffic(TrafficTargetArgs... traffic) {
            return traffic(List.of(traffic));
        }

        public ServiceSpecArgs build() {
            return $;
        }
    }

}
