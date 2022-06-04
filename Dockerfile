FROM eclipse-temurin:17-jre
ENV PORT 8080
EXPOSE 8080
WORKDIR /app

COPY target/app.jar app.jar

ENTRYPOINT java -jar app.jar