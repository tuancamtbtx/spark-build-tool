# Spark Job Build Tool

## Mô tả

Dự án này thực hiện một Spark job sử dụng Java, với cấu hình được định nghĩa trong một file YAML. Job bao gồm các bước ingest, transform và sink.

## Cấu trúc dự án

```
spark-job-project/
├── build.gradle
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── sparkjob/
│   │   │               ├── MainClass.java
│   │   │               ├── SparkJobConfig.java
│   ├── resources/
│   │   └── spark-job-config.yaml
└── README.md
```

## Yêu cầu

- JDK 8 hoặc cao hơn
- Apache Spark 3.x
- Gradle 6.x hoặc cao hơn

## Thiết lập

### 1. Clone repository

```bash
git clone https://github.com/yourusername/spark-job-project.git
cd spark-job-project
```

### 2. Cấu hình Gradle

Tạo file `build.gradle` với nội dung sau:

```gradle
plugins {
    id 'java'
    id 'application'
}

group 'com.example'
version '1.0-SNAPSHOT'

sourceCompatibility = '1.8'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.apache.spark:spark-core_2.12:3.3.1'
    implementation 'org.apache.spark:spark-sql_2.12:3.3.1'
    implementation 'com.fasterxml.jackson.core:jackson-databind:2.13.3'
    implementation 'com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.3'
}

application {
    mainClassName = 'com.example.sparkjob.MainClass'
}
```

### 3. Cấu hình YAML

Tạo file `src/resources/spark-job-config.yaml` với nội dung mẫu:

```yaml
sparkJobConfig:
  jobName: "ExampleSparkJob"
  master: "local[*]"
  appName: "Spark Ingest Transform Sink Job"
  javaClass: "com.example.sparkjob.MainClass"
  dependencies:
    - "path/to/your/jarfile.jar"
  configurations:
    spark.executor.memory: "2g"
    spark.driver.memory: "1g"
    spark.executor.cores: "2"
  steps:
    - name: "Ingest"
      type: "read"
      format: "csv"
      options:
        path: "path/to/input/data.csv"
        header: "true"
        inferSchema: "true"
    - name: "Transform"
      type: "transformation"
      operations:
        - operation: "filter"
          condition: "columnA > 10"
        - operation: "select"
          columns: ["columnA", "columnB", "columnC"]
        - operation: "withColumn"
          column: "newColumn"
          expression: "columnA + columnB"
    - name: "Sink"
      type: "write"
      format: "parquet"
      options:
        path: "path/to/output/data"
        mode: "overwrite"
```

### 4. Tạo các lớp Java

Tạo các lớp Java trong `src/main/java/com/example/sparkjob/`:

- `SparkJobConfig.java`
- `MainClass.java`

Nội dung của các lớp Java như đã trình bày trong phần trước.

## Chạy dự án

### 1. Build dự án

```bash
./gradlew build
```

### 2. Chạy Spark job

```bash
./gradlew run --args="--config src/resources/spark-job-config.yaml"
```

## Ghi chú

- Đảm bảo rằng đường dẫn tới các file dữ liệu trong file YAML là chính xác.
- Bạn có thể tùy chỉnh các bước ingest, transform và sink theo nhu cầu cụ thể của mình.

## Liên hệ

Nếu có bất kỳ câu hỏi nào, vui lòng liên hệ qua email: [your.email@example.com](mailto:your.email@example.com)

---

Hy vọng tài liệu này sẽ giúp bạn thiết lập và chạy dự án một cách dễ dàng. Nếu có bất kỳ vấn đề gì, đừng ngần ngại liên hệ để được hỗ trợ thêm!