🌦️ Real-Time Weather Analytics API
 📌 Project Overview

The Real-Time Weather Analytics API is a RESTful web application developed using Java and Spring Boot. It allows users to manage weather records for different cities, store weather data in a PostgreSQL database, and retrieve information through REST APIs.

The application uses Spring Data JPA and Hibernate to simplify database operations and implement CRUD functionality.

 🚀 Technologies Used

**Java**
**Spring Boot**
**Spring Web**
**Spring Data JPA**
**Hibernate**
**PostgreSQL**
**Maven**
**Postman**
**Git & GitHub**

 ✨ Features

* Add weather records for different cities.
* Retrieve all weather records.
* Retrieve a specific weather record by ID.
* Update existing weather information.
* Delete weather records.
* Search weather records by city name.
* Calculate weather analytics, such as average temperature.

🏗️ Project Structure


src/main/java/com/example/demo/
├── controller/
│   └── WeatherController.java
├── entity/
│   └── Weather.java
├── repository/
│   └── WeatherRepository.java
├── service/
│   └── WeatherService.java
└── DemoApplication.java

src/main/resources/
└── application.properties

pom.xml
README.md


🗄️ Database Configuration

Create a PostgreSQL database named `weatherdb`.

Configure `src/main/resources/application.properties`:


spring.datasource.url=jdbc:postgresql://localhost:5432/weatherdb
spring.datasource.username=postgres
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.port=8080


Set the `DB_PASSWORD` environment variable to your PostgreSQL password before running the application. Never commit database passwords to GitHub.

## ▶️ How to Run the Project

1. Install Java, IntelliJ IDEA, and PostgreSQL.
2. Clone this repository.
3. Create the `weatherdb` database in PostgreSQL.
4. Configure your database credentials.
5. Open the project in IntelliJ IDEA.
6. Reload the Maven dependencies.
7. Run `DemoApplication.java`.

The application will run at:

`http://localhost:8080`

## 🔗 API Endpoints

| Method | Endpoint                     | Description                   |
| ------ | ---------------------------- | ----------------------------- |
| POST   | `/weather`                   | Add a weather record          |
| GET    | `/weather`                   | Retrieve all records          |
| GET    | `/weather/{id}`              | Retrieve a record by ID       |
| PUT    | `/weather/{id}`              | Update a record               |
| DELETE | `/weather/{id}`              | Delete a record               |
| GET    | `/weather/city/{city}`       | Retrieve records by city      |
| GET    | `/weather/analytics/average` | Calculate average temperature |

*The city-search and analytics endpoints are available only after their corresponding controller, service, and repository methods have been implemented.*

🧪 Testing

The REST APIs can be tested using Postman. Send JSON request bodies for POST and PUT operations, and use GET requests to retrieve stored weather data.

Example JSON:

json
{
  "city": "Bengaluru",
  "temperature": 28.5,
  "humidity": 72,
  "condition": "Cloudy",
  "recordedAt": "2026-10-13T09:00:00"
}


 🎯 Learning Outcomes

* Building REST APIs using Spring Boot.
* Implementing CRUD operations.
* Integrating PostgreSQL with Spring Data JPA and Hibernate.
* Organizing code using controller, service, repository, and entity layers.
* Testing REST endpoints with Postman.
* Managing a project using Git and GitHub.

👩‍💻 Author

**V. D. Rekha**

GitHub: [vdrekha322-glitch](https://github.com/vdrekha322-glitch)
