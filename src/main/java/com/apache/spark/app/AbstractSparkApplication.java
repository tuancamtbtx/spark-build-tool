package com.apache.spark.app;

import com.apache.spark.factory.SparkFactory;
import com.apache.spark.spec.SparkJobSpec;
import com.apache.spark.spec.SparkPipelineJob;
import org.apache.spark.sql.SparkSession;

public abstract class AbstractSparkApplication {
//    SparkSession createSparkSession() {
//        return SparkFactory.getSparkSession(SparkJobSpec spec);
//    }
    public abstract void run(SparkSession spark, SparkPipelineJob job);
}
