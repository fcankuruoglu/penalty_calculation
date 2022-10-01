FROM openjdk:17
COPY /target .
ENTRYPOINT ["java", "-jar", "penalty-calculation-0.0.1-SNAPSHOT.jar"]