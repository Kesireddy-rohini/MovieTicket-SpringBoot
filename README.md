# 🎟️ Movie Ticket Booking Application 🎬

Welcome to the **Movie Ticket Booking Application**! 

This Spring Boot project helps you manage movie tickets effortlessly with CRUD (Create, Read, Update, Delete) operations connected to a MySQL database.

## 🌟 Features
- 🎟️ **Book New Tickets**: Add movie tickets with details like title, price, and seat number.
- 📑 **View Tickets**: Retrieve all or specific movie tickets by ID.
- ✏️ **Update Tickets**: Modify existing ticket details.
- 🗑️ **Cancel Tickets**: Delete booked tickets.

---

## 🛠️ Technologies Used
- **Java** ☕
- **Spring Boot** 🚀
- **Spring Data JPA** 🗃️
- **MySQL** 🐬

---

## 📝 Prerequisites
Before you can run the application, make sure you have the following installed:
- **Java 17+** ⚙️
- **MySQL** 🐬
- **Spring Boot** (manually configured or via an IDE like IntelliJ or Eclipse) 💻

---

## ⚙️ How It Works

1. **Spring Boot** 🚀 serves as the back-end framework to handle the API requests and routes them to the appropriate service layer for processing.
   
2. **Spring Data JPA** 🗃️ is used to interact with the **MySQL** database, allowing for easy management of database records without writing complex SQL queries.

3. **Ticket Data** 🎟️ is stored in a **MySQL** table, and each ticket record can be managed (created, updated, retrieved, or deleted) via the provided **RESTful API** endpoints.

---

## 🌐 API Endpoints

### 1. 🎟️ **Create a New Ticket**
- **HTTP Method**: `POST`
- **URL**: `/api/saveTicket`
- **Description**: Add a new movie ticket to the database.
- **Response**: The created movie ticket with its unique `ticketId`.
  
### 2. 📑 **Get Ticket by Id**
- **HTTP Method**: `GET`
- **URL**: `/api/getMovieTicketById`
- **URL**: `/api/tickets/{ticketId}`
- **Description**: Fetch the details of a specific ticket using its `ticketId`.
- **Response**: A ticket object with the requested ID.
  
### 3. ✏️ **Update a Ticket**
- **HTTP Method**: `PUT`
- **URL**: `/api/updateMovieTicketDetails`
- **Description**: Update the details of an existing ticket.
- **Response**: The updated movie ticket details.

### 4. 🗑️ **Delete a Ticket**
- **HTTP Method**: `DELETE`
- **URL**: `/api/deleteTicketById`
- **Description**: Delete a movie ticket by its `ticketId`.
- **Response**: A success message indicating the ticket has been deleted.
