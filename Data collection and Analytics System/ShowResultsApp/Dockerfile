FROM openjdk:17-jdk-alpine
RUN apk add maven
COPY . .
RUN mvn clean install -DskipTests
EXPOSE 8082
CMD ["java","-jar","target/ShowResultsApp-0.0.1-SNAPSHOT.jar"]