## Patron de Diseño Decorator

El patrón de diseño Decorator es un patrón estructural que permite agregar comportamiento adicional a un objeto.


### *Que necesitamos para crear el patron de Diseño Decorator?*

- Componente (Component):  Es una interfaz que compartiran todos los objetos

- Componente Concreto (Concrete Component): Es la implementacion del componente

- Decorador (Decorator): Es una clase abstracta que implementa la interfaz del componente y tiene una referencia a un componente concreto

- Decorador Concreto (Concrete Decorator): Es la implementacion del decorador. Este le da la nueva funcionalidad

### *Ventajas*

- Flexibilidad: Permite agregar y quitar funcionalidad/responsabilidad sin afectar a otros objetos.

- Codigo Simplificado: Evitamos crear clases complejas