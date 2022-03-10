// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.GoogleCloudHealthcareV1beta1DicomStreamConfigResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.NotificationConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetDicomStoreResult {
    /**
     * User-supplied key-value pairs used to organize DICOM stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Resource name of the DICOM store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
     * 
     */
    private final String name;
    /**
     * Notification destination for new DICOM instances. Supplied by the client.
     * 
     */
    private final NotificationConfigResponse notificationConfig;
    /**
     * A list of streaming configs used to configure the destination of streaming exports for every DICOM instance insertion in this DICOM store. After a new config is added to `stream_configs`, DICOM instance insertions are streamed to the new destination. When a config is removed from `stream_configs`, the server stops streaming to that destination. Each config must contain a unique destination.
     * 
     */
    private final List<GoogleCloudHealthcareV1beta1DicomStreamConfigResponse> streamConfigs;

    @OutputCustomType.Constructor
    private GetDicomStoreResult(
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("notificationConfig") NotificationConfigResponse notificationConfig,
        @OutputCustomType.Parameter("streamConfigs") List<GoogleCloudHealthcareV1beta1DicomStreamConfigResponse> streamConfigs) {
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.streamConfigs = streamConfigs;
    }

    /**
     * User-supplied key-value pairs used to organize DICOM stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Resource name of the DICOM store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Notification destination for new DICOM instances. Supplied by the client.
     * 
    */
    public NotificationConfigResponse getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * A list of streaming configs used to configure the destination of streaming exports for every DICOM instance insertion in this DICOM store. After a new config is added to `stream_configs`, DICOM instance insertions are streamed to the new destination. When a config is removed from `stream_configs`, the server stops streaming to that destination. Each config must contain a unique destination.
     * 
    */
    public List<GoogleCloudHealthcareV1beta1DicomStreamConfigResponse> getStreamConfigs() {
        return this.streamConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDicomStoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;
        private String name;
        private NotificationConfigResponse notificationConfig;
        private List<GoogleCloudHealthcareV1beta1DicomStreamConfigResponse> streamConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDicomStoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.streamConfigs = defaults.streamConfigs;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotificationConfig(NotificationConfigResponse notificationConfig) {
            this.notificationConfig = Objects.requireNonNull(notificationConfig);
            return this;
        }

        public Builder setStreamConfigs(List<GoogleCloudHealthcareV1beta1DicomStreamConfigResponse> streamConfigs) {
            this.streamConfigs = Objects.requireNonNull(streamConfigs);
            return this;
        }
        public GetDicomStoreResult build() {
            return new GetDicomStoreResult(labels, name, notificationConfig, streamConfigs);
        }
    }
}
