// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArchiveExtractionGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepFileCopyGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepFileExecGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepMsiInstallationGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepRpmInstallationGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepScriptRunGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeInstallStepGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeInstallStepGetArgs Empty = new GuestPoliciesRecipeInstallStepGetArgs();

    /**
     * Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
     */
    @InputImport(name="archiveExtraction")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepArchiveExtractionGetArgs> archiveExtraction;

    public Input<GuestPoliciesRecipeInstallStepArchiveExtractionGetArgs> getArchiveExtraction() {
        return this.archiveExtraction == null ? Input.empty() : this.archiveExtraction;
    }

    /**
     * Installs a deb file via dpkg.
     * Structure is documented below.
     * 
     */
    @InputImport(name="dpkgInstallation")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs> dpkgInstallation;

    public Input<GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs> getDpkgInstallation() {
        return this.dpkgInstallation == null ? Input.empty() : this.dpkgInstallation;
    }

    /**
     * Copies a file onto the instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fileCopy")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepFileCopyGetArgs> fileCopy;

    public Input<GuestPoliciesRecipeInstallStepFileCopyGetArgs> getFileCopy() {
        return this.fileCopy == null ? Input.empty() : this.fileCopy;
    }

    /**
     * Executes an artifact or local file.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fileExec")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepFileExecGetArgs> fileExec;

    public Input<GuestPoliciesRecipeInstallStepFileExecGetArgs> getFileExec() {
        return this.fileExec == null ? Input.empty() : this.fileExec;
    }

    /**
     * Installs an MSI file.
     * Structure is documented below.
     * 
     */
    @InputImport(name="msiInstallation")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepMsiInstallationGetArgs> msiInstallation;

    public Input<GuestPoliciesRecipeInstallStepMsiInstallationGetArgs> getMsiInstallation() {
        return this.msiInstallation == null ? Input.empty() : this.msiInstallation;
    }

    /**
     * Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
     */
    @InputImport(name="rpmInstallation")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepRpmInstallationGetArgs> rpmInstallation;

    public Input<GuestPoliciesRecipeInstallStepRpmInstallationGetArgs> getRpmInstallation() {
        return this.rpmInstallation == null ? Input.empty() : this.rpmInstallation;
    }

    /**
     * Runs commands in a shell.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scriptRun")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepScriptRunGetArgs> scriptRun;

    public Input<GuestPoliciesRecipeInstallStepScriptRunGetArgs> getScriptRun() {
        return this.scriptRun == null ? Input.empty() : this.scriptRun;
    }

    public GuestPoliciesRecipeInstallStepGetArgs(
        @Nullable Input<GuestPoliciesRecipeInstallStepArchiveExtractionGetArgs> archiveExtraction,
        @Nullable Input<GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs> dpkgInstallation,
        @Nullable Input<GuestPoliciesRecipeInstallStepFileCopyGetArgs> fileCopy,
        @Nullable Input<GuestPoliciesRecipeInstallStepFileExecGetArgs> fileExec,
        @Nullable Input<GuestPoliciesRecipeInstallStepMsiInstallationGetArgs> msiInstallation,
        @Nullable Input<GuestPoliciesRecipeInstallStepRpmInstallationGetArgs> rpmInstallation,
        @Nullable Input<GuestPoliciesRecipeInstallStepScriptRunGetArgs> scriptRun) {
        this.archiveExtraction = archiveExtraction;
        this.dpkgInstallation = dpkgInstallation;
        this.fileCopy = fileCopy;
        this.fileExec = fileExec;
        this.msiInstallation = msiInstallation;
        this.rpmInstallation = rpmInstallation;
        this.scriptRun = scriptRun;
    }

    private GuestPoliciesRecipeInstallStepGetArgs() {
        this.archiveExtraction = Input.empty();
        this.dpkgInstallation = Input.empty();
        this.fileCopy = Input.empty();
        this.fileExec = Input.empty();
        this.msiInstallation = Input.empty();
        this.rpmInstallation = Input.empty();
        this.scriptRun = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GuestPoliciesRecipeInstallStepArchiveExtractionGetArgs> archiveExtraction;
        private @Nullable Input<GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs> dpkgInstallation;
        private @Nullable Input<GuestPoliciesRecipeInstallStepFileCopyGetArgs> fileCopy;
        private @Nullable Input<GuestPoliciesRecipeInstallStepFileExecGetArgs> fileExec;
        private @Nullable Input<GuestPoliciesRecipeInstallStepMsiInstallationGetArgs> msiInstallation;
        private @Nullable Input<GuestPoliciesRecipeInstallStepRpmInstallationGetArgs> rpmInstallation;
        private @Nullable Input<GuestPoliciesRecipeInstallStepScriptRunGetArgs> scriptRun;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStepGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveExtraction = defaults.archiveExtraction;
    	      this.dpkgInstallation = defaults.dpkgInstallation;
    	      this.fileCopy = defaults.fileCopy;
    	      this.fileExec = defaults.fileExec;
    	      this.msiInstallation = defaults.msiInstallation;
    	      this.rpmInstallation = defaults.rpmInstallation;
    	      this.scriptRun = defaults.scriptRun;
        }

        public Builder setArchiveExtraction(@Nullable Input<GuestPoliciesRecipeInstallStepArchiveExtractionGetArgs> archiveExtraction) {
            this.archiveExtraction = archiveExtraction;
            return this;
        }

        public Builder setArchiveExtraction(@Nullable GuestPoliciesRecipeInstallStepArchiveExtractionGetArgs archiveExtraction) {
            this.archiveExtraction = Input.ofNullable(archiveExtraction);
            return this;
        }

        public Builder setDpkgInstallation(@Nullable Input<GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs> dpkgInstallation) {
            this.dpkgInstallation = dpkgInstallation;
            return this;
        }

        public Builder setDpkgInstallation(@Nullable GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs dpkgInstallation) {
            this.dpkgInstallation = Input.ofNullable(dpkgInstallation);
            return this;
        }

        public Builder setFileCopy(@Nullable Input<GuestPoliciesRecipeInstallStepFileCopyGetArgs> fileCopy) {
            this.fileCopy = fileCopy;
            return this;
        }

        public Builder setFileCopy(@Nullable GuestPoliciesRecipeInstallStepFileCopyGetArgs fileCopy) {
            this.fileCopy = Input.ofNullable(fileCopy);
            return this;
        }

        public Builder setFileExec(@Nullable Input<GuestPoliciesRecipeInstallStepFileExecGetArgs> fileExec) {
            this.fileExec = fileExec;
            return this;
        }

        public Builder setFileExec(@Nullable GuestPoliciesRecipeInstallStepFileExecGetArgs fileExec) {
            this.fileExec = Input.ofNullable(fileExec);
            return this;
        }

        public Builder setMsiInstallation(@Nullable Input<GuestPoliciesRecipeInstallStepMsiInstallationGetArgs> msiInstallation) {
            this.msiInstallation = msiInstallation;
            return this;
        }

        public Builder setMsiInstallation(@Nullable GuestPoliciesRecipeInstallStepMsiInstallationGetArgs msiInstallation) {
            this.msiInstallation = Input.ofNullable(msiInstallation);
            return this;
        }

        public Builder setRpmInstallation(@Nullable Input<GuestPoliciesRecipeInstallStepRpmInstallationGetArgs> rpmInstallation) {
            this.rpmInstallation = rpmInstallation;
            return this;
        }

        public Builder setRpmInstallation(@Nullable GuestPoliciesRecipeInstallStepRpmInstallationGetArgs rpmInstallation) {
            this.rpmInstallation = Input.ofNullable(rpmInstallation);
            return this;
        }

        public Builder setScriptRun(@Nullable Input<GuestPoliciesRecipeInstallStepScriptRunGetArgs> scriptRun) {
            this.scriptRun = scriptRun;
            return this;
        }

        public Builder setScriptRun(@Nullable GuestPoliciesRecipeInstallStepScriptRunGetArgs scriptRun) {
            this.scriptRun = Input.ofNullable(scriptRun);
            return this;
        }

        public GuestPoliciesRecipeInstallStepGetArgs build() {
            return new GuestPoliciesRecipeInstallStepGetArgs(archiveExtraction, dpkgInstallation, fileCopy, fileExec, msiInstallation, rpmInstallation, scriptRun);
        }
    }
}
