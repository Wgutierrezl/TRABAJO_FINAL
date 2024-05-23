
package workfinal;

public class tabseleccion 
{
    int serial;
    String marca;
    double tamaño,peso,precio;

    public tabseleccion(int serial, String marca, double tamaño, double peso, double precio) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.peso = peso;
        this.precio = precio;
    }
    

    public tabseleccion() 
    {
        
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
}
