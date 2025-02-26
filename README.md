### Webhook Mock Service



phonon-webhook application

This application exposes REST APIs to create, update and fetch a request.
It also move request to target application for processing.

Steps to build the application:

1. Clone the application code from this location :
2. Build the Project from application directory using below command
   ./phonon-webhook> ./gradlew clean build -x test
   Above command will generated the JAR File at ./phonon-webhook/build/libs directory.
3. Execute the JAR to run the application. Use beow command:
   java -jar ./phonon-webhook/build/libs/loadtesting-0.0.1-SNAPSHOT.jar
