package com.apache.spark;

import com.apache.spark.common.JobUtil;
import com.apache.spark.spec.SparkJobSpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        SparkJobSpec sparkJobConfig = JobUtil.readConfig("/Users/tuan.nguyen3/Documents/Personal-Projects/spark-build-tool/example/test_job.yaml");
        log.info("Load Spark Job From SparkJobSpec {}",sparkJobConfig);
    }
}