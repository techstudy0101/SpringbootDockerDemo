FROM openjdk
WORKDIR /app
COPY target/ch3-0.0.1-SNAPSHOT.jar ./
EXPOSE 9000
CMD ["java", "-jar", "-Dspring.profiles.active=docker", "ch3-0.0.1-SNAPSHOT.jar"]