FROM openjdk:17-alpine
RUN mkdir -p /opt/LabBackEnd
WORKDIR /opt/LabBackEnd
COPY /target/LabBackEnd-0.0.1-SNAPSHOT.jar /opt/LabBackEnd
CMD ["java", "-jar", "LabBackEnd-0.0.1-SNAPSHOT.jar"]
