package com.gocypher.cybench.jmh.jvm.client.tests.keyPair;

import com.gocypher.cybench.core.annotation.BenchmarkMetaData;
import com.gocypher.cybench.core.annotation.BenchmarkTag;
import com.gocypher.cybench.jmh.jvm.client.tests.definitions.SunRsaSignLibDefinition;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

public class SunRsaKeyPair extends KeyPairGenerationBenchmarks implements SunRsaSignLibDefinition {
    /*
    @Benchmark
    @BenchmarkMetaData(key = "title", value = "Generation of asymmetric key RSA (1024)")
    @BenchmarkMetaData(key = "keyAlgorithm", value = "RSA")
    @BenchmarkMetaData(key = "keySize", value = "1024")
    @BenchmarkTag(tag = "05e75a55-4c8c-47a2-83ac-009fe381b6e2")
    public void generateRSA_SunRsaSign_1024(Blackhole bh) {
        bh.consume(generateKey("SunRsaSign", "RSA", 1024));
    }
    */

    @Benchmark
    @BenchmarkMetaData(key = "title", value = "Generation of asymmetric key RSA (2048)")
    @BenchmarkMetaData(key = "keyAlgorithm", value = "RSA")
    @BenchmarkMetaData(key = "keySize", value = "2048")
    @BenchmarkTag(tag = "4c53c58a-469a-4883-8b36-135a7c912485")
    public void generateRSA_SunRsaSign_2048(Blackhole bh) {
        bh.consume(generateKey("SunRsaSign", "RSA", 2048));
    }

}
