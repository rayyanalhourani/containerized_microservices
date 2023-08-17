FROM openjdk:17-jdk-alpine
RUN apk add maven
COPY . .
RUN mvn clean install -DskipTests
EXPOSE 8080
CMD ["java","-jar","target/EnterDataApp-0.0.1-SNAPSHOT.jar"]