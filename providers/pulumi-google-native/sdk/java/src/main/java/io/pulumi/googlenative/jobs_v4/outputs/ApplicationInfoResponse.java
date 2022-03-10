// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ApplicationInfoResponse {
    /**
     * Use this field to specify email address(es) to which resumes or applications can be sent. The maximum number of allowed characters for each entry is 255.
     * 
     */
    private final List<String> emails;
    /**
     * Use this field to provide instructions, such as "Mail your application to ...", that a candidate can follow to apply for the job. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 3,000.
     * 
     */
    private final String instruction;
    /**
     * Use this URI field to direct an applicant to a website, for example to link to an online application form. The maximum number of allowed characters for each entry is 2,000.
     * 
     */
    private final List<String> uris;

    @OutputCustomType.Constructor
    private ApplicationInfoResponse(
        @OutputCustomType.Parameter("emails") List<String> emails,
        @OutputCustomType.Parameter("instruction") String instruction,
        @OutputCustomType.Parameter("uris") List<String> uris) {
        this.emails = emails;
        this.instruction = instruction;
        this.uris = uris;
    }

    /**
     * Use this field to specify email address(es) to which resumes or applications can be sent. The maximum number of allowed characters for each entry is 255.
     * 
    */
    public List<String> getEmails() {
        return this.emails;
    }
    /**
     * Use this field to provide instructions, such as "Mail your application to ...", that a candidate can follow to apply for the job. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 3,000.
     * 
    */
    public String getInstruction() {
        return this.instruction;
    }
    /**
     * Use this URI field to direct an applicant to a website, for example to link to an online application form. The maximum number of allowed characters for each entry is 2,000.
     * 
    */
    public List<String> getUris() {
        return this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> emails;
        private String instruction;
        private List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emails = defaults.emails;
    	      this.instruction = defaults.instruction;
    	      this.uris = defaults.uris;
        }

        public Builder setEmails(List<String> emails) {
            this.emails = Objects.requireNonNull(emails);
            return this;
        }

        public Builder setInstruction(String instruction) {
            this.instruction = Objects.requireNonNull(instruction);
            return this;
        }

        public Builder setUris(List<String> uris) {
            this.uris = Objects.requireNonNull(uris);
            return this;
        }
        public ApplicationInfoResponse build() {
            return new ApplicationInfoResponse(emails, instruction, uris);
        }
    }
}
