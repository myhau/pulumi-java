// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare.v1.inputs.AttributeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserDataMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserDataMappingArgs Empty = new UserDataMappingArgs();

    @Import(name="consentStoreId", required=true)
    private Output<String> consentStoreId;

    public Output<String> consentStoreId() {
        return this.consentStoreId;
    }

    /**
     * A unique identifier for the mapped resource.
     * 
     */
    @Import(name="dataId", required=true)
    private Output<String> dataId;

    /**
     * @return A unique identifier for the mapped resource.
     * 
     */
    public Output<String> dataId() {
        return this.dataId;
    }

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name of the User data mapping, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/userDataMappings/{user_data_mapping_id}`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the User data mapping, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/userDataMappings/{user_data_mapping_id}`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field &#34;values&#34; in each Attribute.
     * 
     */
    @Import(name="resourceAttributes")
    private @Nullable Output<List<AttributeArgs>> resourceAttributes;

    /**
     * @return Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field &#34;values&#34; in each Attribute.
     * 
     */
    public Optional<Output<List<AttributeArgs>>> resourceAttributes() {
        return Optional.ofNullable(this.resourceAttributes);
    }

    /**
     * User&#39;s UUID provided by the client.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return User&#39;s UUID provided by the client.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private UserDataMappingArgs() {}

    private UserDataMappingArgs(UserDataMappingArgs $) {
        this.consentStoreId = $.consentStoreId;
        this.dataId = $.dataId;
        this.datasetId = $.datasetId;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.resourceAttributes = $.resourceAttributes;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserDataMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserDataMappingArgs $;

        public Builder() {
            $ = new UserDataMappingArgs();
        }

        public Builder(UserDataMappingArgs defaults) {
            $ = new UserDataMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder consentStoreId(Output<String> consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            return consentStoreId(Output.of(consentStoreId));
        }

        /**
         * @param dataId A unique identifier for the mapped resource.
         * 
         * @return builder
         * 
         */
        public Builder dataId(Output<String> dataId) {
            $.dataId = dataId;
            return this;
        }

        /**
         * @param dataId A unique identifier for the mapped resource.
         * 
         * @return builder
         * 
         */
        public Builder dataId(String dataId) {
            return dataId(Output.of(dataId));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Resource name of the User data mapping, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/userDataMappings/{user_data_mapping_id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the User data mapping, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/userDataMappings/{user_data_mapping_id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param resourceAttributes Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field &#34;values&#34; in each Attribute.
         * 
         * @return builder
         * 
         */
        public Builder resourceAttributes(@Nullable Output<List<AttributeArgs>> resourceAttributes) {
            $.resourceAttributes = resourceAttributes;
            return this;
        }

        /**
         * @param resourceAttributes Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field &#34;values&#34; in each Attribute.
         * 
         * @return builder
         * 
         */
        public Builder resourceAttributes(List<AttributeArgs> resourceAttributes) {
            return resourceAttributes(Output.of(resourceAttributes));
        }

        /**
         * @param resourceAttributes Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field &#34;values&#34; in each Attribute.
         * 
         * @return builder
         * 
         */
        public Builder resourceAttributes(AttributeArgs... resourceAttributes) {
            return resourceAttributes(List.of(resourceAttributes));
        }

        /**
         * @param userId User&#39;s UUID provided by the client.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId User&#39;s UUID provided by the client.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserDataMappingArgs build() {
            $.consentStoreId = Objects.requireNonNull($.consentStoreId, "expected parameter 'consentStoreId' to be non-null");
            $.dataId = Objects.requireNonNull($.dataId, "expected parameter 'dataId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
