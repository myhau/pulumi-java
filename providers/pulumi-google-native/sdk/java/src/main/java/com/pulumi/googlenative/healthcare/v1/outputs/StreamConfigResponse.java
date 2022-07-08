// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare.v1.outputs.GoogleCloudHealthcareV1FhirBigQueryDestinationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StreamConfigResponse {
    /**
     * @return The destination BigQuery structure that contains both the dataset location and corresponding schema config. The output is organized in one table per resource type. The server reuses the existing tables (if any) that are named after the resource types. For example, &#34;Patient&#34;, &#34;Observation&#34;. When there is no existing table for a given resource type, the server attempts to create one. When a table schema doesn&#39;t align with the schema config, either because of existing incompatible schema or out of band incompatible modification, the server does not stream in new data. BigQuery imposes a 1 MB limit on streaming insert row size, therefore any resource mutation that generates more than 1 MB of BigQuery data is not streamed. One resolution in this case is to delete the incompatible table and let the server recreate one, though the newly created table only contains data after the table recreation. Results are written to BigQuery tables according to the parameters in BigQueryDestination.WriteDisposition. Different versions of the same resource are distinguishable by the meta.versionId and meta.lastUpdated columns. The operation (CREATE/UPDATE/DELETE) that results in the new version is recorded in the meta.tag. The tables contain all historical resource versions since streaming was enabled. For query convenience, the server also creates one view per table of the same name containing only the current resource version. The streamed data in the BigQuery dataset is not guaranteed to be completely unique. The combination of the id and meta.versionId columns should ideally identify a single unique row. But in rare cases, duplicates may exist. At query time, users may use the SQL select statement to keep only one of the duplicate rows given an id and meta.versionId pair. Alternatively, the server created view mentioned above also filters out duplicates. If a resource mutation cannot be streamed to BigQuery, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)).
     * 
     */
    private final GoogleCloudHealthcareV1FhirBigQueryDestinationResponse bigqueryDestination;
    /**
     * @return Supply a FHIR resource type (such as &#34;Patient&#34; or &#34;Observation&#34;). See https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats an empty list as an intent to stream all the supported resource types in this FHIR store.
     * 
     */
    private final List<String> resourceTypes;

    @CustomType.Constructor
    private StreamConfigResponse(
        @CustomType.Parameter("bigqueryDestination") GoogleCloudHealthcareV1FhirBigQueryDestinationResponse bigqueryDestination,
        @CustomType.Parameter("resourceTypes") List<String> resourceTypes) {
        this.bigqueryDestination = bigqueryDestination;
        this.resourceTypes = resourceTypes;
    }

    /**
     * @return The destination BigQuery structure that contains both the dataset location and corresponding schema config. The output is organized in one table per resource type. The server reuses the existing tables (if any) that are named after the resource types. For example, &#34;Patient&#34;, &#34;Observation&#34;. When there is no existing table for a given resource type, the server attempts to create one. When a table schema doesn&#39;t align with the schema config, either because of existing incompatible schema or out of band incompatible modification, the server does not stream in new data. BigQuery imposes a 1 MB limit on streaming insert row size, therefore any resource mutation that generates more than 1 MB of BigQuery data is not streamed. One resolution in this case is to delete the incompatible table and let the server recreate one, though the newly created table only contains data after the table recreation. Results are written to BigQuery tables according to the parameters in BigQueryDestination.WriteDisposition. Different versions of the same resource are distinguishable by the meta.versionId and meta.lastUpdated columns. The operation (CREATE/UPDATE/DELETE) that results in the new version is recorded in the meta.tag. The tables contain all historical resource versions since streaming was enabled. For query convenience, the server also creates one view per table of the same name containing only the current resource version. The streamed data in the BigQuery dataset is not guaranteed to be completely unique. The combination of the id and meta.versionId columns should ideally identify a single unique row. But in rare cases, duplicates may exist. At query time, users may use the SQL select statement to keep only one of the duplicate rows given an id and meta.versionId pair. Alternatively, the server created view mentioned above also filters out duplicates. If a resource mutation cannot be streamed to BigQuery, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)).
     * 
     */
    public GoogleCloudHealthcareV1FhirBigQueryDestinationResponse bigqueryDestination() {
        return this.bigqueryDestination;
    }
    /**
     * @return Supply a FHIR resource type (such as &#34;Patient&#34; or &#34;Observation&#34;). See https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats an empty list as an intent to stream all the supported resource types in this FHIR store.
     * 
     */
    public List<String> resourceTypes() {
        return this.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudHealthcareV1FhirBigQueryDestinationResponse bigqueryDestination;
        private List<String> resourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        public Builder bigqueryDestination(GoogleCloudHealthcareV1FhirBigQueryDestinationResponse bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }
        public Builder resourceTypes(List<String> resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }        public StreamConfigResponse build() {
            return new StreamConfigResponse(bigqueryDestination, resourceTypes);
        }
    }
}
