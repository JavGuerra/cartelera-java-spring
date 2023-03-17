![Logo Cinéfilos](src/main/resources/static/img/logo.svg)  

# Práctica final «Cartelera de Cine»

Práctica final del curso Desarrollo Web Java+Spring de Addeco  
Proyecto Digital School Erasmus+  
Enero-marzo 2023

## La práctica

Empleando **Java** y el framework **Spring**, se ha llevado a cabo la planificación e implementación de una aplicación web que permite a los usuarios listar cines, salas de cine y sus películas asociadas, y capacita a los usuarios registrados para modificar, mediante formularios, cada una de las entidades mencionadas.

En su desarrollo se ha empleado **Spring security**, **Tymeleaft** y **Bootstrap**. Se ha codificado usando **IntelliJ IDEA**.

La planificación y el desarrollo se han llevado a cabo usando **Trello** y **GitHub**.

Además de los requisitos solicitados para el MVP, la app implementa:

- Sprint Security para securización de rutas
- Registro de Usuario
- Refactorización de métodos
- Documentación JavaDoc
- Implementación de Logs

### Estado de la aplicación

La aplicación ha sido realizada en un plazo de cuatro semanas en las que, íbamos aplicando lo que aprendíamos por la mañana.  

Si bien su estado es inconcluso, habida cuenta de que la planificación inicial preveía implementar relaciones entre las distintas pantallas de la App, el código resultante ha sido revisado y cumple con los contenidos impartidos en el curso.  

Versión de la rama de desarrollo: revisión-javier.  

### Opciones de mejora

- Portada dinámica de la App  
- Lógica de negocio y estadísticas
- Gestión de excepciones  
- Testing  
- Diseño claro / oscuro
- Diseño responsive  
- Diseño accesible   
- Aviso legal y privacidad
- Despliegue  

## DEMO

Puede ver un video sobre la aplicación en: https://youtu.be/DfS8oC7WmDk

## Indicaciones de instalación

Tras clonar el repositorio, es necesario crear un usuario en la BBDD relacional llamado «**cinefilo**» con el password: «**ElPadrino2**» (sin comillas). Estos datos, así como el puerto por defecto de la app (**8082**), pueden ser alterados en el fichero «aplication.propieties», en resources.

Una vez iniciada la aplicación en local, se puede acceder a ella con la dirección: http://localhost:8082

Para hacer login, todos los usuarios registrados cuentan con la contraseña: **632541**

## Implicación de los autores

* **Javier Guerra**: Se ha encargado de la coordinación del equipo mediante Trello y de la planificación de las funcionalidades de la aplicación, corrección de errores detectados, securización de la app, documentación JavaDoc, funcionalidades de las entidades «user» y «address» y las propuesta de mejora de la app.


* **Dawid Lempicki**: Ha realizado la estructura de la entidad «room», el listado de películas y la presentación de la app.


* **Pedro Rivas**: Se ha encargado de la gestión del repositorio en GitHub, y las funcionalidades de las entidades de «cinema» y «room».


* **Eduardo González**: Ha realizado el diseño CSS y las funcionalidades de la entidad de «film», la estructura de la entidad «user», y el listado de películas.

## Licencia

Sobre el código fuente: [GNU GENERAL PUBLIC LICENSE Version 3](LICENSE)  

## Saber más

- [Artículo informativo sobre la práctica en mi blog](https://javguerra.github.io/2023-03-17-cartelera-java-spring/)