// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LienArgs extends com.pulumi.resources.ResourceArgs {

    public static final LienArgs Empty = new LienArgs();

    /**
     * The creation time of this Lien.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of this Lien.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * A system-generated unique identifier for this Lien. Example: `liens/1234abcd`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A system-generated unique identifier for this Lien. Example: `liens/1234abcd`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A stable, user-visible/meaningful string identifying the origin of the Lien, intended to be inspected programmatically. Maximum length of 200 characters. Example: &#39;compute.googleapis.com&#39;
     * 
     */
    @Import(name="origin")
    private @Nullable Output<String> origin;

    /**
     * @return A stable, user-visible/meaningful string identifying the origin of the Lien, intended to be inspected programmatically. Maximum length of 200 characters. Example: &#39;compute.googleapis.com&#39;
     * 
     */
    public Optional<Output<String>> origin() {
        return Optional.ofNullable(this.origin);
    }

    /**
     * A reference to the resource this Lien is attached to. The server will validate the parent against those for which Liens are supported. Example: `projects/1234`
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return A reference to the resource this Lien is attached to. The server will validate the parent against those for which Liens are supported. Example: `projects/1234`
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * Concise user-visible strings indicating why an action cannot be performed on a resource. Maximum length of 200 characters. Example: &#39;Holds production API key&#39;
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return Concise user-visible strings indicating why an action cannot be performed on a resource. Maximum length of 200 characters. Example: &#39;Holds production API key&#39;
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * The types of operations which should be blocked as a result of this Lien. Each value should correspond to an IAM permission. The server will validate the permissions against those for which Liens are supported. An empty list is meaningless and will be rejected. Example: [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    @Import(name="restrictions")
    private @Nullable Output<List<String>> restrictions;

    /**
     * @return The types of operations which should be blocked as a result of this Lien. Each value should correspond to an IAM permission. The server will validate the permissions against those for which Liens are supported. An empty list is meaningless and will be rejected. Example: [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    public Optional<Output<List<String>>> restrictions() {
        return Optional.ofNullable(this.restrictions);
    }

    private LienArgs() {}

    private LienArgs(LienArgs $) {
        this.createTime = $.createTime;
        this.name = $.name;
        this.origin = $.origin;
        this.parent = $.parent;
        this.reason = $.reason;
        this.restrictions = $.restrictions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LienArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LienArgs $;

        public Builder() {
            $ = new LienArgs();
        }

        public Builder(LienArgs defaults) {
            $ = new LienArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The creation time of this Lien.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of this Lien.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param name A system-generated unique identifier for this Lien. Example: `liens/1234abcd`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A system-generated unique identifier for this Lien. Example: `liens/1234abcd`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param origin A stable, user-visible/meaningful string identifying the origin of the Lien, intended to be inspected programmatically. Maximum length of 200 characters. Example: &#39;compute.googleapis.com&#39;
         * 
         * @return builder
         * 
         */
        public Builder origin(@Nullable Output<String> origin) {
            $.origin = origin;
            return this;
        }

        /**
         * @param origin A stable, user-visible/meaningful string identifying the origin of the Lien, intended to be inspected programmatically. Maximum length of 200 characters. Example: &#39;compute.googleapis.com&#39;
         * 
         * @return builder
         * 
         */
        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        /**
         * @param parent A reference to the resource this Lien is attached to. The server will validate the parent against those for which Liens are supported. Example: `projects/1234`
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent A reference to the resource this Lien is attached to. The server will validate the parent against those for which Liens are supported. Example: `projects/1234`
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param reason Concise user-visible strings indicating why an action cannot be performed on a resource. Maximum length of 200 characters. Example: &#39;Holds production API key&#39;
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason Concise user-visible strings indicating why an action cannot be performed on a resource. Maximum length of 200 characters. Example: &#39;Holds production API key&#39;
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param restrictions The types of operations which should be blocked as a result of this Lien. Each value should correspond to an IAM permission. The server will validate the permissions against those for which Liens are supported. An empty list is meaningless and will be rejected. Example: [&#39;resourcemanager.projects.delete&#39;]
         * 
         * @return builder
         * 
         */
        public Builder restrictions(@Nullable Output<List<String>> restrictions) {
            $.restrictions = restrictions;
            return this;
        }

        /**
         * @param restrictions The types of operations which should be blocked as a result of this Lien. Each value should correspond to an IAM permission. The server will validate the permissions against those for which Liens are supported. An empty list is meaningless and will be rejected. Example: [&#39;resourcemanager.projects.delete&#39;]
         * 
         * @return builder
         * 
         */
        public Builder restrictions(List<String> restrictions) {
            return restrictions(Output.of(restrictions));
        }

        /**
         * @param restrictions The types of operations which should be blocked as a result of this Lien. Each value should correspond to an IAM permission. The server will validate the permissions against those for which Liens are supported. An empty list is meaningless and will be rejected. Example: [&#39;resourcemanager.projects.delete&#39;]
         * 
         * @return builder
         * 
         */
        public Builder restrictions(String... restrictions) {
            return restrictions(List.of(restrictions));
        }

        public LienArgs build() {
            return $;
        }
    }

}
