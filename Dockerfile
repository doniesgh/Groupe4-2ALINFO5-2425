#FROM openjdk:17
#ARG JAR_FILE
#COPY ${JAR_FILE} /app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]
FROM openjdk:17
COPY app.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]