// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.aws.iot.inputs.TopicRuleCloudwatchAlarmArgs;
import io.pulumi.aws.iot.inputs.TopicRuleCloudwatchMetricArgs;
import io.pulumi.aws.iot.inputs.TopicRuleDynamodbArgs;
import io.pulumi.aws.iot.inputs.TopicRuleDynamodbv2Args;
import io.pulumi.aws.iot.inputs.TopicRuleElasticsearchArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs;
import io.pulumi.aws.iot.inputs.TopicRuleFirehoseArgs;
import io.pulumi.aws.iot.inputs.TopicRuleIotAnalyticArgs;
import io.pulumi.aws.iot.inputs.TopicRuleIotEventArgs;
import io.pulumi.aws.iot.inputs.TopicRuleKinesisArgs;
import io.pulumi.aws.iot.inputs.TopicRuleLambdaArgs;
import io.pulumi.aws.iot.inputs.TopicRuleRepublishArgs;
import io.pulumi.aws.iot.inputs.TopicRuleS3Args;
import io.pulumi.aws.iot.inputs.TopicRuleSnsArgs;
import io.pulumi.aws.iot.inputs.TopicRuleSqsArgs;
import io.pulumi.aws.iot.inputs.TopicRuleStepFunctionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleArgs Empty = new TopicRuleArgs();

    @InputImport(name="cloudwatchAlarm")
      private final @Nullable Input<TopicRuleCloudwatchAlarmArgs> cloudwatchAlarm;

    public Input<TopicRuleCloudwatchAlarmArgs> getCloudwatchAlarm() {
        return this.cloudwatchAlarm == null ? Input.empty() : this.cloudwatchAlarm;
    }

    @InputImport(name="cloudwatchMetric")
      private final @Nullable Input<TopicRuleCloudwatchMetricArgs> cloudwatchMetric;

    public Input<TopicRuleCloudwatchMetricArgs> getCloudwatchMetric() {
        return this.cloudwatchMetric == null ? Input.empty() : this.cloudwatchMetric;
    }

    /**
     * The description of the rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="dynamodb")
      private final @Nullable Input<TopicRuleDynamodbArgs> dynamodb;

    public Input<TopicRuleDynamodbArgs> getDynamodb() {
        return this.dynamodb == null ? Input.empty() : this.dynamodb;
    }

    @InputImport(name="dynamodbv2s")
      private final @Nullable Input<List<TopicRuleDynamodbv2Args>> dynamodbv2s;

    public Input<List<TopicRuleDynamodbv2Args>> getDynamodbv2s() {
        return this.dynamodbv2s == null ? Input.empty() : this.dynamodbv2s;
    }

    @InputImport(name="elasticsearch")
      private final @Nullable Input<TopicRuleElasticsearchArgs> elasticsearch;

    public Input<TopicRuleElasticsearchArgs> getElasticsearch() {
        return this.elasticsearch == null ? Input.empty() : this.elasticsearch;
    }

    /**
     * Specifies whether the rule is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * Configuration block with error action to be associated with the rule. See the documentation for `cloudwatch_alarm`, `cloudwatch_metric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iot_analytics`, `iot_events`, `kinesis`, `lambda`, `republish`, `s3`, `step_functions`, `sns`, `sqs` configuration blocks for further configuration details.
     * 
     */
    @InputImport(name="errorAction")
      private final @Nullable Input<TopicRuleErrorActionArgs> errorAction;

    public Input<TopicRuleErrorActionArgs> getErrorAction() {
        return this.errorAction == null ? Input.empty() : this.errorAction;
    }

    @InputImport(name="firehose")
      private final @Nullable Input<TopicRuleFirehoseArgs> firehose;

    public Input<TopicRuleFirehoseArgs> getFirehose() {
        return this.firehose == null ? Input.empty() : this.firehose;
    }

    @InputImport(name="iotAnalytics")
      private final @Nullable Input<List<TopicRuleIotAnalyticArgs>> iotAnalytics;

    public Input<List<TopicRuleIotAnalyticArgs>> getIotAnalytics() {
        return this.iotAnalytics == null ? Input.empty() : this.iotAnalytics;
    }

    @InputImport(name="iotEvents")
      private final @Nullable Input<List<TopicRuleIotEventArgs>> iotEvents;

    public Input<List<TopicRuleIotEventArgs>> getIotEvents() {
        return this.iotEvents == null ? Input.empty() : this.iotEvents;
    }

    @InputImport(name="kinesis")
      private final @Nullable Input<TopicRuleKinesisArgs> kinesis;

    public Input<TopicRuleKinesisArgs> getKinesis() {
        return this.kinesis == null ? Input.empty() : this.kinesis;
    }

    @InputImport(name="lambda")
      private final @Nullable Input<TopicRuleLambdaArgs> lambda;

    public Input<TopicRuleLambdaArgs> getLambda() {
        return this.lambda == null ? Input.empty() : this.lambda;
    }

    /**
     * The name of the rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="republish")
      private final @Nullable Input<TopicRuleRepublishArgs> republish;

    public Input<TopicRuleRepublishArgs> getRepublish() {
        return this.republish == null ? Input.empty() : this.republish;
    }

    @InputImport(name="s3")
      private final @Nullable Input<TopicRuleS3Args> s3;

    public Input<TopicRuleS3Args> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    @InputImport(name="sns")
      private final @Nullable Input<TopicRuleSnsArgs> sns;

    public Input<TopicRuleSnsArgs> getSns() {
        return this.sns == null ? Input.empty() : this.sns;
    }

    /**
     * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
     * 
     */
    @InputImport(name="sql", required=true)
      private final Input<String> sql;

    public Input<String> getSql() {
        return this.sql;
    }

    /**
     * The version of the SQL rules engine to use when evaluating the rule.
     * 
     */
    @InputImport(name="sqlVersion", required=true)
      private final Input<String> sqlVersion;

    public Input<String> getSqlVersion() {
        return this.sqlVersion;
    }

    @InputImport(name="sqs")
      private final @Nullable Input<TopicRuleSqsArgs> sqs;

    public Input<TopicRuleSqsArgs> getSqs() {
        return this.sqs == null ? Input.empty() : this.sqs;
    }

    @InputImport(name="stepFunctions")
      private final @Nullable Input<List<TopicRuleStepFunctionArgs>> stepFunctions;

    public Input<List<TopicRuleStepFunctionArgs>> getStepFunctions() {
        return this.stepFunctions == null ? Input.empty() : this.stepFunctions;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public TopicRuleArgs(
        @Nullable Input<TopicRuleCloudwatchAlarmArgs> cloudwatchAlarm,
        @Nullable Input<TopicRuleCloudwatchMetricArgs> cloudwatchMetric,
        @Nullable Input<String> description,
        @Nullable Input<TopicRuleDynamodbArgs> dynamodb,
        @Nullable Input<List<TopicRuleDynamodbv2Args>> dynamodbv2s,
        @Nullable Input<TopicRuleElasticsearchArgs> elasticsearch,
        Input<Boolean> enabled,
        @Nullable Input<TopicRuleErrorActionArgs> errorAction,
        @Nullable Input<TopicRuleFirehoseArgs> firehose,
        @Nullable Input<List<TopicRuleIotAnalyticArgs>> iotAnalytics,
        @Nullable Input<List<TopicRuleIotEventArgs>> iotEvents,
        @Nullable Input<TopicRuleKinesisArgs> kinesis,
        @Nullable Input<TopicRuleLambdaArgs> lambda,
        @Nullable Input<String> name,
        @Nullable Input<TopicRuleRepublishArgs> republish,
        @Nullable Input<TopicRuleS3Args> s3,
        @Nullable Input<TopicRuleSnsArgs> sns,
        Input<String> sql,
        Input<String> sqlVersion,
        @Nullable Input<TopicRuleSqsArgs> sqs,
        @Nullable Input<List<TopicRuleStepFunctionArgs>> stepFunctions,
        @Nullable Input<Map<String,String>> tags) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        this.cloudwatchMetric = cloudwatchMetric;
        this.description = description;
        this.dynamodb = dynamodb;
        this.dynamodbv2s = dynamodbv2s;
        this.elasticsearch = elasticsearch;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.errorAction = errorAction;
        this.firehose = firehose;
        this.iotAnalytics = iotAnalytics;
        this.iotEvents = iotEvents;
        this.kinesis = kinesis;
        this.lambda = lambda;
        this.name = name;
        this.republish = republish;
        this.s3 = s3;
        this.sns = sns;
        this.sql = Objects.requireNonNull(sql, "expected parameter 'sql' to be non-null");
        this.sqlVersion = Objects.requireNonNull(sqlVersion, "expected parameter 'sqlVersion' to be non-null");
        this.sqs = sqs;
        this.stepFunctions = stepFunctions;
        this.tags = tags;
    }

    private TopicRuleArgs() {
        this.cloudwatchAlarm = Input.empty();
        this.cloudwatchMetric = Input.empty();
        this.description = Input.empty();
        this.dynamodb = Input.empty();
        this.dynamodbv2s = Input.empty();
        this.elasticsearch = Input.empty();
        this.enabled = Input.empty();
        this.errorAction = Input.empty();
        this.firehose = Input.empty();
        this.iotAnalytics = Input.empty();
        this.iotEvents = Input.empty();
        this.kinesis = Input.empty();
        this.lambda = Input.empty();
        this.name = Input.empty();
        this.republish = Input.empty();
        this.s3 = Input.empty();
        this.sns = Input.empty();
        this.sql = Input.empty();
        this.sqlVersion = Input.empty();
        this.sqs = Input.empty();
        this.stepFunctions = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TopicRuleCloudwatchAlarmArgs> cloudwatchAlarm;
        private @Nullable Input<TopicRuleCloudwatchMetricArgs> cloudwatchMetric;
        private @Nullable Input<String> description;
        private @Nullable Input<TopicRuleDynamodbArgs> dynamodb;
        private @Nullable Input<List<TopicRuleDynamodbv2Args>> dynamodbv2s;
        private @Nullable Input<TopicRuleElasticsearchArgs> elasticsearch;
        private Input<Boolean> enabled;
        private @Nullable Input<TopicRuleErrorActionArgs> errorAction;
        private @Nullable Input<TopicRuleFirehoseArgs> firehose;
        private @Nullable Input<List<TopicRuleIotAnalyticArgs>> iotAnalytics;
        private @Nullable Input<List<TopicRuleIotEventArgs>> iotEvents;
        private @Nullable Input<TopicRuleKinesisArgs> kinesis;
        private @Nullable Input<TopicRuleLambdaArgs> lambda;
        private @Nullable Input<String> name;
        private @Nullable Input<TopicRuleRepublishArgs> republish;
        private @Nullable Input<TopicRuleS3Args> s3;
        private @Nullable Input<TopicRuleSnsArgs> sns;
        private Input<String> sql;
        private Input<String> sqlVersion;
        private @Nullable Input<TopicRuleSqsArgs> sqs;
        private @Nullable Input<List<TopicRuleStepFunctionArgs>> stepFunctions;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchAlarm = defaults.cloudwatchAlarm;
    	      this.cloudwatchMetric = defaults.cloudwatchMetric;
    	      this.description = defaults.description;
    	      this.dynamodb = defaults.dynamodb;
    	      this.dynamodbv2s = defaults.dynamodbv2s;
    	      this.elasticsearch = defaults.elasticsearch;
    	      this.enabled = defaults.enabled;
    	      this.errorAction = defaults.errorAction;
    	      this.firehose = defaults.firehose;
    	      this.iotAnalytics = defaults.iotAnalytics;
    	      this.iotEvents = defaults.iotEvents;
    	      this.kinesis = defaults.kinesis;
    	      this.lambda = defaults.lambda;
    	      this.name = defaults.name;
    	      this.republish = defaults.republish;
    	      this.s3 = defaults.s3;
    	      this.sns = defaults.sns;
    	      this.sql = defaults.sql;
    	      this.sqlVersion = defaults.sqlVersion;
    	      this.sqs = defaults.sqs;
    	      this.stepFunctions = defaults.stepFunctions;
    	      this.tags = defaults.tags;
        }

        public Builder setCloudwatchAlarm(@Nullable Input<TopicRuleCloudwatchAlarmArgs> cloudwatchAlarm) {
            this.cloudwatchAlarm = cloudwatchAlarm;
            return this;
        }

        public Builder setCloudwatchAlarm(@Nullable TopicRuleCloudwatchAlarmArgs cloudwatchAlarm) {
            this.cloudwatchAlarm = Input.ofNullable(cloudwatchAlarm);
            return this;
        }

        public Builder setCloudwatchMetric(@Nullable Input<TopicRuleCloudwatchMetricArgs> cloudwatchMetric) {
            this.cloudwatchMetric = cloudwatchMetric;
            return this;
        }

        public Builder setCloudwatchMetric(@Nullable TopicRuleCloudwatchMetricArgs cloudwatchMetric) {
            this.cloudwatchMetric = Input.ofNullable(cloudwatchMetric);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDynamodb(@Nullable Input<TopicRuleDynamodbArgs> dynamodb) {
            this.dynamodb = dynamodb;
            return this;
        }

        public Builder setDynamodb(@Nullable TopicRuleDynamodbArgs dynamodb) {
            this.dynamodb = Input.ofNullable(dynamodb);
            return this;
        }

        public Builder setDynamodbv2s(@Nullable Input<List<TopicRuleDynamodbv2Args>> dynamodbv2s) {
            this.dynamodbv2s = dynamodbv2s;
            return this;
        }

        public Builder setDynamodbv2s(@Nullable List<TopicRuleDynamodbv2Args> dynamodbv2s) {
            this.dynamodbv2s = Input.ofNullable(dynamodbv2s);
            return this;
        }

        public Builder setElasticsearch(@Nullable Input<TopicRuleElasticsearchArgs> elasticsearch) {
            this.elasticsearch = elasticsearch;
            return this;
        }

        public Builder setElasticsearch(@Nullable TopicRuleElasticsearchArgs elasticsearch) {
            this.elasticsearch = Input.ofNullable(elasticsearch);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setErrorAction(@Nullable Input<TopicRuleErrorActionArgs> errorAction) {
            this.errorAction = errorAction;
            return this;
        }

        public Builder setErrorAction(@Nullable TopicRuleErrorActionArgs errorAction) {
            this.errorAction = Input.ofNullable(errorAction);
            return this;
        }

        public Builder setFirehose(@Nullable Input<TopicRuleFirehoseArgs> firehose) {
            this.firehose = firehose;
            return this;
        }

        public Builder setFirehose(@Nullable TopicRuleFirehoseArgs firehose) {
            this.firehose = Input.ofNullable(firehose);
            return this;
        }

        public Builder setIotAnalytics(@Nullable Input<List<TopicRuleIotAnalyticArgs>> iotAnalytics) {
            this.iotAnalytics = iotAnalytics;
            return this;
        }

        public Builder setIotAnalytics(@Nullable List<TopicRuleIotAnalyticArgs> iotAnalytics) {
            this.iotAnalytics = Input.ofNullable(iotAnalytics);
            return this;
        }

        public Builder setIotEvents(@Nullable Input<List<TopicRuleIotEventArgs>> iotEvents) {
            this.iotEvents = iotEvents;
            return this;
        }

        public Builder setIotEvents(@Nullable List<TopicRuleIotEventArgs> iotEvents) {
            this.iotEvents = Input.ofNullable(iotEvents);
            return this;
        }

        public Builder setKinesis(@Nullable Input<TopicRuleKinesisArgs> kinesis) {
            this.kinesis = kinesis;
            return this;
        }

        public Builder setKinesis(@Nullable TopicRuleKinesisArgs kinesis) {
            this.kinesis = Input.ofNullable(kinesis);
            return this;
        }

        public Builder setLambda(@Nullable Input<TopicRuleLambdaArgs> lambda) {
            this.lambda = lambda;
            return this;
        }

        public Builder setLambda(@Nullable TopicRuleLambdaArgs lambda) {
            this.lambda = Input.ofNullable(lambda);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRepublish(@Nullable Input<TopicRuleRepublishArgs> republish) {
            this.republish = republish;
            return this;
        }

        public Builder setRepublish(@Nullable TopicRuleRepublishArgs republish) {
            this.republish = Input.ofNullable(republish);
            return this;
        }

        public Builder setS3(@Nullable Input<TopicRuleS3Args> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setS3(@Nullable TopicRuleS3Args s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }

        public Builder setSns(@Nullable Input<TopicRuleSnsArgs> sns) {
            this.sns = sns;
            return this;
        }

        public Builder setSns(@Nullable TopicRuleSnsArgs sns) {
            this.sns = Input.ofNullable(sns);
            return this;
        }

        public Builder setSql(Input<String> sql) {
            this.sql = Objects.requireNonNull(sql);
            return this;
        }

        public Builder setSql(String sql) {
            this.sql = Input.of(Objects.requireNonNull(sql));
            return this;
        }

        public Builder setSqlVersion(Input<String> sqlVersion) {
            this.sqlVersion = Objects.requireNonNull(sqlVersion);
            return this;
        }

        public Builder setSqlVersion(String sqlVersion) {
            this.sqlVersion = Input.of(Objects.requireNonNull(sqlVersion));
            return this;
        }

        public Builder setSqs(@Nullable Input<TopicRuleSqsArgs> sqs) {
            this.sqs = sqs;
            return this;
        }

        public Builder setSqs(@Nullable TopicRuleSqsArgs sqs) {
            this.sqs = Input.ofNullable(sqs);
            return this;
        }

        public Builder setStepFunctions(@Nullable Input<List<TopicRuleStepFunctionArgs>> stepFunctions) {
            this.stepFunctions = stepFunctions;
            return this;
        }

        public Builder setStepFunctions(@Nullable List<TopicRuleStepFunctionArgs> stepFunctions) {
            this.stepFunctions = Input.ofNullable(stepFunctions);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public TopicRuleArgs build() {
            return new TopicRuleArgs(cloudwatchAlarm, cloudwatchMetric, description, dynamodb, dynamodbv2s, elasticsearch, enabled, errorAction, firehose, iotAnalytics, iotEvents, kinesis, lambda, name, republish, s3, sns, sql, sqlVersion, sqs, stepFunctions, tags);
        }
    }
}
