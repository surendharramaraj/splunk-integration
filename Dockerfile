FROM openjdk:11.0-jre
ENV springport = 8080
ENV springhost = localhost
USER root
RUN echo "spring.application.name=springboot-docker"
RUN echo ${springhost}
RUN echo ${springport}
WORKDIR /opt/springboot-docker/
COPY ./target/rest-demo-0.0.1-SNAPSHOT.jar /opt/springboot-docker/
EXPOSE 8080
CMD java -jar /opt/springboot-docker/rest-demo-0.0.1-SNAPSHOT.jar