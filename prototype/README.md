## Patron de Diseño Prototype

El patrón de diseño Prototype es un patrón creacional que se utiliza para crear nuevos objetos a partir de un prototipo existente.

### *Que necesitamos para crear el patron de Diseño Prototype?*

- Prototipo (Prototype): Es una interfaz o clase abstracta que declara el método para clonar el objeto.
- Concreto Prototipo (Concrete Prototype): Las implementaciones de los prototipos.
- Cliente (Client): Solicita la clonacion de los objetos

### *Ventajas*

- Costo: Clonarlos es menos costosos que crearlo asi que Optimizamos recursos
- Flexibilidad: Permite crear nuevos objetos con pequeñas variaciones


### *Desventajas*
- clonacion: La clonacion excesiva puede sobrecargar la memoria