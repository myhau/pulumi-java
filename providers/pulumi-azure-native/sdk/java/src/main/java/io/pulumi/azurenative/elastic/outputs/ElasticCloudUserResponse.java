// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ElasticCloudUserResponse {
    /**
     * Elastic cloud default dashboard sso URL of the Elastic user account.
     * 
     */
    private final String elasticCloudSsoDefaultUrl;
    /**
     * Email of the Elastic User Account.
     * 
     */
    private final String emailAddress;
    /**
     * User Id of the elastic account of the User.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"elasticCloudSsoDefaultUrl","emailAddress","id"})
    private ElasticCloudUserResponse(
        String elasticCloudSsoDefaultUrl,
        String emailAddress,
        String id) {
        this.elasticCloudSsoDefaultUrl = elasticCloudSsoDefaultUrl;
        this.emailAddress = emailAddress;
        this.id = id;
    }

    /**
     * Elastic cloud default dashboard sso URL of the Elastic user account.
     * 
    */
    public String getElasticCloudSsoDefaultUrl() {
        return this.elasticCloudSsoDefaultUrl;
    }
    /**
     * Email of the Elastic User Account.
     * 
    */
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * User Id of the elastic account of the User.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticCloudUserResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String elasticCloudSsoDefaultUrl;
        private String emailAddress;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticCloudUserResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticCloudSsoDefaultUrl = defaults.elasticCloudSsoDefaultUrl;
    	      this.emailAddress = defaults.emailAddress;
    	      this.id = defaults.id;
        }

        public Builder setElasticCloudSsoDefaultUrl(String elasticCloudSsoDefaultUrl) {
            this.elasticCloudSsoDefaultUrl = Objects.requireNonNull(elasticCloudSsoDefaultUrl);
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public ElasticCloudUserResponse build() {
            return new ElasticCloudUserResponse(elasticCloudSsoDefaultUrl, emailAddress, id);
        }
    }
}
