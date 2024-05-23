
package workfinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Walter Gutierrez
 */
public class importardiseñadores 
{
    static List<diseñadores> listdise=new LinkedList<>();

    public importardiseñadores() 
    {
        listdise=insertardiseñadores.listadis;
    }
    
    public void importardise() throws FileNotFoundException, IOException
    {
        if(listdise.isEmpty())
            {
                try(BufferedReader po=new BufferedReader(new FileReader(new File("archivo.txt"))))
                {
                    String linea= "";
                    while((linea=po.readLine())!=null)
                    {
                          String[] Lineas = linea.split(":");
                          String Atributo = Lineas[0].toLowerCase().trim();
                          String valor = Lineas[1];
                          
                         switch (Atributo) 
                         {
                                case "nombre":
                                String nombre = valor.trim();
                                String apellido = po.readLine().split(":")[1].trim();
                                String modalidad=po.readLine().split(":")[1].trim();
                                int cedula =Integer.parseInt(po.readLine().split(":")[1].trim());
                                int semestre=Integer.parseInt(po.readLine().split(":")[1].trim());
                                int telefono=Integer.parseInt(po.readLine().split(":")[1].trim());
                                int asignaturasc=Integer.parseInt(po.readLine().split(":")[1].trim());
                                int serial=Integer.parseInt(po.readLine().split(":")[1].trim());
                                double promedio=Double.parseDouble(po.readLine().split(":")[1].trim());
                                
                                
                                listdise.add(new diseñadores(nombre,apellido,modalidad,cedula,semestre,telefono,asignaturasc,serial,promedio));
                                po.readLine();
                                break;

                                default:
                                break;
                         }
                    }
                }
            }
            else
            {
               JOptionPane.showMessageDialog(null,"YA HAY REGISTROS EXISTENTES EN LA LISTA"); 
            }
            
        }
    }
    
    
    

