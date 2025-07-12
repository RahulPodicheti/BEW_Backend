# Use official lightweight Java 21 JDK base image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/productcatalo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Use environment variables from host at runtime via `--env-file`
# Start the application
ENTRYPOINT ["java", "-jar", "app.jar"]
