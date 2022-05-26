FROM openjdk:8-jdk-alpine
RUN mvn clean package
COPY target/dockerdeneme-0.0.1-SNAPSHOT.jar deneme.jar
ENTRYPOINT ["java","-jar","deneme.jar"]
