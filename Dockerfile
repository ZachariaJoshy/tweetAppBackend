FROM openjdk:11
ADD target/tweetapp.jar tweetapp.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "tweetapp.jar"]

