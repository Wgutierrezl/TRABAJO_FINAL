/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workfinal;


public class ingenieros 
{
    
    String nombre,apellido;
    int cedula,semestre,telefono,serial;
    double promedio;

    public ingenieros(String nombre, String apellido, int cedula, int semestre, int telefono, int serial, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.semestre = semestre;
        this.telefono = telefono;
        this.serial = serial;
        this.promedio = promedio;
    }

    public ingenieros() 
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }


    
    
    
}
