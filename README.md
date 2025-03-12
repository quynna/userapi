API RESTful de Creación de Usuarios

Este proyecto es una API RESTful desarrollada con Spring Boot, que permite registrar usuarios y almacenar su información en una base de datos.

🚀 Requisitos Previos

Asegúrate de tener instalado en tu sistema:

Java JDK 17 o superior
Maven
Visual Studio Code con las extensiones:

"Extension Pack for Java"

"Spring Boot Extension Pack"

📂 Instalación y Ejecución

1️⃣ Clonar el Proyecto

 git clone https://github.com/quynna/userapi.git
 cd userapi

2️⃣ Compilar el Proyecto con Maven

 mvn clean install

3️⃣ Ejecutar la Aplicación

 mvn spring-boot:run

La API estará disponible en http://localhost:8080

📌 Endpoints Disponibles

📌 Registro de Usuario

URL: POST /users/register

Descripción: Registra un nuevo usuario.

Formato de solicitud:

{
  "name": "Juan Rodriguez",
  "email": "juan@rodriguez.org",
  "password": "hunter2",
  "phones": [
    {
      "number": "1234567",
      "citycode": "1",
      "contrycode": "57"
    }
  ]
}

Respuestas:

✅ 201 Created - Usuario registrado con éxito.

❌ 400 Bad Request - Email ya registrado o formato incorrecto.

📌 Prueba con cURL

curl -X POST "http://localhost:8080/users/register" \
     -H "Content-Type: application/json" \
     -d '{
           "name": "Juan Rodriguez",
           "email": "juan@rodriguez.org",
           "password": "hunter2",
           "phones": [{"number": "1234567", "citycode": "1", "contrycode": "57"}]
         }'

📌 Prueba con Postman

Abre Postman.

Selecciona POST y escribe http://localhost:8080/users/register

En la pestaña Body, selecciona raw y JSON.

Copia el JSON de ejemplo.

Haz clic en Send.

🛠 Configuración de Base de Datos

Por defecto, el proyecto usa H2 Database en memoria. Puedes acceder a la consola en http://localhost:8080/h2-console con:

JDBC URL: jdbc:h2:mem:testdb

Usuario: sa

Contraseña: (vacío)

Si prefieres MySQL, modifica application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=tucontraseña
spring.jpa.hibernate.ddl-auto=update
