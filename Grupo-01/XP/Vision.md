# Documento de Visión - Gestor de Contraseñas

## Visión General del Proyecto

El proyecto tiene como objetivo principal desarrollar una aplicación de escritorio que funcione como un Gestor de Contraseñas, brindando a los usuarios la capacidad de gestionar sus contraseñas de manera segura y organizada. La aplicación se destacará por su simplicidad de uso y garantizará la confidencialidad de la información almacenada.

## Objetivos

1. **Creación de Contraseñas:**
   - Los usuarios podrán agregar nuevas contraseñas, asociándolas a sitios específicos. La aplicación generará automáticamente contraseñas seguras o permitirá al usuario ingresar una personalizada.

2. **Visualización de Contraseñas:**
   - Se proporcionará una lista organizada de sitios y contraseñas almacenadas. Los usuarios podrán ver sus contraseñas de manera clara y fácil.

3. **Actualización de Contraseñas:**
   - La aplicación permitirá a los usuarios actualizar las contraseñas existentes, ya sea generando nuevas contraseñas o ingresando manualmente una actualización.

4. **Borrado de Contraseñas:**
   - Se brindará la opción de eliminar contraseñas de la lista cuando ya no sean necesarias. Se implementará una confirmación para evitar eliminaciones accidentales.

5. **Persistencia en Archivos:**
   - Las contraseñas se almacenarán de manera segura en archivos locales. Se implementará un sistema de cifrado para proteger la información sensible.

6. **Formato de Almacenamiento:**
   - Cada entrada en el gestor de contraseñas se almacenará en un formato específico: "SITIO DE CONTRASEÑA: CONTRASEÑA". Esto facilitará la lectura y búsqueda de contraseñas.

7. **Seguridad:**
   - La aplicación se diseñará con medidas de seguridad sólidas para proteger la información confidencial, incluyendo el cifrado de archivos y la implementación de buenas prácticas de seguridad.

8. **Interfaz de Usuario Intuitiva:**
   - La interfaz de usuario será amigable y fácil de usar. Se proporcionarán instrucciones claras sobre cómo agregar, ver, actualizar y borrar contraseñas.

## Requisitos Generales del sistema a desarrollar

Veremos los requisitos a través de las historias de usuario

# Historias de Usuario 

<br>

| Campo | Descripción |
|-------|-------------|
| **ID de Historia** | US001 |
| **Nombre de la Historia** | Creacion de contraseñas |
| **Descripción** | Como usuario, quiero poder agregar nuevas contraseñas asociadas a sitios específicos, permitiendo la generacion automática de contraseñas seguras o la creacion de contraseñas personalizadas |
| **Rol del Usuario** | Usario |
| **Objetivo** | Permitir a los usuarios generar y guardar nuevas contraseñas asociadas a sitios especificos |
| **Iteración Asignada** | 1 |
| **Prioridad en Negocio** | Alta |
| **Riesgo en Desarrollo** | Media |
| **Puntos Estimados** | 1 hora |
| **Puntos Reales** | 1 hora 30 minutos |
| **Beneficio Comercial** | Facilitar a los usuarios la gestion segura de sus contraseñas |
| **Requisitos Previos** | Ninguno |
| **Criterios de Aceptación** | Los usuarios pueden agregar contraseñas asociadas a sitios. <br> - La aplicación ofrece la opción de generar contraseñas seguras automáticamente o permite al usuario crear una personalizada. <br> -Las contraseñas deben tener un mínimo de 8 caracteres de longitud. |
| **Notas Técnicas** | La generación automática de contraseñas debe seguir estándares de seguridad robustos. |
| **Historial de Cambios** | Fecha: 2024-01-06 <br> Autor: Kevin Cano |

| Campo | Descripción |
|-------|-------------|
| **ID de Historia** | US002 |
| **Nombre de la Historia** | Visualización de Contraseñas |
| **Descripción** | Como usuario, deseo ver una lista organizada de sitios y contraseñas almacenadas de manera clara y sencilla. |
| **Rol del Usuario** | Usuario |
| **Objetivo** | Facilitar a los usuarios la visualización de sus contraseñas almacenadas de forma legible. |
| **Iteración Asignada** | 2 |
| **Prioridad en Negocio** | Alta |
| **Riesgo en Desarrollo** | Baja |
| **Puntos Estimados** | 30 minutos |
| **Puntos Reales** | 30 minutos |
| **Beneficio Comercial** | Mejorar la usabilidad del gestor de contraseñas. |
| **Requisitos Previos** |  Creación de contraseñas implementada |
| **Criterios de Aceptación** |  Los usuarios pueden ver una lista organizada de sitios y contraseñas almacenadas. <br> - La visualización de contraseñas es clara y fácil de entender. |
| **Notas Técnicas** | No perder la seguridad de las contraseñas en ningun momento |
| **Historial de Cambios** | Fecha: 2024-01-06 <br> Autor: Kevin Cano |

