FROM openjdk:8
EXPOSE 8080
ADD target/Book-Service-ECR.jar	Book-Service-ECR.jar
ENTRYPOINT ["java","-jar","/Book-Service-ECR.jar"] 