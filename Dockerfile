FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} rss-feed.jar
ENTRYPOINT ["java","-jar","/rss-feed.jar"]
EXPOSE 9001