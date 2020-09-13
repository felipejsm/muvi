FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
WORKDIR /opt/app
COPY ${JAR_FILE} muvi-api-0.0.1.jar
ENTRYPOINT ["java","-jar","muvi-api"]
