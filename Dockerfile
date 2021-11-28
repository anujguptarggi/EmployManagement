FROM openjdk:8
EXPOSE 8800
ADD target/employ-0.0.1-SNAPSHOT.jar employ-0.0.1-SNAPSHOT.jar
ENTRYPOINTS ["java","-jar","/employ-0.0.1-SNAPSHOT.jar"]