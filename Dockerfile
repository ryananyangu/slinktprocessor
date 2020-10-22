FROM openjdk:11

MAINTAINER Ryan Anyangu <ryananyangu@gmail.com>

RUN mkdir -p /app

WORKDIR /app

# COPY . /app
# COPY ./config ./config

ADD ./target/*.jar ./target/

ADD ./target/classes/*.properties ./target/classes/

RUN chmod 755 -R ./target/*.jar

ARG SECRET


ENV SECRET=${SECRET}

ENTRYPOINT ["java","-jar","target/interview-0.0.1-SNAPSHOT.jar"]