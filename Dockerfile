FROM openjdk:8
ADD /build/libs/docker-spring-0.0.1-SNAPSHOT.jar docker-spring.jar
ENTRYPOINT ["java", "-jar", "docker-spring.jar"]