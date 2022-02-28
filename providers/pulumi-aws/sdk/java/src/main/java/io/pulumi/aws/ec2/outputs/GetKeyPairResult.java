// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetKeyPairFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKeyPairResult {
    /**
     * The ARN of the Key Pair.
     * 
     */
    private final String arn;
    private final @Nullable List<GetKeyPairFilter> filters;
    /**
     * The SHA-1 digest of the DER encoded private key.
     * 
     */
    private final String fingerprint;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String keyName;
    private final @Nullable String keyPairId;
    /**
     * Any tags assigned to the Key Pair.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"arn","filters","fingerprint","id","keyName","keyPairId","tags"})
    private GetKeyPairResult(
        String arn,
        @Nullable List<GetKeyPairFilter> filters,
        String fingerprint,
        String id,
        @Nullable String keyName,
        @Nullable String keyPairId,
        Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn);
        this.filters = filters;
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.id = Objects.requireNonNull(id);
        this.keyName = keyName;
        this.keyPairId = keyPairId;
        this.tags = Objects.requireNonNull(tags);
    }

    /**
     * The ARN of the Key Pair.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    public List<GetKeyPairFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The SHA-1 digest of the DER encoded private key.
     * 
     */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    public Optional<String> getKeyPairId() {
        return Optional.ofNullable(this.keyPairId);
    }
    /**
     * Any tags assigned to the Key Pair.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyPairResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable List<GetKeyPairFilter> filters;
        private String fingerprint;
        private String id;
        private @Nullable String keyName;
        private @Nullable String keyPairId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyPairResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.filters = defaults.filters;
    	      this.fingerprint = defaults.fingerprint;
    	      this.id = defaults.id;
    	      this.keyName = defaults.keyName;
    	      this.keyPairId = defaults.keyPairId;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setFilters(@Nullable List<GetKeyPairFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyPairId(@Nullable String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetKeyPairResult build() {
            return new GetKeyPairResult(arn, filters, fingerprint, id, keyName, keyPairId, tags);
        }
    }
}
