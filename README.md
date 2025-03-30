# Event-Driven Order Processing System

## 📌 Overview
This project is a **microservices-based order processing system** using **Spring Boot**, **Kafka**, and **JWT authentication**. It consists of two main services:
- **Order Service**: Accepts new orders and publishes events to Kafka.
- **Payment Service**: Consumes Kafka events and processes payments.

## 🏗️ Architecture
```
order-processing-system/
│── order-service/             # Microservice for order creation
│── payment-service/           # Microservice for payment processing
│── api-gateway/               # API Gateway for security & routing
│── kafka-docker-compose.yml   # Kafka setup for local dev
│── k8s/                       # Kubernetes deployment configs
│── README.md                  # Project documentation
│── .gitignore                 
│── pom.xml (or Gradle files)
```

## 🚀 Features
✅ Spring Boot Microservices
✅ Kafka for Event-Driven Processing
✅ JWT Authentication & API Gateway
✅ Docker & Kubernetes Deployment
✅ CI/CD with GitHub Actions/GitLab CI

## 🏃‍♂️ Getting Started

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/rushan09/OrderProcess.git
cd event-driven-order-processing
```

### 2️⃣ Start Kafka & Zookeeper (Docker-Compose)
```sh
docker-compose -f kafka-docker-compose.yml up -d
```

### 3️⃣ Run Services
#### Order Service
```sh
cd order-service
mvn spring-boot:run
```
#### Payment Service
```sh
cd payment-service
mvn spring-boot:run
```

### 4️⃣ Test API (Using cURL or Postman)
```sh
curl -X POST "http://localhost:8080/orders" -H "Content-Type: application/json" -d '{"productName": "Laptop", "amount": 1200.50}'
```

## 📦 Deployment
For **Kubernetes deployment**, apply the manifests:
```sh
kubectl apply -f k8s/
```

## 📜 License
This project is open-source and available under the MIT License.
