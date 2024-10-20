# Patient Management CRUD Application

This is a **Patient Management System** built using **Spring Boot** and **Thymeleaf**. It performs basic CRUD (Create, Read, Update, Delete) operations on patient data, with a user-friendly interface that allows managing patient details like name, age, gender, and symptoms.

## Features

- Add new patient records with validation.
- View a list of all patients.
- Edit existing patient records.
- Delete patient records.
- Validate input fields to ensure data consistency.
- Use checkboxes for symptoms like fever, cough, headache, and more.

## Tech Stack

- **Backend**: Java, Spring Boot, Spring Data JPA
- **Frontend**: Thymeleaf, HTML, Bootstrap, CSS
- **Database**: MySQL
- **Tools**: Maven, Spring Boot DevTools

## Project Structure

- `Controller`: Handles the routing and business logic for the CRUD operations.
- `Service`: Contains the business logic to interact with the repository.
- `Repository`: Manages database operations using Spring Data JPA.
- `Model`: Defines the `Patient` entity with attributes such as name, age, gender, and symptoms.
- `View (Thymeleaf templates)`: HTML pages for creating, reading, updating, and deleting patients.

## Installation & Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/patient-thymeleaf-crud.git
