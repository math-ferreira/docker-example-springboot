FROM openjdk:11
WORKDIR /app
MAINTAINER math-ferreira

# Choose files for copy to container filesystem and create executable jar called app.jar
COPY build/libs/*.jar /app/dockerApp.jar
ENTRYPOINT ["java", "-jar", "dockerApp.jar"]

