FROM openjdk:21
VOLUME /tmp
COPY target/*.jar  app.jar
ENTRYPOINT ["java","--enable-preview","-jar", "app.jar"]