## Patron de Diseño Builder

El patron de diseño creacional que nos ayuda a construir objectos complejos.
Un objectos complejo es un objecto que tiene muchos atributos en el consctutor volviendolo complejo de construir 

### *Que necesitamos para crear el patron de Diseño builder?*

- Director (Director) (opcional): Se comunica con el Builder para coordinar el proceso de construcción del objeto. El Director no es necesario en todas las implementaciones del patrón Builder, pero puede ser útil para guiar la secuencia de construcción de objetos complejos si es necesario.

- Builder (Constructor): El Builder define como construir las partes del objeto y proporciona métodos para configurar y ensamblar el objeto. El Builder no crea directamente el objeto final, sino que coordina la construcción de sus partes. Puede haber varias implementaciones de Builder para construir diferentes representaciones del mismo objeto.

- Product (Producto): El Producto es el objeto que se construye utilizando el patrón Builder. Es el resultado final de la construcción y contiene todas las partes configuradas por el Builder.

### *Ventajas*

- creacion: Hace mas facil la creacion de objetos
- Objetos: Permite crear objetos con varios atributos/configuraciones sin necesidad de utilizar constructores
- codigo: Vuelve el codigo mas legible


### *Desventajas*

- Objetos: Hay que saber en que casos utilizar. por que si utilizas el patron de diseño builder en objectos  solomente agregaremos una capa de complejidad innecesaria

- Crear el builder: Debes crear una clase Builder para cada tipo de objeto que desees construir
