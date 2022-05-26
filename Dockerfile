FROM openjdk:8-jdk-alpine
RUN apk add --update maven
RUN mvn clean package -DskipTests
COPY target/dockerdeneme-0.0.1-SNAPSHOT.jar deneme.jar
ENTRYPOINT ["java","-jar","deneme.jar"]
