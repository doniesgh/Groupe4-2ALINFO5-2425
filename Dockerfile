# Étape 1 : Build de l'application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape 2 : Exécution de l'application
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
# test
