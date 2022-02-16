// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sourcerepo.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryState extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryState Empty = new RepositoryState();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="pubsubConfigs")
    private final @Nullable Input<List<RepositoryPubsubConfigGetArgs>> pubsubConfigs;

    public Input<List<RepositoryPubsubConfigGetArgs>> getPubsubConfigs() {
        return this.pubsubConfigs == null ? Input.empty() : this.pubsubConfigs;
    }

    @InputImport(name="size")
    private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public RepositoryState(
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<List<RepositoryPubsubConfigGetArgs>> pubsubConfigs,
        @Nullable Input<Integer> size,
        @Nullable Input<String> url) {
        this.name = name;
        this.project = project;
        this.pubsubConfigs = pubsubConfigs;
        this.size = size;
        this.url = url;
    }

    private RepositoryState() {
        this.name = Input.empty();
        this.project = Input.empty();
        this.pubsubConfigs = Input.empty();
        this.size = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<List<RepositoryPubsubConfigGetArgs>> pubsubConfigs;
        private @Nullable Input<Integer> size;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pubsubConfigs = defaults.pubsubConfigs;
    	      this.size = defaults.size;
    	      this.url = defaults.url;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPubsubConfigs(@Nullable Input<List<RepositoryPubsubConfigGetArgs>> pubsubConfigs) {
            this.pubsubConfigs = pubsubConfigs;
            return this;
        }

        public Builder setPubsubConfigs(@Nullable List<RepositoryPubsubConfigGetArgs> pubsubConfigs) {
            this.pubsubConfigs = Input.ofNullable(pubsubConfigs);
            return this;
        }

        public Builder setSize(@Nullable Input<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public RepositoryState build() {
            return new RepositoryState(name, project, pubsubConfigs, size, url);
        }
    }
}