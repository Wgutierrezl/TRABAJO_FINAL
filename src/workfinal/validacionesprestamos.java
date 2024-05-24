
package workfinal;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;



public class validacionesprestamos 
{
    boolean verdad=false;
    static List<pcseleccion> listcompu=new LinkedList<>();
    static List<tabseleccion> listatabs=new LinkedList<>();
    public validacionesprestamos() 
    {
        listcompu=computadores.listapc;
        listatabs=tablets.listatab;
    }
    
    
    
    public int validarcomputador(String texto)
    {
        int opcion = 0;

        do {

            try {
                opcion =Integer.parseInt(JOptionPane.showInputDialog(texto+"CUAL DE LOS SIGUIENTES COMPUTADORES DESEA ESCOGER:"));
                verdad = false;
                
                if((opcion)>listcompu.size())
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
    
    public int validarprocesador()
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE EL SISTEMA DEL COMPUTADOR"+"\n"+
                                                                     "1. WINDOWS 7"+"\n"+
                                                                     "2. WINDOWS 10"+"\n"+
                                                                     "3. WINDOWS 11"+"\n"));
              
                verdad = false;
                if(opcion>3)
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
    
    public int validarsistema()
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE EL PROCESAOR DEL COMPUTADOR"+"\n"+
                                                                   "1.AMD Ryzen"+"\n"+
                                                                   "2.Intel Core !5"));
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
    
    public int validartablet(String textot)
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(textot+"CUAL DE LAS SIGUIENTES TABLETS DESEA ESCOGER:"));
                verdad = false;
                
                if((opcion)>listatabs.size())
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
    
    public int validaralmacenamiento()
    {
        int opcion = 0;

        do {

            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE EL ALMACENAMIENTO QUE DESEA DE LA TABLET"+"\n"+
                                                                          "1. 256 GB"+"\n"+
                                                                          "2. 512 GB"+"\n"+
                                                                          "3. 1 TB"+"\n"));
                verdad = false;
                if(opcion>3)
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
