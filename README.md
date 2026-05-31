# Sistema de Gestión Académica

## Descripción del sistema

El Sistema de Gentión Académica en una aplicación de conosola en Java
que permite administrar distintos tipos de personas dentro de una misma institución
educativa.

## Integrantes del grupo

| # | Nombre completo |
|---|----------------|
| 1 | Jason Ortiz Tenorio
| 2 | Joselyn Tatinana Rodriguez Bonilla
| 3 | Breyner Mora Jimenez
| 4 | Pamela Maria Serrano Montiel 

---

## Temas aplicados

- Clases y objetos
- Encapsulamiento (atributos privados, getters y setters)
- Variable `final`
- Palabra reservada `this`
- Composición (Persona tiene una Direccion)
- Enumeración `enum` (TipoPersona)
- Método estático (Utilidades)
- Herencia (`extends`, superclase, subclases)
- Constructores y uso de `super`
- Clase abstracta y métodos abstractos
- Polimorfismo (lista de tipo Persona con objetos Estudiante y Docente)
- Interfaz (`Evaluable`)
- Método `final`
- Manejo de errores con bloques `try-catch`
- Jerarquía de excepciones en Java (Throwable, Exception, RuntimeException)
- Excepción personalizada (`DatoInvalidoException`)
- Propagación de excepciones con `throws`
- Git y GitHub (ramas, commits, pull requests)

---
## Aporte de cada integrante

### Integrante 1
- Clase `Persona` (abstracta): atributos privados, variable `final`, getters/setters, uso de `this`, método `final mostrarIdentificacion()`, método abstracto `describirRol()`.
- Clase `Direccion`: atributos `provincia` y `ciudad`, composición con Persona.
- Enumeración `TipoPersona`: valores ESTUDIANTE y DOCENTE.
- Clase `Utilidades`: método estático `mostrarBienvenida()`.

### Integrante 2 
- Clase `Estudiante`: hereda de Persona, agrega atributo `carrera`, constructor con `super`.
- Clase `Docente`: hereda de Persona, agrega atributo `especialidad`, constructor con `super`.
- Implementación del método `describirRol()` en ambas subclases.
- Demostración de la relación superclase–subclase.

### Integrante 3
- Interfaz `Evaluable` con método `evaluar()`.
- Implementación de `Evaluable` en la clase `Estudiante`.
- Lista polimórfica de tipo `Persona` en la clase `Main`.
- Recorrido de la lista invocando métodos polimórficos.

### Integrante 4 
- Clase `DatoInvalidoException` (excepción personalizada).
- Validaciones de datos vacíos e inválidos con `try-catch`.
- Uso de `NumberFormatException` e `IllegalArgumentException`.
- Propagación de excepciones con `throws`.
- Menú principal interactivo en `Main.java`.
- Comentarios explicando la jerarquía de excepciones en Java.

