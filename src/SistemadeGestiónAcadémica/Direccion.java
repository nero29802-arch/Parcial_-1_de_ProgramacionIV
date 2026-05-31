
package SistemadeGestiónAcadémica;

public class Direccion {
    
    private String provincia;
    private String ciudad;
    
    
    public Direccion(String provincia, String cuidad){
        this.provincia = provincia;
        this.ciudad = cuidad;
    }
    
     
  // Getters and Setter
    
    
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString() {
        return ciudad + ", " + provincia;
    }
    
}