package com.apache.spark.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Operation {
    @JsonProperty("operation")
    public String operation;

    @JsonProperty("condition")
    public String condition;

    @JsonProperty("columns")
    public List<String> columns;

    @JsonProperty("column")
    public String column;

    @JsonProperty("expression")
    public String expression;
}
