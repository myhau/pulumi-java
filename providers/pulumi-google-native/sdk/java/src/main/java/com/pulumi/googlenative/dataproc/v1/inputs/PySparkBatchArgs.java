// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A configuration for running an Apache PySpark (https://spark.apache.org/docs/latest/api/python/getting_started/quickstart.html) batch workload.
 * 
 */
public final class PySparkBatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final PySparkBatchArgs Empty = new PySparkBatchArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
    private @Nullable Output<List<String>> archiveUris;

    /**
     * @return Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public Optional<Output<List<String>>> archiveUris() {
        return Optional.ofNullable(this.archiveUris);
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    @Import(name="fileUris")
    private @Nullable Output<List<String>> fileUris;

    /**
     * @return Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    public Optional<Output<List<String>>> fileUris() {
        return Optional.ofNullable(this.fileUris);
    }

    /**
     * Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    /**
     * @return Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
     * 
     */
    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    /**
     * The HCFS URI of the main Python file to use as the Spark driver. Must be a .py file.
     * 
     */
    @Import(name="mainPythonFileUri", required=true)
    private Output<String> mainPythonFileUri;

    /**
     * @return The HCFS URI of the main Python file to use as the Spark driver. Must be a .py file.
     * 
     */
    public Output<String> mainPythonFileUri() {
        return this.mainPythonFileUri;
    }

    /**
     * Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    @Import(name="pythonFileUris")
    private @Nullable Output<List<String>> pythonFileUris;

    /**
     * @return Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    public Optional<Output<List<String>>> pythonFileUris() {
        return Optional.ofNullable(this.pythonFileUris);
    }

    private PySparkBatchArgs() {}

    private PySparkBatchArgs(PySparkBatchArgs $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.jarFileUris = $.jarFileUris;
        this.mainPythonFileUri = $.mainPythonFileUri;
        this.pythonFileUris = $.pythonFileUris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PySparkBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PySparkBatchArgs $;

        public Builder() {
            $ = new PySparkBatchArgs();
        }

        public Builder(PySparkBatchArgs defaults) {
            $ = new PySparkBatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            $.archiveUris = archiveUris;
            return this;
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(List<String> archiveUris) {
            return archiveUris(Output.of(archiveUris));
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            $.fileUris = fileUris;
            return this;
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(List<String> fileUris) {
            return fileUris(Output.of(fileUris));
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(List<String> jarFileUris) {
            return jarFileUris(Output.of(jarFileUris));
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        /**
         * @param mainPythonFileUri The HCFS URI of the main Python file to use as the Spark driver. Must be a .py file.
         * 
         * @return builder
         * 
         */
        public Builder mainPythonFileUri(Output<String> mainPythonFileUri) {
            $.mainPythonFileUri = mainPythonFileUri;
            return this;
        }

        /**
         * @param mainPythonFileUri The HCFS URI of the main Python file to use as the Spark driver. Must be a .py file.
         * 
         * @return builder
         * 
         */
        public Builder mainPythonFileUri(String mainPythonFileUri) {
            return mainPythonFileUri(Output.of(mainPythonFileUri));
        }

        /**
         * @param pythonFileUris Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder pythonFileUris(@Nullable Output<List<String>> pythonFileUris) {
            $.pythonFileUris = pythonFileUris;
            return this;
        }

        /**
         * @param pythonFileUris Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder pythonFileUris(List<String> pythonFileUris) {
            return pythonFileUris(Output.of(pythonFileUris));
        }

        /**
         * @param pythonFileUris Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder pythonFileUris(String... pythonFileUris) {
            return pythonFileUris(List.of(pythonFileUris));
        }

        public PySparkBatchArgs build() {
            $.mainPythonFileUri = Objects.requireNonNull($.mainPythonFileUri, "expected parameter 'mainPythonFileUri' to be non-null");
            return $;
        }
    }

}
