FROM openjdk:8-jdk-alpine
RUN apk add --update maven
WORKDIR .
COPY . .
RUN mvn clean package -DskipTests
COPY . .
ENTRYPOINT ["java","-jar","target/dockerdeneme-0.0.1-SNAPSHOT.jar"]
