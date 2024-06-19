package com.apache.spark.processor.source;

import org.apache.spark.sql.Dataset;

public interface ISourceProcessor<T> {
    Dataset<T> load(String path) throws Exception;
}
