
package workfinal;

public class tabletsdiseñadores 
{
    String marca,almacenamiento;
    double tamaño,precio;
    int serial;
    double peso;

    public tabletsdiseñadores(String marca, String almacenamiento, double tamaño, double precio, int serial, double peso) {
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.tamaño = tamaño;
        this.precio = precio;
        this.serial = serial;
        this.peso = peso;
    }

    public tabletsdiseñadores() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

   
}
