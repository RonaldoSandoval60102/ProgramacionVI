## Que es un patron de diseño?

Un patrón de diseño es una solución común y probada para un problema específico en el diseño de software. Es como una receta que los programadores pueden seguir para resolver problemas comunes de manera eficiente. Estos patrones ayudan a crear software más robusto y fácil de mantener.

## *En que tipos se divide los patrones de diseño?*

Se dividen en dos grupos, estos son:

Creacionales y Estructurales

## *patrones de diseño*
Patrones de Diseño de Creación:

- Singleton: Garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a ella.

- Prototype: Permite la creación de nuevos objetos mediante la copia de un prototipo existente, lo que es útil cuando la creación de un objeto es costosa.

- Builder: Facilita la construcción de un objeto complejo paso a paso, permitiendo configurar sus partes y finalmente obtener el objeto construido.

- Factory (Factory Method): Define una interfaz para crear objetos, pero permite que las subclases determinen la clase concreta a instanciar. Esto promueve la creación de objetos sin especificar su clase exacta.

Patrones de Diseño Estructurales:

- Adapter: Permite que las interfaces de clases existentes sean utilizadas como si fueran interfaces diferentes. Se utiliza para que dos clases con interfaces incompatibles puedan trabajar juntas.

- Decorator: Agrega comportamiento adicional a un objeto existente sin modificar su estructura. Permite la extensión dinámica de las funcionalidades de los objetos.

- Proxy: Actúa como un intermediario para controlar el acceso a un objeto. Puede utilizarse para realizar tareas como control de acceso, carga perezosa o registro.

- Facade: Proporciona una interfaz unificada a un conjunto de interfaces en un subsistema. Simplifica y unifica la interacción con múltiples clases o componentes, ocultando la complejidad del sistema subyacente.

## *Cuando se utiliza?*

- Singleton: Se utiliza cuando se necesita garantizar que una clase tenga una única instancia en todo el sistema. Esto es útil, por ejemplo, para compartir recursos globales como conexiones a bases de datos o registros de actividad.

- Prototype: Se utiliza cuando la creación de objetos es costosa y se desea crear nuevos objetos mediante la copia de un prototipo existente. Esto es útil en situaciones en las que la creación manual de cada objeto sería ineficiente.

- Builder: Se utiliza cuando se necesita construir objetos complejos paso a paso, permitiendo configurar sus partes y opciones de manera flexible. Es útil en la creación de objetos con muchas opciones configurables, como configuraciones de widgets o documentos.

- Factory (Factory Method): Se utiliza cuando se necesita delegar la creación de objetos a subclases, permitiendo que las subclases determinen la clase concreta a instanciar. Es útil para crear objetos sin conocer su clase exacta de antemano y para lograr flexibilidad en la creación de objetos.

Patrones Estructurales:

- Adapter: Se utiliza cuando se necesitan hacer que dos clases con interfaces incompatibles trabajen juntas. Es útil en la integración de bibliotecas o componentes de terceros que no son compatibles con la interfaz requerida por el sistema.

- Decorator: Se utiliza cuando se necesita agregar responsabilidades adicionales a un objeto de manera dinámica sin modificar su estructura. Es útil para extender las funcionalidades de los objetos sin afectar a otras instancias de la misma clase.

- Proxy: Se utiliza cuando se necesita controlar el acceso a un objeto, retrasar su creación o realizar tareas adicionales antes o después de su uso. Es útil en situaciones como la autenticación, la carga perezosa de recursos o el registro de acciones.

- Facade: Se utiliza cuando se necesita proporcionar una interfaz unificada y simplificada para un subsistema complejo. Es útil para ocultar la complejidad del sistema subyacente y proporcionar una forma más fácil de interactuar con él.