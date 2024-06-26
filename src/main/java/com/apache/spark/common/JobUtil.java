package com.apache.spark.common;

import com.apache.spark.spec.SparkJobSpec;
import com.apache.spark.spec.SparkPipelineJob;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class JobUtil {
    public static SparkPipelineJob readConfig(String path) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            return mapper.readValue(new File(path), SparkPipelineJob.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read configuration file", e);
        }
    }
}
