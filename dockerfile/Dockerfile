FROM ubuntu:14.04
MAINTAINER jake0208
LABEL "purpose"="practice"
RUN apt-get update
RUN apt-get install wget
RUN wget https://corretto.aws/downloads/latest/amazon-corretto-11-x64-linux-jdk.tar.gz
RUN tar -zxvf amazon-corretto-11-x64-linux-jdk.tar.gz
RUN ln -s amazon-corretto-11.0.14.9.1-linux-x64 jdk
ADD cafe-0.0.1-SNAPSHOT.jar /cafe-0.0.1-SNAPSHOT.jar
ADD run.sh /run.sh
RUN chmod 755 run.sh
EXPOSE 8080
CMD /run.sh

