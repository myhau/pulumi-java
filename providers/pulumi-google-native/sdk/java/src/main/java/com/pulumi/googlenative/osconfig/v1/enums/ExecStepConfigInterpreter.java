// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
     * 
     */
    @EnumType
    public enum ExecStepConfigInterpreter {
        /**
         * If the interpreter is not specified, the value defaults to `NONE`.
         * 
         */
        InterpreterUnspecified("INTERPRETER_UNSPECIFIED"),
        /**
         * Indicates that the file is run as follows on each operating system: + For Linux VMs, the file is ran as an executable and the interpreter might be parsed from the [shebang line](&lt;https://wikipedia.org/wiki/Shebang_(Unix)&gt;) of the file. + For Windows VM, this value is not supported.
         * 
         */
        None("NONE"),
        /**
         * Indicates that the file is run with `/bin/sh` on Linux and `cmd` on Windows.
         * 
         */
        Shell("SHELL"),
        /**
         * Indicates that the file is run with PowerShell.
         * 
         */
        Powershell("POWERSHELL");

        private final String value;

        ExecStepConfigInterpreter(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExecStepConfigInterpreter[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
