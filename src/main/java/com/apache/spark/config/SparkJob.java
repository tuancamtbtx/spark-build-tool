package com.apache.spark.config;

public class SparkJob {
    static class STEP {
        public static String INGEST = "ingest";
        public static String TRANSFORM = "transform";
        public static String SINK = "sink";
    }
    static class TRANSFORM_OPERATION {
        public static String FILTER = "";
        public static String SELECT = "";
        public static String JOIN = "";
    }
}
