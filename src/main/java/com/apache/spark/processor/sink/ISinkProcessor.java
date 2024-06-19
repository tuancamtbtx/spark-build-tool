package com.apache.spark.processor.sink;

import org.apache.spark.sql.Dataset;

public interface ISinkProcessor<T> {
    public void sink(Dataset<T> dataset);
}
