FROM ascdc/jdk8:latest
ARG jar_file
COPY ${jar_file} /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]

