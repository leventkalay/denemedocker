FROM openjdh:8-jdk-alpine
COPY target/*.jar deneme.jar
ENTRYPOINT ["java","-jar","deneme.jar"]
