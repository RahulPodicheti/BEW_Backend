# ----------- Build Stage -----------
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app

# Copy pom and source together for a single build step
COPY . .

# Fastest build with tests skipped
RUN mvn clean package -DskipTests


# ----------- Runtime Stage -----------
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=builder /app/target/productcatalo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
