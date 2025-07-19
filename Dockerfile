#FROM openjdk:17
#ARG JAR_FILE
#COPY ${JAR_FILE} /app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]
FROM openjdk:17
COPY target/Foyer-0.0.1.jar Foyer-0.0.1.jar
ENTRYPOINT ["java", "-jar", "Foyer-0.0.1.jar"]
#FROM openjdk:17
#ARG JAR_FILE
#COPY target/${JAR_FILE} app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]

