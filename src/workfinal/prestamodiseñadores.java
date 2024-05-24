
package workfinal;

public class prestamodiseñadores 
{
    String nombre,apellido,marcat,almacenamiento;
    int cedula;

    public prestamodiseñadores(String nombre, String apellido, String marcat, String almacenamiento, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.marcat = marcat;
        this.almacenamiento = almacenamiento;
        this.cedula = cedula;
    }

    public prestamodiseñadores() 
    {
        
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMarcat() {
        return marcat;
    }

    public void setMarcat(String marcat) {
        this.marcat = marcat;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
    
    
}
