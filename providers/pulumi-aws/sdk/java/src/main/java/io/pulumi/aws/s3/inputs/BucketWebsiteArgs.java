// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketWebsiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketWebsiteArgs Empty = new BucketWebsiteArgs();

    /**
     * An absolute path to the document to return in case of a 4XX error.
     * 
     */
    @InputImport(name="errorDocument")
      private final @Nullable Input<String> errorDocument;

    public Input<String> getErrorDocument() {
        return this.errorDocument == null ? Input.empty() : this.errorDocument;
    }

    /**
     * Amazon S3 returns this index document when requests are made to the root domain or any of the subfolders.
     * 
     */
    @InputImport(name="indexDocument")
      private final @Nullable Input<String> indexDocument;

    public Input<String> getIndexDocument() {
        return this.indexDocument == null ? Input.empty() : this.indexDocument;
    }

    /**
     * A hostname to redirect all website requests for this bucket to. Hostname can optionally be prefixed with a protocol (`http://` or `https://`) to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    @InputImport(name="redirectAllRequestsTo")
      private final @Nullable Input<String> redirectAllRequestsTo;

    public Input<String> getRedirectAllRequestsTo() {
        return this.redirectAllRequestsTo == null ? Input.empty() : this.redirectAllRequestsTo;
    }

    /**
     * A json array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
     * describing redirect behavior and when redirects are applied.
     * 
     */
    @InputImport(name="routingRules")
      private final @Nullable Input<Either<String,List<String>>> routingRules;

    public Input<Either<String,List<String>>> getRoutingRules() {
        return this.routingRules == null ? Input.empty() : this.routingRules;
    }

    public BucketWebsiteArgs(
        @Nullable Input<String> errorDocument,
        @Nullable Input<String> indexDocument,
        @Nullable Input<String> redirectAllRequestsTo,
        @Nullable Input<Either<String,List<String>>> routingRules) {
        this.errorDocument = errorDocument;
        this.indexDocument = indexDocument;
        this.redirectAllRequestsTo = redirectAllRequestsTo;
        this.routingRules = routingRules;
    }

    private BucketWebsiteArgs() {
        this.errorDocument = Input.empty();
        this.indexDocument = Input.empty();
        this.redirectAllRequestsTo = Input.empty();
        this.routingRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> errorDocument;
        private @Nullable Input<String> indexDocument;
        private @Nullable Input<String> redirectAllRequestsTo;
        private @Nullable Input<Either<String,List<String>>> routingRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketWebsiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorDocument = defaults.errorDocument;
    	      this.indexDocument = defaults.indexDocument;
    	      this.redirectAllRequestsTo = defaults.redirectAllRequestsTo;
    	      this.routingRules = defaults.routingRules;
        }

        public Builder setErrorDocument(@Nullable Input<String> errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }

        public Builder setErrorDocument(@Nullable String errorDocument) {
            this.errorDocument = Input.ofNullable(errorDocument);
            return this;
        }

        public Builder setIndexDocument(@Nullable Input<String> indexDocument) {
            this.indexDocument = indexDocument;
            return this;
        }

        public Builder setIndexDocument(@Nullable String indexDocument) {
            this.indexDocument = Input.ofNullable(indexDocument);
            return this;
        }

        public Builder setRedirectAllRequestsTo(@Nullable Input<String> redirectAllRequestsTo) {
            this.redirectAllRequestsTo = redirectAllRequestsTo;
            return this;
        }

        public Builder setRedirectAllRequestsTo(@Nullable String redirectAllRequestsTo) {
            this.redirectAllRequestsTo = Input.ofNullable(redirectAllRequestsTo);
            return this;
        }

        public Builder setRoutingRules(@Nullable Input<Either<String,List<String>>> routingRules) {
            this.routingRules = routingRules;
            return this;
        }

        public Builder setRoutingRules(@Nullable Either<String,List<String>> routingRules) {
            this.routingRules = Input.ofNullable(routingRules);
            return this;
        }
        public BucketWebsiteArgs build() {
            return new BucketWebsiteArgs(errorDocument, indexDocument, redirectAllRequestsTo, routingRules);
        }
    }
}
