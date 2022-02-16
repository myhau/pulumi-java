// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TunnelInstanceIAMPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final TunnelInstanceIAMPolicyState Empty = new TunnelInstanceIAMPolicyState();

    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="instance")
    private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    @InputImport(name="policyData")
    private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public TunnelInstanceIAMPolicyState(
        @Nullable Input<String> etag,
        @Nullable Input<String> instance,
        @Nullable Input<String> policyData,
        @Nullable Input<String> project,
        @Nullable Input<String> zone) {
        this.etag = etag;
        this.instance = instance;
        this.policyData = policyData;
        this.project = project;
        this.zone = zone;
    }

    private TunnelInstanceIAMPolicyState() {
        this.etag = Input.empty();
        this.instance = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelInstanceIAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> etag;
        private @Nullable Input<String> instance;
        private @Nullable Input<String> policyData;
        private @Nullable Input<String> project;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(TunnelInstanceIAMPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.instance = defaults.instance;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setPolicyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder setPolicyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public TunnelInstanceIAMPolicyState build() {
            return new TunnelInstanceIAMPolicyState(etag, instance, policyData, project, zone);
        }
    }
}