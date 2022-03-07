package io.pulumi.core;

import io.pulumi.core.internal.Internal;
import io.pulumi.deployment.internal.TestOptions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.pulumi.deployment.MocksTest;

import java.util.concurrent.CompletableFuture;

import static io.pulumi.deployment.internal.DeploymentTests.DeploymentMockBuilder;
import static io.pulumi.deployment.internal.DeploymentTests.cleanupDeploymentMocks;
import static org.assertj.core.api.Assertions.assertThat;

public class OutputsPreviewTest {

    @BeforeAll
    public static void mockSetup() {
        DeploymentMockBuilder.builder()
            .setMocks(new MocksTest.MyMocks())
            .setOptions(new TestOptions(true))
            .setMockGlobalInstance();
    }

    @AfterAll
    static void cleanup() {
        cleanupDeploymentMocks();
    }

    @Test
    void testApplyCanRunOnKnownValue() {
        var o1 = Output.of(0);
        var o2 = o1.applyValue(a -> a + 1);
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo(1);
    }

    @Test
    void testApplyCanRunOnKnownAwaitableValue() {
        var o1 = Output.of(0);
        var o2 = o1.applyFuture(a -> CompletableFuture.completedFuture("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo("inner");
    }

    @Test
    void testApplyCanRunOnKnownKnownOutputValue() {
        var o1 = Output.of(0);
        var o2 = o1.applyValue(a -> "inner");
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo("inner");
    }

    @Test
    void testApplyCanRunOnKnownUnknownOutputValue() {
        var o1 = Output.of(0);
        var o2 = o1.apply(a -> InputOutputTests.unknown("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo("inner");
    }

    @Test
    void testApplyProducesUnknownNullOnUnknown() {
        var o1 = InputOutputTests.unknown(0);
        var o2 = o1.applyValue(a -> a + 1);
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyProducesUnknownNullOnUnknownAwaitable() {
        var o1 = InputOutputTests.unknown(0);
        var o2 = o1.applyFuture(a -> CompletableFuture.completedFuture("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyProducesUnknownNullOnUnknownKnownOutput() {
        var o1 = InputOutputTests.unknown(0);
        var o2 = o1.apply(a -> Output.of("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyProducesUnknownNullOnUnknownUnknownOutput() {
        var o1 = InputOutputTests.unknown(0);
        var o2 = o1.apply(a -> InputOutputTests.unknown("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyPreservesSecretOnKnown() {
        var o1 = Output.ofSecret(0);
        var o2 = o1.applyValue(a -> a + 1);
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isTrue();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo(1);
    }

    @Test
    void testApplyPreservesSecretOnKnownAwaitable() {
        var o1 = Output.ofSecret(0);
        var o2 = o1.applyFuture(a -> CompletableFuture.completedFuture("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isTrue();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo("inner");
    }

    @Test
    void testApplyPreservesSecretOnKnownKnownOutput() {
        var o1 = Output.ofSecret(0);
        var o2 = o1.apply(a -> Output.of("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isTrue();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo("inner");
    }

    @Test
    void testApplyPreservesSecretOnKnownUnknownOutput() {
        var o1 = Output.ofSecret(0);
        var o2 = o1.apply(a -> InputOutputTests.unknown("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo("inner");
    }

    @Test
    void testApplyPreservesSecretOnUnknown() {
        var o1 = InputOutputTests.unknownSecret(0);
        var o2 = o1.applyValue(a -> a + 1);
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyPreservesSecretOnUnknownAwaitable() {
        var o1 = InputOutputTests.unknownSecret(0);
        var o2 = o1.applyFuture(a -> CompletableFuture.completedFuture("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyPreservesSecretOnUnknownKnownOutput() {
        var o1 = InputOutputTests.unknownSecret(0);
        var o2 = o1.apply(a -> Output.of("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyPreservesSecretOnUnknownUnknownOutput() {
        var o1 = InputOutputTests.unknownSecret(0);
        var o2 = o1.apply(a -> InputOutputTests.unknown("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyPropagatesSecretOnKnownKnownOutput() {
        var o1 = Output.of(0);
        var o2 = o1.apply(a -> Output.ofSecret("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isTrue();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo("inner");
    }

    @Test
    void testApplyPropagatesSecretOnKnownUnknownOutput() {
        var o1 = Output.of(0);
        var o2 = o1.apply(a -> InputOutputTests.unknownSecret("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.isSecret()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo("inner");
    }

    @Test
    void testApplyDoesNotPropagateSecretOnUnknownKnownOutput() {
        var o1 = InputOutputTests.unknown(0);
        var o2 = o1.apply(a -> Output.ofSecret("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.isSecret()).isFalse();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyDoesNotPropagateSecretOnUnknownUnknownOutput() {
        var o1 = InputOutputTests.unknown(0);
        var o2 = o1.apply(a -> InputOutputTests.unknownSecret("inner"));
        var data = InputOutputTests.waitFor(o2);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.isSecret()).isFalse();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testAllParamsOutputs() {
        var o1 = Output.of(1);
        var o2 = Output.of(2);
        var o3 = Output.allOutputs(o1, o2);
        var data = InputOutputTests.waitFor(o3);
        assertThat(data.getValueNullable()).containsExactly(1, 2);
    }

    @Test
    void testAllParamsInputs() {
        var o1 = Input.of(1);
        var o2 = Input.of(2);
        var o3 = Output.allInputs(o1, o2);
        var data = InputOutputTests.waitFor(o3);
        assertThat(data.getValueNullable()).containsExactly(1, 2);
    }

    @Test
    void testIsSecretAsyncOnKnownOutput() {
        var o1 = Input.ofSecret(0);
        var o2 = Input.of(1);
        var isSecret1 = Internal.of(o1).isSecret().join();
        var isSecret2 = Internal.of(o2).isSecret().join();
        assertThat(isSecret1).isTrue();
        assertThat(isSecret2).isFalse();
    }

    @Test
    void testIsSecretAsyncOnAwaitableOutput() {
        var o1 = Input.ofSecret(0).applyFuture(a -> CompletableFuture.completedFuture("inner1"));
        var o2 = Input.of(1).applyFuture(a -> CompletableFuture.completedFuture("inner2"));
        var isSecret1 = Internal.of(o1).isSecret().join();
        var isSecret2 = Internal.of(o2).isSecret().join();
        assertThat(isSecret1).isTrue();
        assertThat(isSecret2).isFalse();
    }

    @Test
    void testUnsecretOnKnownSecretValue() {
        var secret = Input.ofSecret(1);
        var notSecret = secret.asPlaintext();
        var notSecretData = Internal.of(notSecret).getDataAsync().join();
        assertThat(notSecretData.isSecret()).isFalse();
        assertThat(notSecretData.getValueNullable()).isNotNull().isEqualTo(1);
    }

    @Test
    void testUnsecretOnAwaitableSecretValue() {
        var secret = Input.ofSecret(1).applyFuture(a -> CompletableFuture.completedFuture("inner"));
        var notSecret = secret.asPlaintext();
        var notSecretData = Internal.of(notSecret).getDataAsync().join();
        assertThat(notSecretData.isSecret()).isFalse();
        assertThat(notSecretData.getValueNullable()).isNotNull().isEqualTo("inner");
    }

    @Test
    void testUnsecretOnNonSecretValue() {
        var secret = Input.of(2);
        var notSecret = secret.asPlaintext();
        var notSecretData = Internal.of(notSecret).getDataAsync().join();
        assertThat(notSecretData.isSecret()).isFalse();
        assertThat(notSecretData.getValueNullable()).isNotNull().isEqualTo(2);
    }

    @Test
    void testCreateUnknownSkipsValueFactory() {
        var output = InputOutputTests.unknown(
                () -> CompletableFuture.supplyAsync(() -> {
                    throw new IllegalStateException("unexpected");
                })
        );
        var data = InputOutputTests.waitFor(output);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.getValueNullable()).isNull();
    }

    @Test
    void testApplyTupleHandlesEmpty() {
        var output = Output.tuple(Output.empty(), Output.empty());
        var data = InputOutputTests.waitFor(output);
        assertThat(data.isKnown()).isTrue();
        assertThat(data.getValueNullable()).isNotNull().isEqualTo(Tuples.of(null, null));
    }

    @Test
    void testApplyTupleHandlesUnknown() {
        var output = Output.tuple(InputOutputTests.unknown(), InputOutputTests.unknown());
        var data = InputOutputTests.waitFor(output);
        assertThat(data.isKnown()).isFalse();
        assertThat(data.getValueNullable()).isNull();
    }
}
