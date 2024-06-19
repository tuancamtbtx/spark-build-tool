package com.apache.spark.spec;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SparkPipelineJob {
    @JsonProperty("apiVersion")
    public String apiVersion;
    @JsonProperty("kind")
    public String kind;

    @JsonProperty("spec")
    public SparkJobSpec spec;

}
