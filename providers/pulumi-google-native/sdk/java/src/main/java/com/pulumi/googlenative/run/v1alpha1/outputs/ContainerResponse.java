// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run.v1alpha1.outputs.ContainerPortResponse;
import com.pulumi.googlenative.run.v1alpha1.outputs.EnvFromSourceResponse;
import com.pulumi.googlenative.run.v1alpha1.outputs.EnvVarResponse;
import com.pulumi.googlenative.run.v1alpha1.outputs.ProbeResponse;
import com.pulumi.googlenative.run.v1alpha1.outputs.ResourceRequirementsResponse;
import com.pulumi.googlenative.run.v1alpha1.outputs.SecurityContextResponse;
import com.pulumi.googlenative.run.v1alpha1.outputs.VolumeMountResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ContainerResponse {
    /**
     * @return (Optional) Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    private final List<String> args;
    private final List<String> command;
    /**
     * @return (Optional) List of environment variables to set in the container.
     * 
     */
    private final List<EnvVarResponse> env;
    /**
     * @return (Optional) List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    private final List<EnvFromSourceResponse> envFrom;
    /**
     * @return Only supports containers from Google Container Registry or Artifact Registry URL of the Container image. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    private final String image;
    /**
     * @return (Optional) Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    private final String imagePullPolicy;
    /**
     * @return (Optional) Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final ProbeResponse livenessProbe;
    /**
     * @return (Optional) Name of the container specified as a DNS_LABEL. Currently unused in Cloud Run. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-label-names
     * 
     */
    private final String name;
    /**
     * @return (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    private final List<ContainerPortResponse> ports;
    /**
     * @return (Optional) Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final ProbeResponse readinessProbe;
    /**
     * @return (Optional) Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    private final ResourceRequirementsResponse resources;
    /**
     * @return (Optional) Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    private final SecurityContextResponse securityContext;
    /**
     * @return (Optional) Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final ProbeResponse startupProbe;
    /**
     * @return (Optional) Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
     * 
     */
    private final String terminationMessagePath;
    /**
     * @return (Optional) Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     */
    private final String terminationMessagePolicy;
    /**
     * @return (Optional) Volume to mount into the container&#39;s filesystem. Only supports SecretVolumeSources. Pod volumes to mount into the container&#39;s filesystem.
     * 
     */
    private final List<VolumeMountResponse> volumeMounts;
    /**
     * @return (Optional) Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image.
     * 
     */
    private final String workingDir;

    @CustomType.Constructor
    private ContainerResponse(
        @CustomType.Parameter("args") List<String> args,
        @CustomType.Parameter("command") List<String> command,
        @CustomType.Parameter("env") List<EnvVarResponse> env,
        @CustomType.Parameter("envFrom") List<EnvFromSourceResponse> envFrom,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("imagePullPolicy") String imagePullPolicy,
        @CustomType.Parameter("livenessProbe") ProbeResponse livenessProbe,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("ports") List<ContainerPortResponse> ports,
        @CustomType.Parameter("readinessProbe") ProbeResponse readinessProbe,
        @CustomType.Parameter("resources") ResourceRequirementsResponse resources,
        @CustomType.Parameter("securityContext") SecurityContextResponse securityContext,
        @CustomType.Parameter("startupProbe") ProbeResponse startupProbe,
        @CustomType.Parameter("terminationMessagePath") String terminationMessagePath,
        @CustomType.Parameter("terminationMessagePolicy") String terminationMessagePolicy,
        @CustomType.Parameter("volumeMounts") List<VolumeMountResponse> volumeMounts,
        @CustomType.Parameter("workingDir") String workingDir) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.livenessProbe = livenessProbe;
        this.name = name;
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = resources;
        this.securityContext = securityContext;
        this.startupProbe = startupProbe;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    /**
     * @return (Optional) Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public List<String> args() {
        return this.args;
    }
    public List<String> command() {
        return this.command;
    }
    /**
     * @return (Optional) List of environment variables to set in the container.
     * 
     */
    public List<EnvVarResponse> env() {
        return this.env;
    }
    /**
     * @return (Optional) List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    public List<EnvFromSourceResponse> envFrom() {
        return this.envFrom;
    }
    /**
     * @return Only supports containers from Google Container Registry or Artifact Registry URL of the Container image. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return (Optional) Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    public String imagePullPolicy() {
        return this.imagePullPolicy;
    }
    /**
     * @return (Optional) Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public ProbeResponse livenessProbe() {
        return this.livenessProbe;
    }
    /**
     * @return (Optional) Name of the container specified as a DNS_LABEL. Currently unused in Cloud Run. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-label-names
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    public List<ContainerPortResponse> ports() {
        return this.ports;
    }
    /**
     * @return (Optional) Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public ProbeResponse readinessProbe() {
        return this.readinessProbe;
    }
    /**
     * @return (Optional) Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    public ResourceRequirementsResponse resources() {
        return this.resources;
    }
    /**
     * @return (Optional) Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    public SecurityContextResponse securityContext() {
        return this.securityContext;
    }
    /**
     * @return (Optional) Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public ProbeResponse startupProbe() {
        return this.startupProbe;
    }
    /**
     * @return (Optional) Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
     * 
     */
    public String terminationMessagePath() {
        return this.terminationMessagePath;
    }
    /**
     * @return (Optional) Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     */
    public String terminationMessagePolicy() {
        return this.terminationMessagePolicy;
    }
    /**
     * @return (Optional) Volume to mount into the container&#39;s filesystem. Only supports SecretVolumeSources. Pod volumes to mount into the container&#39;s filesystem.
     * 
     */
    public List<VolumeMountResponse> volumeMounts() {
        return this.volumeMounts;
    }
    /**
     * @return (Optional) Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image.
     * 
     */
    public String workingDir() {
        return this.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private List<String> command;
        private List<EnvVarResponse> env;
        private List<EnvFromSourceResponse> envFrom;
        private String image;
        private String imagePullPolicy;
        private ProbeResponse livenessProbe;
        private String name;
        private List<ContainerPortResponse> ports;
        private ProbeResponse readinessProbe;
        private ResourceRequirementsResponse resources;
        private SecurityContextResponse securityContext;
        private ProbeResponse startupProbe;
        private String terminationMessagePath;
        private String terminationMessagePolicy;
        private List<VolumeMountResponse> volumeMounts;
        private String workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.envFrom = defaults.envFrom;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
    	      this.securityContext = defaults.securityContext;
    	      this.startupProbe = defaults.startupProbe;
    	      this.terminationMessagePath = defaults.terminationMessagePath;
    	      this.terminationMessagePolicy = defaults.terminationMessagePolicy;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder command(List<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }
        public Builder env(List<EnvVarResponse> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }
        public Builder env(EnvVarResponse... env) {
            return env(List.of(env));
        }
        public Builder envFrom(List<EnvFromSourceResponse> envFrom) {
            this.envFrom = Objects.requireNonNull(envFrom);
            return this;
        }
        public Builder envFrom(EnvFromSourceResponse... envFrom) {
            return envFrom(List.of(envFrom));
        }
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder imagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = Objects.requireNonNull(imagePullPolicy);
            return this;
        }
        public Builder livenessProbe(ProbeResponse livenessProbe) {
            this.livenessProbe = Objects.requireNonNull(livenessProbe);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder ports(List<ContainerPortResponse> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(ContainerPortResponse... ports) {
            return ports(List.of(ports));
        }
        public Builder readinessProbe(ProbeResponse readinessProbe) {
            this.readinessProbe = Objects.requireNonNull(readinessProbe);
            return this;
        }
        public Builder resources(ResourceRequirementsResponse resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder securityContext(SecurityContextResponse securityContext) {
            this.securityContext = Objects.requireNonNull(securityContext);
            return this;
        }
        public Builder startupProbe(ProbeResponse startupProbe) {
            this.startupProbe = Objects.requireNonNull(startupProbe);
            return this;
        }
        public Builder terminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = Objects.requireNonNull(terminationMessagePath);
            return this;
        }
        public Builder terminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = Objects.requireNonNull(terminationMessagePolicy);
            return this;
        }
        public Builder volumeMounts(List<VolumeMountResponse> volumeMounts) {
            this.volumeMounts = Objects.requireNonNull(volumeMounts);
            return this;
        }
        public Builder volumeMounts(VolumeMountResponse... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public Builder workingDir(String workingDir) {
            this.workingDir = Objects.requireNonNull(workingDir);
            return this;
        }        public ContainerResponse build() {
            return new ContainerResponse(args, command, env, envFrom, image, imagePullPolicy, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, terminationMessagePath, terminationMessagePolicy, volumeMounts, workingDir);
        }
    }
}
