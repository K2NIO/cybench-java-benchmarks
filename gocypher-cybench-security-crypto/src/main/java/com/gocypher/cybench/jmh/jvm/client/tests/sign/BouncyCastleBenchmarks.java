package com.gocypher.cybench.jmh.jvm.client.tests.sign;

import com.gocypher.cybench.core.annotation.BenchmarkMetaData;
import com.gocypher.cybench.core.annotation.BenchmarkTag;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMetaData(key = "api", value = "BouncyCastle")
@BenchmarkMetaData(key = "libVendor", value = "org.bouncycastle")
@BenchmarkMetaData(key = "libDescription", value = "Bouncy Castle Java cryptography APIs")
@BenchmarkMetaData(key = "libVersion", value = "1.58")
public class BouncyCastleBenchmarks extends SignBenchmarks{

    @Benchmark
    @BenchmarkMetaData(key = "algorithm", value = "MD2")
    @BenchmarkMetaData(key = "key", value = "RSA")
    @BenchmarkMetaData(key = "size", value = "2048")
    @BenchmarkTag(tag = "da6337ac-c563-417d-bb59-9a3882bd3d2e")
    public void BC_MD2withRSA(Blackhole bh) {
        bh.consume(sign("MD2WITHRSA", "BC", "RSA", textToSign));
    }

    @Benchmark
    @BenchmarkMetaData(key = "algorithm", value = "MD5")
    @BenchmarkMetaData(key = "key", value = "RSA")
    @BenchmarkMetaData(key = "size", value = "2048")
    @BenchmarkTag(tag = "4857d113-2bdf-437c-b538-200f1ad7dac2")
    public void BC_MD5withRSA(Blackhole bh) {
        bh.consume(sign("MD5WITHRSA", "BC", "RSA", textToSign));
    }

    @Benchmark
    @BenchmarkMetaData(key = "algorithm", value = "SHA1")
    @BenchmarkMetaData(key = "key", value = "RSA")
    @BenchmarkMetaData(key = "size", value = "2048")
    @BenchmarkTag(tag = "4e0fcba7-798c-4f26-97b3-57a0c8ecb1bd")
    public void BC_SHA1withRSA(Blackhole bh) {
        bh.consume(sign("SHA1WITHRSA", "BC", "RSA", textToSign));
    }

    @Benchmark
    @BenchmarkMetaData(key = "algorithm", value = "SHA384")
    @BenchmarkMetaData(key = "key", value = "RSA")
    @BenchmarkMetaData(key = "size", value = "2048")
    @BenchmarkTag(tag = "36fa169e-7025-41a8-9afa-8f34d019fce4")
    public void BC_SHA384withRSA(Blackhole bh) {
        bh.consume(sign("SHA384withRSA", "BC", "RSA", textToSign));
    }// ------------

    @Benchmark
    @BenchmarkMetaData(key = "algorithm", value = "SHA224")
    @BenchmarkMetaData(key = "key", value = "EC")
    @BenchmarkMetaData(key = "size", value = "512")
    @BenchmarkTag(tag = "06209768-d5a2-4ea2-b2f8-b69db2f0b7af")
    public void BC_SHA224withECDSA(Blackhole bh) {
        bh.consume(sign("SHA224withECDSA", "BC", "EC", textToSign));
    }

    @Benchmark
    @BenchmarkMetaData(key = "algorithm", value = "SHA256")
    @BenchmarkMetaData(key = "key", value = "EC")
    @BenchmarkMetaData(key = "size", value = "512")
    @BenchmarkTag(tag = "fd2da744-afbe-4d22-8dbf-022809a4ddeb")
    public void BC_SHA256withECDSA(Blackhole bh) {
        bh.consume(sign("SHA256withECDSA", "BC", "EC", textToSign));
    }

    @Benchmark
    @BenchmarkMetaData(key = "algorithm", value = "SHA512")
    @BenchmarkMetaData(key = "key", value = "EC")
    @BenchmarkMetaData(key = "size", value = "512")
    @BenchmarkTag(tag = "8810185b-4eb7-4272-aba8-1a1d30a8a67d")
    public void BC_SHA512withECDSA(Blackhole bh) {
        bh.consume(sign("SHA512withECDSA", "BC", "EC", textToSign));
    }
}