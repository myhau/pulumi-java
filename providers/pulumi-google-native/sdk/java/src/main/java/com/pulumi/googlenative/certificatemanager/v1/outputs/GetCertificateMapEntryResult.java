// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCertificateMapEntryResult {
    /**
     * @return A set of Certificates defines for the given `hostname`. There can be defined up to fifteen certificates in each Certificate Map Entry. Each certificate must match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
     * 
     */
    private final List<String> certificates;
    /**
     * @return The creation timestamp of a Certificate Map Entry.
     * 
     */
    private final String createTime;
    /**
     * @return One or more paragraphs of text description of a certificate map entry.
     * 
     */
    private final String description;
    /**
     * @return A Hostname (FQDN, e.g. `example.com`) or a wildcard hostname expression (`*.example.com`) for a set of hostnames with common suffix. Used as Server Name Indication (SNI) for selecting a proper certificate.
     * 
     */
    private final String hostname;
    /**
     * @return Set of labels associated with a Certificate Map Entry.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return A predefined matcher for particular cases, other than SNI selection.
     * 
     */
    private final String matcher;
    /**
     * @return A user-defined name of the Certificate Map Entry. Certificate Map Entry names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificateMaps/*{@literal /}certificateMapEntries/*`.
     * 
     */
    private final String name;
    /**
     * @return A serving state of this Certificate Map Entry.
     * 
     */
    private final String state;
    /**
     * @return The update timestamp of a Certificate Map Entry.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetCertificateMapEntryResult(
        @CustomType.Parameter("certificates") List<String> certificates,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("hostname") String hostname,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("matcher") String matcher,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.certificates = certificates;
        this.createTime = createTime;
        this.description = description;
        this.hostname = hostname;
        this.labels = labels;
        this.matcher = matcher;
        this.name = name;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * @return A set of Certificates defines for the given `hostname`. There can be defined up to fifteen certificates in each Certificate Map Entry. Each certificate must match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
     * 
     */
    public List<String> certificates() {
        return this.certificates;
    }
    /**
     * @return The creation timestamp of a Certificate Map Entry.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return One or more paragraphs of text description of a certificate map entry.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A Hostname (FQDN, e.g. `example.com`) or a wildcard hostname expression (`*.example.com`) for a set of hostnames with common suffix. Used as Server Name Indication (SNI) for selecting a proper certificate.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Set of labels associated with a Certificate Map Entry.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return A predefined matcher for particular cases, other than SNI selection.
     * 
     */
    public String matcher() {
        return this.matcher;
    }
    /**
     * @return A user-defined name of the Certificate Map Entry. Certificate Map Entry names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificateMaps/*{@literal /}certificateMapEntries/*`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A serving state of this Certificate Map Entry.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The update timestamp of a Certificate Map Entry.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateMapEntryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certificates;
        private String createTime;
        private String description;
        private String hostname;
        private Map<String,String> labels;
        private String matcher;
        private String name;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateMapEntryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.hostname = defaults.hostname;
    	      this.labels = defaults.labels;
    	      this.matcher = defaults.matcher;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder certificates(List<String> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }
        public Builder certificates(String... certificates) {
            return certificates(List.of(certificates));
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder matcher(String matcher) {
            this.matcher = Objects.requireNonNull(matcher);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetCertificateMapEntryResult build() {
            return new GetCertificateMapEntryResult(certificates, createTime, description, hostname, labels, matcher, name, state, updateTime);
        }
    }
}
