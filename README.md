# Spring Boot Application, itext and xlsx file
 ![](https://i.imgur.com/qgRaRlub.jpg)
 
## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard       Edition Development Kit 
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring   A pplications
* [MySQL](https://dev.mysql.com/) - Open-Source Relational Database Management System
* [Git](https://git-scm.com/) - Free and Open-Source distributed version control system  
* [Itext](https://itextpdf.com/en) - PDF Toolkit for PDF generation, PDF programming, handling & manipulation.
* [Ooi-ooxml](https://poi.apache.org/) - Java API To Access Microsoft Excel Format Files

## Packages
- [x] Spring Boot
- [x] MySQL(Database)
- [x] itext
- [x] Spring Data
- [x] Spring Web
- [x] Spring devtools
- [x] Apache Poi

```
.
├── Spring Elements
├── src
│   └── main
│       └── java
│           ├── com.springpdf          
│           ├── com.springpdf.controller             
│           ├── com.springpdf.entity
│           ├── com.springpdf.util
│           ├── com.springpdf.repository
│           └── com.springpdf.service
├── src
│   └── main
│       └── resources
│           └── static              
│           ├── templates            
│           ├── application.properties
│            
├── src
│   └── test
│       └── java
├── JRE System Library
├── Maven Dependencies
├── bin
├── logs
│   └── application.log
├── src
├── target
│   └──application-0.0.1-SNAPSHOT
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Packages
- `models` — to hold our entities;
- `repositories` — to communicate with the database;
- `services` — to hold our business logic;
- `controllers` — to listen to the student;
- `resources/` - Contains all the static resources, templates and property files.
- `resources/static` - contains static resources such as css, js and images.
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/application.properties` - It contains application-wide properties. 
  Spring reads the properties defined in this file to configure your application. 
  You can define server’s default port, server’s context path, database URLs etc, in this file.
- `test/` - contains unit and integration tests
- `pom.xml` - contains all the project dependencies
 
## Running the application locally
mvn spring-boot:run
## Generate PDF 
http://localhost:8080/api/student/studentpdf

## Generate File XLSX
http://localhost:8080/api/student/students.xlsx
