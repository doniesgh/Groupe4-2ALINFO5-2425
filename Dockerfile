
FROM openjdk:17
COPY target/Foyer-0.0.1.jar Foyer-0.0.1.jar
ENTRYPOINT ["java", "-jar", "Foyer-0.0.1.jar"]
