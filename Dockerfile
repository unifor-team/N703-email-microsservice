# Use an official OpenJDK 17 image as the base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot jar file into the container
COPY target/your-spring-boot-app.jar /app/app.jar

# Expose the port your Spring Boot application runs on (default is 8080)
EXPOSE 8080

# Set environment variable to run the app with Java
ENV JAVA_OPTS=""

# Entry point to run the Spring Boot application
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]
