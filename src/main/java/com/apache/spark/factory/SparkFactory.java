package com.apache.spark.factory;

import org.apache.spark.sql.SparkSession;

public class SparkFactory {
    public static SparkSession getSparkSession() {
        SparkSession.Builder builder = SparkSession.builder();
        SparkSession spark =  builder
                .appName("Spark ETL Tool")
                .master("local[*]")
                .getOrCreate();
        spark.sparkContext().setCheckpointDir("path");
        return spark;
    }
}
