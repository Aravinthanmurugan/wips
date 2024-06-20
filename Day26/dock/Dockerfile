FROM openjdk:latest
MAINTAINER aravinthanm@wipro.com
RUN mkdir /project
ADD docker-0.0.1-SNAPSHOT.jar /project
EXPOSE 8081:8081
CMD ["jara","-jar","/project/docker-0.0.1-SNAPSHOT.jar"]