# Inventory Management System

This is a comprehensive inventory management system built using Spring Boot and Java. The system includes services for stock management, order fulfillment, supplier integration, and reporting.

## Features

### 1. Stock Management
- Manage inventory stock levels.
- Add new items, update stock levels, and remove items from the inventory.
- Consistently update stock levels upon order fulfillment.

### 2. Order Fulfillment
- Handle customer orders.
- Create, update, and cancel orders.
- Automatically adjust stock levels upon order placement and fulfillment.
- Generate order confirmation and tracking details for customers.

### 3. Supplier Integration
- Manage suppliers and their product offerings.
- Place restock orders with suppliers when stock levels fall below a certain threshold.
- Track and manage incoming shipments from suppliers to update inventory accordingly.

### 4. Reporting
- Generate various reports for stock levels, order statuses, and supplier performance.

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. *Clone the repository:*
    sh
    git clone https://github.com/yourusername/inventory-management.git
    cd inventory-management
    

2. *Build the project using Maven:*
    sh
    mvn clean install
    

3. *Run the application:*
    sh
    mvn spring-boot:run
    

### Configuration

The application can be configured using the src/main/resources/application.properties file.

#### H2 Database Configuration (default)
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

###Item Management
GET /items: Get all items.
GET /items/{id}: Get item by ID.
POST /items: Add a new item.
PUT /items: Update an existing item.
DELETE /items/{id}: Delete an item by ID.

###Order Management
GET /orders: Get all orders.
GET /orders/{id}: Get order by ID.
POST /orders: Create a new order.
PUT /orders: Update an existing order.
DELETE /orders/{id}: Cancel an order by ID.

###Supplier Management
GET /suppliers: Get all suppliers.
GET /suppliers/{id}: Get supplier by ID.
POST /suppliers: Add a new supplier.
PUT /suppliers: Update an existing supplier.
DELETE /suppliers/{id}: Delete a supplier by ID.


###Reporting
GET /reports/stock-levels: Get stock level report.
GET /reports/order-statuses: Get order status report.
GET /reports/supplier-performance: Get supplier performance report.
