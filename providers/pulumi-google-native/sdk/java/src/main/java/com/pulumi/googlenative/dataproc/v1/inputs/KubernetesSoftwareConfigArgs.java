// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The software configuration for this Dataproc cluster running on Kubernetes.
 * 
 */
public final class KubernetesSoftwareConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesSoftwareConfigArgs Empty = new KubernetesSoftwareConfigArgs();

    /**
     * The components that should be installed in this Dataproc cluster. The key must be a string from the KubernetesComponent enumeration. The value is the version of the software to be installed. At least one entry must be specified.
     * 
     */
    @Import(name="componentVersion")
    private @Nullable Output<Map<String,String>> componentVersion;

    /**
     * @return The components that should be installed in this Dataproc cluster. The key must be a string from the KubernetesComponent enumeration. The value is the version of the software to be installed. At least one entry must be specified.
     * 
     */
    public Optional<Output<Map<String,String>>> componentVersion() {
        return Optional.ofNullable(this.componentVersion);
    }

    /**
     * The properties to set on daemon config files.Property keys are specified in prefix:property format, for example spark:spark.kubernetes.container.image. The following are supported prefixes and their mappings: spark: spark-defaults.confFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return The properties to set on daemon config files.Property keys are specified in prefix:property format, for example spark:spark.kubernetes.container.image. The following are supported prefixes and their mappings: spark: spark-defaults.confFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private KubernetesSoftwareConfigArgs() {}

    private KubernetesSoftwareConfigArgs(KubernetesSoftwareConfigArgs $) {
        this.componentVersion = $.componentVersion;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesSoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesSoftwareConfigArgs $;

        public Builder() {
            $ = new KubernetesSoftwareConfigArgs();
        }

        public Builder(KubernetesSoftwareConfigArgs defaults) {
            $ = new KubernetesSoftwareConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentVersion The components that should be installed in this Dataproc cluster. The key must be a string from the KubernetesComponent enumeration. The value is the version of the software to be installed. At least one entry must be specified.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(@Nullable Output<Map<String,String>> componentVersion) {
            $.componentVersion = componentVersion;
            return this;
        }

        /**
         * @param componentVersion The components that should be installed in this Dataproc cluster. The key must be a string from the KubernetesComponent enumeration. The value is the version of the software to be installed. At least one entry must be specified.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(Map<String,String> componentVersion) {
            return componentVersion(Output.of(componentVersion));
        }

        /**
         * @param properties The properties to set on daemon config files.Property keys are specified in prefix:property format, for example spark:spark.kubernetes.container.image. The following are supported prefixes and their mappings: spark: spark-defaults.confFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The properties to set on daemon config files.Property keys are specified in prefix:property format, for example spark:spark.kubernetes.container.image. The following are supported prefixes and their mappings: spark: spark-defaults.confFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public KubernetesSoftwareConfigArgs build() {
            return $;
        }
    }

}
