#  TALLER DISEÑO Y ESTRUCTURACIÓN DE APLICACIONES DISTRIBUIDAS EN INTERNET
El objetivo de este taller es escribir un servidor web que soporte múltiples solicitudes. El servidor debe leer los archivos del disco local y retornar todos los archivos solicitados, incluyendo páginas html, archivos java script, css e imágenes. A su vez, una aplicación web con javascript, css, e imágenes para probar el servidor. Incluya en la aplicación la comunicación asíncrona con servicios REST en el backend. NO se usarán frameworks web como Spark o Spring, únicamente Java y las librerías para manejo de la red.
## Instalación y Ejecución
El primer paso es instalar git y maven en su equipo, y luego de esto clonar el repositorio desde la terminal de la siguiente manera:
```
git clone https://github.com/leoncico/AREP-LAB01.git
``` 
Seguido de esto, se ingresa a la carpeta resultante y se ejecutan los siguientes comandos de Maven:
```
mvn clean install
```
A continuación, ingresa el último comando para ejecutar el servidor:
```
java -cp target/classes escuelaing.edu.co.arep.AREP
```
Y finalmente ingresa desde un Browser a la dirección [localhost:8080/rutine.html]() para interactuar con la aplicación web.
## Arquitectura
La arquitectura utilizada se alinea con el patrón de Cliente - Servidor, en el cual existe un servidor que aloja todos los recursos y uno o más clientes pueden acceder y usar estos recursos por medio de solicitudes que son respondidas con los servicios REST del Backend.
## Evaluación
Además de pruebas unitarias de las clases que implementaban reglas de negocio, se llevaron a cabo pruebas de usuario con las funcionalidades de la aplicación

![image](/src/main/resources/webroot/PantallaInicio.PNG)
![image](/src/main/resources/webroot/AgregandoEjercicios.PNG)