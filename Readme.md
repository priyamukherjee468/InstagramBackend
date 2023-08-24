<h1 align = "center"> INSTAGRAM BACKEND </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=17-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.1.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.2-brightgreen.svg" />
</a>
  
<a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
</a>
</p>
   
This project is a basic web application that allows users to sign in, sign up, and manage their profile information. Additionally, users can create posts and view posts created by other users. The application uses authentication tokens to secure user data and ensure that only authenticated users can access certain features of the application.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* Swagger

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>



## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* User Model
```
Id : integer
UserName : string
userHandle : string
userBio : string
email : string
password : string
gender : gender
accountType AccountType
isBlueTicked : boolean
```

* Like Model
```
Id : Long
post : Post(ManyToOne)
 liker : User(ManyToOne)
```

* Post Model
```
postId : Integer
postContent : String
 postCreatedTimeStamp : LocalDateTime
postCaption : string
postLocation : string
postType : PostType
@ManyToOne
postOwner : User
```

* Follow Model
```
followeId = Long
currentUser : User (OneToOne)
currentUserFollower : User (ManyToOne)
```

* Comment Model
```
commentId = Long
commentBody : String
commentCreationTimeStamp : LocalDateTime
instaPost : Post(ManyToOne)
Commenter : User (ManyToOne)
```

* Authentication Token 
```
tokenId : Long
tokenValue : string
tokenCreationDate : LocalDate
@OneToOne 
user : User
```

* Admin  
```
adminId : Long
AdminName : string
email : string
password : string

```
## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

The project is a basic web application built using Java and the Spring framework. It allows users to sign up, sign in, and manage their profile information. Users can also create and view posts. The application uses authentication tokens to secure user data and ensure that only authenticated users can access certain features. The API endpoints include user signup, signin, and update details, post creation and retrieval, and authentication token creation. 



## Author

👤 **Priya Mukherjee**

* GitHub: [priyamukherjee468](https://github.com/priyamukherjee468)

* LinkedIn: [Priya Mukherjee](www.linkedin.com/in/priya-mukherjee14)
    
---

    
## Show your support

Give a ⭐️ if this project helped you!
    
---
