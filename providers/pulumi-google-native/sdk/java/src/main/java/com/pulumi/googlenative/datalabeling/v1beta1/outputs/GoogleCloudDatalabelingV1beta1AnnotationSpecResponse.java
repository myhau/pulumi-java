// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatalabelingV1beta1AnnotationSpecResponse {
    /**
     * @return Optional. User-provided description of the annotation specification. The description can be up to 10,000 characters long.
     * 
     */
    private final String description;
    /**
     * @return The display name of the AnnotationSpec. Maximum of 64 characters.
     * 
     */
    private final String displayName;
    /**
     * @return This is the integer index of the AnnotationSpec. The index for the whole AnnotationSpecSet is sequential starting from 0. For example, an AnnotationSpecSet with classes `dog` and `cat`, might contain one AnnotationSpec with `{ display_name: &#34;dog&#34;, index: 0 }` and one AnnotationSpec with `{ display_name: &#34;cat&#34;, index: 1 }`. This is especially useful for model training as it encodes the string labels into numeric values.
     * 
     */
    private final Integer index;

    @CustomType.Constructor
    private GoogleCloudDatalabelingV1beta1AnnotationSpecResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("index") Integer index) {
        this.description = description;
        this.displayName = displayName;
        this.index = index;
    }

    /**
     * @return Optional. User-provided description of the annotation specification. The description can be up to 10,000 characters long.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of the AnnotationSpec. Maximum of 64 characters.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return This is the integer index of the AnnotationSpec. The index for the whole AnnotationSpecSet is sequential starting from 0. For example, an AnnotationSpecSet with classes `dog` and `cat`, might contain one AnnotationSpec with `{ display_name: &#34;dog&#34;, index: 0 }` and one AnnotationSpec with `{ display_name: &#34;cat&#34;, index: 1 }`. This is especially useful for model training as it encodes the string labels into numeric values.
     * 
     */
    public Integer index() {
        return this.index;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1AnnotationSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private Integer index;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1AnnotationSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.index = defaults.index;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }        public GoogleCloudDatalabelingV1beta1AnnotationSpecResponse build() {
            return new GoogleCloudDatalabelingV1beta1AnnotationSpecResponse(description, displayName, index);
        }
    }
}
