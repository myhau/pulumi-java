// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetArnResult {
    /**
     * The [ID](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS account that owns the resource, without the hyphens.
     * 
     */
    private final String account;
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The partition that the resource is in.
     * 
     */
    private final String partition;
    /**
     * The region the resource resides in.
     * Note that the ARNs for some resources do not require a region, so this component might be omitted.
     * 
     */
    private final String region;
    /**
     * The content of this part of the ARN varies by service.
     * It often includes an indicator of the type of resource—for example, an IAM user or Amazon RDS database —followed by a slash (/) or a colon (:), followed by the resource name itself.
     * 
     */
    private final String resource;
    /**
     * The [service namespace](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces) that identifies the AWS product.
     * 
     */
    private final String service;

    @OutputCustomType.Constructor({"account","arn","id","partition","region","resource","service"})
    private GetArnResult(
        String account,
        String arn,
        String id,
        String partition,
        String region,
        String resource,
        String service) {
        this.account = account;
        this.arn = arn;
        this.id = id;
        this.partition = partition;
        this.region = region;
        this.resource = resource;
        this.service = service;
    }

    /**
     * The [ID](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS account that owns the resource, without the hyphens.
     * 
    */
    public String getAccount() {
        return this.account;
    }
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The partition that the resource is in.
     * 
    */
    public String getPartition() {
        return this.partition;
    }
    /**
     * The region the resource resides in.
     * Note that the ARNs for some resources do not require a region, so this component might be omitted.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * The content of this part of the ARN varies by service.
     * It often includes an indicator of the type of resource—for example, an IAM user or Amazon RDS database —followed by a slash (/) or a colon (:), followed by the resource name itself.
     * 
    */
    public String getResource() {
        return this.resource;
    }
    /**
     * The [service namespace](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces) that identifies the AWS product.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArnResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String account;
        private String arn;
        private String id;
        private String partition;
        private String region;
        private String resource;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArnResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.partition = defaults.partition;
    	      this.region = defaults.region;
    	      this.resource = defaults.resource;
    	      this.service = defaults.service;
        }

        public Builder setAccount(String account) {
            this.account = Objects.requireNonNull(account);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPartition(String partition) {
            this.partition = Objects.requireNonNull(partition);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GetArnResult build() {
            return new GetArnResult(account, arn, id, partition, region, resource, service);
        }
    }
}