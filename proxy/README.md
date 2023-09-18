## Patron de Diseño Adapter

El patrón de diseño Proxy es un patrón estructural que actúa como intermediario o sustituto de otro objeto para controlar el acceso a este.
### *Que necesitamos para crear el patron de Diseño proxy?*

- Sujeto (Subject): Define una interfaz común tanto para el Sujeto Real como para el Proxy.

- Sujeto Real (Real Subject): Es la implementación real del objeto con el que el Proxy


- Proxy: Es una clase que implementa la misma interfaz que el Sujeto Real.

### *Tipos comunes de proxies:

- Proxy Virtual
- Proxy Remoto
- Prory de ProteccionS

### *Ventajas*

- Control de acceso: Permite controlar y limitar el acceso al Sujeto Real.

- Aislamiento: Proporciona un punto de entrada único para el Sujeto Real, lo que facilita la implementación de cambios o mejoras en el futuro.
