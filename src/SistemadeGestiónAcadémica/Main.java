package SistemadeGestiónAcadémica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main { // creacion de una clase main # Unidad 3

    // Metodo para validar datos # Unidad 4
    public static void validarTexto(String texto, String campo)
            throws DatosAcademicosException {

        try {

            // Validación para evitar campos vacíos # Unidad 4
            if (texto == null || texto.trim().isEmpty()) {
                throw new DatosAcademicosException(
                        "El campo " + campo + " es obligatorio.");
            }

        } catch (DatosAcademicosException e) {

            // Se captura y vuelve a lanzar la excepción con un mensaje más claro # Unidad 4
            throw new DatosAcademicosException(
                    "Verifique la informacion: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Explicación de excepciones en Java # Unidad 4

        Exception es la clase utilizada para manejar errores
        que pueden ocurrir durante la ejecución del programa.

        NumberFormatException se produce cuando el usuario
        ingresa texto en lugar de un número.

        IllegalArgumentException se utiliza cuando se selecciona
        una opción inválida dentro del menú.

        DatosAcademicosException es una excepción personalizada
        creada para validar los datos ingresados en el sistema.
        */

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

        // Variable para controlar la ejecución del menú principal # Unidad 4
        int opcion = 0;

        // Ciclo que mantiene el programa en ejecución hasta que el usuario seleccione salir # Unidad 4
        while (opcion != 5) {

            try {

                // Menú principal del sistema # Unidad 4
                System.out.println("\n --- MENU PRINCIPAL ----");
                System.out.println("1- Registrar estudiante");
                System.out.println("2- Registrar docente");
                System.out.println("3- Mostrar personas");
                System.out.println("4- Buscar persona");
                System.out.println("5- Salir");
                System.out.print("Indique una opcion: ");

                // Conversión de texto a número para seleccionar una opción del menú # Unidad 4
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:

                        // Registro de estudiantes mediante entrada de datos por teclado # Unidad 4

                        System.out.print("Nombre: ");
                        String nombreEst = sc.nextLine();
                        validarTexto(nombreEst, "nombre");

                        System.out.print("Identificación: ");
                        String idEst = sc.nextLine();
                        validarTexto(idEst, "identificación");

                        System.out.print("Provincia: ");
                        String provinciaEst = sc.nextLine();
                        validarTexto(provinciaEst, "provincia");

                        System.out.print("Ciudad: ");
                        String ciudadEst = sc.nextLine();
                        validarTexto(ciudadEst, "ciudad");

                        System.out.print("Carrera: ");
                        String carrera = sc.nextLine();
                        validarTexto(carrera, "carrera");

                        // Creación y almacenamiento del estudiante en la lista # Unidad 4
                        lista.add(new Estudiante(
                                nombreEst,
                                idEst,
                                new Direccion(provinciaEst, ciudadEst),
                                carrera
                        ));

                        System.out.println("Estudiante registrado correctamente.");
                        break;

                    case 2:

                        // Registro de docentes mediante entrada de datos por teclado # Unidad 4

                        System.out.print("Nombre: ");
                        String nombreDoc = sc.nextLine();
                        validarTexto(nombreDoc, "nombre");

                        System.out.print("Identificación: ");
                        String idDoc = sc.nextLine();
                        validarTexto(idDoc, "identificación");

                        System.out.print("Provincia: ");
                        String provinciaDoc = sc.nextLine();
                        validarTexto(provinciaDoc, "provincia");

                        System.out.print("Ciudad: ");
                        String ciudadDoc = sc.nextLine();
                        validarTexto(ciudadDoc, "ciudad");

                        System.out.print("Especialidad: ");
                        String especialidad = sc.nextLine();
                        validarTexto(especialidad, "especialidad");

                        // Creación y almacenamiento del docente en la lista # Unidad 4
                        lista.add(new Docente(
                                nombreDoc,
                                idDoc,
                                new Direccion(provinciaDoc, ciudadDoc),
                                especialidad
                        ));

                        System.out.println("Docente registrado correctamente.");
                        break;

                    case 3:

                        // Aca se recorre la lista aplicando el uso del polimorfismo # Unidad 3
                        for (Persona p : lista) {
                            p.describirRol();
                            System.out.println("----------------------");
                        }

                        break;

                    case 4:

                        // Búsqueda de personas por identificación # Unidad 4
                        System.out.print("Ingrese la identificación a buscar: ");
                        String buscarId = sc.nextLine();

                        boolean encontrado = false;

                        // Recorrido de la lista para localizar la persona solicitada # Unidad 4
                        for (Persona p : lista) {

                            if (p.getIdentificacion().equals(buscarId)) {

                                System.out.println("\nPersona encontrada:");
                                System.out.println(p);

                                encontrado = true;
                                break;
                            }
                        }

                        // Mensaje cuando la identificación no existe # Unidad 4
                        if (!encontrado) {
                            System.out.println(
                                    "El numero de identificacion no coincide con ninguna persona del sistema.");
                        }

                        break;

                    case 5:

                        // Finalización controlada del programa # Unidad 4
                        System.out.println("Cerrando Sesion...");
                        break;

                    default:

                        // Generación de excepción para opciones inválidas # Unidad 4
                        throw new IllegalArgumentException(
                                "Opcion incorrecta.");
                }

            } catch (NumberFormatException e) {

                // Captura errores cuando se ingresa texto en lugar de números # Unidad 4
                System.out.println(
                        "Por favor, ingrese un dato numerico que sea valido.");

            } catch (DatosAcademicosException e) {

                // Captura errores generados por la excepción personalizada # Unidad 4
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {

                // Captura errores por opciones inválidas del menú # Unidad 4
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}