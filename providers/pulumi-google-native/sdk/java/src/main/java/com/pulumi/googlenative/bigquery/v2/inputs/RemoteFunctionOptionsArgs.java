// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Options for a remote user-defined function.
 * 
 */
public final class RemoteFunctionOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RemoteFunctionOptionsArgs Empty = new RemoteFunctionOptionsArgs();

    /**
     * Fully qualified name of the user-provided connection object which holds the authentication information to send requests to the remote service. projects/{project_id}/locations/{location_id}/connections/{connection_id}
     * 
     */
    @Import(name="connection")
    private @Nullable Output<String> connection;

    /**
     * @return Fully qualified name of the user-provided connection object which holds the authentication information to send requests to the remote service. projects/{project_id}/locations/{location_id}/connections/{connection_id}
     * 
     */
    public Optional<Output<String>> connection() {
        return Optional.ofNullable(this.connection);
    }

    /**
     * Endpoint of the user-provided remote service (e.g. a function url in Google Cloud Functions).
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return Endpoint of the user-provided remote service (e.g. a function url in Google Cloud Functions).
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Max number of rows in each batch sent to the remote service. If absent or if 0, it means no limit.
     * 
     */
    @Import(name="maxBatchingRows")
    private @Nullable Output<String> maxBatchingRows;

    /**
     * @return Max number of rows in each batch sent to the remote service. If absent or if 0, it means no limit.
     * 
     */
    public Optional<Output<String>> maxBatchingRows() {
        return Optional.ofNullable(this.maxBatchingRows);
    }

    /**
     * User-defined context as a set of key/value pairs, which will be sent as function invocation context together with batched arguments in the requests to the remote service. The total number of bytes of keys and values must be less than 8KB.
     * 
     */
    @Import(name="userDefinedContext")
    private @Nullable Output<Map<String,String>> userDefinedContext;

    /**
     * @return User-defined context as a set of key/value pairs, which will be sent as function invocation context together with batched arguments in the requests to the remote service. The total number of bytes of keys and values must be less than 8KB.
     * 
     */
    public Optional<Output<Map<String,String>>> userDefinedContext() {
        return Optional.ofNullable(this.userDefinedContext);
    }

    private RemoteFunctionOptionsArgs() {}

    private RemoteFunctionOptionsArgs(RemoteFunctionOptionsArgs $) {
        this.connection = $.connection;
        this.endpoint = $.endpoint;
        this.maxBatchingRows = $.maxBatchingRows;
        this.userDefinedContext = $.userDefinedContext;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RemoteFunctionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RemoteFunctionOptionsArgs $;

        public Builder() {
            $ = new RemoteFunctionOptionsArgs();
        }

        public Builder(RemoteFunctionOptionsArgs defaults) {
            $ = new RemoteFunctionOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connection Fully qualified name of the user-provided connection object which holds the authentication information to send requests to the remote service. projects/{project_id}/locations/{location_id}/connections/{connection_id}
         * 
         * @return builder
         * 
         */
        public Builder connection(@Nullable Output<String> connection) {
            $.connection = connection;
            return this;
        }

        /**
         * @param connection Fully qualified name of the user-provided connection object which holds the authentication information to send requests to the remote service. projects/{project_id}/locations/{location_id}/connections/{connection_id}
         * 
         * @return builder
         * 
         */
        public Builder connection(String connection) {
            return connection(Output.of(connection));
        }

        /**
         * @param endpoint Endpoint of the user-provided remote service (e.g. a function url in Google Cloud Functions).
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Endpoint of the user-provided remote service (e.g. a function url in Google Cloud Functions).
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param maxBatchingRows Max number of rows in each batch sent to the remote service. If absent or if 0, it means no limit.
         * 
         * @return builder
         * 
         */
        public Builder maxBatchingRows(@Nullable Output<String> maxBatchingRows) {
            $.maxBatchingRows = maxBatchingRows;
            return this;
        }

        /**
         * @param maxBatchingRows Max number of rows in each batch sent to the remote service. If absent or if 0, it means no limit.
         * 
         * @return builder
         * 
         */
        public Builder maxBatchingRows(String maxBatchingRows) {
            return maxBatchingRows(Output.of(maxBatchingRows));
        }

        /**
         * @param userDefinedContext User-defined context as a set of key/value pairs, which will be sent as function invocation context together with batched arguments in the requests to the remote service. The total number of bytes of keys and values must be less than 8KB.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedContext(@Nullable Output<Map<String,String>> userDefinedContext) {
            $.userDefinedContext = userDefinedContext;
            return this;
        }

        /**
         * @param userDefinedContext User-defined context as a set of key/value pairs, which will be sent as function invocation context together with batched arguments in the requests to the remote service. The total number of bytes of keys and values must be less than 8KB.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedContext(Map<String,String> userDefinedContext) {
            return userDefinedContext(Output.of(userDefinedContext));
        }

        public RemoteFunctionOptionsArgs build() {
            return $;
        }
    }

}
