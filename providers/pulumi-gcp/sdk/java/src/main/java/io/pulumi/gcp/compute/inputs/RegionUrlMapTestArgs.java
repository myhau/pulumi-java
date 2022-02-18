// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapTestArgs Empty = new RegionUrlMapTestArgs();

    /**
     * Description of this test case.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Host portion of the URL.
     * 
     */
    @InputImport(name="host", required=true)
    private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    /**
     * Path portion of the URL.
     * 
     */
    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    @InputImport(name="service", required=true)
    private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    public RegionUrlMapTestArgs(
        @Nullable Input<String> description,
        Input<String> host,
        Input<String> path,
        Input<String> service) {
        this.description = description;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private RegionUrlMapTestArgs() {
        this.description = Input.empty();
        this.host = Input.empty();
        this.path = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> host;
        private Input<String> path;
        private Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHost(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setService(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setService(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }

        public RegionUrlMapTestArgs build() {
            return new RegionUrlMapTestArgs(description, host, path, service);
        }
    }
}
