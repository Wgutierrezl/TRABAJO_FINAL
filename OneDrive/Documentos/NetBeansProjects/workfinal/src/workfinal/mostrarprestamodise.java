
package workfinal;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class mostrarprestamodise 
{
    
    static List<diseñadores> listdiseña=new LinkedList<>();
    static List<tabletsdiseñadores> listablets=new LinkedList<>();
    static List<prestamodiseñadores> listaregistrodise=new LinkedList<>();
    static int i=0;
    prestamodiseñadores presdise=new prestamodiseñadores();
    
    public mostrarprestamodise() 
    {
        listdiseña=insertardiseñadores.listadis;
        listablets=tablets.listatablets;
        
    }
    
    public void llenarregistroprestamodiseñadores()
    {
        presdise.setNombre(listdiseña.get(i).getNombre());
        presdise.setApellido(listdiseña.get(i).getApellido());
        presdise.setCedula(listdiseña.get(i).getCedula());
        presdise.setMarcat(listablets.get(i).getMarca());
        presdise.setAlmacenamiento(listablets.get(i).getAlmacenamiento());
        
        listaregistrodise.add(new prestamodiseñadores(presdise.getNombre(),
                                                      presdise.getApellido(),
                                                      presdise.getMarcat(),
                                                      presdise.getAlmacenamiento(),
                                                      presdise.getCedula()));
        mostrarprestamodiseñadores();
        i++;
    }
    
    public void mostrarprestamodiseñadores()
    {
        String texto="";
        
        for(prestamodiseñadores item:listaregistrodise)
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
