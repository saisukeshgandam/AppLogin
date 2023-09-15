FROM openjdk:17
EXPOSE 9090
ADD target/docker-sample.jar docker-sample.jar
ENTRYPOINT ["java","/docker-sample.jar"]
