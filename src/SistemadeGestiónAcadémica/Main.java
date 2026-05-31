
package SistemadeGestiónAcadémica;


import java.util.ArrayList;

public class Main { // creacion de una clase main # Unidad 3
    
    public static void main(String[] args) {

        // aca se hace la creacion de una lista para iniciar la aplicacion del polimorfismo # Unidad 3
        ArrayList<Persona> lista = new ArrayList<>();

        // Se crean objetos de tipo Estudiante # Unidad 3
        lista.add(new Estudiante(
                "Breyner",
                "208800894",
                new Direccion("Puntarenas", "Paso canoas"),
                "Ingeniería en Sistemas"
        ));
        
          // Se crean objetos de tipo Docente # Unidad 3
          lista.add(new Docente(
                "Jose andres",
                "109284024",
                new Direccion("Heredia", "Barva"),
                "Programación"
        ));

        // Aca se recorre la lista aplicando el uso del polimorfismo # Unidad 3
        for (Persona p : lista) {
            p.describirRol();
            System.out.println("----------------------");
        }
    }
 
}
