// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageBuilderDomainJoinInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageBuilderDomainJoinInfoArgs Empty = new ImageBuilderDomainJoinInfoArgs();

    /**
     * Fully qualified name of the directory (for example, corp.example.com).
     * 
     */
    @InputImport(name="directoryName")
      private final @Nullable Input<String> directoryName;

    public Input<String> getDirectoryName() {
        return this.directoryName == null ? Input.empty() : this.directoryName;
    }

    /**
     * Distinguished name of the organizational unit for computer accounts.
     * 
     */
    @InputImport(name="organizationalUnitDistinguishedName")
      private final @Nullable Input<String> organizationalUnitDistinguishedName;

    public Input<String> getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName == null ? Input.empty() : this.organizationalUnitDistinguishedName;
    }

    public ImageBuilderDomainJoinInfoArgs(
        @Nullable Input<String> directoryName,
        @Nullable Input<String> organizationalUnitDistinguishedName) {
        this.directoryName = directoryName;
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    private ImageBuilderDomainJoinInfoArgs() {
        this.directoryName = Input.empty();
        this.organizationalUnitDistinguishedName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageBuilderDomainJoinInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> directoryName;
        private @Nullable Input<String> organizationalUnitDistinguishedName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageBuilderDomainJoinInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryName = defaults.directoryName;
    	      this.organizationalUnitDistinguishedName = defaults.organizationalUnitDistinguishedName;
        }

        public Builder setDirectoryName(@Nullable Input<String> directoryName) {
            this.directoryName = directoryName;
            return this;
        }

        public Builder setDirectoryName(@Nullable String directoryName) {
            this.directoryName = Input.ofNullable(directoryName);
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedName(@Nullable Input<String> organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedName(@Nullable String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = Input.ofNullable(organizationalUnitDistinguishedName);
            return this;
        }
        public ImageBuilderDomainJoinInfoArgs build() {
            return new ImageBuilderDomainJoinInfoArgs(directoryName, organizationalUnitDistinguishedName);
        }
    }
}
