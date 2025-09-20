# Parcial ARSW 2025-2

## Diego Alexander Cardenas Beltran

# Detalles

# Stock Market Web Microservices - Spring Boot Backend

Este proyecto implementa la **fachada backend** de una aplicación para consultar y analizar el mercado de valores, como parte de una arquitectura distribuida web con microservicios.

## ¿Qué hace?

- **Exposición de servicios RESTful** para el frontend React: permite consultar históricos de precios de acciones (intradía, diario, semanal, mensual) usando identificadores como "MSFT".
- **Conexión a proveedores externos** como Alpha Vantage para obtener los datos de mercado.
- **Caché concurrente** para evitar llamadas repetidas a los proveedores externos, mejorando el rendimiento.
- **Cliente de consola Java** para pruebas concurrentes, simulando múltiples usuarios.
- **Organizado por capas**: Controller, Service, Provider, Cache, Model.

## Requisitos

- **Spring Boot (Java)**
- **Maven**
- **Despliegue en AWS/Azure**

## Estructura

```
src/main/java/com/arsw/parcial/
  controller/           # Endpoints REST
  service/              # Lógica de negocio y análisis
  provider/             # Abstracción y proveedores externos
  cache/                # Caché concurrente
  model/                # DTOs y modelos de datos
```


## Despliegue y URLs

- Código fuente: [GitHub Repo](https://github.com/diegcard-arsw/parcial-corte-1)
- [Azure](parcial-arsw-1-ayf4beesaqbue9ep.canadacentral-01.azurewebsites.net)