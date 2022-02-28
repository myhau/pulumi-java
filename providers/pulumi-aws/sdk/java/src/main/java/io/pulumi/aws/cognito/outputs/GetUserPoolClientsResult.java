// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetUserPoolClientsResult {
    /**
     * List of Cognito user pool client IDs.
     * 
     */
    private final List<String> clientIds;
    /**
     * List of Cognito user pool client names.
     * 
     */
    private final List<String> clientNames;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String userPoolId;

    @OutputCustomType.Constructor({"clientIds","clientNames","id","userPoolId"})
    private GetUserPoolClientsResult(
        List<String> clientIds,
        List<String> clientNames,
        String id,
        String userPoolId) {
        this.clientIds = Objects.requireNonNull(clientIds);
        this.clientNames = Objects.requireNonNull(clientNames);
        this.id = Objects.requireNonNull(id);
        this.userPoolId = Objects.requireNonNull(userPoolId);
    }

    /**
     * List of Cognito user pool client IDs.
     * 
     */
    public List<String> getClientIds() {
        return this.clientIds;
    }
    /**
     * List of Cognito user pool client names.
     * 
     */
    public List<String> getClientNames() {
        return this.clientNames;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getUserPoolId() {
        return this.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolClientsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> clientIds;
        private List<String> clientNames;
        private String id;
        private String userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolClientsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIds = defaults.clientIds;
    	      this.clientNames = defaults.clientNames;
    	      this.id = defaults.id;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setClientIds(List<String> clientIds) {
            this.clientIds = Objects.requireNonNull(clientIds);
            return this;
        }

        public Builder setClientNames(List<String> clientNames) {
            this.clientNames = Objects.requireNonNull(clientNames);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setUserPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public GetUserPoolClientsResult build() {
            return new GetUserPoolClientsResult(clientIds, clientNames, id, userPoolId);
        }
    }
}
