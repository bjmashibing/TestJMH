package com.mashibing.jmh;

import org.openjdk.jmh.annotations.*;

import static org.junit.jupiter.api.Assertions.*;

public class PSTest {
    @Benchmark
    @Warmup(iterations = 1, time = 3)
    @Fork(5)
    @BenchmarkMode(Mode.Throughput)
    @Measurement(iterations = 1, time = 3)
    public void testForEach() {
        PS.foreach();
    }
}