E-Commerce Backend API using Spring Boot

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1-brightgreen?style=for-the-badge&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)

A robust backend RESTful API for an E-Commerce platform built using Java, Spring Boot, and MySQL/PostgreSQL.  
This application handles user authentication, product listing, order management, role-based access control, and more.


Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL / PostgreSQL
- Spring Security + JWT
- Postman for API testing
- Maven as build tool
- Git & GitHub for version control

Features

✅ User Registration & Login (with hashed password)  
✅ JWT-based Authentication & Authorization  
✅ Role-based Access Control (Admin / Customer)  
✅ Product Management (Add / View / Update / Delete)  
✅ Cart & Order Management  
✅ Exception Handling with proper HTTP status codes  
✅ Input validation & clean architecture


How to Run Locally

1. Clone the repo:

   ```bash
   git clone https://github.com/Sanchit60/ECommerce-backend-API.git
   cd ECommerce-backend-API

2. Configure application.properties:
    spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
    spring.datasource.username=your_db_user
    spring.datasource.password=your_db_password
    jwt.secret=your_jwt_secret

3. Run the application:
   You can use your IDE or:
    mvn spring-boot:run

4. Test APIs with Postman:
    Import the provided Postman collection or create your own.

   
🔐 Authentication:

1. JWT token is required for accessing protected endpoints.

2. Admin-only endpoints are restricted using role-based access.

3. Token is to be passed in the Authorization header as:


    Bearer <your_token>

 Future Scope:
 
1. Payment gateway integration (Razorpay/Stripe)

2. Product search & filters

3. Pagination and sorting for product listings

4. Email confirmation & forgot password module

   
