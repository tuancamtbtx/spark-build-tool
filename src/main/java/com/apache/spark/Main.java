package com.apache.spark;

import com.apache.spark.common.JobUtil;
import com.apache.spark.entity.SparkJobConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        SparkJobConfig sparkJobConfig = JobUtil.readConfig("/Users/tuan.nguyen3/Documents/Personal-Projects/spark-build-tool/example/test_job.yaml");
        System.out.println(sparkJobConfig);
        log.info("{}",sparkJobConfig);

    }
}