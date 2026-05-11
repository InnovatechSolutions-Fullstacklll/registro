# 📝 MS Register - Inovatech

Microservicio encargado del registro de usuarios.

Permite:
- Registrar usuarios
- Validar correos repetidos
- Encriptar contraseñas
- Guardar usuarios en H2 Database

---

# 📌 Tecnologías utilizadas

- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- H2 Database
- Lombok
- Maven
- JWT
- Postman

---

# 📦 Dependencias utilizadas

- Spring Web
- Spring Security
- Spring Data JPA
- H2 Database
- Lombok
- DevTools
- Validation
- Spring Boot Starter Test

---

# 🛠 Requisitos previos

## ✅ Java 21

https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html

---

## ✅ Maven

https://maven.apache.org/download.cgi

---

## ✅ IntelliJ IDEA

https://www.jetbrains.com/idea/download/

---

## ✅ Postman

https://www.postman.com/downloads/

---

# ⚙ Configuración

## Puerto

server.port=9091

---

# 🗄 Base de datos H2

## Configuración

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=admin

spring.jpa.hibernate.ddl-auto=update

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

---

# 🧪 Consola H2

Abrir:

http://localhost:9091/h2-console

## Datos conexión

JDBC URL: jdbc:h2:mem:testdb
User: admin
Password: admin

---

# ▶ Cómo ejecutar

MsRegisterApplication

---

# 📡 Endpoint principal

## Registrar usuario

POST http://localhost:9090/api/register

## Body ejemplo

{
"nombre": "Camilo",
"email": "camilo@test.com",
"password": "123456",
"confirmPassword": "123456"
}

---

# 🔐 Seguridad

Se utiliza:

- BCryptPasswordEncoder
- Spring Security
- JWT

Las contraseñas se almacenan encriptadas.

---

# 🧠 Función del microservicio

Este microservicio:
- Registra usuarios
- Guarda usuarios en base de datos
- Valida duplicados
- Encripta contraseñas
- Expone usuarios al Login Service

---

# 🧪 Tests

mvn test

---

# 👨‍💻 Autores

Camilo Leiva (cc.leiva@duocuc.cl)

Nicolas Rivera (nico.veraf@duocuc.cl)

Ramiro Gomez (ra.gomezv@duocuc.cl)

Laura Fontecilla (la.fontecilla@duocuc.cl)


## **Proyecto desarrollado para Inovatech.**