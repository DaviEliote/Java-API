# 📦 Product API – Java Spring Boot

This project provides a simple in-memory REST API for managing products. It allows you to create, retrieve, update, and delete products using a basic Spring Boot structure.

---

## 🚀 Available Endpoints

### `GET /product/getAllProducts`
- **Description**: Returns all products stored in memory.  
- **Response**: `ArrayList<Product>`

---

### `GET /product/getProductById`
- **Description**: Returns a specific product by the provided ID.  
- **Expected request body (JSON)**:
```json
{
  "id": 1
}
```
- **Response**: `Optional<Product>`

---

### `PUT /product/updateProduct`
- **Description**: Updates an existing product with the provided data.  
- **Expected request body (JSON)**:
```json
{
  "id": 1,
  "name": "Updated Product",
  "price": 99.99
}
```
- **Response**: Updated list of products (`ArrayList<Product>`)

---

### `POST /product/postProduct`
- **Description**: Adds a new product to the in-memory list.  
- **Expected request body (JSON)**:
```json
{
  "id": 1,
  "name": "New Product",
  "price": 49.99
}
```
- **Response**: `HTTP 201 Created` (no body)

---

### `DELETE /product/deleteAllProducts`
- **Description**: Deletes all products from the list.  
- **Response**: `HTTP 200 OK`

---

## 🛠️ Technologies Used

- Java  
- Spring Boot  
- Spring Web  

---

## 📁 Basic Project Structure

- `ProductController` – REST Controller layer  
- `ProductService` – Service layer  
- `ProductDTO` – Data Transfer Object  
- `Product` – Domain Model  

---

> This project is for educational purposes only and stores data in memory during execution.
