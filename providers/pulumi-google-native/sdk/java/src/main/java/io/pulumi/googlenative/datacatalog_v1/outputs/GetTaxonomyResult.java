// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1SystemTimestampsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTaxonomyResult {
    private final List<String> activatedPolicyTypes;
    private final String description;
    private final String displayName;
    private final String name;
    private final Integer policyTagCount;
    private final GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps;

    @OutputCustomType.Constructor({"activatedPolicyTypes","description","displayName","name","policyTagCount","taxonomyTimestamps"})
    private GetTaxonomyResult(
        List<String> activatedPolicyTypes,
        String description,
        String displayName,
        String name,
        Integer policyTagCount,
        GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps) {
        this.activatedPolicyTypes = Objects.requireNonNull(activatedPolicyTypes);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
        this.policyTagCount = Objects.requireNonNull(policyTagCount);
        this.taxonomyTimestamps = Objects.requireNonNull(taxonomyTimestamps);
    }

    public List<String> getActivatedPolicyTypes() {
        return this.activatedPolicyTypes;
    }
    public String getDescription() {
        return this.description;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public String getName() {
        return this.name;
    }
    public Integer getPolicyTagCount() {
        return this.policyTagCount;
    }
    public GoogleCloudDatacatalogV1SystemTimestampsResponse getTaxonomyTimestamps() {
        return this.taxonomyTimestamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaxonomyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> activatedPolicyTypes;
        private String description;
        private String displayName;
        private String name;
        private Integer policyTagCount;
        private GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaxonomyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedPolicyTypes = defaults.activatedPolicyTypes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.policyTagCount = defaults.policyTagCount;
    	      this.taxonomyTimestamps = defaults.taxonomyTimestamps;
        }

        public Builder setActivatedPolicyTypes(List<String> activatedPolicyTypes) {
            this.activatedPolicyTypes = Objects.requireNonNull(activatedPolicyTypes);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicyTagCount(Integer policyTagCount) {
            this.policyTagCount = Objects.requireNonNull(policyTagCount);
            return this;
        }

        public Builder setTaxonomyTimestamps(GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps) {
            this.taxonomyTimestamps = Objects.requireNonNull(taxonomyTimestamps);
            return this;
        }

        public GetTaxonomyResult build() {
            return new GetTaxonomyResult(activatedPolicyTypes, description, displayName, name, policyTagCount, taxonomyTimestamps);
        }
    }
}