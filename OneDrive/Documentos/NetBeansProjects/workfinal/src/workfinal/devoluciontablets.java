
package workfinal;


import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class devoluciontablets 
{
    static List<prestamodiseñadores> listdise=new LinkedList<>();
    validardevolucionbusqueda vdb=new validardevolucionbusqueda();
    public devoluciontablets() 
    {
        listdise=mostrarprestamodise.listaregistrodise;
    }
    
    public void devolucion()
    {
        int ced=0;
        boolean encontrado = false;
        ced=vdb.devolucionced();
        
        for(int i=0;i<listdise.size();i++)
        {
            if(ced==listdise.get(i).getCedula())
            {
                listdise.remove(i);
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
           mostrarlistadiseñadores();
        }
    }
    
    public void mostrarlistadiseñadores()
    {
        if(listdise.isEmpty())
        { 
           JOptionPane.showMessageDialog(null, "NO HAY REGISTROS");
        }
        else
        {
            String texto="";
             for(prestamodiseñadores item:listdise)
             {
                 texto=texto+"NOMBRE:"+" "+item.getNombre()+"\n"+
                             "APELLIDO:"+" "+item.getApellido()+"\n"+
                             "CEDULA:"+" "+item.getCedula()+"\n"+
                             "TABLET:"+" "+item.getMarcat()+"\n"+
                             "ALMACENAMIENTO:"+" "+item.getAlmacenamiento()+"\n"+"\n";
                
             }
             texto=texto+"\n";
        
             JOptionPane.showMessageDialog(null,"REGISTRO DE PRESTAMOS DE DISEÑADORES CON DATO BORRADO"+"\n"+texto);
        }
       
    }
    
    
    
}