| Campo | Descripción |
|-------|-------------|
| **ID de Historia** | US003 |
| **Nombre de la Historia** | Actualización de Contraseñas |
| **Descripción** | Como usuario, quiero poder actualizar mis contraseñas existentes, ya sea generando nuevas contraseñas automáticamente o ingresando actualizaciones personalizadas. |
| **Rol del Usuario** | Usuario |
| **Objetivo** | Permitir a los usuarios modificar sus contraseñas existentes según sus necesidades. |
| **Iteración Asignada** | 2 |
| **Prioridad en Negocio** | Alta |
| **Riesgo en Desarrollo** | Medio |
| **Puntos Estimados** | 1 hora |
| **Puntos Reales** | 3 horas |
| **Beneficio Comercial** | Mejorar la seguridad y flexibilidad de las contraseñas almacenadas. |
| **Requisitos Previos** | Creación de contraseñas implementada |
| **Criterios de Aceptación** |  Los usuarios pueden actualizar sus contraseñas existentes. <br> - La actualización puede ser automática o personalizada. |
| **Notas Técnicas** | La actualización debe ser sencilla y falcil de entender para el usuario |
| **Historial de Cambios** | Fecha: 2024-01-06 <br> Autor: Kevin Cano |

| Campo | Descripción |
|-------|-------------|
| **ID de Historia** | US004 |
| **Nombre de la Historia** | Borrado de Contraseñas |
| **Descripción** | Como usuario, necesito la opción de eliminar contraseñas cuando ya no sean necesarias, evitando eliminaciones accidentales. |
| **Rol del Usuario** | Usuario |
| **Objetivo** | Proporcionar a los usuarios una forma segura de eliminar contraseñas obsoletas o innecesarias. |
| **Iteración Asignada** | 3 |
| **Prioridad en Negocio** | Media |
| **Riesgo en Desarrollo** | Baja |
| **Puntos Estimados** | 30 minutos |
| **Puntos Reales** | |
| **Beneficio Comercial** | Mejorar la gestión y seguridad de las contraseñas almacenadas. |
| **Requisitos Previos** | Mejorar la gestión y seguridad de las contraseñas almacenadas. |
| **Criterios de Aceptación** | - Los usuarios pueden eliminar contraseñas de la lista. <br> - Se requiere confirmación antes de la eliminación para prevenir accidentes. |
| **Notas Técnicas** | Ninguna |
| **Historial de Cambios** | Fecha: 2024-01-06 <br> Autor: Kevin Cano |

| Campo | Descripción |
|-------|-------------|
| **ID de Historia** | US005 |
| **Nombre de la Historia** | Persistencia y formato de almacenamiento |
| **Descripción** | Como usuario, deseo que las contraseñas se almacenen de manera segura en archivos locales utilizando un sistema de cifrado para proteger la información sensible. Además, quiero que cada entrada en el gestor de contraseñas se guarde en un formato claro y legible, facilitando la lectura y búsqueda de contraseñas. |
| **Rol del Usuario** | Usuario |
| **Objetivo** | Asegurar la integridad y seguridad de las contraseñas almacenadas y optimizar la accesibilidad y búsqueda de las mismas. |
| **Iteración Asignada** | 1 |
| **Prioridad en Negocio** | Alta |
| **Riesgo en Desarrollo** | Alto |
| **Puntos Estimados** | 1 hora |
| **Puntos Reales** | 1 hora 30 minutos |
| **Beneficio Comercial** | Incrementar la confianza de los usuarios en la seguridad de la aplicación y mejorar la usabilidad y eficiencia del gestor de contraseñas. |
| **Requisitos Previos** | Actualización y Borrado de contraseñas implementados |
| **Criterios de Aceptación** | - Las contraseñas se almacenan de manera segura en archivos locales con un sistema de cifrado. <br> - Cada entrada se guarda en el formato "SITIO DE CONTRASEÑA: CONTRASEÑA" para facilitar su lectura y búsqueda. |
| **Notas Técnicas** | La información de las contraseñas debe ser segura, legible y fácil de entender para el usuario. |
| **Historial de Cambios** | Fecha: 2024-01-07 <br> Autor: Kevin Cano |


## Tecnologías y Herramientas

- **Lenguaje de Programación:** JAVA
- **Interfaz Gráfica:** Se implementará una interfaz gráfica para mejorar la experiencia del usuario.
- **Persistencia de Datos:** La información se almacenará en archivos locales.
- **Cifrado de Datos:** Se utilizarán algoritmos de cifrado para proteger las contraseñas almacenadas.

---

Este documento proporciona una visión general del proyecto, destacando sus objetivos principales y las tecnologías que se utilizarán. Si tienes alguna pregunta o necesitas más detalles, no dudes en preguntar.