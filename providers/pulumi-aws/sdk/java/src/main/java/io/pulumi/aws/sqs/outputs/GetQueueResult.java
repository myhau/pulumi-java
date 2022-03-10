// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sqs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetQueueResult {
    /**
     * The Amazon Resource Name (ARN) of the queue.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * A map of tags for the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The URL of the queue.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"arn","id","name","tags","url"})
    private GetQueueResult(
        String arn,
        String id,
        String name,
        Map<String,String> tags,
        String url) {
        this.arn = arn;
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.url = url;
    }

    /**
     * The Amazon Resource Name (ARN) of the queue.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * A map of tags for the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The URL of the queue.
     * 
    */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        private Map<String,String> tags;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.url = defaults.url;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetQueueResult build() {
            return new GetQueueResult(arn, id, name, tags, url);
        }
    }
}