// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecConfig;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecDnsConfig;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecHealthcheck;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecHost;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecLabel;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecMount;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecPrivileges;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecSecret;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTaskSpecContainerSpec {
    private final @Nullable List<String> args;
    private final @Nullable List<String> commands;
    private final @Nullable List<ServiceTaskSpecContainerSpecConfig> configs;
    private final @Nullable String dir;
    private final @Nullable ServiceTaskSpecContainerSpecDnsConfig dnsConfig;
    private final @Nullable Map<String,String> env;
    private final @Nullable List<String> groups;
    private final @Nullable ServiceTaskSpecContainerSpecHealthcheck healthcheck;
    private final @Nullable String hostname;
    private final @Nullable List<ServiceTaskSpecContainerSpecHost> hosts;
    private final String image;
    private final @Nullable String isolation;
    private final @Nullable List<ServiceTaskSpecContainerSpecLabel> labels;
    private final @Nullable List<ServiceTaskSpecContainerSpecMount> mounts;
    private final @Nullable ServiceTaskSpecContainerSpecPrivileges privileges;
    private final @Nullable Boolean readOnly;
    private final @Nullable List<ServiceTaskSpecContainerSpecSecret> secrets;
    private final @Nullable String stopGracePeriod;
    private final @Nullable String stopSignal;
    private final @Nullable String user;

    @OutputCustomType.Constructor({"args","commands","configs","dir","dnsConfig","env","groups","healthcheck","hostname","hosts","image","isolation","labels","mounts","privileges","readOnly","secrets","stopGracePeriod","stopSignal","user"})
    private ServiceTaskSpecContainerSpec(
        @Nullable List<String> args,
        @Nullable List<String> commands,
        @Nullable List<ServiceTaskSpecContainerSpecConfig> configs,
        @Nullable String dir,
        @Nullable ServiceTaskSpecContainerSpecDnsConfig dnsConfig,
        @Nullable Map<String,String> env,
        @Nullable List<String> groups,
        @Nullable ServiceTaskSpecContainerSpecHealthcheck healthcheck,
        @Nullable String hostname,
        @Nullable List<ServiceTaskSpecContainerSpecHost> hosts,
        String image,
        @Nullable String isolation,
        @Nullable List<ServiceTaskSpecContainerSpecLabel> labels,
        @Nullable List<ServiceTaskSpecContainerSpecMount> mounts,
        @Nullable ServiceTaskSpecContainerSpecPrivileges privileges,
        @Nullable Boolean readOnly,
        @Nullable List<ServiceTaskSpecContainerSpecSecret> secrets,
        @Nullable String stopGracePeriod,
        @Nullable String stopSignal,
        @Nullable String user) {
        this.args = args;
        this.commands = commands;
        this.configs = configs;
        this.dir = dir;
        this.dnsConfig = dnsConfig;
        this.env = env;
        this.groups = groups;
        this.healthcheck = healthcheck;
        this.hostname = hostname;
        this.hosts = hosts;
        this.image = image;
        this.isolation = isolation;
        this.labels = labels;
        this.mounts = mounts;
        this.privileges = privileges;
        this.readOnly = readOnly;
        this.secrets = secrets;
        this.stopGracePeriod = stopGracePeriod;
        this.stopSignal = stopSignal;
        this.user = user;
    }

    public List<String> getArgs() {
        return this.args == null ? List.of() : this.args;
    }
    public List<String> getCommands() {
        return this.commands == null ? List.of() : this.commands;
    }
    public List<ServiceTaskSpecContainerSpecConfig> getConfigs() {
        return this.configs == null ? List.of() : this.configs;
    }
    public Optional<String> getDir() {
        return Optional.ofNullable(this.dir);
    }
    public Optional<ServiceTaskSpecContainerSpecDnsConfig> getDnsConfig() {
        return Optional.ofNullable(this.dnsConfig);
    }
    public Map<String,String> getEnv() {
        return this.env == null ? Map.of() : this.env;
    }
    public List<String> getGroups() {
        return this.groups == null ? List.of() : this.groups;
    }
    public Optional<ServiceTaskSpecContainerSpecHealthcheck> getHealthcheck() {
        return Optional.ofNullable(this.healthcheck);
    }
    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    public List<ServiceTaskSpecContainerSpecHost> getHosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }
    public String getImage() {
        return this.image;
    }
    public Optional<String> getIsolation() {
        return Optional.ofNullable(this.isolation);
    }
    public List<ServiceTaskSpecContainerSpecLabel> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    public List<ServiceTaskSpecContainerSpecMount> getMounts() {
        return this.mounts == null ? List.of() : this.mounts;
    }
    public Optional<ServiceTaskSpecContainerSpecPrivileges> getPrivileges() {
        return Optional.ofNullable(this.privileges);
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public List<ServiceTaskSpecContainerSpecSecret> getSecrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }
    public Optional<String> getStopGracePeriod() {
        return Optional.ofNullable(this.stopGracePeriod);
    }
    public Optional<String> getStopSignal() {
        return Optional.ofNullable(this.stopSignal);
    }
    public Optional<String> getUser() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> commands;
        private @Nullable List<ServiceTaskSpecContainerSpecConfig> configs;
        private @Nullable String dir;
        private @Nullable ServiceTaskSpecContainerSpecDnsConfig dnsConfig;
        private @Nullable Map<String,String> env;
        private @Nullable List<String> groups;
        private @Nullable ServiceTaskSpecContainerSpecHealthcheck healthcheck;
        private @Nullable String hostname;
        private @Nullable List<ServiceTaskSpecContainerSpecHost> hosts;
        private String image;
        private @Nullable String isolation;
        private @Nullable List<ServiceTaskSpecContainerSpecLabel> labels;
        private @Nullable List<ServiceTaskSpecContainerSpecMount> mounts;
        private @Nullable ServiceTaskSpecContainerSpecPrivileges privileges;
        private @Nullable Boolean readOnly;
        private @Nullable List<ServiceTaskSpecContainerSpecSecret> secrets;
        private @Nullable String stopGracePeriod;
        private @Nullable String stopSignal;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.configs = defaults.configs;
    	      this.dir = defaults.dir;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.env = defaults.env;
    	      this.groups = defaults.groups;
    	      this.healthcheck = defaults.healthcheck;
    	      this.hostname = defaults.hostname;
    	      this.hosts = defaults.hosts;
    	      this.image = defaults.image;
    	      this.isolation = defaults.isolation;
    	      this.labels = defaults.labels;
    	      this.mounts = defaults.mounts;
    	      this.privileges = defaults.privileges;
    	      this.readOnly = defaults.readOnly;
    	      this.secrets = defaults.secrets;
    	      this.stopGracePeriod = defaults.stopGracePeriod;
    	      this.stopSignal = defaults.stopSignal;
    	      this.user = defaults.user;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = args;
            return this;
        }

        public Builder setCommands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }

        public Builder setConfigs(@Nullable List<ServiceTaskSpecContainerSpecConfig> configs) {
            this.configs = configs;
            return this;
        }

        public Builder setDir(@Nullable String dir) {
            this.dir = dir;
            return this;
        }

        public Builder setDnsConfig(@Nullable ServiceTaskSpecContainerSpecDnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder setEnv(@Nullable Map<String,String> env) {
            this.env = env;
            return this;
        }

        public Builder setGroups(@Nullable List<String> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setHealthcheck(@Nullable ServiceTaskSpecContainerSpecHealthcheck healthcheck) {
            this.healthcheck = healthcheck;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setHosts(@Nullable List<ServiceTaskSpecContainerSpecHost> hosts) {
            this.hosts = hosts;
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setIsolation(@Nullable String isolation) {
            this.isolation = isolation;
            return this;
        }

        public Builder setLabels(@Nullable List<ServiceTaskSpecContainerSpecLabel> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setMounts(@Nullable List<ServiceTaskSpecContainerSpecMount> mounts) {
            this.mounts = mounts;
            return this;
        }

        public Builder setPrivileges(@Nullable ServiceTaskSpecContainerSpecPrivileges privileges) {
            this.privileges = privileges;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSecrets(@Nullable List<ServiceTaskSpecContainerSpecSecret> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setStopGracePeriod(@Nullable String stopGracePeriod) {
            this.stopGracePeriod = stopGracePeriod;
            return this;
        }

        public Builder setStopSignal(@Nullable String stopSignal) {
            this.stopSignal = stopSignal;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = user;
            return this;
        }
        public ServiceTaskSpecContainerSpec build() {
            return new ServiceTaskSpecContainerSpec(args, commands, configs, dir, dnsConfig, env, groups, healthcheck, hostname, hosts, image, isolation, labels, mounts, privileges, readOnly, secrets, stopGracePeriod, stopSignal, user);
        }
    }
}