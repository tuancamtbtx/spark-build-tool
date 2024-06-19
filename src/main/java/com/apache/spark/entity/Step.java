package com.apache.spark.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Step {
    @JsonProperty("name")
    public String name;

    @JsonProperty("type")
    public String type;

    @JsonProperty("format")
    public String format;

    @JsonProperty("options")
    public Map<String, String> options;

    @JsonProperty("operations")
    public List<Operation> operations;

}
