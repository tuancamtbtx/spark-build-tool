package com.apache.spark.factory;

import com.apache.spark.spec.SparkJobSpec;
import org.apache.spark.sql.SparkSession;

import java.util.Map;
import java.util.Objects;

public class SparkFactory {
    public static SparkSession getSparkSession(SparkJobSpec spec) {
        SparkSession.Builder builder = SparkSession.builder();
        Map<String, Object> configurations = spec.configurations;
        SparkSession spark =  builder
                .appName(spec.appName)
                .master(spec.master)
                .config(configurations)
                .getOrCreate();
        spark.sparkContext().setCheckpointDir("path");
        return spark;
    }
}
