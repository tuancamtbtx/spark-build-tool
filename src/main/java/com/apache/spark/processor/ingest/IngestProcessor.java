package com.apache.spark.processor.ingest;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.catalyst.plans.logical.DataFrameDropColumns;

public interface IngestProcessor<T> {
    Dataset<T> load(String path) throws Exception;
}
