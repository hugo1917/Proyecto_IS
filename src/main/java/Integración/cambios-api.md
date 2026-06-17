# Documentación de Cambios - API Externa

## Descripción de las Modificaciones
Se ha integrado un nuevo método de control dentro de la clase `ApiExterna.java` para robustecer el monitoreo y salud de las conexiones con servicios de terceros.

## Detalles Técnicos
* **Método añadido:** `verificarEstadoApi()`
* **Tipo de retorno:** `boolean`
* **Comportamiento:** Simula una petición de control de estado (Heartbeat / Health Check) que valida que el endpoint responda correctamente (Status 200 OK) antes de ejecutar operaciones críticas de geolocalización o consultas al Active Directory.