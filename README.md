Example integration testing of the REST endpoints of a web application. This project uses Cucumber JVM and Rest-assured for testing a website's REST API.

All of the tests can be executed with the following Maven command:

clean verify -PintegrationTesting -Dcucumber.options='--tags @indexRest --tags ~@WIP'