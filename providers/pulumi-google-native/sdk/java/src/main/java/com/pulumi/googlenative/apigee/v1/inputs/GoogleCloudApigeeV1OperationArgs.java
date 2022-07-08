// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the pairing of REST resource path and the actions (verbs) allowed on the resource path.
 * 
 */
public final class GoogleCloudApigeeV1OperationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1OperationArgs Empty = new GoogleCloudApigeeV1OperationArgs();

    /**
     * methods refers to the REST verbs as in https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html. When none specified, all verb types are allowed.
     * 
     */
    @Import(name="methods")
    private @Nullable Output<List<String>> methods;

    /**
     * @return methods refers to the REST verbs as in https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html. When none specified, all verb types are allowed.
     * 
     */
    public Optional<Output<List<String>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    /**
     * REST resource path associated with the API proxy or remote service.
     * 
     */
    @Import(name="resource", required=true)
    private Output<String> resource;

    /**
     * @return REST resource path associated with the API proxy or remote service.
     * 
     */
    public Output<String> resource() {
        return this.resource;
    }

    private GoogleCloudApigeeV1OperationArgs() {}

    private GoogleCloudApigeeV1OperationArgs(GoogleCloudApigeeV1OperationArgs $) {
        this.methods = $.methods;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1OperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1OperationArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1OperationArgs();
        }

        public Builder(GoogleCloudApigeeV1OperationArgs defaults) {
            $ = new GoogleCloudApigeeV1OperationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param methods methods refers to the REST verbs as in https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html. When none specified, all verb types are allowed.
         * 
         * @return builder
         * 
         */
        public Builder methods(@Nullable Output<List<String>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods methods refers to the REST verbs as in https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html. When none specified, all verb types are allowed.
         * 
         * @return builder
         * 
         */
        public Builder methods(List<String> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods methods refers to the REST verbs as in https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html. When none specified, all verb types are allowed.
         * 
         * @return builder
         * 
         */
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param resource REST resource path associated with the API proxy or remote service.
         * 
         * @return builder
         * 
         */
        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource REST resource path associated with the API proxy or remote service.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public GoogleCloudApigeeV1OperationArgs build() {
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            return $;
        }
    }

}
