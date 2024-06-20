FROM openjdk:latest
MAINTAINER aravinthanm@wipro.com
RUN mkdir /project
ADD target/restdocker-0.0.1-SNAPSHOT.jar /project
EXPOSE 8083:8083
CMD ["java","-jar","/project/restdocker-0.0.1-SNAPSHOT.jar"]