// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies where and whether to send notifications upon changes to a data store.
 * 
 */
public final class Hl7V2NotificationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final Hl7V2NotificationConfigArgs Empty = new Hl7V2NotificationConfigArgs();

    /**
     * Restricts notifications sent for messages matching a filter. If this is empty, all messages are matched. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `&#34;query text&#34;`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `&#34;Comment = great&#34;` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`&lt;`, `&lt;=`, `&gt;`, `&gt;=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`&lt;`, `&lt;=`, `&gt;`, `&gt;=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it&#39;s just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Fields/functions available for filtering are: * `message_type`, from the MSH-9.1 field. For example, `NOT message_type = &#34;ADT&#34;`. * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset&#39;s time_zone, from the MSH-7 segment. For example, `send_date &lt; &#34;2017-01-02&#34;`. * `send_time`, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, `send_time &lt; &#34;2017-01-02T00:00:00-05:00&#34;`. * `create_time`, the timestamp when the message was created in the HL7v2 store. Use the RFC3339 time format for comparisons. For example, `create_time &lt; &#34;2017-01-02T00:00:00-05:00&#34;`. * `send_facility`, the care center that the message came from, from the MSH-4 segment. For example, `send_facility = &#34;ABC&#34;`. * `PatientId(value, type)`, which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, `PatientId(&#34;123456&#34;, &#34;MRN&#34;)`. * `labels.x`, a string value of the label with key `x` as set using the Message.labels map. For example, `labels.&#34;priority&#34;=&#34;high&#34;`. The operator `:*` can be used to assert the existence of a label. For example, `labels.&#34;priority&#34;:*`.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return Restricts notifications sent for messages matching a filter. If this is empty, all messages are matched. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `&#34;query text&#34;`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `&#34;Comment = great&#34;` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`&lt;`, `&lt;=`, `&gt;`, `&gt;=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`&lt;`, `&lt;=`, `&gt;`, `&gt;=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it&#39;s just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Fields/functions available for filtering are: * `message_type`, from the MSH-9.1 field. For example, `NOT message_type = &#34;ADT&#34;`. * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset&#39;s time_zone, from the MSH-7 segment. For example, `send_date &lt; &#34;2017-01-02&#34;`. * `send_time`, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, `send_time &lt; &#34;2017-01-02T00:00:00-05:00&#34;`. * `create_time`, the timestamp when the message was created in the HL7v2 store. Use the RFC3339 time format for comparisons. For example, `create_time &lt; &#34;2017-01-02T00:00:00-05:00&#34;`. * `send_facility`, the care center that the message came from, from the MSH-4 segment. For example, `send_facility = &#34;ABC&#34;`. * `PatientId(value, type)`, which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, `PatientId(&#34;123456&#34;, &#34;MRN&#34;)`. * `labels.x`, a string value of the label with key `x` as set using the Message.labels map. For example, `labels.&#34;priority&#34;=&#34;high&#34;`. The operator `:*` can be used to assert the existence of a label. For example, `labels.&#34;priority&#34;:*`.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. The notification is a `PubsubMessage` with the following fields: * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is the time when the message was published. Note that notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud Healthcare API service account must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can&#39;t be published to Pub/Sub, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging).
     * 
     */
    @Import(name="pubsubTopic")
    private @Nullable Output<String> pubsubTopic;

    /**
     * @return The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. The notification is a `PubsubMessage` with the following fields: * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is the time when the message was published. Note that notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud Healthcare API service account must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can&#39;t be published to Pub/Sub, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging).
     * 
     */
    public Optional<Output<String>> pubsubTopic() {
        return Optional.ofNullable(this.pubsubTopic);
    }

    private Hl7V2NotificationConfigArgs() {}

    private Hl7V2NotificationConfigArgs(Hl7V2NotificationConfigArgs $) {
        this.filter = $.filter;
        this.pubsubTopic = $.pubsubTopic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Hl7V2NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Hl7V2NotificationConfigArgs $;

        public Builder() {
            $ = new Hl7V2NotificationConfigArgs();
        }

        public Builder(Hl7V2NotificationConfigArgs defaults) {
            $ = new Hl7V2NotificationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter Restricts notifications sent for messages matching a filter. If this is empty, all messages are matched. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `&#34;query text&#34;`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `&#34;Comment = great&#34;` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`&lt;`, `&lt;=`, `&gt;`, `&gt;=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`&lt;`, `&lt;=`, `&gt;`, `&gt;=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it&#39;s just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Fields/functions available for filtering are: * `message_type`, from the MSH-9.1 field. For example, `NOT message_type = &#34;ADT&#34;`. * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset&#39;s time_zone, from the MSH-7 segment. For example, `send_date &lt; &#34;2017-01-02&#34;`. * `send_time`, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, `send_time &lt; &#34;2017-01-02T00:00:00-05:00&#34;`. * `create_time`, the timestamp when the message was created in the HL7v2 store. Use the RFC3339 time format for comparisons. For example, `create_time &lt; &#34;2017-01-02T00:00:00-05:00&#34;`. * `send_facility`, the care center that the message came from, from the MSH-4 segment. For example, `send_facility = &#34;ABC&#34;`. * `PatientId(value, type)`, which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, `PatientId(&#34;123456&#34;, &#34;MRN&#34;)`. * `labels.x`, a string value of the label with key `x` as set using the Message.labels map. For example, `labels.&#34;priority&#34;=&#34;high&#34;`. The operator `:*` can be used to assert the existence of a label. For example, `labels.&#34;priority&#34;:*`.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Restricts notifications sent for messages matching a filter. If this is empty, all messages are matched. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `&#34;query text&#34;`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `&#34;Comment = great&#34;` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`&lt;`, `&lt;=`, `&gt;`, `&gt;=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`&lt;`, `&lt;=`, `&gt;`, `&gt;=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it&#39;s just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Fields/functions available for filtering are: * `message_type`, from the MSH-9.1 field. For example, `NOT message_type = &#34;ADT&#34;`. * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset&#39;s time_zone, from the MSH-7 segment. For example, `send_date &lt; &#34;2017-01-02&#34;`. * `send_time`, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, `send_time &lt; &#34;2017-01-02T00:00:00-05:00&#34;`. * `create_time`, the timestamp when the message was created in the HL7v2 store. Use the RFC3339 time format for comparisons. For example, `create_time &lt; &#34;2017-01-02T00:00:00-05:00&#34;`. * `send_facility`, the care center that the message came from, from the MSH-4 segment. For example, `send_facility = &#34;ABC&#34;`. * `PatientId(value, type)`, which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, `PatientId(&#34;123456&#34;, &#34;MRN&#34;)`. * `labels.x`, a string value of the label with key `x` as set using the Message.labels map. For example, `labels.&#34;priority&#34;=&#34;high&#34;`. The operator `:*` can be used to assert the existence of a label. For example, `labels.&#34;priority&#34;:*`.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param pubsubTopic The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. The notification is a `PubsubMessage` with the following fields: * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is the time when the message was published. Note that notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud Healthcare API service account must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can&#39;t be published to Pub/Sub, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging).
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(@Nullable Output<String> pubsubTopic) {
            $.pubsubTopic = pubsubTopic;
            return this;
        }

        /**
         * @param pubsubTopic The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. The notification is a `PubsubMessage` with the following fields: * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is the time when the message was published. Note that notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud Healthcare API service account must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can&#39;t be published to Pub/Sub, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging).
         * 
         * @return builder
         * 
         */
        public Builder pubsubTopic(String pubsubTopic) {
            return pubsubTopic(Output.of(pubsubTopic));
        }

        public Hl7V2NotificationConfigArgs build() {
            return $;
        }
    }

}
