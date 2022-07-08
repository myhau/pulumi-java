// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The project team associated with the entity, if any.
 * 
 */
public final class DefaultObjectAccessControlProjectTeamArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultObjectAccessControlProjectTeamArgs Empty = new DefaultObjectAccessControlProjectTeamArgs();

    /**
     * The project number.
     * 
     */
    @Import(name="projectNumber")
    private @Nullable Output<String> projectNumber;

    /**
     * @return The project number.
     * 
     */
    public Optional<Output<String>> projectNumber() {
        return Optional.ofNullable(this.projectNumber);
    }

    /**
     * The team.
     * 
     */
    @Import(name="team")
    private @Nullable Output<String> team;

    /**
     * @return The team.
     * 
     */
    public Optional<Output<String>> team() {
        return Optional.ofNullable(this.team);
    }

    private DefaultObjectAccessControlProjectTeamArgs() {}

    private DefaultObjectAccessControlProjectTeamArgs(DefaultObjectAccessControlProjectTeamArgs $) {
        this.projectNumber = $.projectNumber;
        this.team = $.team;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultObjectAccessControlProjectTeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultObjectAccessControlProjectTeamArgs $;

        public Builder() {
            $ = new DefaultObjectAccessControlProjectTeamArgs();
        }

        public Builder(DefaultObjectAccessControlProjectTeamArgs defaults) {
            $ = new DefaultObjectAccessControlProjectTeamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectNumber The project number.
         * 
         * @return builder
         * 
         */
        public Builder projectNumber(@Nullable Output<String> projectNumber) {
            $.projectNumber = projectNumber;
            return this;
        }

        /**
         * @param projectNumber The project number.
         * 
         * @return builder
         * 
         */
        public Builder projectNumber(String projectNumber) {
            return projectNumber(Output.of(projectNumber));
        }

        /**
         * @param team The team.
         * 
         * @return builder
         * 
         */
        public Builder team(@Nullable Output<String> team) {
            $.team = team;
            return this;
        }

        /**
         * @param team The team.
         * 
         * @return builder
         * 
         */
        public Builder team(String team) {
            return team(Output.of(team));
        }

        public DefaultObjectAccessControlProjectTeamArgs build() {
            return $;
        }
    }

}
