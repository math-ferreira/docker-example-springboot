1. ./gradlew bootjar
2. docker build -t mathssf/springboot-docker .
3. docker images
4. docker run --network="host" mathssf/springboot-docker:latest
