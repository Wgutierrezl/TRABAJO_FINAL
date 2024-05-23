
package workfinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import static workfinal.computadores.listapc;
import static workfinal.computadores.texto;


public class tablets 
{
    
    static List<tabletsdiseñadores> listatablets=new LinkedList<>();
    static List<tabseleccion> listatab=new LinkedList<>();
    static boolean mostrartab=false;
    static String textot="";
    
    tabletsdiseñadores tabs=new tabletsdiseñadores();
    tabseleccion t=new tabseleccion();
    validacionesprestamos vad=new validacionesprestamos();

    public tablets() 
    {
        
    }
    
    public void llenartablets() throws FileNotFoundException, IOException
    {
        listatab.clear();
        
         try(BufferedReader po=new BufferedReader(new FileReader("C:\\Users\\Walter Gutierrez\\OneDrive\\Escritorio\\archivotablets.txt")))
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
                         int serial=Integer.parseInt(valor.trim());
                         String tablet= po.readLine().split(":")[1].trim();
                         double tamaño=Double.parseDouble(po.readLine().split(":")[1].trim());
                         double precio=Double.parseDouble(po.readLine().split(":")[1].trim());
                         double peso=Double.parseDouble(po.readLine().split(":")[1].trim());
                          
                         t.setSerial(serial);
                         t.setMarca(tablet);
                         t.setTamaño(tamaño);
                         t.setPeso(peso);
                         t.setPrecio(precio);
                                
                         listatab.add(new tabseleccion(t.getSerial(),t.getMarca(),t.getTamaño(),t.getPeso(),t.getPrecio()));
                                
                                
                         po.readLine();
                         break;
                                
                         default:
                         break;
                 }
            }
                    
        }
         
        seleccionartablet();
    }
    
    public void seleccionartablet()
    {
        int opciont=0;
        if(!mostrartab)
        {
           textot="TABLETS DISPONIBLES\n";
           for(int i=0;i<listatab.size();i++)
           {
               textot=textot+" "+(i+1)+"."+"TABLET:"+listatab.get(i).getMarca()+"\n"+
                                      "SERIAL:"+listatab.get(i).getSerial()+"\n"+
                                      "TAMAÑO:"+listatab.get(i).getTamaño()+"\n"+
                                      "PESO:"+listatab.get(i).getPeso()+"\n"+
                                      "PRECIO:"+listatab.get(i).getPrecio()+"\n"+"\n";
           }
           mostrartab=true;
        }
        
        opciont=vad.validartablet(textot);
        
        componertab(opciont);
        calcularalmacenamiento();
    }
    
    public void componertab(int p)
    {
        for(int i=0;i<listatab.size();i++)
        {
            if((p-1)==i)
            {
                tabs.setMarca(listatab.get(i).getMarca());
                tabs.setSerial(listatab.get(i).getSerial());
                tabs.setTamaño(listatab.get(i).getTamaño());
                tabs.setPrecio(listatab.get(i).getPrecio());
                tabs.setPeso(listatab.get(i).getPeso());
            }
        }
    }
    
    public void calcularalmacenamiento()
    {
        int opcionalmacenamiento=0;
        
        opcionalmacenamiento=vad.validaralmacenamiento();
        
        switch(opcionalmacenamiento)
        {
            case 1:
            tabs.setAlmacenamiento("256 gb");
            llenarlistatab();
            break;
            
            case 2:
            tabs.setAlmacenamiento("512 GB");
            llenarlistatab();
            break;
            
            case 3:
            tabs.setAlmacenamiento("1 TB");
            llenarlistatab();
            break;    
        }
        
        
    }
    
    public void llenarlistatab()
    {
        listatablets.add(new tabletsdiseñadores(tabs.getMarca(),
                                                tabs.getAlmacenamiento(),
                                                tabs.getTamaño(),
                                                tabs.getPrecio(),
                                                tabs.getSerial(),
                                                tabs.getPeso())); 
        mostrar();
        mostrarprestamodise prestadiseñadores=new mostrarprestamodise();
        prestadiseñadores.llenarregistroprestamodiseñadores();
        
        
    }
    
    public void mostrar()
    {
        String texto="";
        
        for(tabletsdiseñadores item:listatablets)
        {
            texto=texto+"MARCA:"+" "+item.getMarca()+"\n"+
                        "SERIAL TABLET:"+" "+item.getSerial()+"\n"+
                        "ALMACENAMIENTO:"+" "+item.getAlmacenamiento()+"\n"+
                        "TAMAÑO:"+" "+item.getTamaño()+"\n"+
                        "PRECIO:"+" "+item.getPrecio()+"\n"+
                        "PESO:"+" "+item.getPeso()+"\n"+"\n";
        }
        
        JOptionPane.showMessageDialog(null, "TABLETS PRESTADAS"+"\n"+texto);
    }
    
    
}
