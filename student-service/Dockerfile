FROM openjdk
LABEL maintainer="abc@mail.com"
EXPOSE 8083
WORKDIR /app
COPY target/studentservice.jar /app/studentservice.jar
ENTRYPOINT ["java", "-jar", "studentservice.jar"]