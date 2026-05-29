/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadeGestiónAcadémica;

/**
 *
 * @author HP
 * Clase Estudiante que hereda de Persona.
 * Demuestra el uso de herencia con extends,
 * uso de super para llamar al constructor de la superclase,
 * y sobrescritura del método abstracto describirRol().
 */

//nueva clase Estudiante utilizando extends en la clase Persona y implementando un Evaluable # Unidad 3
public class Estudiante extends Persona implements Evaluable { // # modificado por la Unidad 3

    // Atributo específico de Estudiante
    private String carrera;

    // Tipo de persona usando el enum
    private TipoPersona tipo;

    /**
     * Constructor de Estudiante.
     * Usa super() para inicializar los atributos heredados de Persona.
     */
    public Estudiante(String nombre, String identificacion, Direccion direccion, String carrera) {
        // Llamada al constructor de la superclase Persona
        super(nombre, identificacion, direccion);
        this.carrera = carrera;
        this.tipo = TipoPersona.ESTUDIANTE;
    }

    // Getters y Setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void mostrarInfo() {
    System.out.println("=== INFORMACIÓN DEL ESTUDIANTE ===");
    System.out.println("Nombre      : " + getNombre());
    System.out.println("Carrera     : " + carrera);
    System.out.println("Dirección   : " + getDireccion());
    System.out.println("País        : " + PAIS);
    mostrarIdentificacion();
    }

    public TipoPersona getTipo() {
        return tipo;
    }   

    /**
     * Implementación del método abstracto describirRol() de Persona.
     * Cada subclase lo implementa de forma diferente (polimorfismo).
     */
    @Override
    public void describirRol() {
        System.out.println("=== ROL: ESTUDIANTE ===");
        System.out.println("Nombre : " + getNombre());
        System.out.println("Carrera: " + carrera);
        System.out.println("País   : " + PAIS);
        mostrarIdentificacion();
    }

    @Override
    public String toString() {
        return "[ ESTUDIANTE ] " + getNombre()
                + " | ID: " + getIdentificacion()
                + " | Carrera: " + carrera
                + " | Dirección: " + getDireccion()
                + " | País: " + PAIS;
    }
    
    @Override // # Agregado por la Unidad 3
    public void evaluar() {
         System.out.println("Evaluando estudiante: " + getNombre());
    }
    // nuevo metodo override para evaluar al estudiante # Unidad 3
    
}

