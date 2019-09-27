# Getting Started

### This is a POC for Rest with NoSql(MongoDB)

* [Getting started with Spring with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

### Setup Project
* [Install MongoDB on macos](https://docs.mongodb.com/manual/tutorial/install-mongodb-on-os-x/)

### Run Project
* Gradle bootRun will start the application on localhost:8080
* 3 end points will be exposed 
    1. post endpoint at /save to save a request
    2. get endpoint at /{RequestNumber} to get latest version of request
    3. get endpoint  at /allRequests/{RequestNumber}
    
* Additional Postman scripts can be found in source code under scripts folder

### Guides
The following guides are for further reading:

* [Spring Data MongoDB](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/)

