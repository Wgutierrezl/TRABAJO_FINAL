
package workfinal;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class modificardiseñadores 
{
    static List<prestamodiseñadores> listaprestdise=new LinkedList<>();
    static List<diseñadores> listdiseñadores=new LinkedList<>();
    static List<tabseleccion> listatabs=new LinkedList<>();
    validacionmodificar vmod=new validacionmodificar();

    public modificardiseñadores() 
    {
        listaprestdise=mostrarprestamodise.listaregistrodise;
        listdiseñadores=insertardiseñadores.listadis;
        listatabs=tablets.listatab;
        
    }
    
    public void modificarprestamodiseñadores()
    {
        int opcionmodificar=0;
        int ced=0;
        int cont=0;
        
        ced=vmod.modificarcedula();
        
        for(int i=0;i<listaprestdise.size();i++)
        {
            
           if(ced==listaprestdise.get(i).getCedula())
           {
            
              do
              {
                 opcionmodificar=vmod.modificarmenudiseñadores();
                 
                   switch(opcionmodificar)
                   {
                          case 1:
                          listaprestdise.get(i).setNombre(JOptionPane.showInputDialog("ACTUALICE O MODIFIQUE SU NOMBRE"));
                          break;
                          
                          case 2:
                          listaprestdise.get(i).setApellido(JOptionPane.showInputDialog("ACTUALICE O MODIFIQUE SU APELLIDO"));
                          break;
                          
                          case 3:
                          listaprestdise.get(i).setCedula(vmod.validarceduladiseñadoresingenieros());
                          break;
                          
                          case 4:
                          modtablet(listaprestdise.get(i).getMarcat(),i);
                          break;
                          
                          case 5:
                          modalmacenamiento(listaprestdise.get(i).getAlmacenamiento(),i);   
                          break;
                          
                          case 6:
                          mostrarcambios(i);   
                          break;
                          
                   }
            
               }while(opcionmodificar!=7);
              
           }
           else
           {
               cont++;
           }    
         
        }
        if(cont==listaprestdise.size())
        {
           JOptionPane.showMessageDialog(null, "EL ESTUDIANTE DE DISEÑO NO SE ENCUENTRA EN EL REGISTRO"); 
        }
        
    }
    
    public void modtablet(String tab, int i)
    {
        String testotab="";
        for(int j=0;j<listatabs.size();j++)
        { 
            testotab=testotab+(j+1)+"."+listatabs.get(j).getMarca()+"\n";
        }
        
        int opciontab=vmod.validartabletmodificacion(tab, testotab);
        
        
        elegircambiotab(opciontab,i);
       
    }
 
    
    
    public void elegircambiotab(int p, int pos)
    {
        for(int i=0;i<listatabs.size();i++)
        {
            if((p-1)==i)
            {
               listaprestdise.get(pos).setMarcat(listatabs.get(i).getMarca());
            }
        }
    }
    
    public void modalmacenamiento(String cap, int i)
    {
        int opcionalm=vmod.validaralmacenamientotab(cap);
        
        switch(opcionalm)
        {
            case 1:
            listaprestdise.get(i).setAlmacenamiento("256 GB");
            break;
            
            case 2:
            listaprestdise.get(i).setAlmacenamiento("512 GB");
            break;
            
            case 3:
            listaprestdise.get(i).setAlmacenamiento("1 TB");
            break;    
                
        }
    }
    
    public void mostrarcambios(int i)
    {
        String texto="";
        

            texto=texto+"NOMBRE:"+" "+listaprestdise.get(i).getNombre()+"\n"+
                        "APELLIDO:"+" "+listaprestdise.get(i).getApellido()+"\n"+
                        "CEDULA:"+" "+listaprestdise.get(i).getCedula()+"\n"+
                        "MARCA TAB:"+" "+listaprestdise.get(i).getMarcat()+"\n"+
                        "ALMACENAMIENTO:"+" "+listaprestdise.get(i).getAlmacenamiento()+"\n";
                        
        
        
        JOptionPane.showMessageDialog(null, "REGISTRO DE PRESTAMOS DE TABLETS ACTUALIZADO"+"\n"+texto);
    }
    
    
    
}
