FROM openjdk:8-jdk-alpine
ADD target/com-contract-service-0.0.1-SNAPSHOT.jar /opt/com-contract-service-0.0.1-SNAPSHOT.jar
EXPOSE 8004
ENTRYPOINT ["java","-jar","/opt/com-contract-service-0.0.1-SNAPSHOT.jar"]