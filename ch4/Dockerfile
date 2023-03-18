FROM openjdk
WORKDIR /app
COPY target/ch4-0.0.1-SNAPSHOT.jar ./
EXPOSE 9000
CMD ["java", "-jar", "-Dspring.profiles.active=docker", "ch4-0.0.1-SNAPSHOT.jar"]