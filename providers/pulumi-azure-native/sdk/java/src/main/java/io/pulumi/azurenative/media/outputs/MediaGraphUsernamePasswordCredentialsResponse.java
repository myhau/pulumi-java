// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MediaGraphUsernamePasswordCredentialsResponse {
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphUsernamePasswordCredentials'.
     * 
     */
    private final String odataType;
    /**
     * Password for a username/password pair.
     * 
     */
    private final String password;
    /**
     * Username for a username/password pair.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private MediaGraphUsernamePasswordCredentialsResponse(
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("username") String username) {
        this.odataType = odataType;
        this.password = password;
        this.username = username;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphUsernamePasswordCredentials'.
     * 
    */
    public String odataType() {
        return this.odataType;
    }
    /**
     * Password for a username/password pair.
     * 
    */
    public String password() {
        return this.password;
    }
    /**
     * Username for a username/password pair.
     * 
    */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphUsernamePasswordCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphUsernamePasswordCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public MediaGraphUsernamePasswordCredentialsResponse build() {
            return new MediaGraphUsernamePasswordCredentialsResponse(odataType, password, username);
        }
    }
}
