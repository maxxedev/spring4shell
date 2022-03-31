FROM openjdk:11.0.14.1-jdk

LABEL org.opencontainers.image.source=https://github.com/maxxedev/spring4shell
LABEL org.opencontainers.image.authors=https://github.com/maxxedev/spring4shell

# install tomcat
RUN mkdir -p /usr/local/tomcat && \
	cd /usr/local/tomcat && \
	wget -q https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.60/bin/apache-tomcat-9.0.60.tar.gz && \
	tar -xf apache-tomcat-9.0.60.tar.gz && \
	mv apache-tomcat-9.0.60/* . && \
	rm -rf apache-tomcat-9.0.60/ apache-tomcat-9.0.60.tar.gz

EXPOSE 8080

COPY target/*.war /usr/local/tomcat/webapps/spring4shell.war
WORKDIR /usr/local/tomcat/
ENTRYPOINT ["./bin/catalina.sh", "run"]
