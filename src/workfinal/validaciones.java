
package workfinal;

import javax.swing.JOptionPane;

public class validaciones 
{
    boolean verdad=false;
    public validaciones() 
    {
        
    }
    
    public int validarmenu()
    {
        int opcion = 0;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("UNIVERSIDAD SAN JOSE" + "\n"
                        + "1.ESTUDIANTES INGENIERIA" + "\n"
                        + "2.ESTUDIANTES DISEÑO" + "\n"
                        + "3.IMPRIMIR INVENTARIO" + "\n"
                        + "4.SALIR" + "\n"));
                verdad = false;
                
                if(opcion>4)
                {
                    JOptionPane.showMessageDialog(null, "NO HAY VALORES PARA ESE ITEM");
                    verdad=true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return opcion;
    }
    
    
    public int validarmenuingenieros()
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("PRESTAMO DE EQUIPOS DE COMPUTADOR PARA INGENIEROS"+"\n"+
                                                            "1.REGISTRAR PRESTAMO DE EQUIPO"+"\n"+
                                                            "2.MODIFICAR PRESTAMO DE EQUIPO"+"\n"+
                                                            "3.DEVOLUCION DE EQUIPO"+"\n"+
                                                            "4.BUSCAR EQUIPO"+"\n"+
                                                            "5.EXPORTAR REGISTRO DE INGENIEROS"+"\n"+
                                                            "6.VOLVER AL MENU PRINCIPAL"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return opcion;
    }
    
    public int validarmenudiseñadores()
    {
        int opcion = 0;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("PRESTAMO DE EQUIPOS DE TABLETS PARA DISEÑADORES" + "\n"
                        + "1.REGISTRAR PRESTAMO DE EQUIPO" + "\n"
                        + "2.MODIFICAR PRESTAMO DE EQUIPO" + "\n"
                        + "3.DEVOLUCION DE EQUIPO" + "\n"
                        + "4.BUSCAR EQUIPO" + "\n"
                        + "5.EXPORTAR LISTA DE DISEÑADORES" + "\n"
                        + "6.VOLVER AL MENU PRINCIPAL"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return opcion;
    }
    
    public int validarcedulaingenierosdiseñadores()
    {
        int cedula=0;
        do {

            try {
                cedula=Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU CEDULA"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return cedula;
    }
    
    public int validarserial()
    {
        int serial=0;
        do {

            try {
                serial=Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU SERIAL"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return serial;
    }
    
    public int validarsemestre()
    {
       int semestre=0;
        do {

            try {
                semestre=Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU SEMESTRE ACTUAL"));
                verdad = false;
                if(semestre>10)
                {
                    JOptionPane.showMessageDialog(null, "DIGITE UN SEMESTRE CORRECTO");
                    verdad=true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return semestre; 
    }
    
    public int validartelefono()
    {
        int telefono=0;
        do {

            try {
                telefono=Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU TELFONO"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return telefono;
    }
    
    public double validarpromedio()
    {
        double promedio=0;
        do {

            try {
                promedio=Double.parseDouble(JOptionPane.showInputDialog("DIGITE SU PROMEDIO"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return promedio;
    }
    
    public int validarasignaturas()
    {
        int asignaturas=0;
        do {

            try {
                asignaturas=Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUS ASIGNATURAS MATRICULADAS"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return asignaturas;
    }
    
    public int validarprestamopctab()
    {
        int opcion = 0;

        do {

            try {
                opcion =Integer.parseInt(JOptionPane.showInputDialog("DESEA SOLICITAR UN PRESTAMO"+"\n"+
                                                                    "1.SI"+"\n"+
                                                                    "2.NO"));
                verdad = false;
                if(opcion>2)
                {
                   JOptionPane.showMessageDialog(null, "NO HAY VALORES PARA ESE ITEM");
                   verdad=true; 
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return opcion;
    }
    
    
    
    
    
}
