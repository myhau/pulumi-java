// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceSerialPortResult {
    /**
     * The output of the serial port. Serial port output is available only when the VM instance is running, and logs are limited to the most recent 1 MB of output per port.
     * 
     */
    private final String contents;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instance;
    private final Integer port;
    private final String project;
    private final String zone;

    @OutputCustomType.Constructor({"contents","id","instance","port","project","zone"})
    private GetInstanceSerialPortResult(
        String contents,
        String id,
        String instance,
        Integer port,
        String project,
        String zone) {
        this.contents = Objects.requireNonNull(contents);
        this.id = Objects.requireNonNull(id);
        this.instance = Objects.requireNonNull(instance);
        this.port = Objects.requireNonNull(port);
        this.project = Objects.requireNonNull(project);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * The output of the serial port. Serial port output is available only when the VM instance is running, and logs are limited to the most recent 1 MB of output per port.
     * 
     */
    public String getContents() {
        return this.contents;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getInstance() {
        return this.instance;
    }
    public Integer getPort() {
        return this.port;
    }
    public String getProject() {
        return this.project;
    }
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceSerialPortResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contents;
        private String id;
        private String instance;
        private Integer port;
        private String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceSerialPortResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.id = defaults.id;
    	      this.instance = defaults.instance;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder setContents(String contents) {
            this.contents = Objects.requireNonNull(contents);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetInstanceSerialPortResult build() {
            return new GetInstanceSerialPortResult(contents, id, instance, port, project, zone);
        }
    }
}
