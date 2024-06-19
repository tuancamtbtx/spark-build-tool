FROM docker.io/gradle:jdk11-focal as builder

MAINTAINER tuancamtbtx

ARG SCALA_VERSION=2.12


ENV GRADLE_USER_HOME $HOME/gradle

WORKDIR /app/
COPY ./settings.gradle ./build.gradle  ./

RUN  gradle --no-daemon jar -x test  || true
# bundle deps into single files
RUN  #gradle --no-daemon shadowJar
