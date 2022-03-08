// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FhirStoreStreamConfigBigqueryDestinationSchemaConfig {
    /**
     * The depth for all recursive structures in the output analytics schema. For example, concept in the CodeSystem
     * resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called
     * concept.concept but not concept.concept.concept. If not specified or set to 0, the server will use the default
     * value 2. The maximum depth allowed is 5.
     * 
     */
    private final Integer recursiveStructureDepth;
    /**
     * Specifies the output schema type. Only ANALYTICS is supported at this time.
     * * ANALYTICS: Analytics schema defined by the FHIR community.
     *   See https://github.com/FHIR/sql-on-fhir/blob/master/sql-on-fhir.md.
     *   Default value is `ANALYTICS`.
     *   Possible values are `ANALYTICS`.
     * 
     */
    private final @Nullable String schemaType;

    @OutputCustomType.Constructor({"recursiveStructureDepth","schemaType"})
    private FhirStoreStreamConfigBigqueryDestinationSchemaConfig(
        Integer recursiveStructureDepth,
        @Nullable String schemaType) {
        this.recursiveStructureDepth = recursiveStructureDepth;
        this.schemaType = schemaType;
    }

    /**
     * The depth for all recursive structures in the output analytics schema. For example, concept in the CodeSystem
     * resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called
     * concept.concept but not concept.concept.concept. If not specified or set to 0, the server will use the default
     * value 2. The maximum depth allowed is 5.
     * 
    */
    public Integer getRecursiveStructureDepth() {
        return this.recursiveStructureDepth;
    }
    /**
     * Specifies the output schema type. Only ANALYTICS is supported at this time.
     * * ANALYTICS: Analytics schema defined by the FHIR community.
     *   See https://github.com/FHIR/sql-on-fhir/blob/master/sql-on-fhir.md.
     *   Default value is `ANALYTICS`.
     *   Possible values are `ANALYTICS`.
     * 
    */
    public Optional<String> getSchemaType() {
        return Optional.ofNullable(this.schemaType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreStreamConfigBigqueryDestinationSchemaConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer recursiveStructureDepth;
        private @Nullable String schemaType;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreStreamConfigBigqueryDestinationSchemaConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recursiveStructureDepth = defaults.recursiveStructureDepth;
    	      this.schemaType = defaults.schemaType;
        }

        public Builder setRecursiveStructureDepth(Integer recursiveStructureDepth) {
            this.recursiveStructureDepth = Objects.requireNonNull(recursiveStructureDepth);
            return this;
        }

        public Builder setSchemaType(@Nullable String schemaType) {
            this.schemaType = schemaType;
            return this;
        }
        public FhirStoreStreamConfigBigqueryDestinationSchemaConfig build() {
            return new FhirStoreStreamConfigBigqueryDestinationSchemaConfig(recursiveStructureDepth, schemaType);
        }
    }
}
