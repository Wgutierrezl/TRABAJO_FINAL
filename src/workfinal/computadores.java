
package workfinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class computadores 
{
    static List<computadoresingenieros> listacomp=new LinkedList<>();
    static List<pcseleccion> listapc=new LinkedList<>();
    boolean mostrar=false;
    static String texto="";
    
    computadoresingenieros comp=new computadoresingenieros();
    pcseleccion pc=new pcseleccion();
    validacionesprestamos vad=new validacionesprestamos();
    
    public computadores() 
    {
        
    }
    
    public void seleccionarcomputador() throws FileNotFoundException, IOException
    {
        listapc.clear();
                
                try(BufferedReader po=new BufferedReader(new FileReader("C:\\Users\\Walter Gutierrez\\OneDrive\\Escritorio\\archivocomputadores.txt")))
                {
                    String linea= "";
                    while((linea=po.readLine())!=null)
                    {
                          String[] Lineas = linea.split(":");
                          String Atributo = Lineas[0].toLowerCase().trim();
                          String valor = Lineas[1];
                          
                         switch (Atributo) 
                         {
                                case "serial":
                                int serial =Integer.parseInt(valor.trim());
                                String computador = po.readLine().split(":")[1].trim();
                                double pulgadas=Double.parseDouble(po.readLine().split(":")[1].trim());
                                double precio=Double.parseDouble(po.readLine().split(":")[1].trim());
                                
                                pc.setSerial(serial);
                                pc.setPc(computador);
                                pc.setPulgadas(pulgadas);
                                pc.setPrecio(precio);
                                
                                listapc.add(new pcseleccion(pc.getSerial(),pc.getPc(),pc.getPulgadas(),pc.getPrecio()));
                                
                                
                                po.readLine();
                                break;
                                
                                default:
                                break;
                         }
                    }
                    
                }
                
                selecioncompus();
            
        
    }
    
    public void selecioncompus()
    {
           
        if(!mostrar)
        {
           texto="COMPUTADORES DISPONIBLES\n";
           for(int i=0;i<listapc.size();i++)
           {
               texto=texto+" "+(i+1)+"."+"COMPUTADOR:"+listapc.get(i).getPc()+"\n"+
                                      "SERIAL:"+listapc.get(i).getSerial()+"\n"+
                                      "PULGADAS:"+listapc.get(i).getPulgadas()+"\n"+
                                      "PRECIO:"+listapc.get(i).getPrecio()+"\n"+"\n";
           }
           mostrar=true;
          
        }
        
        
        
        int opcion=vad.validarcomputador(texto);
        
        for(int i=0;i<listapc.size();i++)
        {
            if((opcion-1)==i)
            {
                comp.setMarca(listapc.get(i).getPc());
                comp.setSerialpc(listapc.get(i).getSerial());
                comp.setPulgadas(listapc.get(i).getPulgadas());
                comp.setPrecio(listapc.get(i).getPrecio());
            }
        }
        
        calcularprocesador();
        
                
        
        
    }
    
    public void calcularprocesador()
    {
        int opcionprocesador=0;
        
        opcionprocesador=vad.validarprocesador();
        
        switch(opcionprocesador)
        {
            case 1:
            comp.setSistema("WINDOWS 7");
            calcularsistema();
            break;
            
            case 2:
            comp.setSistema("WINDOSW 10");
            calcularsistema();
            break;
            
            case 3:
            comp.setSistema("WINDOWS 11");
            calcularsistema();
            break;
        }
                
    }
    
    public void calcularsistema()
    {
        int opcionsistema=0;
        
        opcionsistema=vad.validarsistema();
        switch(opcionsistema)
        {
            case 1:
            comp.setProcesador("AMD Ryzen");
            listacomp.add(new computadoresingenieros(comp.getMarca(),
                                                     comp.getSistema(),
                                                     comp.getProcesador(),
                                                     comp.getPulgadas(),
                                                     comp.getPrecio(),
                                                     comp.getSerialpc()));
            mostrar();
            mostrarprestamoing mping=new mostrarprestamoing();
            mping.registrarprestamoing();
            break;
            
            case 2:
            comp.setProcesador("Intel Core !5");
            listacomp.add(new computadoresingenieros(comp.getMarca(),
                                                     comp.getSistema(),
                                                     comp.getProcesador(),
                                                     comp.getPulgadas(),
                                                     comp.getPrecio(),
                                                     comp.getSerialpc()));
            mostrar();
            mostrarprestamoing mpin=new mostrarprestamoing();
            mpin.registrarprestamoing();
            
            break;
                                                     
        }
    }
    
    public void mostrar()
    {
        String texto="";
        for(computadoresingenieros item: listacomp)
        {
            texto=texto+"COMPUTADOR:"+" "+item.getMarca()+"\n"+
                        "SERIAL:"+" "+item.getSerialpc()+"\n"+
                        "PROCESADOR:"+" "+item.getProcesador()+"\n"+
                        "SISTEMA:"+" "+item.getSistema()+"\n"+
                        "PRECIO:"+" "+item.getPrecio()+"\n"+
                        "PULGADAS:"+" "+item.getPulgadas()+"\n"+"\n";
        }
        
        JOptionPane.showMessageDialog(null,"REGISTRO DE COMPUTADORES PRESTADOS"+"\n"+texto);
        
    }
    
     
     
    
}
