
package workfinal;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class mostrarprestamoing 
{

    static List<ingenieros> listinge = new LinkedList<>();
    static List<computadoresingenieros> listcomp=new LinkedList<>();
    static List<prestamoingenieros> listaprestamoing=new LinkedList<>();
    static int i=0;
    prestamoingenieros presing=new prestamoingenieros();
    public mostrarprestamoing() 
    {
        listinge=insertaringenieros.listaing;
        listcomp=computadores.listacomp;
    }
    
    public void registrarprestamoing()
    {
//        for(int i=0;i<listinge.size();i++)
        
            presing.setNombre(listinge.get(i).getNombre());
            presing.setApellido(listinge.get(i).getApellido());
            presing.setCedula(listinge.get(i).getCedula());
            presing.setComputador(listcomp.get(i).getMarca());
            presing.setSistema(listcomp.get(i).getSistema());
            presing.setProcesador(listcomp.get(i).getProcesador());
            
            listaprestamoing.add(new prestamoingenieros(presing.getNombre(),
                                                        presing.getApellido(),
                                                        presing.getComputador(),
                                                        presing.getProcesador(),
                                                        presing.getSistema(),
                                                        presing.getCedula()));
                    
        
        
        mostrarprestamo();
        i++;
    }
    
    public void mostrarprestamo()
    {
        String texto="";
        
        for(prestamoingenieros item:listaprestamoing)
        {
            texto=texto+"NOMBRE:"+" "+item.getNombre()+"\n"+
                        "APELLIDO:"+" "+item.getApellido()+"\n"+
                        "CEDULA:"+" "+item.getCedula()+"\n"+
                        "COMPUTADOR:"+" "+item.getComputador()+"\n"+
                        "PROCESADOR:"+" "+item.getProcesador()+"\n"+
                        "SISTEMA:"+" "+item.getSistema()+"\n"+
                        "\n";
        }
        texto=texto+"\n";
        
        JOptionPane.showMessageDialog(null,"REGISTRO DE PRESTAMOS DE INGENIERIA"+"\n"+texto);
    }
 
}
