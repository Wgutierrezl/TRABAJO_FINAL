
package workfinal;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class buscartablets 
{
    
    static List<tabletsdiseñadores> listabs=new LinkedList<>();
    static List<prestamodiseñadores> listdiseña=new LinkedList<>();
    validardevolucionbusqueda vdb=new validardevolucionbusqueda();
    
    public buscartablets() 
    {
        listabs=tablets.listatablets;
        listdiseña=mostrarprestamodise.listaregistrodise;
    }
    
    public void buscartabs()
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
        int serialtab=0;
        int index=0;
        boolean encontrado=false;
        
        serialtab=vdb.validarbuscarserialpc();
        
        for(int i=0;i<listabs.size();i++)
        {
            if(serialtab==listabs.get(i).getSerial())
            {
               encontrado=true;
               index=i;
               JOptionPane.showMessageDialog(null, "LA TABLET SE ENCUENTRA EN EL INVERTARIO");
               break;
            }
        }
        
        if (!encontrado) 
        {
           JOptionPane.showMessageDialog(null, "LA TABLET NO ESTA REGISTRADO EN EL INVENTARIO");
        } 
        else
        {
            mostrar(index);
        }

    }
    
    public void mostrar(int i)
    {
        String texto="";
        
            texto=texto+"MARCA:"+listabs.get(i).getMarca()+"\n"+
                        "SERIAL TABLET:"+listabs.get(i).getSerial()+"\n"+
                        "ALMACENAMIENTO:"+listabs.get(i).getAlmacenamiento()+"\n"+
                        "TAMAÑO:"+listabs.get(i).getTamaño()+"\n"+
                        "PRECIO:"+listabs.get(i).getPrecio()+"\n"+
                        "PESO:"+listabs.get(i).getPeso()+"\n";
        
        
        JOptionPane.showMessageDialog(null, "LA TABLET ES EL SIGUIENTE"+"\n"+texto);
    }
    
    public void buscarcedula()
    {
        int ced=0;
        int index=0;
        boolean encontrado=false;
        
        ced=vdb.validarbuscarcedula();
        
        for(int i=0;i<listdiseña.size();i++)
        {
            if(ced==listdiseña.get(i).getCedula())
            {
               encontrado=true;
               index=i;
               JOptionPane.showMessageDialog(null, "LA TABLET SE ENCUENTRA EN EL INVERTARIO");
               break;
            }
        }
        
        if (!encontrado) 
        {
           JOptionPane.showMessageDialog(null, "LA TABLET NO ESTA REGISTRADO EN EL INVENTARIO");
        } 
        else
        {
            mostrar(index);
        }
        
    }
    
    
}
