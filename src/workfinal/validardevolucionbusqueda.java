
package workfinal;

import javax.swing.JOptionPane;

public class validardevolucionbusqueda 
{
    boolean verdad=false;
    public validardevolucionbusqueda() 
    {
        
    }
    
    public int devolucionced()
    {
        int cedula = 0;

        do {

            try {
                cedula=Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CEDULA EL REGISTRO PARA BUSCAR"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return cedula;
    }
    
    public int opcionbuscar()
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("POR QUE MEDIO DESEA BUSCAR EL EQUIPO"+"\n"+
                                                                  "1. SERIAL"+"\n"+
                                                                  "2. CEDULA DEL REGISTRO DE PRESTAMOS"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return opcion;
    }
    
    public int validarbuscarserialpc()
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SERIAL DEL COMPUTADOR A BUSCAR"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return opcion;
    }
    
    public int validarbuscarcedula()
    {
        int cedula = 0;

        do {

            try {
                cedula=Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CEDULA DEL REGISTRO PARA BUSCAR EL EQUIPO"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return cedula;
    }
    
    public int validarinventario()
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("INVENTARIO DEL REGISTRO DE PRESTAMOS COMPUTADORES Y TABLETS"+"\n"+
                                                            "¿CUAL INVENTARIO DESEA VER?"+"\n"+
                                                            "1.REGISTRO DE PRESTAMO INGENIEROS"+"\n"+
                                                            "2.REGISTRO DE PRESTAMOS DISEÑADORES"+"\n"));
                verdad = false;
                if(opcion>2)
                {
                    JOptionPane.showMessageDialog(null, "NO HAY VALORES PARA ESE ITEM");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return opcion;
    }
    
    
    
}
