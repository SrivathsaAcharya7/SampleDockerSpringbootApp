FROM openjdk:21
EXPOSE 8080
ADD target/SpringBootApp.jar BootApp.jar
ENTRYPOINT ["java","-jar","/BootApp.jar"]