FROM java:8-jre
COPY target/cd-service-app.jar /
EXPOSE 8080
CMD java -jar /cd-service-app.jar
