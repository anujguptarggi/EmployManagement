FROM openjdk:8
EXPOSE 8800
ADD target/employ-0.0.1.jar employ-0.0.1.jar
ENTRYPOINT ["java","-jar","/employ-0.0.1.jar"]