// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDelegatedAdministratorsDelegatedAdministrator {
    /**
     * The Amazon Resource Name (ARN) of the delegated administrator's account.
     * 
     */
    private final String arn;
    /**
     * The date when the account was made a delegated administrator.
     * 
     */
    private final String delegationEnabledDate;
    /**
     * The email address that is associated with the delegated administrator's AWS account.
     * 
     */
    private final String email;
    /**
     * The unique identifier (ID) of the delegated administrator's account.
     * 
     */
    private final String id;
    /**
     * The method by which the delegated administrator's account joined the organization.
     * 
     */
    private final String joinedMethod;
    /**
     * The date when the delegated administrator's account became a part of the organization.
     * 
     */
    private final String joinedTimestamp;
    /**
     * The friendly name of the delegated administrator's account.
     * 
     */
    private final String name;
    /**
     * The status of the delegated administrator's account in the organization.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"arn","delegationEnabledDate","email","id","joinedMethod","joinedTimestamp","name","status"})
    private GetDelegatedAdministratorsDelegatedAdministrator(
        String arn,
        String delegationEnabledDate,
        String email,
        String id,
        String joinedMethod,
        String joinedTimestamp,
        String name,
        String status) {
        this.arn = arn;
        this.delegationEnabledDate = delegationEnabledDate;
        this.email = email;
        this.id = id;
        this.joinedMethod = joinedMethod;
        this.joinedTimestamp = joinedTimestamp;
        this.name = name;
        this.status = status;
    }

    /**
     * The Amazon Resource Name (ARN) of the delegated administrator's account.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The date when the account was made a delegated administrator.
     * 
    */
    public String getDelegationEnabledDate() {
        return this.delegationEnabledDate;
    }
    /**
     * The email address that is associated with the delegated administrator's AWS account.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The unique identifier (ID) of the delegated administrator's account.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The method by which the delegated administrator's account joined the organization.
     * 
    */
    public String getJoinedMethod() {
        return this.joinedMethod;
    }
    /**
     * The date when the delegated administrator's account became a part of the organization.
     * 
    */
    public String getJoinedTimestamp() {
        return this.joinedTimestamp;
    }
    /**
     * The friendly name of the delegated administrator's account.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The status of the delegated administrator's account in the organization.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDelegatedAdministratorsDelegatedAdministrator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String delegationEnabledDate;
        private String email;
        private String id;
        private String joinedMethod;
        private String joinedTimestamp;
        private String name;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDelegatedAdministratorsDelegatedAdministrator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.delegationEnabledDate = defaults.delegationEnabledDate;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.joinedMethod = defaults.joinedMethod;
    	      this.joinedTimestamp = defaults.joinedTimestamp;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDelegationEnabledDate(String delegationEnabledDate) {
            this.delegationEnabledDate = Objects.requireNonNull(delegationEnabledDate);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setJoinedMethod(String joinedMethod) {
            this.joinedMethod = Objects.requireNonNull(joinedMethod);
            return this;
        }

        public Builder setJoinedTimestamp(String joinedTimestamp) {
            this.joinedTimestamp = Objects.requireNonNull(joinedTimestamp);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetDelegatedAdministratorsDelegatedAdministrator build() {
            return new GetDelegatedAdministratorsDelegatedAdministrator(arn, delegationEnabledDate, email, id, joinedMethod, joinedTimestamp, name, status);
        }
    }
}
