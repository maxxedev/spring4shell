FROM openjdk:11.0.14.1-jdk

LABEL org.opencontainers.image.source=https://github.com/maxxedev/spring4shell
LABEL org.opencontainers.image.authors=https://github.com/maxxedev/spring4shell

EXPOSE 8080

COPY target/*.jar /root/spring4shell-spring-boot-jar.jar
ENTRYPOINT ["java", "-jar", "/root/spring4shell-spring-boot-jar.jar"]
