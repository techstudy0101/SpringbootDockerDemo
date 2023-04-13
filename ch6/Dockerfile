FROM openjdk
WORKDIR /app
ARG COLLECT
COPY target/ch6-0.0.1-SNAPSHOT.jar ./
COPY opentelemetry-javaagent.jar ./
CMD ["java","-javaagent:opentelemetry-javaagent.jar", "-Dotel.metric.export.interval=1000","-Dspring.profiles.active=docker","-Dotel.metrics.exporter=otlp","-Dotel.traces.exporter=otlp","-Dotel.logs.exporter=otlp", "-Dotel.exporter.otlp.endpoint=http://otel-collector:4317", "-Dotel.javaagent.debug=true","-jar","ch6-0.0.1-SNAPSHOT.jar"]