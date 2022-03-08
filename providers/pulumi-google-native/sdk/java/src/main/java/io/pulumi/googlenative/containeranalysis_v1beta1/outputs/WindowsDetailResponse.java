// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.KnowledgeBaseResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WindowsDetailResponse {
    /**
     * The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar.
     * 
     */
    private final String cpeUri;
    /**
     * The description of the vulnerability.
     * 
     */
    private final String description;
    /**
     * The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed kb's presence is considered a fix.
     * 
     */
    private final List<KnowledgeBaseResponse> fixingKbs;
    /**
     * The name of the vulnerability.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"cpeUri","description","fixingKbs","name"})
    private WindowsDetailResponse(
        String cpeUri,
        String description,
        List<KnowledgeBaseResponse> fixingKbs,
        String name) {
        this.cpeUri = cpeUri;
        this.description = description;
        this.fixingKbs = fixingKbs;
        this.name = name;
    }

    /**
     * The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar.
     * 
    */
    public String getCpeUri() {
        return this.cpeUri;
    }
    /**
     * The description of the vulnerability.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed kb's presence is considered a fix.
     * 
    */
    public List<KnowledgeBaseResponse> getFixingKbs() {
        return this.fixingKbs;
    }
    /**
     * The name of the vulnerability.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpeUri;
        private String description;
        private List<KnowledgeBaseResponse> fixingKbs;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixingKbs = defaults.fixingKbs;
    	      this.name = defaults.name;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFixingKbs(List<KnowledgeBaseResponse> fixingKbs) {
            this.fixingKbs = Objects.requireNonNull(fixingKbs);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public WindowsDetailResponse build() {
            return new WindowsDetailResponse(cpeUri, description, fixingKbs, name);
        }
    }
}
