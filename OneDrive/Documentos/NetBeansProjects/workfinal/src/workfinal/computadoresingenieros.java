
package workfinal;

public class computadoresingenieros 
{
    
    String marca,sistema,procesador;
    double pulgadas,precio;
    int serialpc;

    public computadoresingenieros(String marca, String sistema, String procesador, double pulgadas, double precio, int serialpc) {
        this.marca = marca;
        this.sistema = sistema;
        this.procesador = procesador;
        this.pulgadas = pulgadas;
        this.precio = precio;
        this.serialpc = serialpc;
    }

    public computadoresingenieros() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
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

    public int getSerialpc() {
        return serialpc;
    }

    public void setSerialpc(int serialpc) {
        this.serialpc = serialpc;
    }

    

    
}
