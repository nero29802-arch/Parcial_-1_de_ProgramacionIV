
package SistemadeGestiónAcadémica;


public  abstract class Persona {
      // Variable final: su valor no puede cambiar una vez asignado
    public final String PAIS = "Costa Rica";
    private String nombre;
    private String identificacion;
   private Direccion direccion;
 
    // Constructor
    public Persona(String nombre, String identificacion, Direccion direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }
    
    
    /*
              Getters and Setters
    */
    
    
    public String getNombre() {
        return nombre;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getIdentiicacion() {
        return identificacion;
    }
    
    
   public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public Direccion getDireccion() {
        return direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    /*
                           Metodos 
    */
    
    
    public final void mostrarIdentificacion() {
        System.out.println("Identificación:" + this.identificacion);
    
    }
    
    
    public abstract void describirRol();
    
    
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " ID " + identificacion
                + "Dirección: " + direccion
                + "País: " + PAIS;
    }

}
