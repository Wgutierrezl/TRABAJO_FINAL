
package workfinal;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class modificaringenieros 
{
    static List<prestamoingenieros> listacomping=new LinkedList<>();
    static List<ingenieros> listaingenieros=new LinkedList<>();
    static List<pcseleccion> listapc=new LinkedList<>();
    static String testopc="";
    
    validacionmodificar vmod=new validacionmodificar();
    
    
    
    public modificaringenieros() 
    {
        listaingenieros=insertaringenieros.listaing;
        listacomping=mostrarprestamoing.listaprestamoing;
        listapc=computadores.listapc;
    }
    
    public void modificarprestamocomputadores()
    {
        int opcionmodificar=0;
        int ced=0;
        boolean verdad=true;
        int cont=0;
        
        ced=vmod.modificarcedula();
        
        for(int i=0;i<listacomping.size();i++)
        {
            
           if(ced==listacomping.get(i).getCedula())
           {
               
              do
              {
                 opcionmodificar=vmod.validarmenumodificaringe();
                 
                   switch(opcionmodificar)
                   {
                          case 1:
                          listacomping.get(i).setNombre(JOptionPane.showInputDialog("ACTUALICE O MODIFIQUE SU NOMBRE"));
                          break;
                          
                          case 2:
                          listacomping.get(i).setApellido(JOptionPane.showInputDialog("ACTUALICE O MODIFIQUE SU APELLIDO"));
                          break;
                          
                          case 3:
                          listacomping.get(i).setCedula(vmod.validarceduladiseñadoresingenieros());
                          break;
                          
                          case 4:
                          modcomputador(listacomping.get(i).getComputador(),i);
                          break;
                          
                          case 5:
                          modprocesador(listacomping.get(i).getProcesador(),i);   
                          break;
                          
                          case 6:
                          modsistema(listacomping.get(i).getSistema(),i) ;   
                          break;
                          
                          case 7:
                          mostrarcambios(i);    
                          
                   }
            
               }while(opcionmodificar!=8);
              
           }
           else
           {
               cont++;
           }
           
           
        }
        if(cont==listacomping.size())
        {
           JOptionPane.showMessageDialog(null, "EL ESTUDIANTE DE INGENIERIA NO SE ENCUENTRA EN EL REGISTRO"); 
        }
        
    }
    
    public void modcomputador(String pc,int i)
    {
        String testopc="";
        for(int j=0;j<listapc.size();j++)
        { 
            testopc=testopc+(j+1)+"."+listapc.get(j).getPc()+"\n";
        }
        
        int opcionpc=vmod.validarmodificarcomputador(pc, testopc);
        
        elegircambiopc(opcionpc,i);

    }
    
    public void elegircambiopc(int p,int pos)
    {
        for(int i=0;i<listapc.size();i++)
        {
            if((p-1)==i)
            {
                listacomping.get(pos).setComputador(listapc.get(i).getPc());
            }
        }
    }

    public void modprocesador(String procesador, int i) 
    {
        int opcionprocesador=vmod.validarprocesador(procesador);
        switch(opcionprocesador)
        {
            case 1:
            listacomping.get(i).setProcesador("AMD Ryzen");
            break;
            
            case 2:
            listacomping.get(i).setProcesador("Intel Core !5");
            break;
        }
    }

    public void modsistema(String sistema, int i) 
    {
        int opcionsistema=vmod.validarsistemamod(sistema);
        
        switch(opcionsistema)
        {
            case 1:
            listacomping.get(i).setSistema("WINDOWS 7");
            break;
            
            case 2:
            listacomping.get(i).setSistema("WINDOWS 10");   
            break;
            
            case 3:
            listacomping.get(i).setSistema("WINDOWS 11");  
            break;
        }
    }
    
    public void mostrarcambios(int i)
    {
        String texto="";
        texto=texto+"NOMBRE:"+listacomping.get(i).getNombre()+"\n"+
                    "APELLIDO:"+listacomping.get(i).getApellido()+"\n"+
                    "CEDULA:"+listacomping.get(i).getCedula()+"\n"+
                    "COMPUTADOR:"+listacomping.get(i).getComputador()+"\n"+
                    "PROCESADOR:"+listacomping.get(i).getProcesador()+"\n"+
                    "SISTEMA:"+listacomping.get(i).getSistema()+"\n";
        JOptionPane.showMessageDialog(null, texto);
    }
        
        
    
    

    
    
    
}
