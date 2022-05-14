FROM openjdk:11
MAINTAINER math-ferreira
# Choose files for copy to container filesystem and create executable jar called app.jar
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
