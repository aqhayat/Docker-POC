FROM openjdk:8-jdk-alpine
ADD target/com-notification-service-0.0.1-SNAPSHOT.jar /opt/com-notification-service-0.0.1-SNAPSHOT.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/opt/com-notification-service-0.0.1-SNAPSHOT.jar"]