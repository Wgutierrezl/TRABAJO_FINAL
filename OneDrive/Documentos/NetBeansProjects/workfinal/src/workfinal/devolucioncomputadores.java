
package workfinal;


import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class devolucioncomputadores 
{
    static List<prestamoingenieros> listadev=new LinkedList<>();
    validardevolucionbusqueda vdb=new validardevolucionbusqueda();
    
    public devolucioncomputadores() 
    {
        listadev=mostrarprestamoing.listaprestamoing;
    }
    
    public void devoluciones()
    {
        int ced=0;
        boolean encontrado = false;
        ced=vdb.devolucionced();
        
        for(int i=0;i<listadev.size();i++)
        {
            if(ced==listadev.get(i).getCedula())
            {
                listadev.remove(i);
                encontrado=true;
                break;
            }
        }
        if (!encontrado) 
        {
           JOptionPane.showMessageDialog(null, "EL REGISTRO NO EXISTE");
        } 
        else 
        {
           mostrarlista();
        }
        
//        if(contp==listadev.size())
//        {
//            JOptionPane.showMessageDialog(null, "EL REGISTRO NO EXISTE");
//        }
//        
//        listadev.remove(eliminar);
//        mostrarlista();
        
    }
    
    public void mostrarlista()
    {
        if(listadev.isEmpty())
        { 
           JOptionPane.showMessageDialog(null, "NO HAY REGISTROS");
        }
        else
        {
            String texto="";
             for(prestamoingenieros item:listadev)
             {
                 texto=texto+"NOMBRE:"+" "+item.getNombre()+"\n"+
                             "APELLIDO:"+" "+item.getApellido()+"\n"+
                             "CEDULA:"+" "+item.getCedula()+"\n"+
                             "COMPUTADOR:"+" "+item.getComputador()+"\n"+
                             "PROCESADOR"+" "+item.getProcesador()+"\n"+
                             "SISTEMA"+" "+item.getSistema()+"\n"+"\n";
             }
             texto=texto+"\n";
        
             JOptionPane.showMessageDialog(null,"REGISTRO DE PRESTAMOS DE INGENIEROS CON DATO BORRADO"+"\n"+texto);
        }
       
    }
    
    
    
    
    
}
