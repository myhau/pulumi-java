// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolUICustomizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolUICustomizationArgs Empty = new UserPoolUICustomizationArgs();

    /**
     * The client ID for the client app. Defaults to `ALL`. If `ALL` is specified, the `css` and/or `image_file` settings will be used for every client that has no UI customization set previously.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The CSS values in the UI customization, provided as a String. At least one of `css` or `image_file` is required.
     * 
     */
    @InputImport(name="css")
      private final @Nullable Input<String> css;

    public Input<String> getCss() {
        return this.css == null ? Input.empty() : this.css;
    }

    /**
     * The uploaded logo image for the UI customization, provided as a base64-encoded String. Drift detection is not possible for this argument. At least one of `css` or `image_file` is required.
     * 
     */
    @InputImport(name="imageFile")
      private final @Nullable Input<String> imageFile;

    public Input<String> getImageFile() {
        return this.imageFile == null ? Input.empty() : this.imageFile;
    }

    /**
     * The user pool ID for the user pool.
     * 
     */
    @InputImport(name="userPoolId", required=true)
      private final Input<String> userPoolId;

    public Input<String> getUserPoolId() {
        return this.userPoolId;
    }

    public UserPoolUICustomizationArgs(
        @Nullable Input<String> clientId,
        @Nullable Input<String> css,
        @Nullable Input<String> imageFile,
        Input<String> userPoolId) {
        this.clientId = clientId;
        this.css = css;
        this.imageFile = imageFile;
        this.userPoolId = Objects.requireNonNull(userPoolId, "expected parameter 'userPoolId' to be non-null");
    }

    private UserPoolUICustomizationArgs() {
        this.clientId = Input.empty();
        this.css = Input.empty();
        this.imageFile = Input.empty();
        this.userPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolUICustomizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> css;
        private @Nullable Input<String> imageFile;
        private Input<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolUICustomizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.css = defaults.css;
    	      this.imageFile = defaults.imageFile;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setCss(@Nullable Input<String> css) {
            this.css = css;
            return this;
        }

        public Builder setCss(@Nullable String css) {
            this.css = Input.ofNullable(css);
            return this;
        }

        public Builder setImageFile(@Nullable Input<String> imageFile) {
            this.imageFile = imageFile;
            return this;
        }

        public Builder setImageFile(@Nullable String imageFile) {
            this.imageFile = Input.ofNullable(imageFile);
            return this;
        }

        public Builder setUserPoolId(Input<String> userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }

        public Builder setUserPoolId(String userPoolId) {
            this.userPoolId = Input.of(Objects.requireNonNull(userPoolId));
            return this;
        }
        public UserPoolUICustomizationArgs build() {
            return new UserPoolUICustomizationArgs(clientId, css, imageFile, userPoolId);
        }
    }
}
