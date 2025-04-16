# Spring Boot - EventPublisher

Este módulo demuestra cómo utilizar `ApplicationEventPublisher` en Spring Boot para publicar eventos de manera explícita dentro del contexto de la aplicación. Es una evolución de los fundamentos anteriores, enfocada en el control manual de la publicación y la orquestación basada en eventos.

probando desde verbo POST localhost:8080/api/transferencias
con este body:
        {
            "cuentaOrigen": "una",
            "cuentaDestino": "dos",
            "monto": 100
        }

MANEJAR ESTA GUIA https://medium.com/hprog99/mastering-events-in-spring-boot-a-comprehensive-guide-86348f968fc6

## 🚀 Objetivo

Implementar una arquitectura simple donde los componentes publican eventos personalizados usando `ApplicationEventPublisher`, y otros reaccionan a ellos mediante `@EventListener`. Este enfoque permite desacoplar acciones y crear flujos de trabajo asincrónicos y extensibles.

## 🔧 Tecnologías utilizadas

- Java 17+
- Spring Boot
- Spring Context (`ApplicationEventPublisher`, `@EventListener`)
- Maven

## 📂 Estructura del proyecto

```
📁 src/
 ┣ 📁 main/
 ┃ ┗ 📁 java/
 ┃     ┗ 📁 com.example.publisher/
 ┃         ┣ 📄 CustomEvent.java
 ┃         ┣ 📄 PublisherService.java
 ┃         ┣ 📄 EventHandler.java
 ┃         ┗ 📄 Application.java
📄 pom.xml
📄 README.md
```

## 🧠 Conceptos clave

- **ApplicationEventPublisher**: permite publicar eventos desde cualquier componente Spring.
- **CustomEvent**: clase que encapsula los datos de un evento específico.
- **@EventListener**: maneja la lógica asociada a eventos publicados dentro del contexto de Spring.
- **Separación de responsabilidades**: cada componente tiene un rol único, comunicándose por eventos.

## ▶️ Ejecución

1. Clona el repositorio.
2. Navega a este subdirectorio.
3. Ejecuta el proyecto desde tu IDE o con el siguiente comando:

```bash
./mvnw spring-boot:run
```

## 📝 Notas

Este módulo forma parte de la serie **Event Driven Programming con Spring Boot**. En este caso, el foco está en el uso programático de `ApplicationEventPublisher` como una herramienta clave para la orquestación basada en eventos.