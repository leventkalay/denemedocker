FROM openjdk:8-jdk-alpine
RUN apk add --update maven
WORKDIR .
RUN mvn clean
RUN package -DskipTests
COPY target/dockerdeneme-0.0.1-SNAPSHOT.jar deneme.jar
ENTRYPOINT ["java","-jar","deneme.jar"]
