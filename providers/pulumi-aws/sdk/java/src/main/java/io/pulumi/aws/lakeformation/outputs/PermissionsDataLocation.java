// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PermissionsDataLocation {
    /**
     * Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * 
     */
    private final String arn;
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final @Nullable String catalogId;

    @OutputCustomType.Constructor({"arn","catalogId"})
    private PermissionsDataLocation(
        String arn,
        @Nullable String catalogId) {
        this.arn = Objects.requireNonNull(arn);
        this.catalogId = catalogId;
    }

    /**
     * Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public Optional<String> getCatalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsDataLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable String catalogId;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsDataLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogId = defaults.catalogId;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public PermissionsDataLocation build() {
            return new PermissionsDataLocation(arn, catalogId);
        }
    }
}
