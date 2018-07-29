from java:8
expose 8080
add /target/sample-project1-1.0-SNAPSHOT.jar /opt/sample-project1-1.0-SNAPSHOT.jar
workdir /opt
entrypoint ["java","-jar","sample-project1-1.0-SNAPSHOT.jar"]