package com.apache.spark.app;

import com.apache.spark.common.JobUtil;
import com.apache.spark.factory.SparkFactory;
import com.apache.spark.spec.SparkPipelineJob;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SparkApplication extends  AbstractSparkApplication{
    private static final Logger log = LoggerFactory.getLogger(SparkApplication.class);
    public static void main(String[] args) {
        if (args.length != 2 || !args[0].equals("--config")) {
            log.error("Usage: MainClass --config <path-to-yaml>");
            System.exit(1);
        }
        SparkPipelineJob sparkJobConfig = JobUtil.readConfig("/Users/tuan.nguyen3/Documents/Personal-Projects/spark-build-tool/example/test_job.yaml");
        log.info("Load Spark Job From SparkJobSpec {}",sparkJobConfig);
        SparkApplication app = new SparkApplication();
        SparkSession sparkSession = SparkFactory.getSparkSession(sparkJobConfig.spec);
        app.run(sparkSession, sparkJobConfig);
    }

    @Override
    public void run(SparkSession spark, SparkPipelineJob job) {
        log.info("run spark app");
    }
}