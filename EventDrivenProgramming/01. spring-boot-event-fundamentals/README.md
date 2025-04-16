# Spring Boot Event Fundamentals

Este proyecto tiene como objetivo demostrar los conceptos fundamentales del manejo de eventos en aplicaciones Spring Boot, utilizando el patrón de **event-driven programming** a nivel de componentes de la aplicación.
El proyecto es basado en la información obtenida del canal: https://www.youtube.com/channel/UCTXForyROk00E6jiaNKSV1A

## 🚀 Objetivo

Implementar una arquitectura sencilla que utilice **publicadores y escuchadores de eventos (ApplicationEventPublisher & @EventListener)** dentro de Spring Boot, permitiendo un acoplamiento débil y un flujo de lógica más reactivo entre componentes.

## 🔧 Tecnologías utilizadas

- Java 17+
- Spring Boot
- Spring Context / Application Events
- Maven

## 📂 Estructura del proyecto

```
📁 src/
 ┣ 📁 main/
 ┃ ┣ 📁 java/
 ┃ ┃ ┗ 📁 com.example.eventdemo/
 ┃ ┃    ┣ 📄 EventPublisher.java
 ┃ ┃    ┣ 📄 CustomEvent.java
 ┃ ┃    ┣ 📄 EventListener.java
 ┃ ┃    ┗ 📄 Application.java
 ┣ 📁 test/
 ┃ ┗ 📄 EventTests.java
📄 pom.xml
📄 README.md
```

## 🧠 Conceptos clave

- **ApplicationEventPublisher**: interfaz de Spring para publicar eventos personalizados dentro del contexto de la aplicación.
- **@EventListener**: anotación para declarar métodos que deben reaccionar a eventos específicos.
- **Acoplamiento débil**: separación de lógica entre componentes que se comunican a través de eventos.

## ▶️ Ejecución

1. Clona el repositorio.
2. Navega hasta el directorio del proyecto.
3. Ejecuta la aplicación con tu IDE o usando:

```bash
./mvnw spring-boot:run
```

## 📝 Notas

Este proyecto es el primero de una serie de ejercicios prácticos relacionados con arquitecturas orientadas a eventos. Se recomienda usar este módulo como base para entender los conceptos antes de pasar a implementaciones más complejas como Event Sourcing o CQRS.