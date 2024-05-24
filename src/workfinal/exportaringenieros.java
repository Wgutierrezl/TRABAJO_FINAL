
package workfinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


public class exportaringenieros 
{
    static List<ingenieros> listinge=new LinkedList<>();
    File archivo=new File("ingenieros.txt");
    public exportaringenieros() 
    {
        listinge=insertaringenieros.listaing;
    }
    
    public void exportarin () throws IOException
    {
       
        try(BufferedWriter war=new BufferedWriter(new FileWriter(archivo)))
        {
            for(ingenieros item:listinge)
            {
                war.write("NOMBRE:"+" "+item.getNombre()+"\n");
                war.write("APELLIDO:"+" "+item.getApellido()+"\n");
                war.write("CEDULA:"+" "+item.getCedula()+"\n");
                war.write("SERIAL:"+" "+item.getSerial()+"\n");
                war.write("SEMESTRE:"+" "+item.getSemestre()+"\n");
                war.write("PROMEDIO:"+" "+item.getPromedio()+"\n");
                war.write("TELEFONO:"+" "+item.getTelefono()+"\n");
                war.write("\n");
                
            }
        }
        JOptionPane.showMessageDialog(null, "DATOS EXPORTADOS CORRECTAMENTE");
    }
    
    
    
}

