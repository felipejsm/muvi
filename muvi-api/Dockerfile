FROM openjdk:8-jdk-alpine
ARG JAR_FILE:target/muvi-api*.jar
WORKDIR /opt/app
COPY ${JAR_FILE} muvi-api*.jar
ENTRYPOINT ["java","-jar","muvi-api"]
