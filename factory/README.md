## Patron de Diseño Factory 

Este es un patron creacional que nos permite crear objectos sin tener que especificar su clase exacta

### *Que ventajas tiene no especificar la clase de la cual queremos crear el objeto*

- Desacoplamiento: Nos permitira aclopar y desaclopar mas facilmente el codigo si este cambia en el futuro (Permite agregar nuevas implementaciones mas facilmente)
- Objecto: Simplifica la creacion de Objectos y nos permite crearlos sin tener que conocer los detalles de cómo se crea.
- Codigo: Al utilizar una intefaz este nos permite reutilizar codigo de la creacion de objetos evitando asi el codigo duplicado.

### *Que necesitamos para crear el patron de Diseño factory?*

- Product(Producto): Es la interfaz  o clase abstracta que indica que tipo de objeto se va a crear.
- Creator(Creador): Es la clase abstracta que tiene el meodo abstracto factory el cual es el responsable de crear el objecto

- Concrete Creator(Creador Concreto) son los que mplementan el factory method para crear objectos

- Concrete Product (Producto Concreto): Son los objectos creados con el factory

### *Ventajas*

- Flexibilidad: Permite cambiar el objeto que se crea sin tener que modificar todo el codigo
- Desacoplamiento: Permite aclopar y desaclopar el codigo mas facilmente generando haci un codigo mas mantenible y escalable
- Reusabilidad: Se reutiliza el codigo de la creacion de objetos


