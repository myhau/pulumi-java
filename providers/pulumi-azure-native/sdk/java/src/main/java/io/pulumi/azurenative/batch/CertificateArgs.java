// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.batch.enums.CertificateFormat;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The identifier for the certificate. This must be made up of algorithm and thumbprint separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * 
     */
    @Import(name="certificateName")
      private final @Nullable Output<String> certificateName;

    public Output<String> certificateName() {
        return this.certificateName == null ? Codegen.empty() : this.certificateName;
    }

    /**
     * The maximum size is 10KB.
     * 
     */
    @Import(name="data", required=true)
      private final Output<String> data;

    public Output<String> data() {
        return this.data;
    }

    /**
     * The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<CertificateFormat> format;

    public Output<CertificateFormat> format() {
        return this.format == null ? Codegen.empty() : this.format;
    }

    /**
     * This must not be specified if the certificate format is Cer.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * This must match the thumbprint from the name.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable Output<String> thumbprint;

    public Output<String> thumbprint() {
        return this.thumbprint == null ? Codegen.empty() : this.thumbprint;
    }

    /**
     * This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     * 
     */
    @Import(name="thumbprintAlgorithm")
      private final @Nullable Output<String> thumbprintAlgorithm;

    public Output<String> thumbprintAlgorithm() {
        return this.thumbprintAlgorithm == null ? Codegen.empty() : this.thumbprintAlgorithm;
    }

    public CertificateArgs(
        Output<String> accountName,
        @Nullable Output<String> certificateName,
        Output<String> data,
        @Nullable Output<CertificateFormat> format,
        @Nullable Output<String> password,
        Output<String> resourceGroupName,
        @Nullable Output<String> thumbprint,
        @Nullable Output<String> thumbprintAlgorithm) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.certificateName = certificateName;
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
        this.format = format;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.thumbprint = thumbprint;
        this.thumbprintAlgorithm = thumbprintAlgorithm;
    }

    private CertificateArgs() {
        this.accountName = Codegen.empty();
        this.certificateName = Codegen.empty();
        this.data = Codegen.empty();
        this.format = Codegen.empty();
        this.password = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.thumbprint = Codegen.empty();
        this.thumbprintAlgorithm = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> certificateName;
        private Output<String> data;
        private @Nullable Output<CertificateFormat> format;
        private @Nullable Output<String> password;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> thumbprint;
        private @Nullable Output<String> thumbprintAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.certificateName = defaults.certificateName;
    	      this.data = defaults.data;
    	      this.format = defaults.format;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.thumbprint = defaults.thumbprint;
    	      this.thumbprintAlgorithm = defaults.thumbprintAlgorithm;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder certificateName(@Nullable Output<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public Builder certificateName(@Nullable String certificateName) {
            this.certificateName = Codegen.ofNullable(certificateName);
            return this;
        }
        public Builder data(Output<String> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder data(String data) {
            this.data = Output.of(Objects.requireNonNull(data));
            return this;
        }
        public Builder format(@Nullable Output<CertificateFormat> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable CertificateFormat format) {
            this.format = Codegen.ofNullable(format);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Codegen.ofNullable(thumbprint);
            return this;
        }
        public Builder thumbprintAlgorithm(@Nullable Output<String> thumbprintAlgorithm) {
            this.thumbprintAlgorithm = thumbprintAlgorithm;
            return this;
        }
        public Builder thumbprintAlgorithm(@Nullable String thumbprintAlgorithm) {
            this.thumbprintAlgorithm = Codegen.ofNullable(thumbprintAlgorithm);
            return this;
        }        public CertificateArgs build() {
            return new CertificateArgs(accountName, certificateName, data, format, password, resourceGroupName, thumbprint, thumbprintAlgorithm);
        }
    }
}
