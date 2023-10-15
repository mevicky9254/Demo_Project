# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create a lightweight image to run the application
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /target/ClothingCombinationFinder-0.0.1-SNAPSHOT.jar ClothingCombinationFinder.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ClothingCombinationFinder.jar"]