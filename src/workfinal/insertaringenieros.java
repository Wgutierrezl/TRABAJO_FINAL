
package workfinal;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class insertaringenieros 
{

    static List<ingenieros> listaing=new LinkedList<>();
    static List<diseñadores> listadiseñadores=new LinkedList<>();
    
    public insertaringenieros() 
    {
        listadiseñadores=insertardiseñadores.listadis;
    }
    
    public void llenar() throws IOException
    {
        validaciones val=new validaciones();
        JOptionPane.showMessageDialog(null,"ESTUDIANTES DE INGENIERIA");
        int cedulaing=0;
        ingenieros inge=new ingenieros();
        
        int opcionprestamo=0;
        
        inge.setNombre(JOptionPane.showInputDialog("INGRESE SU NOMBRE"));
        inge.setApellido(JOptionPane.showInputDialog("INGRESE SU APELLIDO"));
        inge.setCedula(val.validarcedulaingenierosdiseñadores());
        inge.setSerial(val.validarserial());
        inge.setSemestre(val.validarsemestre());
        inge.setPromedio(val.validarpromedio());
        inge.setTelefono(val.validartelefono());
        
        
        cedulaing=inge.getCedula();
        
       if(calcularlista(cedulaing)==false)
       {
        
          if(calcular(cedulaing)==false)
          {
        
             listaing.add(new ingenieros(inge.getNombre(),
                                      inge.getApellido(),
                                      inge.getCedula(),
                                      inge.getSemestre(),
                                      inge.getTelefono(),
                                      inge.getSerial(),
                                      inge.getPromedio()));
        
        
            opcionprestamo=val.validarprestamopctab();
        
            switch(opcionprestamo)
            {
                  case 1:
                  computadores pc=new computadores();
                  pc.seleccionarcomputador();
                  break;
            
                  case 2:
                  break;
                
            }
        }
        else
        {
           JOptionPane.showMessageDialog(null, "EL ESTUDIANTE DE INGENIERIA YA SE ENCUENTRA REGISTRADO");
        }
          
       }
       else
       {
           JOptionPane.showMessageDialog(null, "EL ESTUDIANTE YA SE ENCUENTRA REGISTRADO EN LA CARRERA DE DISEÑO");
       }
                
    }
    
    public boolean calcular(int c)
    {
        for(ingenieros item:listaing)
        {
            if(c==item.getCedula())
            {
                return true;
            }
        }
        return false;
    }
    
    
    public boolean calcularlista(int ced)
    {
        for(diseñadores item:listadiseñadores)
        {
            if(ced==item.getCedula())
            {
                return true;
            }
        }
        return false;
        
    }
    
    
}
