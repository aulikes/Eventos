# Spring Boot - Custom ApplicationEvent

Este proyecto demuestra cómo crear y utilizar eventos personalizados en Spring Boot extendiendo la clase `ApplicationEvent`. Se explora el mecanismo de publicación y manejo de eventos dentro del contenedor de Spring para lograr una comunicación desacoplada entre componentes.

Probando desde verbo POST localhost:8080/api/transferencias
con este body:
        {
            "cuentaOrigen": "una",
            "cuentaDestino": "dos",
            "monto": 100
        }

MANEJAR ESTA GUIA https://medium.com/hprog99/mastering-events-in-spring-boot-a-comprehensive-guide-86348f968fc6

## 🚀 Objetivo

Mostrar cómo construir eventos personalizados heredando de `ApplicationEvent`, publicarlos desde componentes del sistema y reaccionar a ellos mediante `@EventListener`.

## 🔧 Tecnologías utilizadas

- Java 17+
- Spring Boot
- Spring Context (`ApplicationEvent`, `ApplicationEventPublisher`)
- Maven

## 📂 Estructura del proyecto

```
📁 src/
 ┣ 📁 main/
 ┃ ┣ 📁 java/
 ┃ ┃ ┗ 📁 com.example.eventcustom/
 ┃ ┃    ┣ 📄 CustomEvent.java
 ┃ ┃    ┣ 📄 EventPublisherService.java
 ┃ ┃    ┣ 📄 CustomEventListener.java
 ┃ ┃    ┗ 📄 Application.java
📄 pom.xml
📄 README.md
```

## 🧠 Conceptos clave

- **ApplicationEvent**: clase base para definir eventos personalizados en Spring.
- **ApplicationEventPublisher**: interfaz para publicar eventos a los listeners registrados en el contexto de la aplicación.
- **@EventListener**: anotación para métodos que deben reaccionar a eventos específicos.
- **Acoplamiento débil**: la lógica de negocios se separa de los flujos de ejecución mediante eventos.

## ▶️ Ejecución

1. Clona el repositorio.
2. Navega hasta este directorio del proyecto.
3. Ejecuta el proyecto con tu IDE o con el comando:

```bash
./mvnw spring-boot:run
```

## 📝 Notas

Este módulo forma parte de la serie **Event Driven Programming con Spring Boot**. A diferencia del uso de objetos POJO como eventos, aquí se utiliza un enfoque más formal con `ApplicationEvent`, lo cual es útil cuando se requiere un mayor control o compatibilidad con componentes de Spring más antiguos.
