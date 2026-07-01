# Appointment Booking System

A Spring Boot web application for scheduling and managing appointments, built with Spring MVC, Spring Data JPA, and Thymeleaf, backed by a MySQL database.

## Features
- Add a new appointment (Client Name, Service, Date, Time)
- View all appointments in a table
- Delete an appointment record
- *(Update and Search by name/date can be added as extensions)*

## Project Structure
com.appointment.controller  → AppointmentController (handles routes)
com.appointment.model       → Appointment (JPA entity)
com.appointment.repository  → AppointmentRepository (Spring Data JPA)
com.appointment.service     → AppointmentService, AppointmentServiceImpl
src/main/resources/
├── templates/             → index.html, add_appointment.html, view_appointments.html
├── static/css/            → style.css
└── application.properties

## Tech Stack
- Java, Spring Boot
- Spring Data JPA / Hibernate
- Thymeleaf (templating)
- MySQL
- Apache Tomcat (embedded)
- Maven

## Database Schema

| Column | Type | Constraints |
|--------|------|-------------|
| appointmentid | INT | PRIMARY KEY, AUTO_INCREMENT |
| clientname | VARCHAR(100) | NOT NULL |
| service | VARCHAR(100) | NOT NULL |
| date | DATE | NOT NULL |
| time | TIME | NOT NULL |

*(Table is auto-managed by Hibernate via `spring.jpa.hibernate.ddl-auto=update`)*

## Setup & Run

1. Create a MySQL database:
```sql
   CREATE DATABASE appointmentdb;
```
2. Update `application.properties` with your MySQL credentials:
```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/appointmentdb
   spring.datasource.username=root
   spring.datasource.password=yourpassword
```
3. Run the application:
mvn spring-boot:run
4. Open in browser:
http://localhost:8080

## Routes
| Route | Method | Purpose |
|-------|--------|---------|
| `/` | GET | Home page |
| `/add` | GET | Show add appointment form |
| `/save` | POST | Save a new appointment |
| `/view` | GET | List all appointments |
| `/delete/{id}` | GET | Delete an appointment by ID |

## GitHub
https://github.com/717824y150-svg/appointment-booking-system-using-springboot

## Author
Shruthika R — 717824Y150
