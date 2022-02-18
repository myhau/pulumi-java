// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceServerCaCertGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceServerCaCertGetArgs Empty = new DatabaseInstanceServerCaCertGetArgs();

    @InputImport(name="cert")
    private final @Nullable Input<String> cert;

    public Input<String> getCert() {
        return this.cert == null ? Input.empty() : this.cert;
    }

    @InputImport(name="commonName")
    private final @Nullable Input<String> commonName;

    public Input<String> getCommonName() {
        return this.commonName == null ? Input.empty() : this.commonName;
    }

    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * The [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * formatted date time string indicating when this whitelist expires.
     * 
     */
    @InputImport(name="expirationTime")
    private final @Nullable Input<String> expirationTime;

    public Input<String> getExpirationTime() {
        return this.expirationTime == null ? Input.empty() : this.expirationTime;
    }

    @InputImport(name="sha1Fingerprint")
    private final @Nullable Input<String> sha1Fingerprint;

    public Input<String> getSha1Fingerprint() {
        return this.sha1Fingerprint == null ? Input.empty() : this.sha1Fingerprint;
    }

    public DatabaseInstanceServerCaCertGetArgs(
        @Nullable Input<String> cert,
        @Nullable Input<String> commonName,
        @Nullable Input<String> createTime,
        @Nullable Input<String> expirationTime,
        @Nullable Input<String> sha1Fingerprint) {
        this.cert = cert;
        this.commonName = commonName;
        this.createTime = createTime;
        this.expirationTime = expirationTime;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    private DatabaseInstanceServerCaCertGetArgs() {
        this.cert = Input.empty();
        this.commonName = Input.empty();
        this.createTime = Input.empty();
        this.expirationTime = Input.empty();
        this.sha1Fingerprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceServerCaCertGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cert;
        private @Nullable Input<String> commonName;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> expirationTime;
        private @Nullable Input<String> sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceServerCaCertGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.commonName = defaults.commonName;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder setCert(@Nullable Input<String> cert) {
            this.cert = cert;
            return this;
        }

        public Builder setCert(@Nullable String cert) {
            this.cert = Input.ofNullable(cert);
            return this;
        }

        public Builder setCommonName(@Nullable Input<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder setCommonName(@Nullable String commonName) {
            this.commonName = Input.ofNullable(commonName);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setExpirationTime(@Nullable Input<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder setExpirationTime(@Nullable String expirationTime) {
            this.expirationTime = Input.ofNullable(expirationTime);
            return this;
        }

        public Builder setSha1Fingerprint(@Nullable Input<String> sha1Fingerprint) {
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public Builder setSha1Fingerprint(@Nullable String sha1Fingerprint) {
            this.sha1Fingerprint = Input.ofNullable(sha1Fingerprint);
            return this;
        }

        public DatabaseInstanceServerCaCertGetArgs build() {
            return new DatabaseInstanceServerCaCertGetArgs(cert, commonName, createTime, expirationTime, sha1Fingerprint);
        }
    }
}
