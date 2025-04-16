# Event Sourcing + CQRS

Este proyecto tiene como objetivo implementar una arquitectura basada en los patrones **Event Sourcing** y **CQRS (Command Query Responsibility Segregation)** utilizando tecnologías modernas del ecosistema Java y Spring.

Ejecutndo la información optenida del curso https://www.udemy.com/course/arquitectura-software-moderna-ddd-eventos-microservicios-cqrs/?couponCode=KEEPLEARNING
Del repositorio https://github.com/danielblanco96/arquitectura-software-udemy

## 🎯 Objetivo

- Implementar una arquitectura que persista el estado de la aplicación exclusivamente a través de eventos.
- Separar claramente las operaciones de escritura (Commands) y lectura (Queries) para mejorar la escalabilidad y flexibilidad del sistema.
- Ilustrar los beneficios del Event Sourcing como auditoría completa, reconstrucción del estado y trazabilidad.

## 🧱 Tecnologías esperadas

- Java 17+
- Spring Boot
- Axon Framework / Eventuate / Kafka Streams (según el enfoque)
- MongoDB / PostgreSQL
- Apache Kafka
- Docker, Docker Compose
- Maven
- JUnit / Mockito
- Swagger / OpenAPI

## 📂 Estructura prevista del proyecto

```
event-sourcing-cqrs/
 ┣ 📁 command-service/       # Procesamiento de comandos y persistencia de eventos
 ┣ 📁 query-service/         # Proyección de vistas optimizadas para lectura
 ┣ 📁 common/                # Librerías compartidas (eventos, DTOs, utilidades)
 ┣ 📁 infrastructure/        # Configuración de mensajería, almacenamiento y seguridad
 ┣ 📁 docs/                  # Diagramas, especificaciones y diseño técnico
 ┗ 📄 README.md
```

## 🧠 Conceptos clave

- **Event Sourcing**: patrón en el que el estado de una entidad se reconstruye reproduciendo una secuencia de eventos.
- **CQRS**: separación entre el modelo de lectura y el de escritura, optimizando cada uno para su propósito.
- **Event Store**: almacenamiento centralizado de todos los eventos del sistema.
- **Proyecciones**: vistas de solo lectura generadas a partir de eventos para consultas eficientes.

## 🛠️ Estado del proyecto

Este módulo se encuentra en fase de diseño inicial. Pronto se agregarán los primeros servicios y componentes funcionales.