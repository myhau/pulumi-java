// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBrokerUser {
    private final Boolean consoleAccess;
    private final List<String> groups;
    private final String username;

    @OutputCustomType.Constructor({"consoleAccess","groups","username"})
    private GetBrokerUser(
        Boolean consoleAccess,
        List<String> groups,
        String username) {
        this.consoleAccess = consoleAccess;
        this.groups = groups;
        this.username = username;
    }

    public Boolean getConsoleAccess() {
        return this.consoleAccess;
    }
    public List<String> getGroups() {
        return this.groups;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean consoleAccess;
        private List<String> groups;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleAccess = defaults.consoleAccess;
    	      this.groups = defaults.groups;
    	      this.username = defaults.username;
        }

        public Builder setConsoleAccess(Boolean consoleAccess) {
            this.consoleAccess = Objects.requireNonNull(consoleAccess);
            return this;
        }

        public Builder setGroups(List<String> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GetBrokerUser build() {
            return new GetBrokerUser(consoleAccess, groups, username);
        }
    }
}
