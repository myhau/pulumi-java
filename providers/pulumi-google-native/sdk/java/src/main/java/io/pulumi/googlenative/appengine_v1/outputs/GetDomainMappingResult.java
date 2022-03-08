// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.appengine_v1.outputs.ResourceRecordResponse;
import io.pulumi.googlenative.appengine_v1.outputs.SslSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDomainMappingResult {
    /**
     * Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.
     * 
     */
    private final String name;
    /**
     * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    private final List<ResourceRecordResponse> resourceRecords;
    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
     */
    private final SslSettingsResponse sslSettings;

    @OutputCustomType.Constructor({"name","resourceRecords","sslSettings"})
    private GetDomainMappingResult(
        String name,
        List<ResourceRecordResponse> resourceRecords,
        SslSettingsResponse sslSettings) {
        this.name = name;
        this.resourceRecords = resourceRecords;
        this.sslSettings = sslSettings;
    }

    /**
     * Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.
     * 
    */
    public List<ResourceRecordResponse> getResourceRecords() {
        return this.resourceRecords;
    }
    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
    */
    public SslSettingsResponse getSslSettings() {
        return this.sslSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<ResourceRecordResponse> resourceRecords;
        private SslSettingsResponse sslSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceRecords = defaults.resourceRecords;
    	      this.sslSettings = defaults.sslSettings;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceRecords(List<ResourceRecordResponse> resourceRecords) {
            this.resourceRecords = Objects.requireNonNull(resourceRecords);
            return this;
        }

        public Builder setSslSettings(SslSettingsResponse sslSettings) {
            this.sslSettings = Objects.requireNonNull(sslSettings);
            return this;
        }
        public GetDomainMappingResult build() {
            return new GetDomainMappingResult(name, resourceRecords, sslSettings);
        }
    }
}
