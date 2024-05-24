
package workfinal;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;



public class mostrarinventario 
{
    static List<prestamodiseñadores> listaprestamodise=new LinkedList<>();
    static List<prestamoingenieros> listaprestamoing=new LinkedList<>();
    validardevolucionbusqueda vdb=new validardevolucionbusqueda();
    public mostrarinventario() 
    {
        listaprestamodise=mostrarprestamodise.listaregistrodise;
        listaprestamoing=mostrarprestamoing.listaprestamoing;
    }
    
    public void prestamoestudiantes()
    {
        int op=vdb.validarinventario();
        
        switch(op)
        {
            case 1:
            mostrarregistroingenieros();
            break;
            
            case 2:
            mostrarregistrodiseñadores();
            break;
                    
        }
                
    }
    
    public void mostrarregistroingenieros()
    {
        if (listaprestamoing.isEmpty()) {
            JOptionPane.showMessageDialog(null, "AUN NO SE HAN REGISTRADO PRESTAMOS DE EQUIPOS DE COMPUTADOR");
           
        } else {
            String texto = "";

            for (prestamoingenieros item : listaprestamoing) {
                texto = texto + "NOMBRE:" + " " + item.getNombre() + "\n"
                        + "APELLIDO:" + " " + item.getApellido() + "\n"
                        + "CEDULA:" + " " + item.getCedula() + "\n"
                        + "COMPUTADOR:" + " " + item.getComputador() + "\n"
                        + "PROCESADOR:" + " " + item.getProcesador() + "\n"
                        + "SISTEMA:" + " " + item.getSistema() + "\n"
                        + "\n";
            }
            texto = texto + "\n";

            JOptionPane.showMessageDialog(null, "REGISTRO DE PRESTAMOS DE INGENIERIA" + "\n" + texto);
        }
    }
    
    public void mostrarregistrodiseñadores()
    {
        if(listaprestamodise.isEmpty())
        {
             JOptionPane.showMessageDialog(null, "AUN NO SE HAN REGISTRADO PRESTAMOS DE EQUIPOS DE TABLETS");
        }
        else
        {
            String texto="";
        
        for(prestamodiseñadores item:listaprestamodise)
        {
            texto=texto+"NOMBRE:"+" "+item.getNombre()+"\n"+
                        "APELLIDO:"+" "+item.getApellido()+"\n"+
                        "CEDULA:"+" "+item.getCedula()+"\n"+
                        "MARCA TAB:"+" "+item.getMarcat()+"\n"+
                        "ALMACENAMIENTO:"+" "+item.getAlmacenamiento()+"\n"+"\n";
                        
        }
        
        JOptionPane.showMessageDialog(null, "REGISTRO DE PRESTAMOS DE TABLETS"+"\n"+texto);
        }
    }
    
    
    
    
    
}
