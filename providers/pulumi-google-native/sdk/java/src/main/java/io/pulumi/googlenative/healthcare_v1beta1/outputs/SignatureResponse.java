// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.ImageResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SignatureResponse {
    /**
     * Optional. An image of the user's signature.
     * 
     */
    private final ImageResponse image;
    /**
     * Optional. Metadata associated with the user's signature. For example, the user's name or the user's title.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Optional. Timestamp of the signature.
     * 
     */
    private final String signatureTime;
    /**
     * User's UUID provided by the client.
     * 
     */
    private final String userId;

    @OutputCustomType.Constructor({"image","metadata","signatureTime","userId"})
    private SignatureResponse(
        ImageResponse image,
        Map<String,String> metadata,
        String signatureTime,
        String userId) {
        this.image = image;
        this.metadata = metadata;
        this.signatureTime = signatureTime;
        this.userId = userId;
    }

    /**
     * Optional. An image of the user's signature.
     * 
    */
    public ImageResponse getImage() {
        return this.image;
    }
    /**
     * Optional. Metadata associated with the user's signature. For example, the user's name or the user's title.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Optional. Timestamp of the signature.
     * 
    */
    public String getSignatureTime() {
        return this.signatureTime;
    }
    /**
     * User's UUID provided by the client.
     * 
    */
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageResponse image;
        private Map<String,String> metadata;
        private String signatureTime;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(SignatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.metadata = defaults.metadata;
    	      this.signatureTime = defaults.signatureTime;
    	      this.userId = defaults.userId;
        }

        public Builder setImage(ImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setSignatureTime(String signatureTime) {
            this.signatureTime = Objects.requireNonNull(signatureTime);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public SignatureResponse build() {
            return new SignatureResponse(image, metadata, signatureTime, userId);
        }
    }
}
