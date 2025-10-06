# 📝 Collaborative Document Editing Platform

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen?style=flat-square)]()
[![Java](https://img.shields.io/badge/Java-17%2B-blue?style=flat-square)]()
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green?style=flat-square)]()
[![Docker](https://img.shields.io/badge/Docker-ready-blue?style=flat-square)]()
[![Redis](https://img.shields.io/badge/Redis-supported-red?style=flat-square)]()
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-db-blue?style=flat-square)]()
[![WebSocket](https://img.shields.io/badge/WebSocket-realtime-orange?style=flat-square)]()
[![Swagger](https://img.shields.io/badge/Swagger-API-green?style=flat-square)]()
[![Cloud](https://img.shields.io/badge/Cloud-Deployment%20Ready-blue?style=flat-square)]()
[![Security](https://img.shields.io/badge/Security-Enabled-brightgreen?style=flat-square)]()

## Overview

A **distributed, real-time collaborative document editing platform** built with Java, Spring Boot, WebSockets, and modern backend technologies. This project enables simultaneous editing, real-time sync, and robust document management—designed for scalable deployments and reliability in modern cloud environments.

---

## 🚀 Features

- Real-time multi-user document editing (WebSocket-powered)
- Optimistic concurrency with **OT (Operational Transformation)** / **CRDT**
- RESTful APIs for document and user management
- Secure user authentication (JWT/Session-based)
- Live user attribution and edit history tracking
- Persistent storage with **PostgreSQL** and caching with **Redis**
- Plug-and-play backend—easily extensible for cloud deployment
- Best practices: code modularity, security, CI/CD ready

---

## 🛠️ Tech Stack

- **Backend:** Java 17+, Spring Boot 3.x, Maven
- **Real-Time Sync:** WebSocket, OT/CRDT Logic
- **Database:** PostgreSQL, H2 (dev), Redis (caching)
- **Security:** Spring Security, JWT
- **DevOps:** Docker, Cloud Deployment Ready
- **Other:** Maven, JUnit, Swagger

---

## 📁 Project Structure

```
Distributed_Document_Editing/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/yourdomain/doceditor/
│   │   ├── resources/
│   ├── test/
│
├── pom.xml
├── README.md
└── ...
```

---

## 🏗️ Setup & Usage

1. **Clone the repo:**
   ```bash
   git clone https://github.com/manamsriram/Distributed_Document_Editing.git
   cd Distributed_Document_Editing
   ```
2. **Configure environment:**
   - Set up PostgreSQL & Redis (see `application.properties` for configs)
   - (Optional) Add Cloud/DevOps configs for deployment

3. **Build & run:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Explore APIs:**
   - Visit `http://localhost:8080/swagger-ui.html` for interactive docs

---

## 🤝 Contributing

Contributions welcome! Please open issues or submit pull requests.
- Fork the repo
- Create a feature branch
- Follow code style and add tests for new features

---
