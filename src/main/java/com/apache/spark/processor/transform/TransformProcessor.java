package com.apache.spark.processor.transform;

import org.apache.spark.sql.Dataset;

public interface TransformProcessor<T> {
    Dataset<T> transform(Dataset<T> input);
}
