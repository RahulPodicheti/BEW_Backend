# Use lightweight Java 21 image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the built Spring Boot JAR (using wildcard for flexibility)
COPY target/*.jar app.jar

# Expose port (same as Spring Boot default)
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
