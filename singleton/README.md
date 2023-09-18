## Patron de Diseño Singleton

El patrón Singleton es un patrón de diseño creacional que garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a esa instancia desde cualquier parte del programa.

### *Que necesitamos para crear el patron de Diseño Singleton?*

- Constructor privado: Tenemos que poner un constructor privado para que este no permita crear mas instancias del mismo objeto.

- Metodo estatico de acceso: Crear un metodo getInstance() que actua como punto de acceso global del singleton.

### *Ventajas*

- Control: Controlamos que solo se cree una isntancia unica
- Acceso global: Tenemos un punto de acceso global para acceder al objeto
- Sincronizacion: Evitamos problemas de sincronizacion
