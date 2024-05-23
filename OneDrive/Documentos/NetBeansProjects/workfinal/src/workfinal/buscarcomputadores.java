
package workfinal;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class buscarcomputadores 
{
    static List<computadoresingenieros> listacpc=new LinkedList<>();
    static List<prestamoingenieros> listaconsul=new LinkedList<>();
    validardevolucionbusqueda vdb=new validardevolucionbusqueda();

    public buscarcomputadores() 
    {
       listacpc=computadores.listacomp;
       listaconsul=mostrarprestamoing.listaprestamoing;
    }
    
    public void buscarpc()
    {
        
        int opbuscar=vdb.opcionbuscar();
        switch(opbuscar)
        {
            case 1:
            buscarserial();
            break;
            
            case 2:
            buscarcedula();
            break;
        }
        
    }
    
    public void buscarserial()
    {
        int se=0;
        int index=0;
        boolean encontrado=false;
        
        se=vdb.validarbuscarserialpc();
        
        for(int i=0;i<listacpc.size();i++)
        {
            if(se==listacpc.get(i).getSerialpc())
            {
               encontrado=true;
               index=i;
               JOptionPane.showMessageDialog(null, "EL COMPUTADOR SE ENCUENTRA EN EL INVERTARIO");
               break;
            }
        }
        
        if (!encontrado) 
        {
           JOptionPane.showMessageDialog(null, "EL COMPUTADOR NO ESTA REGISTRADO EN EL INVENTARIO");
        } 
        else
        {
            mostrar(index);
        }

    }
    
    public void mostrar(int i)
    {
        String texto="";
        
        texto=texto+"SERIAL PC:"+listacpc.get(i).getSerialpc()+"\n"+
                    "COMPUTADOR:"+listacpc.get(i).getMarca()+" "+"\n"+
                    "PULGADAS:"+listacpc.get(i).getPulgadas()+"\n"+
                    "PRECIO:"+listacpc.get(i).getPrecio()+"\n"+
                    "PROCESADOR:"+listacpc.get(i).getProcesador()+"\n"+
                    "SISTEMA:"+listacpc.get(i).getSistema()+"\n";
        
        JOptionPane.showMessageDialog(null, "EL COMPUTADOR ES EL SIGUIENTE"+"\n"+texto);
    }
    
    public void buscarcedula()
    {
        int ced=0;
        int index=0;
        boolean encontrado=false;
        
        ced=vdb.validarbuscarcedula();
        
        for(int i=0;i<listaconsul.size();i++)
        {
            if(ced==listaconsul.get(i).getCedula())
            {
               encontrado=true;
               index=i;
               JOptionPane.showMessageDialog(null, "EL COMPUTADOR SE ENCUENTRA EN EL INVERTARIO");
               break;
            }
        }
        
        if (!encontrado) 
        {
           JOptionPane.showMessageDialog(null, "EL COMPUTADOR NO ESTA REGISTRADO EN EL INVENTARIO");
        } 
        else
        {
            mostrar(index);
        }
        
    }
    
    
}
