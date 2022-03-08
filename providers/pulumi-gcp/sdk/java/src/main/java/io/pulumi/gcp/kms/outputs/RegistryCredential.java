// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class RegistryCredential {
    private final Map<String,Object> publicKeyCertificate;

    @OutputCustomType.Constructor({"publicKeyCertificate"})
    private RegistryCredential(Map<String,Object> publicKeyCertificate) {
        this.publicKeyCertificate = publicKeyCertificate;
    }

    public Map<String,Object> getPublicKeyCertificate() {
        return this.publicKeyCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredential defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> publicKeyCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyCertificate = defaults.publicKeyCertificate;
        }

        public Builder setPublicKeyCertificate(Map<String,Object> publicKeyCertificate) {
            this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate);
            return this;
        }
        public RegistryCredential build() {
            return new RegistryCredential(publicKeyCertificate);
        }
    }
}
