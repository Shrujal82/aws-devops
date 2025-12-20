FROM public.ecr.aws/amazoncorretto/amazoncorretto:21-al2023
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]