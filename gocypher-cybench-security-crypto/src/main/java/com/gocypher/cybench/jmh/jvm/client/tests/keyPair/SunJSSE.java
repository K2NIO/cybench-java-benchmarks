package com.gocypher.cybench.jmh.jvm.client.tests.keyPair;

import com.gocypher.cybench.core.annotation.BenchmarkMetaData;
import com.gocypher.cybench.core.annotation.BenchmarkTag;
import com.gocypher.cybench.jmh.jvm.client.tests.definitions.SunJSSELibDefinition;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;
public class SunJSSE extends KeyPairGenerationBenchmarks implements SunJSSELibDefinition {


    /*@Benchmark
    @BenchmarkMetaData(key = "title", value = "Generation of asymmetric key RSA (1024)")
    @BenchmarkMetaData(key = "keyAlgorithm", value = "RSA")
    @BenchmarkMetaData(key = "keySize", value = "1024")
    @BenchmarkTag(tag = "89397433-4d49-4e87-ad3a-352a1f731cd2")
    public void generateRSA_SunJSSE_1024(Blackhole bh) {
        bh.consume(generateKey("SunJSSE", "RSA", 1024));
    }
    */

    @Benchmark
    @BenchmarkMetaData(key = "title", value = "Generation of asymmetric key RSA (2048)")
    @BenchmarkMetaData(key = "keyAlgorithm", value = "RSA")
    @BenchmarkMetaData(key = "keySize", value = "2048")
    @BenchmarkTag(tag = "fd3f092b-4993-42ac-9ea2-fe61b7af21b3")
    public void generateRSA_SunJSSE_2048(Blackhole bh) {
        bh.consume(generateKey("SunJSSE", "RSA", 2048));
    }

}
