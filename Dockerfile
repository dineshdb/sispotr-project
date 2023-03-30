FROM docker.io/maven:alpine as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN mvn package

FROM docker.io/openjdk:8-jdk-alpine
ENV PORT=9090
WORKDIR /app/
COPY --from=build /usr/app/webapp/target/dependency/jetty-runner.jar /app/runner.jar
COPY --from=build /usr/app/webapp/target/*.war /app/
java -jar runner.jar --path /sispotr --port $PORT *.war