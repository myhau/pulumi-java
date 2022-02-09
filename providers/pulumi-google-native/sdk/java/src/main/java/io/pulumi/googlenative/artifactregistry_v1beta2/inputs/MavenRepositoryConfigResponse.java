// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class MavenRepositoryConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final MavenRepositoryConfigResponse Empty = new MavenRepositoryConfigResponse();

    @InputImport(name="allowSnapshotOverwrites", required=true)
    private final Boolean allowSnapshotOverwrites;

    public Boolean getAllowSnapshotOverwrites() {
        return this.allowSnapshotOverwrites;
    }

    @InputImport(name="versionPolicy", required=true)
    private final String versionPolicy;

    public String getVersionPolicy() {
        return this.versionPolicy;
    }

    public MavenRepositoryConfigResponse(
        Boolean allowSnapshotOverwrites,
        String versionPolicy) {
        this.allowSnapshotOverwrites = Objects.requireNonNull(allowSnapshotOverwrites, "expected parameter 'allowSnapshotOverwrites' to be non-null");
        this.versionPolicy = Objects.requireNonNull(versionPolicy, "expected parameter 'versionPolicy' to be non-null");
    }

    private MavenRepositoryConfigResponse() {
        this.allowSnapshotOverwrites = null;
        this.versionPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MavenRepositoryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowSnapshotOverwrites;
        private String versionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(MavenRepositoryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSnapshotOverwrites = defaults.allowSnapshotOverwrites;
    	      this.versionPolicy = defaults.versionPolicy;
        }

        public Builder setAllowSnapshotOverwrites(Boolean allowSnapshotOverwrites) {
            this.allowSnapshotOverwrites = Objects.requireNonNull(allowSnapshotOverwrites);
            return this;
        }

        public Builder setVersionPolicy(String versionPolicy) {
            this.versionPolicy = Objects.requireNonNull(versionPolicy);
            return this;
        }

        public MavenRepositoryConfigResponse build() {
            return new MavenRepositoryConfigResponse(allowSnapshotOverwrites, versionPolicy);
        }
    }
}