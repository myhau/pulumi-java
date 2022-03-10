// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.CisBenchmarkResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.ComplianceVersionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ComplianceNoteResponse {
    private final CisBenchmarkResponse cisBenchmark;
    /**
     * A description about this compliance check.
     * 
     */
    private final String description;
    /**
     * A rationale for the existence of this compliance check.
     * 
     */
    private final String rationale;
    /**
     * A description of remediation steps if the compliance check fails.
     * 
     */
    private final String remediation;
    /**
     * Serialized scan instructions with a predefined format.
     * 
     */
    private final String scanInstructions;
    /**
     * The title that identifies this compliance check.
     * 
     */
    private final String title;
    /**
     * The OS and config versions the benchmark applies to.
     * 
     */
    private final List<ComplianceVersionResponse> version;

    @OutputCustomType.Constructor
    private ComplianceNoteResponse(
        @OutputCustomType.Parameter("cisBenchmark") CisBenchmarkResponse cisBenchmark,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("rationale") String rationale,
        @OutputCustomType.Parameter("remediation") String remediation,
        @OutputCustomType.Parameter("scanInstructions") String scanInstructions,
        @OutputCustomType.Parameter("title") String title,
        @OutputCustomType.Parameter("version") List<ComplianceVersionResponse> version) {
        this.cisBenchmark = cisBenchmark;
        this.description = description;
        this.rationale = rationale;
        this.remediation = remediation;
        this.scanInstructions = scanInstructions;
        this.title = title;
        this.version = version;
    }

    public CisBenchmarkResponse getCisBenchmark() {
        return this.cisBenchmark;
    }
    /**
     * A description about this compliance check.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * A rationale for the existence of this compliance check.
     * 
    */
    public String getRationale() {
        return this.rationale;
    }
    /**
     * A description of remediation steps if the compliance check fails.
     * 
    */
    public String getRemediation() {
        return this.remediation;
    }
    /**
     * Serialized scan instructions with a predefined format.
     * 
    */
    public String getScanInstructions() {
        return this.scanInstructions;
    }
    /**
     * The title that identifies this compliance check.
     * 
    */
    public String getTitle() {
        return this.title;
    }
    /**
     * The OS and config versions the benchmark applies to.
     * 
    */
    public List<ComplianceVersionResponse> getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CisBenchmarkResponse cisBenchmark;
        private String description;
        private String rationale;
        private String remediation;
        private String scanInstructions;
        private String title;
        private List<ComplianceVersionResponse> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cisBenchmark = defaults.cisBenchmark;
    	      this.description = defaults.description;
    	      this.rationale = defaults.rationale;
    	      this.remediation = defaults.remediation;
    	      this.scanInstructions = defaults.scanInstructions;
    	      this.title = defaults.title;
    	      this.version = defaults.version;
        }

        public Builder setCisBenchmark(CisBenchmarkResponse cisBenchmark) {
            this.cisBenchmark = Objects.requireNonNull(cisBenchmark);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setRationale(String rationale) {
            this.rationale = Objects.requireNonNull(rationale);
            return this;
        }

        public Builder setRemediation(String remediation) {
            this.remediation = Objects.requireNonNull(remediation);
            return this;
        }

        public Builder setScanInstructions(String scanInstructions) {
            this.scanInstructions = Objects.requireNonNull(scanInstructions);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setVersion(List<ComplianceVersionResponse> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public ComplianceNoteResponse build() {
            return new ComplianceNoteResponse(cisBenchmark, description, rationale, remediation, scanInstructions, title, version);
        }
    }
}
