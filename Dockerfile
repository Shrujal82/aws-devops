FROM public.ecr.aws/amazoncorretto/amazoncorretto:21-alpine
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]