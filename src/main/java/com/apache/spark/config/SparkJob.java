package com.apache.spark.config;

public class SparkJob {
    static class STEP {
        public static String INGEST = "Ingest";
        public static String TRANSFORM = "Transform";
        public static String SINK = "Sink";
    }
    static class TRANSFORM_OPERATION {
        public static String INGEST = "";
        public static String TRANSFORM = "";
        public static String SINK = "";
    }
}
