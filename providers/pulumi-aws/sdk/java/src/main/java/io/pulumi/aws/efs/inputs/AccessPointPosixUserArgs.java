// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointPosixUserArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointPosixUserArgs Empty = new AccessPointPosixUserArgs();

    /**
     * POSIX group ID used for all file system operations using this access point.
     * 
     */
    @InputImport(name="gid", required=true)
      private final Input<Integer> gid;

    public Input<Integer> getGid() {
        return this.gid;
    }

    /**
     * Secondary POSIX group IDs used for all file system operations using this access point.
     * 
     */
    @InputImport(name="secondaryGids")
      private final @Nullable Input<List<Integer>> secondaryGids;

    public Input<List<Integer>> getSecondaryGids() {
        return this.secondaryGids == null ? Input.empty() : this.secondaryGids;
    }

    /**
     * POSIX user ID used for all file system operations using this access point.
     * 
     */
    @InputImport(name="uid", required=true)
      private final Input<Integer> uid;

    public Input<Integer> getUid() {
        return this.uid;
    }

    public AccessPointPosixUserArgs(
        Input<Integer> gid,
        @Nullable Input<List<Integer>> secondaryGids,
        Input<Integer> uid) {
        this.gid = Objects.requireNonNull(gid, "expected parameter 'gid' to be non-null");
        this.secondaryGids = secondaryGids;
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
    }

    private AccessPointPosixUserArgs() {
        this.gid = Input.empty();
        this.secondaryGids = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointPosixUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> gid;
        private @Nullable Input<List<Integer>> secondaryGids;
        private Input<Integer> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointPosixUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.secondaryGids = defaults.secondaryGids;
    	      this.uid = defaults.uid;
        }

        public Builder setGid(Input<Integer> gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }

        public Builder setGid(Integer gid) {
            this.gid = Input.of(Objects.requireNonNull(gid));
            return this;
        }

        public Builder setSecondaryGids(@Nullable Input<List<Integer>> secondaryGids) {
            this.secondaryGids = secondaryGids;
            return this;
        }

        public Builder setSecondaryGids(@Nullable List<Integer> secondaryGids) {
            this.secondaryGids = Input.ofNullable(secondaryGids);
            return this;
        }

        public Builder setUid(Input<Integer> uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public Builder setUid(Integer uid) {
            this.uid = Input.of(Objects.requireNonNull(uid));
            return this;
        }
        public AccessPointPosixUserArgs build() {
            return new AccessPointPosixUserArgs(gid, secondaryGids, uid);
        }
    }
}
