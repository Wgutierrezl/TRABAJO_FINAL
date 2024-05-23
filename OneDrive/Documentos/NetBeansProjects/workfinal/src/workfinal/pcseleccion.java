
package workfinal;

public class pcseleccion 
{
    int serial;
    String pc;
    double pulgadas,precio;

    public pcseleccion(int serial, String pc, double pulgadas, double precio) {
        this.serial = serial;
        this.pc = pc;
        this.pulgadas = pulgadas;
        this.precio = precio;
    }

    public pcseleccion() 
    {
        
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
}
