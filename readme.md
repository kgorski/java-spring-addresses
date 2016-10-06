# Address Book powered by Spring Boot and Hibernate

Simple address book for storing and displaying addresses. Addresses are stored and displayed via JDBC. 

## System Requirements / Dependencies
* java 1.7+
* MySQL 5.0+

## Installation
### Checkout the repository

    git clone git@github.com:kgorski/java-spring-addresses.git

### Run gradle build

    gradle build

## Setup
Copy application.properties.dist file into application.properties file and set jdbc:

    jdbc.driverClassName=com.mysql.jdbc.Driver
    jdbc.url=jdbc:mysql://localhost:3306/addresses
    jdbc.username=addresses
    jdbc.password=addresses

## Running

java -jar build\libs\addresses-X.X.X.jar
