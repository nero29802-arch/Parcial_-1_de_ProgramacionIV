/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadeGestiónAcadémica;

/**
 *
 * @author HP
 * Clase Docente que hereda de Persona.
 * Demuestra el uso de herencia con extends,
 * uso de super para llamar al constructor de la superclase,
 * y sobrescritura del método abstracto describirRol().
 */
public class Docente extends Persona {

    // Atributo específico de Docente
    private String especialidad;

    // Tipo de persona usando el enum
    private TipoPersona tipo;

    /**
     * Constructor de Docente.
     * Usa super() para inicializar los atributos heredados de Persona.
     */
    public Docente(String nombre, String identificacion, Direccion direccion, String especialidad) {
        // Llamada al constructor de la superclase Persona
        super(nombre, identificacion, direccion);
        this.especialidad = especialidad;
        this.tipo = TipoPersona.DOCENTE;
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
        System.out.println("=== ROL: DOCENTE ===");
        System.out.println("Nombre      : " + getNombre());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("País        : " + PAIS);
        mostrarIdentificacion();
    }

    @Override
    public String toString() {
        return "[ DOCENTE ] " + getNombre()
                + " | ID: " + getIdentificacion()
                + " | Especialidad: " + especialidad
                + " | Dirección: " + getDireccion()
                + " | País: " + PAIS;
    }
}

