/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workfinal;


public class prestamoingenieros 
{
    
    String nombre,apellido,computador,procesador,sistema;
    int cedula;

    public prestamoingenieros(String nombre, String apellido, String computador, String procesador, String sistema, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.computador = computador;
        this.procesador = procesador;
        this.sistema = sistema;
        this.cedula = cedula;
    }

    public prestamoingenieros() 
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

    public String getComputador() {
        return computador;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
    
    
}
