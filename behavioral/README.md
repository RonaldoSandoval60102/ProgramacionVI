## Patron de Diseño Chain of Responsibility  

El patrón de diseño Chain of Responsibility (Cadena de Responsabilidad) es un patrón de diseño de comportamiento que se utiliza para pasar solicitudes en cadena.

Se base en constroladores que deciden si procesan la solicitud o no

### *Que necesitamos para crear el patron de diseño Chain of Responsibility ?*

- Handler (Manipulador): Esta es una interfaz o una clase abstracta que define un método "handleRequest"

- ConcreteHandler (Manipulador Concreto): Son las clases que implementan el "Handler"

- Client (Cliente):  Es el objeto que pide una solicitud

- Chain (Cadena): Puede ser una lista, arbol u otra estructura que conecte los controladores

### *Ventajas*
-  Principio de Responsabilidad Única 
-  Principio Abierto/Cerrado 


### *Desventajas*
- Como son aveces varias solicitudes algunas se quedan sin ser atendidas

## Patron de Diseño behavioral el visitor  

Este es un patron de diseño de comportamiento, lo utilizamos cuando queremos agregar nuevas operaciones/funcionalidades a una estructura de objetos ya existentes sin modificar la estructura

### *Que necesitamos para crear el patron de behavioral el visitor ?*

- Visitor (Visitante): Interfaz que define los metodos de visitante "visit"
- Concrete Visitor (Visitante Concreto): Es el que implementa la clase visitor
- Element(Elemento): Es una interfaz o clase abstracta que define el metodo "accept"
- Concrete Element (Elemento Concreto): Son las clases que implementan la interfaz element
- Object Structure (Estructura de Objetos): Es una coleccion de objetos que se pueden visitar. Puede ser una lista o un arbol

### *Cuando utilizamos este patron?*

- Se utiliza cuando se quiere evitar instrucciones como if o switch para determinar el tipo de objeto y la operacion

- Cuando necesitamos realizar distintas operaciones sin modificar la estructura actual 

### *Ventajas*

- Introduce un nuevo comportamiento que funciona con objectos diferentes
- Cumplimos el Principio de Responsabilidad Única 
- Un visitante puede acumular informacion util mientras trabaja con los demas objetos


### *Desventajas*

- Se tiene que actualizar todos los visitantes cada vez que se agrega o elimina una clase

- El visitante no puede tener acceso a metodos privados


