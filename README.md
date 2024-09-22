# Trueck: Sistema de Gestión Empresarial

## Descripción
**Trueck** es una aplicación desarrollada en Java utilizando JavaFX para gestionar de manera eficiente las operaciones de una empresa de transporte. La aplicación permite a los usuarios administrar información clave, como la gestión de vehículos, conductores, rutas y pedidos. El objetivo principal es proporcionar una interfaz intuitiva y funcionalidades que optimicen la gestión diaria de la empresa.

## Información del Proyecto
- **Nombre del Proyecto**: Trueck
- **Desarrollador**: Stiven De La Rosa Brito
- **Matrícula**: 2022-0457
- **Carrera**: Desarrollo de Software
- **Materia**: Programación 1
- **Sección**: Virtual
- **Profesor/a**: Freidy Núñez Pérez
- **Fecha de Creación**: 28 de octubre de 2022
- **Trabajo**: Proyecto Final

## Funcionalidades
- **Gestión de Vehículos**: Registro, modificación y eliminación de vehículos de la empresa, incluyendo detalles como matrícula, modelo y capacidad.
- **Gestión de Conductores**: Administración de la información de los conductores, como nombres, licencias y experiencia.
- **Planificación de Rutas**: Asignación de rutas para optimizar la logística de transporte.
- **Gestión de Pedidos**: Registro de pedidos, asignación de vehículos y conductores, seguimiento de estado y entrega.
- **Informes y Estadísticas**: Generación de informes sobre el rendimiento de la empresa y visualización de estadísticas relevantes.

## Requisitos
- **Java 11 o superior**: Requerido para ejecutar la aplicación con JavaFX.
- **JavaFX SDK**: Debe estar correctamente configurado en el proyecto.
- **Eclipse IDE**: Recomendado para desarrollo y pruebas.

## Instalación
1. **Descargar el Proyecto**:
   - Clona este repositorio en tu máquina local:
     ```bash
     git clone https://github.com/tu-usuario/trueck.git
     ```
2. **Configurar JavaFX**:
   - Descarga e instala el [JavaFX SDK](https://openjfx.io/) y configura la ruta en el proyecto.
   - Añade las librerías de JavaFX al proyecto en Eclipse (`Java Build Path` > `Libraries` > `Add External JARs...`).
   - En `Run Configurations` > `VM Arguments`, añade el siguiente argumento:
     ```bash
     --module-path "C:\ruta\a\javafx-sdk-23\lib" --add-modules javafx.controls,javafx.fxml
     ```
   - Asegúrate de ajustar la ruta según la ubicación del SDK en tu sistema.

3. **Ejecutar la Aplicación**:
   - Compila y ejecuta la clase principal `Main.java` desde tu entorno de desarrollo.

## Uso de la Aplicación
1. **Inicio de Sesión**: Accede a la aplicación utilizando credenciales de administrador.
2. **Navegación por el Menú**: Utiliza el menú principal para acceder a las diferentes secciones de gestión (vehículos, conductores, rutas y pedidos).
3. **Registro y Edición**: Registra nuevos datos o edita información existente a través de formularios fáciles de usar.
4. **Generación de Informes**: Accede a la sección de informes para obtener estadísticas y datos importantes de la empresa.

## Futuras Mejoras
- Integración con una base de datos para almacenamiento persistente de la información.
- Funcionalidades avanzadas de gestión de inventarios y clientes.
- Mejoras en la interfaz gráfica para una experiencia de usuario más intuitiva.

## Contribuciones
Este proyecto es de carácter académico, pero cualquier sugerencia o mejora es bienvenida. Si deseas contribuir, no dudes en abrir un `pull request` o contactar al desarrollador.
