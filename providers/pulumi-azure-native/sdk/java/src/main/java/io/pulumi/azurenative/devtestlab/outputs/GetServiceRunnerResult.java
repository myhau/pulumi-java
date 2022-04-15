// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.IdentityPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceRunnerResult {
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The identity of the resource.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identity;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServiceRunnerResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityPropertiesResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The identifier of the resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The identity of the resource.
     * 
    */
    public Optional<IdentityPropertiesResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceRunnerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private @Nullable String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceRunnerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServiceRunnerResult build() {
            return new GetServiceRunnerResult(id, identity, location, name, tags, type);
        }
    }
}
