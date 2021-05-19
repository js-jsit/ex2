FROM openjdk:8-jre-alpine3.9
RUN mkdir -p /app
WORKDIR /app
COPY ./target/ex2*.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "/app/ex2*.jar"]
