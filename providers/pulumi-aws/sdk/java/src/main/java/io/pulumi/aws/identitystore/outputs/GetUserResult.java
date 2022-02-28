// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.identitystore.outputs;

import io.pulumi.aws.identitystore.outputs.GetUserFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetUserResult {
    private final List<GetUserFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String identityStoreId;
    private final String userId;
    /**
     * The user's user name value.
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"filters","id","identityStoreId","userId","userName"})
    private GetUserResult(
        List<GetUserFilter> filters,
        String id,
        String identityStoreId,
        String userId,
        String userName) {
        this.filters = Objects.requireNonNull(filters);
        this.id = Objects.requireNonNull(id);
        this.identityStoreId = Objects.requireNonNull(identityStoreId);
        this.userId = Objects.requireNonNull(userId);
        this.userName = Objects.requireNonNull(userName);
    }

    public List<GetUserFilter> getFilters() {
        return this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getIdentityStoreId() {
        return this.identityStoreId;
    }
    public String getUserId() {
        return this.userId;
    }
    /**
     * The user's user name value.
     * 
     */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetUserFilter> filters;
        private String id;
        private String identityStoreId;
        private String userId;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.identityStoreId = defaults.identityStoreId;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
        }

        public Builder setFilters(List<GetUserFilter> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentityStoreId(String identityStoreId) {
            this.identityStoreId = Objects.requireNonNull(identityStoreId);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetUserResult build() {
            return new GetUserResult(filters, id, identityStoreId, userId, userName);
        }
    }
}
