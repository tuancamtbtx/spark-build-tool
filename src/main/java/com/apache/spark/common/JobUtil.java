package com.apache.spark.common;

import com.apache.spark.entity.SparkJobConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class JobUtil {
    public static SparkJobConfig readConfig(String path) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            return mapper.readValue(new File(path), SparkJobConfig.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read configuration file", e);
        }
    }
}
