/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workfinal;

/**
 *
 * @author Walter Gutierrez
 */
public class diseñadores 
{
     String nombre,apellido,modalidad;
    int cedula,semestre,telefono,asignaturasc,serial;
    double promedio;

    public diseñadores(String nombre, String apellido, String modalidad, int cedula, int semestre, int telefono, int asignaturasc, int serial, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.modalidad = modalidad;
        this.cedula = cedula;
        this.semestre = semestre;
        this.telefono = telefono;
        this.asignaturasc = asignaturasc;
        this.serial = serial;
        this.promedio = promedio;
    }

    public diseñadores() 
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

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
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

    public int getAsignaturasc() {
        return asignaturasc;
    }

    public void setAsignaturasc(int asignaturasc) {
        this.asignaturasc = asignaturasc;
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
