
package workfinal;

import javax.swing.JOptionPane;

public class validacionmodificar 
{

    boolean verdad=false;
    public validacionmodificar() 
    {
        
    }
    
    public int modificarcedula()
    {
        int cedula = 0;

        do {

            try {
                cedula=Integer.parseInt(JOptionPane.showInputDialog("MODIFICAR REGISTRO DE PRESTAMO"+"\n"+
                                                         "DIGITE LA CEDULA DEL REGISTRO A MODIFICAR"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return cedula;
    }
    
    public int validarmenumodificaringe()
    {
       int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("¿QUE VALOR DESEA MODIFICAR DEL REGISTRO DE SU PRESTAMO"+"\n"+
                                                                              "1. NOMBRE"+"\n"+
                                                                              "2. APELLIDO"+"\n"+
                                                                              "3. CEDULA"+"\n"+
                                                                              "4. COMPUTADOR"+"\n"+
                                                                              "5. PROCESADOR"+"\n"+
                                                                              "6. SISTEMA"+"\n"+
                                                                              "7. MOSTRAR CAMBIOS"+"\n"+
                                                                              "8. SALIR"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS,NO SE ACEPTAN ESPACIOS EN BLANCO");
                verdad = true;

            }

        } while (verdad == true);
        return opcion; 
    }
    
    public int validarmodificarcomputador(String pc,String testopc)
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("ACTUALMENTE TIENES EL COMPUTADOR"+" "+pc+"\n"+
                                                                   "POR CUAL DE LAS SIGUENTES DESEAS CAMBIARLO:"+"\n"+testopc));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS,NO SE ACEPTAN ESPACIOS EN BLANCO");
                verdad = true;

            }

        } while (verdad == true);
        return opcion; 
    }
    
    public int validarprocesador(String procesador)
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("ACTUALMENTE TIENES EL PROCESADOR"+" "+procesador+"\n"+
                                                                          "POR CUAL DE LOS SIGUIENTES LOS DESEAS CAMBIAR"+"\n"+
                                                                          "1.AMD Ryzen"+"\n"+
                                                                          "2.Intel Core !5"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS,NO SE ACEPTAN ESPACIOS EN BLANCO");
                verdad = true;

            }

        } while (verdad == true);
        return opcion; 
    }
    
    public int validarsistemamod(String sistema)
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("ACTUALMENTE TIENES EL SISTEMA"+" "+sistema+"\n"+
                                                                       "POR CUAL DE LOS SIGUIENTES LO DESEA CAMBIAR"+"\n"+
                                                                       "1. WINDOWS 7"+"\n"+
                                                                       "2. WINDOWS 10"+"\n"+
                                                                       "3. WINDOWS 11"+"\n"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS,NO SE ACEPTAN ESPACIOS EN BLANCO");
                verdad = true;

            }

        } while (verdad == true);
        return opcion; 
    }
    
    public int modificarmenudiseñadores()
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("¿QUE VALOR DESEA MODIFICAR DEL REGISTRO DE SU PRESTAMO"+"\n"+
                                                                              "1. NOMBRE"+"\n"+
                                                                              "2. APELLIDO"+"\n"+
                                                                              "3. CEDULA"+"\n"+
                                                                              "4. TABLET"+"\n"+
                                                                              "5. ALMACENAMIENTO"+"\n"+
                                                                              "6. MOSTRAR CAMBIOS"+"\n"+
                                                                              "7. SALIR"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS,NO SE ACEPTAN ESPACIOS EN BLANCO");
                verdad = true;

            }

        } while (verdad == true);
        return opcion; 
    }
    
    public int validarceduladiseñadoresingenieros()
    {
       int cedula = 0;

        do {

            try {
                cedula=Integer.parseInt(JOptionPane.showInputDialog("MODIFIQUE O ACTUALICE SU CEDULA"+"\n"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS");
                verdad = true;

            }

        } while (verdad == true);
        return cedula; 
    }
    
    public int validartabletmodificacion(String tab,String testotab)
    {
       int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("ACTUALMENTE TIENES LA TABLET"+" "+tab+"\n"+
                                                                   "POR CUAL DE LAS SIGUENTES DESEA CAMBIARLA:"+"\n"+testotab));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS,NO SE ACEPTAN ESPACIOS EN BLANCO");
                verdad = true;

            }

        } while (verdad == true);
        return opcion;  
    }
    
    public int validaralmacenamientotab(String cap)
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("ACTUALMENTE TIENES EL ALMACENAMIENTO"+" "+cap+"\n"+
                                                                          "POR CUAL DE LOS SIGUIENTES LOS DESEAS CAMBIAR"+"\n"+
                                                                          "1. 256 GB"+"\n"+
                                                                          "2. 512 GB"+"\n"+
                                                                          "3. 1 TB"));
                verdad = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE NUMEROS NO LETRAS,NO SE ACEPTAN ESPACIOS EN BLANCO");
                verdad = true;

            }

        } while (verdad == true);
        return opcion;  
    }
    
    
    
}
