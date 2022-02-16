// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.filestore.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.filestore.outputs.InstanceFileSharesNfsExportOption;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceFileShares {
    private final Integer capacityGb;
    private final String name;
    private final @Nullable List<InstanceFileSharesNfsExportOption> nfsExportOptions;

    @OutputCustomType.Constructor({"capacityGb","name","nfsExportOptions"})
    private InstanceFileShares(
        Integer capacityGb,
        String name,
        @Nullable List<InstanceFileSharesNfsExportOption> nfsExportOptions) {
        this.capacityGb = Objects.requireNonNull(capacityGb);
        this.name = Objects.requireNonNull(name);
        this.nfsExportOptions = nfsExportOptions;
    }

    public Integer getCapacityGb() {
        return this.capacityGb;
    }
    public String getName() {
        return this.name;
    }
    public List<InstanceFileSharesNfsExportOption> getNfsExportOptions() {
        return this.nfsExportOptions == null ? List.of() : this.nfsExportOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFileShares defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacityGb;
        private String name;
        private @Nullable List<InstanceFileSharesNfsExportOption> nfsExportOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFileShares defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityGb = defaults.capacityGb;
    	      this.name = defaults.name;
    	      this.nfsExportOptions = defaults.nfsExportOptions;
        }

        public Builder setCapacityGb(Integer capacityGb) {
            this.capacityGb = Objects.requireNonNull(capacityGb);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNfsExportOptions(@Nullable List<InstanceFileSharesNfsExportOption> nfsExportOptions) {
            this.nfsExportOptions = nfsExportOptions;
            return this;
        }

        public InstanceFileShares build() {
            return new InstanceFileShares(capacityGb, name, nfsExportOptions);
        }
    }
}